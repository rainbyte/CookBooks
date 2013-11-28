package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class Help extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnBack;
	private JLabel jLabel2;
	private JSeparator jSeparator1;
	private JLabel lblFirmat3g;

	public Help() {
		initialize();
	}

	public void initialize() {
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Tahoma", Font.BOLD, 11));
		jSeparator1 = new JSeparator();
		btnBack = new JButton();
		lblFirmat3g = new JLabel();

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new Dimension(712, 587));

		jLabel2.setText("PREGUNTAS FRECUENTES");

		btnBack.setBackground(new java.awt.Color(255, 0, 0));
		btnBack.setText("VOLVER AL INICIO");
		btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnBackMousePressed(evt);
			}
		});

		lblFirmat3g.setText("DESARROLLADO POR T3G");

		JLabel lblQuestion1 = new JLabel(
				"\u00BFComo busco un libro espec\u00EDfico?");
		lblQuestion1.setForeground(new Color(0, 0, 153));
		lblQuestion1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblAnswer1 = new JLabel(
				"La b\u00FAsqueda se encuentra en la mayoria de las pantallas, ubicada en la parte superior izquierda, debajo del logo de CookBooks.");
		lblAnswer1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnswer1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblAnswer1_2 = new JLabel(
				"Ingrese el texto en el casillero, y luego presione el boton BUSCAR.");
		lblAnswer1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnswer1_2.setHorizontalAlignment(SwingConstants.CENTER);

		JSeparator separator1 = new JSeparator();

		JLabel lblQuestion2 = new JLabel("\u00BFComo compro un libro?");
		lblQuestion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion2.setForeground(new Color(0, 0, 153));
		lblQuestion2.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblAnswer2 = new JLabel(
				"Usa el sistema de \"Carro de Compras\" que opera similarmente al de una librer\u00EDa real, puede sumar libros al carrito ");
		lblAnswer2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer2_2 = new JLabel(
				"o quitar libros del carrito en cualquier momento. Puede ordenar un libro haciendo click en el bot\u00F3n \"Agregar libro\".");
		lblAnswer2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer2_3 = new JLabel(
				"Sobre el margen superior derecho el recuadro del carrito de compras le informa los libros y el valor de los mismos.");
		lblAnswer2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer2_4 = new JLabel(
				"Acceda al carrito de compras (Cesto rojo) haciendo click en el mismo, y dentro de este modifique la cantidad");
		lblAnswer2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer2_5 = new JLabel(
				"de cada libro, adecuandola a la compra que quiera realizar.");
		lblAnswer2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer2_5.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSeparator separator2 = new JSeparator();

		JLabel lblQuestion3 = new JLabel(
				"\u00BFPuedo cancelar una compra luego de emitida?");
		lblQuestion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion3.setForeground(new Color(0, 0, 153));
		lblQuestion3.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblAnswer3 = new JLabel(
				"No. Una vez que confirmo su compra, no puede cancelarse la misma.");
		lblAnswer3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer3.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSeparator separator3 = new JSeparator();

		JLabel lblQuestion4 = new JLabel("\u00BFQue formas de pago hay?");
		lblQuestion4.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion4.setForeground(new Color(0, 0, 153));
		lblQuestion4.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblAnswer4 = new JLabel(
				"Los pagos online, son s\u00F3lo con tarjeta de cr\u00E9dito y en un s\u00F3lo pago.");
		lblAnswer4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer4.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSeparator separator4 = new JSeparator();

		JLabel lblQuestion5 = new JLabel(
				"\u00BFEnv\u00EDan libros a mi provincia? \u00BFY a otros pa\u00EDses?");
		lblQuestion5.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion5.setForeground(new Color(0, 0, 153));
		lblQuestion5.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblAnswer5 = new JLabel(
				"Enviamos solamente a todo el territorio de la Rep\u00FAblica Argentina. Todas las provincias correspondientes.");
		lblAnswer5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer5.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSeparator separator5 = new JSeparator();

		JLabel lblQuestion6 = new JLabel(
				"\u00BFEs seguro usar tarjeta de cr\u00E9dito?");
		lblQuestion6.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion6.setForeground(new Color(0, 0, 153));
		lblQuestion6.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblAnswer6 = new JLabel(
				"Para resguardar la seguridad de los datos en Internet se han desarrollado un n\u00FAmero de protocolos y aplicaciones ");
		lblAnswer6.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer6.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer6_2 = new JLabel(
				"usando t\u00E9cnicas de encriptaci\u00F3n. En cookbook.com la seguridad esta garantizada por el uso de los protocolos Secure HTTP");
		lblAnswer6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer6_3 = new JLabel(
				"y Secure Sockets Layer (SSL) que proveen de autenticaci\u00F3n para servidores y navegadores.");
		lblAnswer6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer6_3.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblAnswer6_4 = new JLabel(
				"cookbook.com ha seleccionado el sistema de Pago Seguro de Decidir para la validaci\u00F3n de las tarjetas de cr\u00E9dito en l\u00EDnea.");
		lblAnswer6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer6_4.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSeparator separator6 = new JSeparator();
		separator6.setBackground(Color.BLACK);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(226)
							.addComponent(lblQuestion1))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(88)
							.addComponent(separator1, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(223)
							.addComponent(lblQuestion2, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(88)
							.addComponent(separator2, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(160)
							.addComponent(lblQuestion3, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(89)
							.addComponent(separator3, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(161)
							.addComponent(lblQuestion4, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(90)
							.addComponent(separator4, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(160)
							.addComponent(lblQuestion5, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(91)
							.addComponent(separator5, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(161)
							.addComponent(lblQuestion6, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAnswer1, GroupLayout.PREFERRED_SIZE, 711, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblAnswer3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblAnswer2_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblAnswer2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblAnswer2_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblAnswer2_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblAnswer2_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(20)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(256)
									.addComponent(btnBack)
									.addGap(151)
									.addComponent(lblFirmat3g))
								.addComponent(lblAnswer1_2, GroupLayout.PREFERRED_SIZE, 632, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAnswer4, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
								.addComponent(lblAnswer5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(lblAnswer6_3, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAnswer6_4, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAnswer6_2, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
						.addComponent(lblAnswer6, GroupLayout.PREFERRED_SIZE, 693, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(12)
							.addComponent(jLabel2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator6, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel2)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(separator6, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
								.addGap(8))
							.addComponent(jSeparator1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
					.addGap(19)
					.addComponent(lblQuestion1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer1)
					.addGap(1)
					.addComponent(lblAnswer1_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQuestion2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer2)
					.addGap(1)
					.addComponent(lblAnswer2_2)
					.addGap(1)
					.addComponent(lblAnswer2_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAnswer2_4)
					.addGap(1)
					.addComponent(lblAnswer2_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQuestion3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQuestion4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQuestion5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQuestion6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAnswer6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblAnswer6_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblAnswer6_3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnswer6_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirmat3g)
						.addComponent(btnBack))
					.addGap(15))
		);
		setLayout(jPanel2Layout);
	}

	private void btnBackMousePressed(java.awt.event.MouseEvent evt) {
		// TODO Evento para ir a la interfaz anterios (Principal?)
		// Es el evento del boton "VOLVER ATRAS"
	}
}
