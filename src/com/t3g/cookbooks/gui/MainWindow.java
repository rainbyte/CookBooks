package com.t3g.cookbooks.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.t3g.cookbooks.gui.abstraction.MainWindowLogic;
import com.t3g.cookbooks.gui.abstraction.PanelBody;
import com.t3g.cookbooks.gui.abstraction.PanelHeader;
import com.t3g.cookbooks.gui.panel.body.Contact;
import com.t3g.cookbooks.gui.panel.body.Help;
import com.t3g.cookbooks.gui.panel.body.Home;
import com.t3g.cookbooks.gui.panel.body.RecoverPass;
import com.t3g.cookbooks.gui.panel.body.Register;
import com.t3g.cookbooks.gui.panel.body.admin.Catalogue;
import com.t3g.cookbooks.gui.panel.body.admin.OrderAsAdmin;
import com.t3g.cookbooks.gui.panel.body.user.MyAccount;
import com.t3g.cookbooks.gui.panel.body.user.OrderAsUser;
import com.t3g.cookbooks.gui.panel.header.Registered;
import com.t3g.cookbooks.gui.panel.header.Unregistered;
import com.t3g.cookbooks.session.SessionManager;

public class MainWindow extends JFrame implements MainWindowLogic {
	private static final long serialVersionUID = 1L;

	private boolean hasPanelHeader = false, hasPanelBody = false;
	private PanelHeader panelHeader;
	private PanelBody panelBody, panelBodyPrev;
	
	public MainWindow() {
		getContentPane().setBackground(new Color(153, 153, 255));
		this.setMinimumSize(new Dimension(800, 768));
		getContentPane().setLayout(null);

		setPanelHeader(new Unregistered(this));
		setPanelBody(new Home(this));
		
		panelBodyPrev = panelBody;
	}

	public void setPanelHeader(PanelHeader header) {
		if (header == null) return;

		// Remove previous panel
		if (hasPanelHeader)	getContentPane().remove(panelHeader);
			
		// Instantiate new panel
		panelHeader = header;
		panelHeader.setBounds(0, 0, 784, 165);
		getContentPane().add(panelHeader);
				
		// Rearrange components
		getContentPane().revalidate();
		repaint();
		
		// Set state
		hasPanelHeader = true;
	}

	public void setPanelBody(PanelBody body) {
		if (body == null) return;
		
		// Remove previous panel
		if (hasPanelBody) {
			panelBodyPrev = panelBody;
			getContentPane().remove(panelBody);
		}
				
		// Instantiate new panel		
		panelBody = body;
		panelBody.setBounds(0, 160, 784, 569);
		getContentPane().add(panelBody);
				
		// Rearrange components
		getContentPane().revalidate();
		repaint();
		
		// Set state
		hasPanelBody = true;
	}

	public void goContact() {
		setPanelBody(new Contact(this));
	}

	public void goHelp() {
		setPanelBody(new Help(this));		
	}

	public void goHome() {
		boolean isAdminSession = SessionManager.isAdminSession();
		
		if (isAdminSession) {
			setPanelBody(new Catalogue(this));
		} else {
			setPanelBody(new Home(this));
		}
	}

	public void goMyAccount() {
		setPanelBody(new MyAccount(this));
	}
	
	public void goOrder() {
		boolean isAdminSession = SessionManager.isAdminSession();
		
		if (isAdminSession) {
			setPanelBody(new OrderAsAdmin(this));
		} else {
			setPanelBody(new OrderAsUser(this));
		}		
	}
	
	public void goPrevious() {
		setPanelBody(panelBodyPrev);
	}
	
	public void goRecoverPass() {
		// TODO (T3G) needs validation
		setPanelBody(new RecoverPass(this));
	}
	
	public void goRegister() {
		setPanelBody(new Register(this));		
	}

	public void useHeaderRegistered() {
		setPanelHeader(new Registered(this));
	}

	public void useHeaderUnregistered() {
		setPanelHeader(new Unregistered(this));	
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
