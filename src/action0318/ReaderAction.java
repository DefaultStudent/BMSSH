package action0318;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import factory0318.DAOFactory;
import pojo0318.Reader;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-19
 *
 */

public class ReaderAction extends ActionSupport {
	
	private Reader reader;

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}
	
	// 查询全部读者信息
	public String findAll() throws Exception{
		List<Reader> list = DAOFactory.getReaderInstances().findAllReader();
		if (list.size() > 0){
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession hsession = request.getSession();
			hsession.setAttribute("reader", list);
		}
		return SUCCESS;
	}
	
	// 添加读者信息
	public String addReader() throws Exception{
		if (DAOFactory.getReaderInstances().addReader(reader)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 修改读者信息
	public String updateReader() throws Exception{
		if (DAOFactory.getReaderInstances().updateReader(reader)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 删除读者信息
	public String deleteReader() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		int rid = Integer.parseInt(request.getParameter("rid"));
		DAOFactory.getReaderInstances().deleteReader(rid);
		return SUCCESS;
	}
	
	// 查询单个用户信息
	public String findOneReader() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession hsession = request.getSession();
		int rid = Integer.parseInt(request.getParameter("rid"));
		Reader reader = DAOFactory.getReaderInstances().findReaderById(rid);
		hsession.setAttribute("rid", reader.getRid());
		hsession.setAttribute("rname", reader.getRname());
		hsession.setAttribute("ridcard", reader.getRidcard());
		return SUCCESS;
	}

}
