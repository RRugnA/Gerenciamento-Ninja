package dao;

import java.util.List;

public interface DAO<T> {

	void create(T t);
	
	List<T> read();
	
	//void update(T t, String[] params);
	void update(T t);
	
	void delete(T t);

	T getId(T t) ;
	
}
