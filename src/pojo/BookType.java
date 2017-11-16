package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-14
 *
 */

public class BookType {
	private int booktypeid;
	private String booktypename;
	private Set<BookInfo> bookinfo = new HashSet<BookInfo>();
	
	public int getBooktypeid() {
		return booktypeid;
	}
	public void setBooktypeid(int booktypeid) {
		this.booktypeid = booktypeid;
	}
	public String getBooktypename() {
		return booktypename;
	}
	public void setBooktypename(String booktypename) {
		this.booktypename = booktypename;
	}
	public Set<BookInfo> getBookinfo() {
		return bookinfo;
	}
	public void setBookinfo(Set<BookInfo> bookinfo) {
		this.bookinfo = bookinfo;
	}
	

}
