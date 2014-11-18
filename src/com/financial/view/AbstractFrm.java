package com.financial.view;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sun.font.EAttribute;

public abstract class AbstractFrm extends JFrame{
	
	/**
	 *Serial version  
	 */
	
	private static final long serialVersionUID = 1L;
	
	private DefaultTableModel model= new DefaultTableModel();

	/*
	 * Constructor for set a default view
	 */
	public AbstractFrm(String title) {
		super(title);
		setBounds(10, 10, 300, 300);
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0,0));
		mainPanel.setLayout(null);
		
		setSize(575,310);		//Default Size for Main Window
		setVisible(false);
		
		getContentPane().add(BorderLayout.CENTER, mainPanel);
		model = getModel();
		
		mainPanel.add(scrollPane);
		
		for (JButton button: getButtons())
			mainPanel.add(button);
		
		
	}
		
	/*
	 * (non-Javadoc)
	 * @see java.awt.Window#setSize(int, int)
	 */
	public void setSize(int wiegth, int height){
		mainPanel.setBounds(0, 0, wiegth, height);
		super.setSize(wiegth, height);
	}
	public abstract List<JButton> getButtons();
	public abstract DefaultTableModel getModel();
	
	private JPanel mainPanel= new JPanel();
	private JScrollPane scrollPane = new JScrollPane();
	private JTable table = new JTable();
	
}
