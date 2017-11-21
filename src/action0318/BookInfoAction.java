package action0318;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import factory0318.DAOFactory;
import pojo0318.BookInfo;
import pojo0318.BookType;

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
		List<BookInfo> list = DAOFactory.getBookInfoInstances().findAllBookInfo();
		if (list.size() > 0){
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession hsession = request.getSession();
			hsession.setAttribute("bookinfo", list);
		}
		return SUCCESS;
	}
	
	// 添加全部图书信息
	public String addBookInfo() throws Exception{
		if(DAOFactory.getBookInfoInstances().addBookInfo(bookinfo)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 修改图书信息
	public String updateBookInfo() throws Exception{
		if (DAOFactory.getBookInfoInstances().updateBookInfo(bookinfo)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 删除图书信息
	public String deleteBookInfo() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		DAOFactory.getBookInfoInstances().deleteBookInfo(bookid);
		return SUCCESS;
	}
	
	// 查询单个图书信息
	public String findOneBookInfo() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession hsession = request.getSession();
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		BookInfo bookinfo = DAOFactory.getBookInfoInstances().findBookInfoById(bookid);
		
		hsession.setAttribute("bookid", bookinfo.getBookid());
		hsession.setAttribute("bookname", bookinfo.getBookname());
		hsession.setAttribute("booktypename", bookinfo.getBooktypename());
		hsession.setAttribute("author", bookinfo.getAuthor());
		hsession.setAttribute("pubname", bookinfo.getPubname());
		hsession.setAttribute("isbn", bookinfo.getIsbn());
		hsession.setAttribute("price", bookinfo.getPrice());
		
		return SUCCESS;
	}

}
