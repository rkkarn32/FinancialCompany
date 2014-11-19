package com.financial.persistance;

public interface IDao<T,R> { 
	
	public boolean persist(T object);
	public boolean remove(T object);
	public T getAccount(R object);
}
