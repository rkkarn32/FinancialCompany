package com.financial.persistance;

import java.util.List;

public interface IDao<T,R> { 
	
	public boolean persist(T object);
	public boolean remove(T object);
	public T getAccount(R object);
	public List<T> getAll();
}
