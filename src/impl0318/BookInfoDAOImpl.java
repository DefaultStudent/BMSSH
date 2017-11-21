package impl0318;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao0318.BookInfoDAO;
import pojo0318.BookInfo;
import util0318.HibernateSessionFactory;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-20
 *
 */

public class BookInfoDAOImpl implements BookInfoDAO {
	
	Session session = null;
	Transaction tran = null;
	
	public BookInfoDAOImpl(){
		session = HibernateSessionFactory.getSession();
		tran = session.beginTransaction();
	}

	// 查询全部图书信息
	@Override
	public List<BookInfo> findAllBookInfo() throws Exception {
		String hql = "from BookInfo";
		Query query = session.createQuery(hql);
		List<BookInfo> list = query.list();
		tran.commit();
		return list;
	}

	// 添加图书信息
	@Override
	public boolean addBookInfo(BookInfo bookinfo) throws Exception {
		bookinfo.setBookid(bookinfo.getBookid());
		bookinfo.setBookname(bookinfo.getBookname());
		bookinfo.setBooktypename(bookinfo.getBooktypename());
		bookinfo.setAuthor(bookinfo.getAuthor());
		bookinfo.setPubname(bookinfo.getPubname());
		bookinfo.setIsbn(bookinfo.getIsbn());
		bookinfo.setPrice(bookinfo.getPrice());
		session.save(bookinfo);
		tran.commit();
		return true;
	}

	// 修改图书信息
	@Override
	public boolean updateBookInfo(BookInfo bookinfo) throws Exception {
		String hql = "update BookInfo set bookname=?,booktypename=?,author=?,pubname=?,isbn=?,price=? where bookid=?";
		Query query = session.createQuery(hql);
		query.setString(0, bookinfo.getBookname());
		query.setString(1, bookinfo.getBooktypename());
		query.setString(2, bookinfo.getAuthor());
		query.setString(3, bookinfo.getPubname());
		query.setString(4, bookinfo.getIsbn());
		query.setDouble(5, bookinfo.getPrice());
		query.setInteger(6, bookinfo.getBookid());
		
		int i = query.executeUpdate();
		tran.commit();
		if (i > 0){
			return true;
		} else {
			return false;
		}
	}

	// 删除图书信息
	@Override
	public boolean deleteBookInfo(int bookid) throws Exception {
		String hql = "delete from BookInfo where bookid=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, bookid);
		query.executeUpdate();
		tran.commit();
		return true;
	}

	// 查询单个图书信息
	@Override
	public BookInfo findBookInfoById(int bookid) throws Exception {
		// TODO Auto-generated method stub
		BookInfo bookinfo = (BookInfo)session.get(BookInfo.class, bookid);
		tran.commit();
		return bookinfo;
	}

}
