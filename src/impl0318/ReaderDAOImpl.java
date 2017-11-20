package impl0318;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao0318.ReaderDAO;
import pojo0318.Reader;
import util0318.HibernateSessionFactory;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-17
 *
 */

public class ReaderDAOImpl implements ReaderDAO {
	
	Session session = null;
	Transaction tran = null;
	
	public ReaderDAOImpl(){
		session = HibernateSessionFactory.getSession();
		tran = session.beginTransaction();
	}

	// 查询全部
	@Override
	public List<Reader> findAllReader() throws Exception {
		String hql = "from Reader";
		Query query = session.createQuery(hql);
		List<Reader> list = query.list();
		tran.commit();
		return list;
	}

	// 根据rid查询读者信息
	@Override
	public Reader findReaderById(int rid) throws Exception {
		Reader reader = (Reader)session.get(Reader.class, rid);
		tran.commit();
		return reader;
	}

	// 修改读者信息
	@Override
	public boolean updateReader(Reader reader) throws Exception {
		String hql = "update Reader set rname = ?, ridcard = ? where rid=?";
		Query query = session.createQuery(hql);
		query.setString(0, reader.getRname());
		query.setString(1, reader.getRidcard());
		query.setInteger(2, reader.getRid());
		
		int i = query.executeUpdate();
		tran.commit();
		
		if (i > 0){
			return true;
		} else {
			return false;
		}
	}

	// 删除读者信息
	@Override
	public boolean deleteReader(int rid) throws Exception {
		String hql = "delete from Reader where rid = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, rid);
		query.executeUpdate();
		tran.commit();
		return true;
	}

	// 添加读者信息
	@Override
	public boolean addReader(Reader reader) throws Exception {
		reader.setRid(reader.getRid());
		reader.setRname(reader.getRname());
		reader.setRidcard(reader.getRidcard());
		session.save(reader);
		tran.commit();
		return true;
	}

}
