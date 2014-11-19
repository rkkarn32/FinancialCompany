package com.financial.application;

import java.util.ArrayList;

import javax.swing.UIManager;

import com.financial.controller.AbstractFrmController;
import com.financial.controller.DefaultFrmController;
import com.financial.controller.IFrmController;
import com.financial.factories.FinancialFactory;
import com.financial.factories.IFinancialFactory;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;

public class FinCo {
	
	private static AbstractFrm mainView ;
	private static IFrmController controller;
	//private static IFinancialFactory factory;
	
	
	
	/*
	 * Main Application for Factory
	 */
	
	public static void main(String[] args) {
		
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
			
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    if(controller== null){
		    	controller = new DefaultFrmController(new ArrayList<IAccount>(), new DefaultFrm("MyView"));
		    	IFinancialFactory factory = new FinancialFactory();
		    	controller.setFinancialFactory(factory);
		    	controller.updateView();
		    }
		    else
		    	controller.updateView();
		    
			//Create a new instance of our application's frame, and make it visible.
			//mainView.setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
	public static AbstractFrm getMainView() {
		return mainView;
	}
	public void setMainView(AbstractFrm mainView) {
		this.mainView = mainView;
	}
	public static IFrmController getController() {
		return controller;
	}
	public void setController(IFrmController controller){
		this.controller = controller;
	}
	
	
	
	
}
