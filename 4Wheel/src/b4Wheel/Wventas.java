package b4Wheel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;

import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JCheckBox;

public class Wventas extends JFrame {

	private JPanel contentPane;
	ImageIcon logo = new ImageIcon("4wp-logo.png");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblCliente;
	private JLabel lblProducto;
	private JLabel lblVendedor;
	private JList list;
	private JLabel lblDescripcin;
	private JTextPane textPane;
	private JLabel lblImagen;
	private JButton btnRealizarVenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wventas frame = new Wventas();
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
	public Wventas() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.setExtendedState(MAXIMIZED_BOTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		lblProducto.setBounds(58, 86, 89, 19);
		panel.add(lblProducto);
		
		textField = new JTextField();
		textField.setBounds(142, 44, 190, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		lblCliente.setBounds(58, 45, 72, 19);
		panel.add(lblCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 85, 190, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		lblVendedor = new JLabel("Vendedor:");
		lblVendedor.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		lblVendedor.setBounds(58, 125, 73, 19);
		panel.add(lblVendedor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(142, 124, 190, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLogo = new JLabel(logo);
		lblLogo.setBounds(939, 45, 215, 72);
		panel.add(lblLogo);
		
		list = new JList();
		list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list.setBounds(58, 198, 460, 200);
		panel.add(list);
		
		lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		lblDescripcin.setBounds(546, 169, 81, 14);
		panel.add(lblDescripcin);
		
		textPane = new JTextPane();
		textPane.setBackground(SystemColor.control);
		textPane.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		textPane.setBounds(546, 198, 300, 200);
		panel.add(textPane);
		
		lblImagen = new JLabel("imagen");
		lblImagen.setBounds(892, 201, 300, 200);
		panel.add(lblImagen);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		btnAgregar.setBounds(1103, 412, 89, 23);
		panel.add(btnAgregar);
		
		JLabel lblNcliente = new JLabel("NCliente");
		lblNcliente.setBounds(58, 454, 46, 14);
		panel.add(lblNcliente);
		
		JList list_1 = new JList();
		list_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		list_1.setBounds(58, 479, 1134, 170);
		panel.add(list_1);
		
		btnRealizarVenta = new JButton("Realizar venta");
		btnRealizarVenta.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		btnRealizarVenta.setBounds(1054, 649, 126, 23);
		panel.add(btnRealizarVenta);
		
		JCheckBox chckbxFactura = new JCheckBox("Factura");
		chckbxFactura.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		chckbxFactura.setBounds(940, 649, 97, 23);
		panel.add(chckbxFactura);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		btnLimpiar.setBounds(58, 661, 89, 23);
		panel.add(btnLimpiar);
	}
}
