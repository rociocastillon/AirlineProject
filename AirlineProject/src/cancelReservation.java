import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class cancelReservation {

	private JFrame frame;
	private JTextField NameTextField;
	private JTextField PNTextField;
	private JTextField FNTextField;
	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancelReservation window = new cancelReservation();
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
	public cancelReservation() {
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
		
		JLabel lblNewLabel = new JLabel("You have selected to cancel your reservation.");
		lblNewLabel.setBounds(80, 53, 300, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please fill out the following information:");
		lblNewLabel_1.setBounds(100, 70, 300, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel NameLabel = new JLabel("Name:");
		NameLabel.setBounds(90, 100, 50, 16);
		frame.getContentPane().add(NameLabel);
		
		JLabel PNLabel = new JLabel("Phone Number:");
		PNLabel.setBounds(35, 125, 100, 16);
		frame.getContentPane().add(PNLabel);
		
		JLabel FNLabel = new JLabel("Flight Number:");
		FNLabel.setBounds(35, 150, 100, 16);
		frame.getContentPane().add(FNLabel);
		
		NameTextField = new JTextField();
		NameTextField.setBounds(158, 95, 130, 26);
		frame.getContentPane().add(NameTextField);
		NameTextField.setColumns(10);
		
		PNTextField = new JTextField();
		PNTextField.setBounds(158, 120, 130, 26);
		frame.getContentPane().add(PNTextField);
		PNTextField.setColumns(10);
		
		FNTextField = new JTextField();
		FNTextField.setBounds(158, 145, 130, 26);
		frame.getContentPane().add(FNTextField);
		FNTextField.setColumns(10);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		backButton.setBounds(6, 223, 117, 29);
		frame.getContentPane().add(backButton);
		
		JButton backButton_1 = new JButton("Next");
		backButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButton_1.setBounds(306, 223, 117, 29);
		frame.getContentPane().add(backButton_1);
		
		
	}
	
}


