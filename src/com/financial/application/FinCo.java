package com.financial.application;

import javax.swing.UIManager;

import project.bank.BankFrm;

import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;

public class FinCo {
	
	private static AbstractFrm mainView ;
	
	public void setMainView(AbstractFrm mainView) {
		this.mainView = mainView;
	}
	
	
	/*
	 * Main Application for Factory
	 */
	public static void main(String[] args) {
		
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
			
		    if(mainView ==null)
			mainView = new DefaultFrm("Default Display");
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    
			//Create a new instance of our application's frame, and make it visible.
			mainView.setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
}
