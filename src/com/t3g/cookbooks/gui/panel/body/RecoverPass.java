package com.t3g.cookbooks.gui.panel.body;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class RecoverPass extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField textMail;

	public RecoverPass() {
		initialize();
	}

	public void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new java.awt.Dimension(674, 500));
		
		JLabel lblRecoverPass = new JLabel("RECUPERAR CONTRASE\u00D1A");
		lblRecoverPass.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBackground(Color.BLACK);
		
		JLabel lblForgotPass = new JLabel("\u00BFOlvidaste la contrase\u00F1a?");
		lblForgotPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPass.setForeground(new Color(0, 0, 153));
		lblForgotPass.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblMailRequest = new JLabel("Ingrese su mail para recibir en su bandeja de entrada su contrase\u00F1a");
		lblMailRequest.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnBack = new JButton();
		btnBack.setText("VOLVER AL INICIO");
		btnBack.setBackground(Color.RED);
		
		JLabel lblFirmat3g = new JLabel();
		lblFirmat3g.setText("DESARROLLADO POR T3G");
		
		textMail = new JTextField();
		textMail.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail:");
		
		JButton btnConfirm = new JButton("Confirmar");
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO "Enviar" un mail a la bandeja de entrada del mail ingresado verificando que sea valido
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(261)
							.addComponent(btnBack)
							.addGap(146)
							.addComponent(lblFirmat3g, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblRecoverPass)
								.addGap(18)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
									.addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(10)
										.addComponent(lblMailRequest, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
									.addComponent(lblForgotPass, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(166)
								.addComponent(lblMail)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textMail, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
								.addGap(28)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(270)
							.addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblRecoverPass))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(20)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblForgotPass)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMailRequest)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(11)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMail)
								.addComponent(textMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnConfirm)
							.addPreferredGap(ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
							.addComponent(btnBack))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFirmat3g)))
					.addGap(20))
		);
		setLayout(jPanel2Layout);
	}
}
