import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class DepartingFlight {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartingFlight window = new DepartingFlight();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	FileWriter fw;
	
	/**
	 * Create the application.
	 */
	public DepartingFlight() {
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
		
		JLabel lblNewLabel = new JLabel("Thank you for that information. Next choose your departing city and time:");
		lblNewLabel.setBounds(16, 6, 428, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Los Angeles -> Las Vegas  8:30 AM Departure");
		rdbtnNewRadioButton.setBounds(36, 58, 418, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("(Note: All flights and times are 7 days a week.");
		lblNewLabel_1.setBounds(16, 24, 406, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Los Angeles ->  Phoenix 10:00 AM Departure");
		rdbtnNewRadioButton_1.setBounds(36, 93, 371, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Los Angeles -> San Francisco  1:00 PM Departure");
		rdbtnNewRadioButton_2.setBounds(36, 128, 386, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Los Angeles ->  San Diego   4:00 PM Departure ");
		rdbtnNewRadioButton_3.setBounds(36, 163, 371, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		
	}
}
