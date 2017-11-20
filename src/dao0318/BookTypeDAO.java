package dao0318;

import java.util.List;

import pojo0318.BookType;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-20
 *
 */

public interface BookTypeDAO {
	
	// 查询全部图书类型信息
	public List<BookType> findAllBookType() throws Exception;
	
	// 添加图书类型信息
	public boolean addBookType(BookType booktype) throws Exception;
	
	// 修改图书类型信息
	public boolean updateBookType(BookType booktype) throws Exception;
	
	// 删除图书类型信息
	public boolean deleteBookType(int booktypeid) throws Exception;

}
