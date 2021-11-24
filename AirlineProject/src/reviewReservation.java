//
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reviewReservation {


	private JFrame frame;
	private JFrame frame2, frame3;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField number;
	private JTextField resNumber;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reviewReservation window = new reviewReservation();
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
	public reviewReservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); // create new frame used for getting customer information
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame2 = new JFrame(); //create frame for showing reservation details
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		frame3 = new JFrame(); // creating frame for showing error message
		frame3.setBounds(100, 100, 450, 200);
		frame3.getContentPane().setLayout(null);
		
		firstname = new JTextField(); //creates text box for user to input first name
		firstname.setBounds(189, 87, 130, 26);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		JTextArea txtrYouHaveSelcted = new JTextArea(); //creates heading message
		txtrYouHaveSelcted.setBackground(SystemColor.window);
		txtrYouHaveSelcted.setText("You have selected to review your resvervation.\nPlease enter the following information:");
		txtrYouHaveSelcted.setBounds(69, 17, 308, 39);
		frame.getContentPane().add(txtrYouHaveSelcted);
		
		JLabel lblNewLabel = new JLabel("First Name :"); //creates first name label
		lblNewLabel.setBounds(94, 92, 83, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name : "); // creates last name label
		lblNewLabel_1.setBounds(94, 120, 83, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number : "); // creates phone number label
		lblNewLabel_2.setBounds(68, 148, 110, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Reservation Number :"); //creates reservation number label
		lblNewLabel_3.setBounds(35, 176, 143, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		lastname = new JTextField(); // creates input box for user to input lastname
		lastname.setBounds(189, 115, 130, 26);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		number = new JTextField(); // creates input box for user to input phone number
		number.setBounds(189, 143, 130, 26);
		frame.getContentPane().add(number);
		number.setColumns(10);
		
		resNumber = new JTextField(); // creates input box for user to input reservation number
		resNumber.setBounds(189, 171, 130, 26);
		frame.getContentPane().add(resNumber);
		resNumber.setColumns(10);
		
		btnNewButton = new JButton("Next"); //creates next button to proceed to next step
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//checks if user did not input the required details
				
			if(firstname.getText().isEmpty() | lastname.getText().isEmpty() | resNumber.getText().isEmpty() | number.getText().isEmpty())
			{
				JLabel invalidLabel = new JLabel("Invalid Input!");
				invalidLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
				invalidLabel.setBounds(157, 27, 127, 31);
				frame3.getContentPane().add(invalidLabel);
				
				JLabel errorMsg = new JLabel("Please check your information and try again!"); // creates error message 
				errorMsg.setBounds(83, 82, 280, 16);
				frame3.getContentPane().add(errorMsg);
				
				JButton closebutton = new JButton("Close");
				closebutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						frame3.dispose();
					
					}
				});

				closebutton.setBounds(310, 124, 117, 29); //creates close button to go back to previous frame
				frame3.getContentPane().add(closebutton);
				frame3.setVisible(true);
				
			}
				
			else {
				//creates display of reservation information

				JLabel fullname = new JLabel("Name: \t"+ firstname.getText() + " " + lastname.getText());
				fullname.setBounds(105, 40, 300, 16);
				frame2.getContentPane().add(fullname);
				
				JLabel resnum = new JLabel("Reservation Number: \t" + resNumber.getText());
				resnum.setBounds(18, 20, 388, 16);
				frame2.getContentPane().add(resnum);
				
				JLabel numLabel = new JLabel("Phone Number: \t"+ number.getText());
				numLabel.setBounds(53, 60, 353, 16);
				frame2.getContentPane().add(numLabel);
				
				JLabel fromCityLabel = new JLabel("From: \t");
				fromCityLabel.setBounds(77, 136, 156, 16);
				frame2.getContentPane().add(fromCityLabel);
				
				JLabel departureDateLabel = new JLabel("Departure Date: \t");
				departureDateLabel.setBounds(18, 156, 215, 16);
				frame2.getContentPane().add(departureDateLabel);
				
				JLabel departureTimeLabel = new JLabel("Departure Time: \t");
				departureTimeLabel.setBounds(18, 176, 215, 16);
				frame2.getContentPane().add(departureTimeLabel);
				
				JLabel toCityLabel = new JLabel("To: \t");
				toCityLabel.setBounds(315, 136, 114, 16);
				frame2.getContentPane().add(toCityLabel);
				
				JLabel arrivalDateLabel = new JLabel("Arrival Date: \t");
				arrivalDateLabel.setBounds(258, 156, 171, 16);
				frame2.getContentPane().add(arrivalDateLabel);
				
				JLabel arrivalTimeLabel = new JLabel("Arrival Time: \t");
				arrivalTimeLabel.setBounds(258, 176, 171, 16);
				frame2.getContentPane().add(arrivalTimeLabel);
				
				JLabel flightLabel = new JLabel("Flight Number: \t");
				flightLabel.setBounds(18, 100, 353, 16);
				frame2.getContentPane().add(flightLabel);
				
				JButton closebutton = new JButton("Close");
				closebutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						frame2.dispose();
						frame.dispose();
					
					}
				});

				closebutton.setBounds(310, 230, 117, 29);
				frame2.getContentPane().add(closebutton);
				
				frame2.setVisible(true);
			
			}}
		});
		btnNewButton.setBounds(297, 222, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
