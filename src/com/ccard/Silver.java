package com.ccard;

public class Silver extends CCard{

	public Silver(double initialBalance) {
		super(initialBalance);
		
		super.setMI(0.08);
		super.setMP(0.12);
	}

}
