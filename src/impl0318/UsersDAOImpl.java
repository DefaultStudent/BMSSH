package impl0318;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao0318.UsersDAO;
import pojo0318.Users;
import util0318.HibernateSessionFactory;

/**
 * 
 * @author Simon
 * @version 1.1 2017-11-17
 *
 */

public class UsersDAOImpl implements UsersDAO {
	
	private Session session = null;
	private Transaction transaction = null;
	
	public UsersDAOImpl(){
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
	}

	//登陆功能
	@Override
	public boolean loginUsers(Users users) throws Exception {
		String hql = "from Users where uid=? and upwd=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, users.getUid());
		query.setString(1, users.getUpwd());
		List<Users> list = query.list();
		for (Users u : list){
			users.setUname(u.getUname());
			users.setLimit(u.getLimit());
		}
		
		transaction.commit();
			
		if (list.size() > 0) {
			
			return true;
		} else {
			return false;
		}
	}
	
	//查询全部用户信息
	@Override
	public List<Users> findAllUsers() throws Exception {
		String hql = "from Users";
		Query query = session.createQuery(hql);
		List<Users> list = query.list();
		transaction.commit();
		return list;
	}

	//用户注册
	@Override
	public boolean registerUsers(Users users) throws Exception {
		users.setUname(users.getUname());
		users.setUpwd(users.getUpwd());
		session.save(users);
		transaction.commit();
		return true;
	}

	//用户信息更新
	@Override
	public boolean updateUsers(Users users) throws Exception {
		String hql = "update Users set uname=?, upwd=? where uid=?";
		Query query = session.createQuery(hql);
		query.setString(0, users.getUname());
		query.setString(1, users.getUpwd());
		query.setInteger(2, users.getUid());
		int i = query.executeUpdate();
		
		transaction.commit();
		
		if (i > 0){
			return true;
		} else {
			return false;
		}
	}

	//删除用户信息
	@Override
	public boolean deleteUsers(int uid) throws Exception {
		String hql = "delete from Users where uid=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, uid);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	//根据uid查询用户信息
	@Override
	public Users findUsersById(int uid) throws Exception {
		Users users = (Users)session.get(Users.class, uid);
		transaction.commit();
		return users;
	}	

}
