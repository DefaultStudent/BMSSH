package factory0318;

import dao0318.ReaderDAO;
import dao0318.UsersDAO;
import impl0318.ReaderDAOImpl;
import impl0318.UsersDAOImpl;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-16
 *
 */

public class DAOFactory {
	public static UsersDAO getUserInstances(){
		return new UsersDAOImpl();
	}
	
	public static ReaderDAO getReaderInstances(){
		return new ReaderDAOImpl();
	}

}
