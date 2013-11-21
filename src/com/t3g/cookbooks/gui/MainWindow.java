package com.t3g.cookbooks.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

import com.t3g.cookbooks.gui.panel.body.BodyRegister;
import com.t3g.cookbooks.gui.panel.header.HeaderUnregistered;

import java.awt.BorderLayout;

public class MainWindow extends JFrame {

	JPanel panelHeader, panelBody;

	public MainWindow() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		panelHeader = new HeaderUnregistered();
		getContentPane().add(panelHeader);

		panelBody = new BodyRegister();
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
