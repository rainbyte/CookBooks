package com.t3g.cookbooks.gui.panel.header;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.t3g.cookbooks.resources.Resources;

public class Registered extends JPanel {
	private static final long serialVersionUID = 1L;

	JButton btnLogin, btnSearch;
	JLabel lblPrincipalpicture, txtContac, txtHelp, txtHome, txtOrder,
			txtRegister;
	JTextField txtSearch;
	private JPanel panelSearchBar;
	private JPanel panelLogin1;
	private JPanel panelLogin2;
	private JPanel panelMainBar;
	private JLabel lblUsuario;

	public Registered() {
		initialize();
	}

	private void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));

		panelMainBar = new JPanel();
		panelMainBar.setBorder(null);
		panelMainBar.setBackground(new Color(153, 153, 255));
		panelMainBar.setBounds(0, 186, 778, 44);
		panelMainBar.setLayout(new BoxLayout(panelMainBar, BoxLayout.X_AXIS));
		setLayout(null);
		add(panelMainBar);
		lblPrincipalpicture = new JLabel();
		lblPrincipalpicture.setBounds(0, 0, 250, 168);
		add(lblPrincipalpicture);
		lblPrincipalpicture.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrincipalpicture.setVerticalAlignment(SwingConstants.TOP);

		lblPrincipalpicture.setIcon(Resources.getLogo());

		panelLogin2 = new JPanel();
		panelLogin2.setBackground(new Color(153, 153, 255));
		panelLogin2.setBounds(497, 32, 281, 38);
		add(panelLogin2);
		panelLogin2.setBorder(null);
		btnLogin = new JButton();
		panelLogin2.add(btnLogin);

		btnLogin.setText("Cerrar Sesi\u00F3n");

		panelLogin1 = new JPanel();
		panelLogin1.setBackground(new Color(153, 153, 255));
		panelLogin1.setBounds(497, 0, 281, 32);
		add(panelLogin1);
		panelLogin1.setBorder(null);
		panelLogin1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelLogin1.add(lblUsuario);

		panelSearchBar = new JPanel();
		panelSearchBar.setBounds(0, 131, 364, 44);
		add(panelSearchBar);
		panelSearchBar.setBorder(null);
		panelSearchBar.setBackground(new Color(153, 153, 255));
		panelSearchBar.setLayout(null);
		txtSearch = new JTextField();
		txtSearch.setBounds(10, 6, 260, 20);
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		panelSearchBar.add(txtSearch);

		txtSearch.setText("Buscar libro, autor, ISBN...");
		btnSearch = new JButton();
		btnSearch.setBounds(275, 4, 90, 25);
		panelSearchBar.add(btnSearch);

		btnSearch.setText("Buscar");

		JPanel panelToolBar = new JPanel();
		panelToolBar.setBounds(364, 129, 413, 44);
		add(panelToolBar);
		panelToolBar.setBorder(null);
		panelToolBar.setBackground(new Color(153, 153, 255));
		panelToolBar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		txtHome = new JLabel();
		txtHome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				txtHomeMousePressed(evt);
			}
		});
		panelToolBar.add(txtHome);

		txtHome.setForeground(new java.awt.Color(51, 51, 255));
		txtHome.setText("Libros");
		txtOrder = new JLabel();
		panelToolBar.add(txtOrder);

		txtOrder.setForeground(new java.awt.Color(51, 51, 255));
		txtOrder.setText("Pedidos");
		txtHelp = new JLabel();
		panelToolBar.add(txtHelp);

		txtHelp.setForeground(new java.awt.Color(51, 51, 255));
		txtHelp.setText("Ayuda");
		txtContac = new JLabel();
		panelToolBar.add(txtContac);

		txtContac.setForeground(new java.awt.Color(51, 51, 255));
		txtContac.setText("Contacto");
		txtRegister = new JLabel();
		panelToolBar.add(txtRegister);

		txtRegister.setForeground(new java.awt.Color(51, 51, 255));
		txtRegister.setText("Mi Cuenta");
		txtRegister.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				txtRegisterMousePressed(evt);
			}
		});
		txtContac.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				txtContacMousePressed(evt);
			}
		});
		txtHelp.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				txtHelpMousePressed(evt);
			}
		});
		txtOrder.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				txtOrderMousePressed(evt);
			}
		});
		btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnSearchMousePressed(evt);
			}
		});
		btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnLoginMousePressed(evt);
			}
		});
		lblPrincipalpicture.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				lblPrincipalpictureMousePressed(evt);
			}
		});
	}

	private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ingresar a la pagina, y loguearse. Abre pantalla
		// home pero ya logueado.
	}

	private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para realizar una busqueda, en txtSearch esta lo que
		// buscamos
	}

	private void lblPrincipalpictureMousePressed(java.awt.event.MouseEvent evt) {
		com.t3g.cookbooks.gui.MainWindow.estado = "Home";
	}
	
	private void txtHomeMousePressed(java.awt.event.MouseEvent evt){
		com.t3g.cookbooks.gui.MainWindow.estado = "Home";
	}

	private void txtRegisterMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz de MI CUENTA
	}

	private void txtContacMousePressed(java.awt.event.MouseEvent evt) {
		com.t3g.cookbooks.gui.MainWindow.estado = "Contact";
	}

	private void txtHelpMousePressed(java.awt.event.MouseEvent evt) {
		com.t3g.cookbooks.gui.MainWindow.estado = "Help";
	}

	private void txtOrderMousePressed(java.awt.event.MouseEvent evt) {
		com.t3g.cookbooks.gui.MainWindow.estado = "Order";
	}
}
