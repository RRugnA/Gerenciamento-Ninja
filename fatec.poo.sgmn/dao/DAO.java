package dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

	void create(T t);
	
	List<T> read();
	
	void update(T t, String[] params);
	
	void delete(T t);

	Optional<T> get(long id);
}
