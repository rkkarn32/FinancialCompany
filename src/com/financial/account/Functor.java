package com.financial.account;

public interface Functor<T,R> {
	public void compute(T compute);
	public R getValue();
}
