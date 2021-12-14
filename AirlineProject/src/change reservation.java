import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class changeReservation implements ActionListener{
	
	private JFrame frame;
	private JTextField FNTextField;
	private JTextField LNTextField;
	private JTextField PNTextField;
	//private JFrame frame_1;
	private JTextField EMTextField;
	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changeReservation window = new changeReservation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
      
 }
	});
  }
	
	public changeReservation() {
		initialize();
	}


	FileWriter fileWriter;


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("You have selected to chnage a reservation!");
		lblNewLabel.setBounds(70, 30, 400, 24);
		frame.getContentPane().add(lblNewLabel);
    
    
	public static void main(String[] args)
	{ 
	    char choice; 
	    char confirmChange;
	    String FlightMonth = "2"; 
	    String FlightDay = "7";
	    String FlightYear = "69";
	    String NewMonth;
    
	    String NewDay;
	    String NewYear;
	    
	    System.out.print("Make a selection");
	    System.out.print("\n");
	    System.out.print("Press 3 to change the Reservation data:");
	    System.out.print("\n");
	    choice = ConsoleInput.readToWhiteSpace(true).charAt(0);
	    switch (choice)
	{
	    case '3':
	        System.out.print("Change Reservation date");
	        System.out.print("\n");
	        System.out.print("Enter Month:");
	        System.out.print("\n");
	        NewMonth = ConsoleInput.readToWhiteSpace(true);
	        System.out.print("Enter Day:");
	        System.out.print("\n");
	        NewDay = ConsoleInput.readToWhiteSpace(true);
	        System.out.print("Enter Year:");
	        System.out.print("\n");
	        NewYear = ConsoleInput.readToWhiteSpace(true);
	        System.out.print("Press 1 to confirm change.");
	        confirmChange = ConsoleInput.readToWhiteSpace(true).charAt(0);
	        if (confirmChange == '1')
	        {
	            ;
	        }
	
	        {
	  FlightMonth = NewMonth;
	  FlightDay = NewDay;
	  FlightYear = NewYear;
	 }
	
	 
	   System.out.print("Your Reservation Date is");
	   System.out.print(FlightMonth + "/" + FlightDay + "/" + FlightYear);
	   System.out.print("\n");
	   
	    }
	
	}
}
}
