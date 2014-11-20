package com.financial.view;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Dialog_Report extends JDialog{
	
	protected JButton buttonOk;
	protected JButton buttonCancel;
	protected JLabel labelShow;
	protected JScrollPane scrollPane;
	
	public Dialog_Report(AbstractFrm parent, StringBuilder msg){
		super(parent);
		setSize(405,370 );
		buttonOk = new JButton();
		buttonCancel = new JButton();
		labelShow = new JLabel();
		scrollPane = new JScrollPane();
		
		scrollPane.setBounds(24,24,358,240);
		getContentPane().add(scrollPane);
		
		labelShow.setText(msg.toString());
		labelShow.setBounds(0,0,355,237);
		getContentPane().add(labelShow);
		
		scrollPane.getViewport().add(labelShow);
		
		buttonOk.setText("Ok");
		buttonOk.setBounds(156,276,96,24);
		getContentPane().add(buttonOk);
		buttonOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("done");
				dispose();
			}
		});
		
	}
}
