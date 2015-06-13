package b4Wheel;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class IngCliente extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	ImageIcon logo1 = new ImageIcon("4logogde.png");
	private JLabel lblLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngCliente frame = new IngCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IngCliente() {
		setBounds(1, 1, 800, 600);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		
		JLabel lblNombreraznSocial = new JLabel("Nombre/Raz\u00F3n Social:");
		lblNombreraznSocial.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		lblNombreraznSocial.setBounds(60, 62, 158, 23);
		panel.add(lblNombreraznSocial);
		
		textField = new JTextField();
		textField.setBounds(210, 63, 463, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		lblTelfono.setBounds(60, 115, 70, 16);
		panel.add(lblTelfono);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 114, 171, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail:");
		lblEmail.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		lblEmail.setBounds(341, 117, 54, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(392, 114, 281, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRfc = new JLabel("R.F.C. :");
		lblRfc.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		lblRfc.setBounds(60, 173, 46, 14);
		panel.add(lblRfc);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 171, 281, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(584, 224, 89, 23);
		panel.add(btnIngresar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(485, 224, 89, 23);
		panel.add(btnLimpiar);
		
		lblLogo = new JLabel(logo1);
		lblLogo.setBounds(132, 259, 500, 300);
		panel.add(lblLogo);
		

	}
}
