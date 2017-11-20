package factory0318;

import dao0318.BookInfoDAO;
import dao0318.BookTypeDAO;
import dao0318.ReaderDAO;
import dao0318.UsersDAO;
import impl0318.BookInfoDAOImpl;
import impl0318.BookTypeDAOImpl;
import impl0318.ReaderDAOImpl;
import impl0318.UsersDAOImpl;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-16
 *
 */

public class DAOFactory {
	// 用户
	public static UsersDAO getUserInstances(){
		return new UsersDAOImpl();
	}
	
	// 读者
	public static ReaderDAO getReaderInstances(){
		return new ReaderDAOImpl();
	}
	
	// 图书信息
	public static BookInfoDAO getBookInfoInstances(){
		return new BookInfoDAOImpl();
	}
	
	// 图书类型
	public static BookTypeDAO getBookTypeInstances(){
		return new BookTypeDAOImpl();
	}

}
