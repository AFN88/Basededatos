package b4Wheel;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.Font;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import javax.swing.JDesktopPane;
import org.eclipse.swt.graphics.Point;
import java.awt.Color;

public class Admon extends JFrame {

	private JPanel contentPane;
	ImageIcon cliente = new ImageIcon();
	private Menu m;
	private MenuItem bus, mod, rep;
	private MenuItem sepa, sepa1, sepa2, sepa3, sepa4;
	private MenuItem ing, eli, alma;
	/**
	 * @wbp.nonvisual location=40,79
	 */
	private final JDesktopPane desktopPane = new JDesktopPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admon frame = new Admon();
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
	public Admon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.setExtendedState(MAXIMIZED_BOTH);
		
		Display d = new Display();
		Shell s= new Shell(d);
		s.setMinimumSize(new Point(200, 200));
		s.setMaximized(true);
		
		
		m  = new Menu(s,SWT.BAR);
		
		ing = new MenuItem(m,SWT.CASCADE);
		ing.setText("Ingresar");
		
		final Menu ingmenu = new Menu(s,SWT.DROP_DOWN);
		ing.setMenu(ingmenu);
		
		final MenuItem ingclient = new MenuItem(ingmenu,SWT.PUSH);
		ingclient.setText("Cliente");
		final MenuItem ingprov = new MenuItem(ingmenu,SWT.PUSH);
		ingprov.setText("Proveedor");
		final MenuItem ingven = new MenuItem(ingmenu,SWT.PUSH);
		ingven.setText("Vendedor");
		
		sepa = new MenuItem(m,SWT.SEPARATOR);
		
		
		bus = new MenuItem(m,SWT.CASCADE);
		bus.setText("Buscar");
		
		final Menu busmenu = new Menu(s,SWT.DROP_DOWN);
		bus.setMenu(busmenu);
		
		final MenuItem busclient = new MenuItem(busmenu,SWT.PUSH);
		busclient.setText("Cliente");
		final MenuItem busprov = new MenuItem(busmenu,SWT.PUSH);
		busprov.setText("Proveedor");
		final MenuItem busven = new MenuItem(busmenu,SWT.PUSH);
		busven.setText("Vendedor");
		
		sepa1 = new MenuItem(m,SWT.SEPARATOR);
		
		eli = new MenuItem(m,SWT.CASCADE);
		eli.setText("Eliminar");
		
		final Menu elimenu = new Menu(s,SWT.DROP_DOWN);
		eli.setMenu(elimenu);
		
		final MenuItem eliclient = new MenuItem(elimenu,SWT.PUSH);
		eliclient.setText("Cliente");
		final MenuItem eliprov = new MenuItem(elimenu,SWT.PUSH);
		eliprov.setText("Proveedor");
		final MenuItem eliven = new MenuItem(elimenu,SWT.PUSH);
		eliven.setText("Vendedor");
		
		sepa2 = new MenuItem(m,SWT.SEPARATOR);
		
		mod = new MenuItem(m,SWT.CASCADE);
		mod.setText("Modificar");
		
		final Menu modmenu = new Menu(s,SWT.DROP_DOWN);
		mod.setMenu(modmenu);
		
		final MenuItem modclient = new MenuItem(modmenu,SWT.PUSH);
		modclient.setText("Cliente");
		final MenuItem modprov = new MenuItem(modmenu,SWT.PUSH);
		modprov.setText("Proveedor");
		final MenuItem modven = new MenuItem(modmenu,SWT.PUSH);
		modven.setText("Vendedor");
		
		sepa3 = new MenuItem(m,SWT.SEPARATOR);
		
		rep = new MenuItem(m,SWT.CASCADE);
		rep.setText("Reportes");
		
		sepa4 = new MenuItem(m,SWT.SEPARATOR);
		
		alma = new MenuItem(m,SWT.CASCADE);
		alma.setText("Almacen");
		
		
		s.setMenuBar(m);
		s.open();
		
		 while (!s.isDisposed()) {
		      if (!d.readAndDispatch())
		        d.sleep();
		    }
		    d.dispose();
		  
		   
		
	}
}
