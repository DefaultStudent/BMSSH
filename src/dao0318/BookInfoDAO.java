package dao0318;

import java.util.List;

import pojo0318.BookInfo;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-19
 *
 */

public interface BookInfoDAO {
	
	// 查询全部图书信息
	public List<BookInfo> findAllBookInfo() throws Exception;
	
	// 添加图书信息
	public boolean addBookInfo(BookInfo bookinfo) throws Exception;
	
	// 修改图书信息
	public boolean updateBookInfo(BookInfo bookinfo) throws Exception;
	
	// 删除图书信息
	public boolean deleteBookInfo(int bookid) throws Exception;
	
	// 查询单个图书信息
	public BookInfo findBookInfoById(int bookid) throws Exception;

}
