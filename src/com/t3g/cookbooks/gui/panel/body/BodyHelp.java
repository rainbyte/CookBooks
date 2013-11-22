package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;

import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class BodyHelp extends JPanel {

	private JButton btnBack;
	private JLabel jLabel2;
	private JSeparator jSeparator1;
	private JLabel lblFirmat3g;
	private JPanel panel, panel_1, panel_5;

	public BodyHelp() {
		initialize();
	}

	public void initialize() {
		jLabel2 = new JLabel();
		jSeparator1 = new JSeparator();
		btnBack = new JButton();
		lblFirmat3g = new JLabel();

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new Dimension(712, 587));

		jLabel2.setText("PREGUNTAS FRECUENTES");

		btnBack.setBackground(new java.awt.Color(255, 0, 0));
		btnBack.setText("VOLVER ATR�?S");
		btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnBackMousePressed(evt);
			}
		});
		
		lblFirmat3g.setText("DESARROLLADO POR T3G");
		
		JLabel lblQuestion1 = new JLabel("\u00BFComo busco un libro espec\u00EDfico?");
		lblQuestion1.setForeground(new Color(0, 0, 153));
		lblQuestion1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblAnswer1 = new JLabel("La b\u00FAsqueda se encuentra en la mayoria de las pantallas, ubicada en la parte superior izquierda, debajo del logo de CookBooks.");
		lblAnswer1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnswer1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAnswer1_2 = new JLabel("Ingrese el texto en el casillero, y luego presione el boton BUSCAR.");
		lblAnswer1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnswer1_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator separator = new JSeparator();
		
		JLabel lblQuestion2 = new JLabel("\u00BFComo compro un libro?");
		lblQuestion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion2.setForeground(new Color(0, 0, 153));
		lblQuestion2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblUseElSistema = new JLabel("Usa el sistema de \"Carro de Compras\" que opera similarmente al de una librer\u00EDa real, puede sumar libros al carrito ");
		lblUseElSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblUseElSistema.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblOQuitarLibros = new JLabel("o quitar libros del carrito en cualquier momento. Puede ordenar un libro haciendo click en el bot\u00F3n \"Agregar libro\".");
		lblOQuitarLibros.setHorizontalAlignment(SwingConstants.CENTER);
		lblOQuitarLibros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblSobreElMargen = new JLabel("Sobre el margen superior derecho el recuadro del carrito de compras le informa los libros y el valor de los mismos.");
		lblSobreElMargen.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobreElMargen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblAccedaAlCarrito = new JLabel("Acceda al carrito de compras (Cesto rojo) haciendo click en el mismo, y dentro de este modifique la cantidad");
		lblAccedaAlCarrito.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccedaAlCarrito.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblDeCadaLibro = new JLabel("de cada libro, adecuandola a la compra que quiera realizar.");
		lblDeCadaLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeCadaLibro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblpuedoCancelarUna = new JLabel("\u00BFPuedo cancelar una compra luego de emitida?");
		lblpuedoCancelarUna.setHorizontalAlignment(SwingConstants.CENTER);
		lblpuedoCancelarUna.setForeground(new Color(0, 0, 153));
		lblpuedoCancelarUna.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNoUnaVez = new JLabel("No. Una vez que confirmo su compra, no puede cancelarse la misma.");
		lblNoUnaVez.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoUnaVez.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblqueFormasDe = new JLabel("\u00BFQue formas de pago hay?");
		lblqueFormasDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblqueFormasDe.setForeground(new Color(0, 0, 153));
		lblqueFormasDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblLosPagosOnline = new JLabel("Los pagos online, son s\u00F3lo con tarjeta de cr\u00E9dito y en un s\u00F3lo pago.");
		lblLosPagosOnline.setHorizontalAlignment(SwingConstants.CENTER);
		lblLosPagosOnline.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JSeparator separator_3 = new JSeparator();
		
		JLabel lblenvanLibrosA = new JLabel("\u00BFEnv\u00EDan libros a mi provincia? \u00BFY a otros pa\u00EDses?");
		lblenvanLibrosA.setHorizontalAlignment(SwingConstants.CENTER);
		lblenvanLibrosA.setForeground(new Color(0, 0, 153));
		lblenvanLibrosA.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblEnviamosSolamenteA = new JLabel("Enviamos solamente a todo el territorio de la Rep\u00FAblica Argentina. Todas las provincias correspondientes.");
		lblEnviamosSolamenteA.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnviamosSolamenteA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JSeparator separator_4 = new JSeparator();
		
		JLabel lblesSeguroUsar = new JLabel("\u00BFEs seguro usar tarjeta de cr\u00E9dito?");
		lblesSeguroUsar.setHorizontalAlignment(SwingConstants.CENTER);
		lblesSeguroUsar.setForeground(new Color(0, 0, 153));
		lblesSeguroUsar.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblParaResguardarLa = new JLabel("Para resguardar la seguridad de los datos en Internet se han desarrollado un n\u00FAmero de protocolos y aplicaciones ");
		lblParaResguardarLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaResguardarLa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblUsandoTcnicasDe = new JLabel("usando t\u00E9cnicas de encriptaci\u00F3n. En cookbook.com la seguridad esta garantizada por el uso de los protocolos Secure HTTP");
		lblUsandoTcnicasDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsandoTcnicasDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblYSecureSockets = new JLabel("y Secure Sockets Layer (SSL) que proveen de autenticaci\u00F3n para servidores y navegadores.");
		lblYSecureSockets.setHorizontalAlignment(SwingConstants.CENTER);
		lblYSecureSockets.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblCookbookcomHaSeleccionado = new JLabel("cookbook.com ha seleccionado el sistema de Pago Seguro de Decidir para la validaci\u00F3n de las tarjetas de cr\u00E9dito en l\u00EDnea.");
		lblCookbookcomHaSeleccionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblCookbookcomHaSeleccionado.setFont(new Font("Tahoma", Font.PLAIN, 12));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(12)
							.addComponent(jLabel2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(226)
							.addComponent(lblQuestion1))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(88)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(223)
							.addComponent(lblQuestion2, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(88)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(160)
							.addComponent(lblpuedoCancelarUna, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(89)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(161)
							.addComponent(lblqueFormasDe, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(90)
							.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(160)
							.addComponent(lblenvanLibrosA, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(91)
							.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(161)
							.addComponent(lblesSeguroUsar, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAnswer1, GroupLayout.PREFERRED_SIZE, 711, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNoUnaVez, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblDeCadaLibro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblUseElSistema, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblOQuitarLibros, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblAccedaAlCarrito, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblSobreElMargen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(20)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(256)
									.addComponent(btnBack)
									.addGap(151)
									.addComponent(lblFirmat3g))
								.addComponent(lblAnswer1_2, GroupLayout.PREFERRED_SIZE, 632, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLosPagosOnline, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
								.addComponent(lblEnviamosSolamenteA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(lblYSecureSockets, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCookbookcomHaSeleccionado, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsandoTcnicasDe, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
						.addComponent(lblParaResguardarLa, GroupLayout.PREFERRED_SIZE, 693, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
					.addGap(19)
					.addComponent(lblQuestion1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer1)
					.addGap(1)
					.addComponent(lblAnswer1_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQuestion2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblUseElSistema)
					.addGap(1)
					.addComponent(lblOQuitarLibros)
					.addGap(1)
					.addComponent(lblSobreElMargen)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAccedaAlCarrito)
					.addGap(1)
					.addComponent(lblDeCadaLibro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblpuedoCancelarUna, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNoUnaVez, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblqueFormasDe, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLosPagosOnline, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblenvanLibrosA, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnviamosSolamenteA, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblesSeguroUsar, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblParaResguardarLa, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblUsandoTcnicasDe, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblYSecureSockets, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCookbookcomHaSeleccionado, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirmat3g)
						.addComponent(btnBack))
					.addGap(15))
		);
		setLayout(jPanel2Layout);
	}

	private void btnBackMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBackMousePressed
		// TODO Evento para ir a la interfaz anterios (Principal?) QuizÃ¡s lo
		// mejor es hacer
		// que vaya a la principal... para simplificar pero no sÃ©
		// Es el evento del botÃ³n "VOLVER ATRÃ�S"
	}
}
