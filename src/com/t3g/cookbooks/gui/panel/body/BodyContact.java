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

public class BodyContact extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnBack;
	private JLabel jLabel2;
	private JLabel lblFirmat3g;
	private JLabel lblContacto2;
	private JLabel lblContacto3;
	private JSeparator separator;

	public BodyContact() {
		initialize();
	}

	public void initialize() {
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack = new JButton();
		lblFirmat3g = new JLabel();

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new Dimension(712, 587));

		jLabel2.setText("CONTACTO");

		btnBack.setBackground(new java.awt.Color(255, 0, 0));
		btnBack.setText("VOLVER AL INICIO");
		btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnBackMousePressed(evt);
			}
		});
		
		lblFirmat3g.setText("DESARROLLADO POR T3G");
		
		JLabel lblContacto1 = new JLabel("Atencion al Cliente");
		lblContacto1.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto1.setForeground(new Color(0, 0, 153));
		lblContacto1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		lblContacto2 = new JLabel("Puede contactar nuestro servicio al cliente enviando un mail a:");
		lblContacto2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContacto2.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblContacto3 = new JLabel("contacto@cookbooks.com");
		lblContacto3.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto3.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblContacto4 = new JLabel("Si tenes dudas sobre alg\u00FAn producto, para ordenes ya en proceso, cont\u00E1ctese al:");
		lblContacto4.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblContacto5 = new JLabel("Tel\u00E9fono (54) 221 - 489 - 5858 o por fax (54) 221 - 489 - 5855");
		lblContacto5.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto5.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblContacto6 = new JLabel("Horario de Atenci\u00F3n");
		lblContacto6.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto6.setForeground(new Color(0, 0, 0));
		lblContacto6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblContacto7 = new JLabel("Lunes a Viernes de 9:00hs a 17:00hs (Hora Argentina)");
		lblContacto7.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto7.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setAlignmentY(0.0f);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblContacto4, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblContacto5, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblContacto3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblContacto2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblContacto1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(12)
								.addComponent(jLabel2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(276)
								.addComponent(btnBack)
								.addGap(151)
								.addComponent(lblFirmat3g)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(228)
							.addComponent(lblContacto6, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblContacto7, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel2)
							.addGap(46))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addComponent(lblContacto1)
					.addGap(18)
					.addComponent(lblContacto2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblContacto3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(97)
					.addComponent(lblContacto4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblContacto5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(lblContacto6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblContacto7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
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
