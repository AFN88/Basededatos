package b4Wheel;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;

public class IngProveedor extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngProveedor frame = new IngProveedor();
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
	public IngProveedor() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 800, 600);

	}

}
