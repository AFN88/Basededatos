package b4Wheel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Wadmin extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	ImageIcon mlogo = new ImageIcon("logo4w.png");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wadmin frame = new Wadmin();
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
	public Wadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		this.setExtendedState(MAXIMIZED_BOTH);
		double w = this.getSize().getWidth();
		double h = this.getSize().getHeight();
		System.out.println(w);
		System.out.println(h);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnIngresar = new JMenu("Archivo");
		menuBar.add(mnIngresar);
		
		JMenu mnIngresar_1 = new JMenu("Ingresar");
		mnIngresar.add(mnIngresar_1);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IngCliente ic = new IngCliente();
				desktopPane.add(ic);
				ic.show();
				ic.setSize(800,600);
				ic.setClosable(true);
				
			}
		});
		mnIngresar_1.add(mntmClientes);
		
		JMenuItem mntmProveedor = new JMenuItem("Proveedor");
		mnIngresar_1.add(mntmProveedor);
		
		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mnIngresar_1.add(mntmVendedor);
		
		JMenu mnBuscar = new JMenu("Buscar");
		mnIngresar.add(mnBuscar);
		
		JMenuItem mntmCliente_2 = new JMenuItem("Cliente");
		mnBuscar.add(mntmCliente_2);
		
		JMenuItem mntmProveedor_2 = new JMenuItem("Proveedor");
		mnBuscar.add(mntmProveedor_2);
		
		JMenuItem mntmVendedor_2 = new JMenuItem("Vendedor");
		mnBuscar.add(mntmVendedor_2);
		
		JSeparator separator = new JSeparator();
		mnIngresar.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnIngresar.add(mntmSalir);
		
		JMenu mnNewMenu = new JMenu("Editar");
		menuBar.add(mnNewMenu);
		
		JMenu mnModificar = new JMenu("Modificar");
		mnNewMenu.add(mnModificar);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnModificar.add(mntmCliente);
		
		JMenuItem mntmProveedor_1 = new JMenuItem("Proveedor");
		mnModificar.add(mntmProveedor_1);
		
		JMenuItem mntmVendedor_1 = new JMenuItem("Vendedor");
		mnModificar.add(mntmVendedor_1);
		
		JMenu mnEliminar = new JMenu("Eliminar");
		mnNewMenu.add(mnEliminar);
		
		JMenuItem mntmCliente_1 = new JMenuItem("Cliente");
		mnEliminar.add(mntmCliente_1);
		
		JMenuItem mntmProveedor_3 = new JMenuItem("Proveedor");
		mnEliminar.add(mntmProveedor_3);
		
		JMenuItem mntmVendedor_3 = new JMenuItem("Vendedor");
		mnEliminar.add(mntmVendedor_3);
		
		JMenu mnAdministracin = new JMenu("Administraci\u00F3n");
		menuBar.add(mnAdministracin);
		
		JMenuItem mntmReportes = new JMenuItem("Reportes");
		mnAdministracin.add(mntmReportes);
		
		JMenu mnAlmacen = new JMenu("Almacen");
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnAlmacen.add(mntmBuscar);
		
		JMenuItem mntmIngresar = new JMenuItem("Ingresar");
		mnAlmacen.add(mntmIngresar);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnAlmacen.add(mntmModificar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnAlmacen.add(mntmEliminar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblLogp = new JLabel(mlogo);
		lblLogp.setBounds(150, 70, 1000, 500);
		desktopPane.add(lblLogp);
		
	}

}
