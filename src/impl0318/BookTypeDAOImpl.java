package impl0318;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao0318.BookTypeDAO;
import pojo0318.BookType;
import util0318.HibernateSessionFactory;

public class BookTypeDAOImpl implements BookTypeDAO{
	
	Session session = null;
	Transaction tran = null;
	
	public BookTypeDAOImpl(){
		session = HibernateSessionFactory.getSession();
		tran = session.beginTransaction();
	}

	// 查询全部图书类别信息
	@Override
	public List<BookType> findAllBookType() throws Exception {
		String hql = "from BookType";
		Query query = session.createQuery(hql);
		List<BookType> list = query.list();
		tran.commit();
		return list;
	}

	// 添加图书类别信息
	@Override
	public boolean addBookType(BookType booktype) throws Exception {
		booktype.setBooktypeid(booktype.getBooktypeid());
		booktype.setBooktypename(booktype.getBooktypename());
		session.save(booktype);
		tran.commit();
		return true;
	}

	// 修改图书类别信息
	@Override
	public boolean updateBookType(BookType booktype) throws Exception {
		String hql = "update BookType set booktypename=? where booktypeid=?";
		Query query = session.createQuery(hql);
		query.setString(0, booktype.getBooktypename());
		query.setInteger(1, booktype.getBooktypeid());
		
		int i = query.executeUpdate();
		tran.commit();
		if ( i > 0){
			return true;
		} else {
			return false;
		}
	}

	// 删除图书类别信息
	@Override
	public boolean deleteBookType(int booktypeid) throws Exception {
		String hql = "delete from BookType where booktypeid = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, booktypeid);
		query.executeUpdate();
		tran.commit();
		return true;
	}

}
