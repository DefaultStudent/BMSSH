package action0318;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import factory0318.DAOFactory;
import pojo0318.BookType;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-21
 *
 */

public class BookTypeAction extends ActionSupport {
	
	private BookType booktype;

	public BookType getBooktype() {
		return booktype;
	}

	public void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}
	
	// 查询全部图书类型信息
	public String findAll() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession hsession = request.getSession();
		List<BookType> list = DAOFactory.getBookTypeInstances().findAllBookType();
		if (list.size() > 0){
			
			hsession.setAttribute("booktype", list);
		}
		List<String> btname = new ArrayList<String>();
		for (BookType booktype : list){
			btname.add(booktype.getBooktypename());
		}
		hsession.setAttribute("bt", btname);
		return SUCCESS;
	}
	
	// 添加图书类型信息
	public String addBookType() throws Exception{
		if (DAOFactory.getBookTypeInstances().addBookType(booktype)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 修改图书类型信息
	public String updateBookType() throws Exception{
		if (DAOFactory.getBookTypeInstances().updateBookType(booktype)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 删除图书类型信息
	public String deleteBookType() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		int booktypeid = Integer.parseInt(request.getParameter("booktypeid"));
		DAOFactory.getBookTypeInstances().deleteBookType(booktypeid);
		return SUCCESS;
	}
	
	// 查询单个图书类型信息
	public String findBookTypeById() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession hsession = request.getSession();
		int booktypeid = Integer.parseInt(request.getParameter("booktypeid"));
		// 解决中文编码问题 String i=new String((request.getParameter("booktypeid")).getBytes("iso8859-1"),"gb18030");
		BookType booktype = DAOFactory.getBookTypeInstances().findBookTypeById(booktypeid);
		hsession.setAttribute("booktypeid", booktype.getBooktypeid());
		hsession.setAttribute("booktypename", booktype.getBooktypename());
		return SUCCESS;
		
	}

}
