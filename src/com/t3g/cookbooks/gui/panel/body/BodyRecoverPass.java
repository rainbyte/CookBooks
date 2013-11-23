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

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

import com.t3g.cookbooks.gui.admin.catalogue.Home;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class BodyRecoverPass extends JPanel {
	private JPanel panel, panel_1, panel_5;
	private JTextField textMail;

	public BodyRecoverPass() {
		initialize();
	}

	public void initialize() {

		setBackground(new java.awt.Color(153, 153, 255));
		setAutoscrolls(true);
		setName(""); // NOI18N
		setPreferredSize(new java.awt.Dimension(674, 500));
		
		JLabel lblRecoverPass = new JLabel("Recuperar Contrase\u00F1a");
		lblRecoverPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBackground(Color.BLACK);
		
		JLabel lblForgotPass = new JLabel("\u00BFOlvistaste la contrase\u00F1a?");
		lblForgotPass.setForeground(new Color(102, 0, 153));
		lblForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel lblMailRequest = new JLabel("Ingrese su mail para recibir en su bandeja de entrada su contrase\u00F1a");
		
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
							.addGap(159)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMailRequest)
								.addComponent(lblForgotPass)))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblRecoverPass)
								.addGap(18)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
								.addGap(178)
								.addComponent(lblMail)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
									.addGroup(jPanel2Layout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textMail, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
									.addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(45)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnConfirm)
											.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblFirmat3g, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(18, Short.MAX_VALUE))
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
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(lblForgotPass)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblMailRequest)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMail))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnConfirm)
							.addPreferredGap(ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
							.addComponent(btnBack))
						.addComponent(lblFirmat3g))
					.addGap(26))
		);
		setLayout(jPanel2Layout);
	}
}
