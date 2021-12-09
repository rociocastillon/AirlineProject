import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class makeReservation implements ActionListener{
	


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
					makeReservation window = new makeReservation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public makeReservation() {
		initialize();
	}


	FileWriter fileWriter;


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("You have selected to make a reservation!");
		lblNewLabel.setBounds(100, 20, 300, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton nextButton = new JButton("Next");
		nextButton.setBounds(307, 221, 117, 29);
		nextButton.addActionListener(this);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepartingFlight df = new DepartingFlight();
				df.newScreen();
				//frame_1 = new JFrame();
				//frame_1.setBounds(100, 100, 450, 300);
				//frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame_1.getContentPane().setLayout(null);
				//frame_1.setVisible(true);
				
				
				if (e.getActionCommand() == nextButton.getActionCommand()) 
				{
					try
					{
						fileWriter = new FileWriter("passenger.txt", true);
						fileWriter.write(FNTextField.getText() + " ");
						fileWriter.write(LNTextField.getText() + " ");
						fileWriter.write(PNTextField.getText() + " ");
						fileWriter.write(EMTextField.getText() + " ");
						fileWriter.close();
						JOptionPane.showMessageDialog(null, "File Writing Successful");
				} catch(Exception ae) {JOptionPane.showMessageDialog(null, e + ""); }
			}
			
			}
	});
		frame.getContentPane().add(nextButton);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter the following information:");
		lblNewLabel_1.setBounds(110, 38, 250, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(41, 70, 90, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setBounds(44, 98, 83, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone Number:");
		lblNewLabel_4.setBounds(10, 126, 100, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(70, 154, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		FNTextField = new JTextField();
		FNTextField.setBounds(143, 66, 130, 26);
		frame.getContentPane().add(FNTextField);
		FNTextField.setColumns(10);
		
		
		LNTextField = new JTextField();
		LNTextField.setBounds(143, 93, 130, 26);
		frame.getContentPane().add(LNTextField);
		LNTextField.setColumns(10);
		
		PNTextField = new JTextField();
		PNTextField.setBounds(143, 121, 130, 26);
		frame.getContentPane().add(PNTextField);
		PNTextField.setColumns(10);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		backButton.setBounds(10, 221, 117, 29);
		frame.getContentPane().add(backButton);
		
		EMTextField = new JTextField();
		EMTextField.setBounds(143, 147, 130, 26);
		frame.getContentPane().add(EMTextField);
		EMTextField.setColumns(10);
		
		

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
	}

}
