package dao0318;

import java.util.List;

import pojo0318.Reader;

/**
 * 
 * @author Simon
 * @version 1.0 2017-11-17
 * 包含对读者的各种操作
 */

public interface ReaderDAO {
	// 查询全部读者信息
	public List<Reader> findAllReader() throws Exception;
	
	// 根据rid查询读者信息
	public Reader findReaderById(int rid) throws Exception;
	
	// 修改读者信息
	public boolean updateReader(Reader reader) throws Exception;
	
	// 删除读者信息
	public boolean deleteReader(int rid) throws Exception;
	
	// 添加读者信息
	public boolean addReader(Reader reader) throws Exception;

}
