import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class confirmationEmail {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmationEmail window = new confirmationEmail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the application.
	 */
	public confirmationEmail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A confirmatiom has been sent to your email.");
		lblNewLabel.setBounds(85, 24, 292, 30);
		frame.getContentPane().add(lblNewLabel);
	}
}
