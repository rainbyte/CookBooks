package com.t3g.cookbooks.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.t3g.cookbooks.gui.panel.body.Contact;
import com.t3g.cookbooks.gui.panel.body.Help;
import com.t3g.cookbooks.gui.panel.body.Home;
import com.t3g.cookbooks.gui.panel.body.Register;
import com.t3g.cookbooks.gui.panel.header.Unregistered;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = 1L;
	public static String estado = "Home";
	JPanel panelHeader;
	static JPanel panelBody;

	public MainWindow() {
		getContentPane().setBackground(new Color(153, 153, 255));
		this.setMinimumSize(new Dimension(800, 768));
		getContentPane().setLayout(null);

		panelHeader = new Unregistered();
		panelHeader.setBounds(0, 0, 784, 165);
		getContentPane().add(panelHeader);

		panelBody = new Register();
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
