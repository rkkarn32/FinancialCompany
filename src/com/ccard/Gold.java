package com.ccard;

public class Gold extends CCard {

	public Gold(double initialBalance) {
		super(initialBalance);
		super.setMI(0.06);
		super.setMP(0.10);
	}

}
