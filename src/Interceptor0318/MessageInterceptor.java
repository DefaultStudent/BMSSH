package Interceptor0318;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import action0318.BookTypeAction;

/**
 * 
 * @author Simon
 * @version 1.0 2017-12-5
 *
 */

public class MessageInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		BookTypeAction bookTypeAction = (BookTypeAction) ai.getAction();
		String bookTypeName = bookTypeAction.getBooktype().getBooktypename();
		System.out.println("lll" + bookTypeName);
		
		if (bookTypeName.contains("低")){
			bookTypeName = bookTypeName.replaceAll("低", "*");
			bookTypeAction.getBooktype().setBooktypename(bookTypeName);
		}
		return ai.invoke();
	}

}
