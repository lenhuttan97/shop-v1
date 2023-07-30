package tan.le.shop1.service;

import java.util.List;

public interface GenericServcie<T>{
	
	List<T> findAll();
	
	T findById(Long Id);
	
	T save(T t);
	
	Boolean update(T t);
	
	Boolean delete(T t);
	
	List<T> saveBatch (List<T> list);
}
