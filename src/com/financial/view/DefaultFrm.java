package com.financial.view;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DefaultFrm extends JFrame{
	
	/**
	 *Serial version  
	 */
	
	private static final long serialVersionUID = 1L;

	/*
	 * Constructor for set a default view
	 */
	public DefaultFrm(String title) {
		super(title);
		setBounds(10, 10, 300, 300);
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0,0));
		setSize(575,310);		//Default Size for Main Window
		setVisible(false);
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
	}
	
	public List<JButton> getButtonList(){
		return null;
	}
	/*
	 * (non-Javadoc)
	 * @see java.awt.Window#setSize(int, int)
	 */
	public void setSize(int wiegth, int height){
		super.setSize(wiegth, height);
	}
	
	private JPanel mainPanel;
	
}
