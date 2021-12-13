import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class cancelReservation {

	private JFrame frame;
	private JTextField name;
	private JTextField reservationNumber;
	public String currentLine;
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
		
		JLabel FNLabel = new JLabel("Reservation Number:");
		FNLabel.setBounds(6, 128, 134, 16);
		frame.getContentPane().add(FNLabel);
		
		name = new JTextField();
		name.setBounds(158, 95, 130, 26);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		reservationNumber = new JTextField();
		reservationNumber.setBounds(158, 123, 130, 26);
		frame.getContentPane().add(reservationNumber);
		reservationNumber.setColumns(10);
		
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
				if(reservationNumber.getText().isEmpty() | name.getText().isEmpty() )
				{
					JOptionPane.showMessageDialog(null, "Error: You must enter a name and reservation number.");
				}
				else
				{
				deleteRes(name, reservationNumber);
				}
				
			}
		});
		backButton_1.setBounds(306, 223, 117, 29);
		frame.getContentPane().add(backButton_1);
		
		
	}
	public void deleteRes(JTextField name, JTextField reservationNumber)
	{
		boolean successful = false;
		String [] split;

		try
		{
			File temp = new File("tempfile.txt");
			File passenger = new File("passenger.txt");
			BufferedReader reader = new BufferedReader(new FileReader("passenger.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
			String str = "";
			String match = "";
			while((str = reader.readLine()) != null) {
				split = str.split("  ");
				match = split[0];
				//String trimLine = currentLine.trim();
				if(!match.equals(reservationNumber.getText()))
				{
					writer.write(str + System.getProperty("line.separator"));
					
				}
				else 
				{
					successful = true;
				}
				
				temp.renameTo(passenger);

			}
			writer.close();
			reader.close();
			if(successful == true) {
				JOptionPane.showMessageDialog(null, "Your reservation has been successfully canceled!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Error: No reservations match.");
			}

		}catch (Exception e )
			{
				e.printStackTrace();
			}
		
		
	}
	
}



































