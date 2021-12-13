import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class reviewReservation {


	private JFrame mainFrame;
	private JFrame frame2;
	private JTextField firstname;
	private JTextField resNumber;
	private JButton btnNewButton;
	
	private String fname;
	private String lname;
	private String phonenum;
	private String passemail;
	private String arrCity;
	private String depCity;
	private String depTime;
	private String reservationNum;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reviewReservation window = new reviewReservation();
					window.mainFrame.setVisible(true);
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
		mainFrame = new JFrame(); // create new frame used for getting customer information
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		frame2 = new JFrame(); //create frame for showing reservation details
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		firstname = new JTextField(); //creates text box for user to input first name
		firstname.setBounds(189, 87, 130, 26);
		mainFrame.getContentPane().add(firstname);
		firstname.setColumns(10);	
		
		JTextArea txtrYouHaveSelcted = new JTextArea(); //creates heading message
		txtrYouHaveSelcted.setBackground(SystemColor.window);
		txtrYouHaveSelcted.setText("You have selected to review your resvervation.\nPlease enter the following information:");
		txtrYouHaveSelcted.setBounds(69, 17, 308, 39);
		mainFrame.getContentPane().add(txtrYouHaveSelcted);
		
		JLabel lblNewLabel = new JLabel("First Name :"); //creates first name label
		lblNewLabel.setBounds(94, 92, 83, 16);
		mainFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Reservation Number :"); //creates reservation number label
		lblNewLabel_3.setBounds(34, 136, 143, 16);
		mainFrame.getContentPane().add(lblNewLabel_3);

		
		resNumber = new JTextField(); // creates input box for user to input reservation number
		resNumber.setBounds(189, 131, 130, 26);
		mainFrame.getContentPane().add(resNumber);
		resNumber.setColumns(10);
		
		btnNewButton = new JButton("Next"); //creates next button to proceed to next step
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//checks if user did not input the required details
				
			if(firstname.getText().isEmpty() | resNumber.getText().isEmpty())
			{

				JOptionPane.showMessageDialog(null, "Invalid Input: Please Check your Information and try again.");
			}
			else 
			{
				//creates display of reservation information
				getInfo(firstname,resNumber);
				//showInformation(frame2);
				mainFrame.dispose();
			}
		}});
		btnNewButton.setBounds(297, 222, 117, 29);
		mainFrame.getContentPane().add(btnNewButton);
	}
	private void showInformation(JFrame frame)
	{
		JLabel fullname = new JLabel("Name: \t" + fname +" " + lname);
		fullname.setBounds(105, 40, 300, 16);
		frame.getContentPane().add(fullname);
		
		JLabel resnum = new JLabel("Reservation Number: \t" + reservationNum);
		resnum.setBounds(18, 20, 388, 16);
		frame.getContentPane().add(resnum);
		
		JLabel numLabel = new JLabel("Phone Number: \t" + phonenum);
		numLabel.setBackground(UIManager.getColor("window"));
		numLabel.setBounds(53, 60, 353, 16);
		frame.getContentPane().add(numLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(111, 80, 370, 16);
		frame.getContentPane().add(emailLabel);
		
		JLabel fromCityLabel = new JLabel("From: \t" + depCity);
		fromCityLabel.setBounds(56, 148, 156, 16);
		frame.getContentPane().add(fromCityLabel);
		
		JLabel departureDateLabel = new JLabel("Date: \t");
		departureDateLabel.setBounds(254, 148, 107, 16);
		frame.getContentPane().add(departureDateLabel);
		
		JLabel departureTimeLabel = new JLabel("Time: \t" + depTime);
		departureTimeLabel.setBounds(254, 176, 107, 16);
		frame.getContentPane().add(departureTimeLabel);
		
		JLabel toCityLabel = new JLabel("To: \t" + arrCity);
		toCityLabel.setBounds(66, 176, 114, 16);
		frame.getContentPane().add(toCityLabel);
		
		JLabel flightLabel = new JLabel("Flight Information");
		flightLabel.setFont(new Font("Papyrus", Font.BOLD, 13));
		flightLabel.setBounds(104, 120, 185, 16);
		frame.getContentPane().add(flightLabel);
		
		JButton closebutton = new JButton("Close");
		closebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
			
			}
		});


		closebutton.setBounds(310, 230, 117, 29);
		frame.getContentPane().add(closebutton);
		
		JButton conEmail = new JButton("Send confirmation email");
		conEmail.setBounds(40, 230, 200, 29);
		frame.getContentPane().add(conEmail);
		conEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				confirmationEmail con = new confirmationEmail();
				con.newScreen();
			}
		});

		
		
		frame.setVisible(true);
	
	}
	private void getInfo(JTextField firstname2, JTextField resNumber2)
	{
		ArrayList<String> data = new ArrayList<String>();
		String []splitted;
		boolean successful = false;

		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("passenger.txt"));
			String S ="";
			String match = "";
			int i=0;
			while((S = br.readLine()) != null)
			{
				data.add(S);
			}
			
			while(!match.equals(resNumber2.getText()) & i < data.size())
			{
				S= data.get(i);
				splitted = S.split("  ");
				if((splitted[0]).equals(resNumber2.getText()))
				{
					int j=0;
					match = splitted[j];
					reservationNum = splitted[j];
					fname = splitted[j+1];
					lname= splitted[j+2];
					phonenum = splitted[j+3];
					passemail = splitted[j+4];
					depCity = splitted[j+5];
					arrCity = splitted[j+6];
					depTime = splitted[j+7];
					successful = true;

				}
				
				
				i++;
			}
			
			br.close();
			if(successful == false) {
				
				JOptionPane.showMessageDialog(null, "Error: No reservations match.");
			}
			else {
				showInformation(frame2);
			}
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
