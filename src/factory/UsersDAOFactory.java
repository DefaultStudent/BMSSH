package factory;

import dao.UsersDAO;
import impl.UsersDAOImpl;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-16
 *
 */

public class UsersDAOFactory {
	public static UsersDAO getUserInstances(){
		return new UsersDAOImpl();
	}

}
