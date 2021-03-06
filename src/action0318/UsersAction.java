package action0318;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import factory0318.DAOFactory;
import pojo0318.Users;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-14
 *
 */

public class UsersAction extends ActionSupport {
	private Users users;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	// 用户登陆
	public String login() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession hsession = request.getSession();
		
		if (DAOFactory.getUserInstances().loginUsers(users)){
			hsession.setAttribute("uname", users.getUname());
			hsession.setAttribute("limit", users.getLimit());
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 用户注册
	public String register() throws Exception{
		if (DAOFactory.getUserInstances().registerUsers(users)){
			return SUCCESS;
		} else {
			return INPUT;
		}
		
	}
	
	// 用户查询
	public String queryall() throws Exception{
		List<Users> list = DAOFactory.getUserInstances().findAllUsers();
		if (list.size() > 0){
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession hsession = request.getSession();
			hsession.setAttribute("users", list);
		}
		return SUCCESS;
	}
	
	// 根据uid查询
	public String queryByUid() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		int uid = Integer.parseInt(request.getParameter("uid"));
		DAOFactory.getUserInstances().findUsersById(uid);
		HttpSession hsession = request.getSession();
		
		hsession.setAttribute("uid", users.getUid());
		hsession.setAttribute("uname", users.getUname());
		hsession.setAttribute("upwd", users.getUpwd());
		hsession.setAttribute("ulimit", users.getLimit());
		
		return SUCCESS;
	}
	
	// 修改用户信息
	public String update() throws Exception{
		if (DAOFactory.getUserInstances().updateUsers(users)){
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	// 删除用户信息
	public String delete() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		int uid = Integer.parseInt(request.getParameter("uid"));
		DAOFactory.getUserInstances().deleteUsers(uid);
		return SUCCESS;
	}

}
