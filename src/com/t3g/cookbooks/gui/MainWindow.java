package com.t3g.cookbooks.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.t3g.cookbooks.gui.panel.body.BodyRegister;
import com.t3g.cookbooks.gui.panel.header.HeaderUnregistered;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel panelHeader, panelBody;

	public MainWindow() {
		getContentPane().setBackground(new Color(153, 153, 255));
		this.setMinimumSize(new Dimension(800, 768)); 
		getContentPane().setLayout(null);
		
		panelHeader = new HeaderUnregistered();
		panelHeader.setBounds(0, 0, 784, 165);
		getContentPane().add(panelHeader);

		panelBody = new BodyRegister();
		panelBody.setBounds(0, 160, 784, 569);
		getContentPane().add(panelBody);
		
	}

	public static void main(String[] args) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainWindow().setVisible(true);
			}
		});
	}
}
