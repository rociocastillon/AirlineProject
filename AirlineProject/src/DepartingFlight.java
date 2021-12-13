import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;


public class DepartingFlight {

	private JFrame frame;
	FileWriter LAtoLV;
	FileWriter LAtoP;
	FileWriter LAtoSF;
	FileWriter LAtoSD;
	

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
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



	public DepartingFlight() {
		initialize();
	}
	



	
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer info saved. Next choose your departing city and time:");
		lblNewLabel.setBounds(12, 16, 432, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(Note: All flights and times are 7 days a week.)");
		lblNewLabel_1.setBounds(70, 30, 320, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JButton NextButton = new JButton("Next");
		NextButton.setBounds(327, 224, 117, 29);
		frame.getContentPane().add(NextButton);
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Successful success = new Successful();
				success.newScreen();
				frame.dispose();
				
			
			}
	});
		

		JButton BackButton = new JButton("Back");
		BackButton.setBounds(36, 224, 117, 29);
		frame.getContentPane().add(BackButton);
		
		JButton LAtoLV_1 = new JButton("Los Angeles  ->  Las Vegas    8:00 AM Departure");

		LAtoLV_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == LAtoLV_1.getActionCommand()) {
					try {
						LAtoLV = new FileWriter("passenger.txt", true);
						LAtoLV.write("Los Angeles  Las Vegas  8:00 AM  ");
						LAtoLV.write("\n");
						LAtoLV.close();
					} catch(Exception ae) {JOptionPane.showMessageDialog(null, e + "Error: cannot save Customer details."); }
				}
			}
		});
		LAtoLV_1.setBounds(36, 52, 396, 29);
		frame.getContentPane().add(LAtoLV_1);
		
		JButton LAtoP_1 = new JButton("Los Angeles ->  Phoenix         10:00 AM Departure");
		LAtoP_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == LAtoP_1.getActionCommand()) {
					try {
						LAtoP = new FileWriter("passenger.txt", true);
						LAtoP.write("Los Angeles  Phoenix  10:00 AM  ");
						LAtoP.write("\n");
						LAtoP.close();
					} catch(Exception ae) {JOptionPane.showMessageDialog(null, e + "Error: cannot save flight details."); }
				}
			}
			
		});
		LAtoP_1.setBounds(36, 93, 396, 29);
		frame.getContentPane().add(LAtoP_1);
		
		JButton LAtoSF_1 = new JButton("Los Angeles -> San Francisco  1:00 PM Departure");
		LAtoSF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == LAtoSF_1.getActionCommand()) {
					try {
						LAtoSF = new FileWriter("passenger.txt", true);
						LAtoSF.write("Los Angeles  San Francisco  1:00 PM  ");
						LAtoSF.write("\n");
						LAtoSF.close();
					} catch(Exception ae) {JOptionPane.showMessageDialog(null, e + "Error: cannot save flight details."); }
				}
			}
			
		});
		LAtoSF_1.setBounds(36, 134, 396, 29);
		frame.getContentPane().add(LAtoSF_1);
		
		JButton LAtoSD_1 = new JButton("Los Angeles ->  San Diego       4:00 PM Departure");
		LAtoSD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == LAtoSD_1.getActionCommand()) {
					try {
						LAtoSD = new FileWriter("passenger.txt", true);
						LAtoSD.write("Los Angeles  San Diego  4:00 PM  ");
						LAtoSD.write("\n");
						LAtoSD.close();
					} catch(Exception ae) {JOptionPane.showMessageDialog(null, e + "Error: cannot save flight details."); }
				}
			}
			
		});
		LAtoSD_1.setBounds(36, 175, 396, 29);
		frame.getContentPane().add(LAtoSD_1);
		
		
		
	}
}


