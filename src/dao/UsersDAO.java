package dao;

import java.util.List;

import pojo.Users;

/**
 * 包含对用户的操作
 * @author Simon
 * @version 1.0 2017-11-14
 *
 */

public interface UsersDAO {
	
	//登陆
	public boolean loginUsers(Users users) throws Exception;
	
	//查看全部用户信息
	public List<Users> findAllUsers() throws Exception;
	
	//根据uid查询单个用户信息
	public Users findUsersById(int uid) throws Exception;
	
	//注册
	public boolean registerUsers(Users users) throws Exception;
	
	//修改
	public boolean updateUsers(Users users) throws Exception;
	
	//删除
	public boolean deleteUsers(int uid) throws Exception;

}
