package com.financial.view;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class AbstractFrm extends JFrame{
	
	/**
	 *Serial version  
	 */
	
	private static final long serialVersionUID = 1L;
	
	private DefaultTableModel model;

	/*
	 * Constructor for set a default view
	 */
	public AbstractFrm(String title) {
		super(title);
		//setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0,0));
		
		mainPanel= new JPanel();
		mainPanel.setLayout(null);
		
		setSize(575,310);		//Default Size for Main Window
		setVisible(false);
		
		getContentPane().add(BorderLayout.CENTER, mainPanel);
		model = getModel();
		table = new JTable(model);
		
		mainPanel.add(scrollPane);
		scrollPane.setBounds(12,92,444,160);
		scrollPane.getViewport().add(table);
        table.setBounds(0, 0, 420, 0);
		
        List<JButton> bList = getButtons();
        
		if(bList != null && bList.size()!=0)
		for (JButton button: bList)
			mainPanel.add(button);
	}
	
	public void updateView(DefaultTableModel model){
		if(model!=null)
		this.table.setModel(model);
		repaint();
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
	public abstract List<JButton> getButtonList();
	public abstract DefaultTableModel getModel();
	
	private JPanel mainPanel;
	private JScrollPane scrollPane = new JScrollPane();
	private JTable table = new JTable();

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
	
	
	
}
