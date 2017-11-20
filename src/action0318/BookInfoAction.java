package action0318;

import com.opensymphony.xwork2.ActionSupport;

import pojo0318.BookInfo;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-20
 *
 */

public class BookInfoAction extends ActionSupport {
	private BookInfo bookinfo;

	public BookInfo getBookinfo() {
		return bookinfo;
	}

	public void setBookinfo(BookInfo bookinfo) {
		this.bookinfo = bookinfo;
	}
	
	// 查询全部图书信息操作
	public String findAll() throws Exception{
		return SUCCESS;
	}

}
