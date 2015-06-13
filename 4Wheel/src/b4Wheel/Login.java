package b4Wheel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Calibri", Font.BOLD, 12));
		lblUsuario.setBounds(35, 26, 46, 14);
		panel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Calibri", Font.BOLD, 12));
		lblContrasea.setBounds(35, 65, 68, 14);
		panel.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(112, 22, 154, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Calibri", Font.BOLD, 12));
		btnIngresar.setBounds(122, 97, 89, 23);
		panel.add(btnIngresar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 61, 153, 20);
		panel.add(passwordField);
	}
}
