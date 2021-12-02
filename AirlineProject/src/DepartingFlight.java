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
		
		JLabel lblNewLabel = new JLabel("Customer info saved. Next choose your departing city and time:");
		lblNewLabel.setBounds(12, 16, 432, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton LAtoLV = new JRadioButton("Los Angeles -> Las Vegas        8:30 AM Departure");
		LAtoLV.setBounds(36, 58, 418, 23);
		frame.getContentPane().add(LAtoLV);
		
		JLabel lblNewLabel_1 = new JLabel("(Note: All flights and times are 7 days a week.)");
		lblNewLabel_1.setBounds(70, 30, 406, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton LAtoP = new JRadioButton("Los Angeles ->  Phoenix         10:00 AM Departure");
		LAtoP.setBounds(36, 93, 408, 23);
		frame.getContentPane().add(LAtoP);
		
		JRadioButton LAtoSF = new JRadioButton("Los Angeles -> San Francisco  1:00 PM Departure");
		LAtoSF.setBounds(36, 128, 408, 23);
		frame.getContentPane().add(LAtoSF);
		
		JRadioButton LAtoSD = new JRadioButton("Los Angeles ->  San Diego       4:00 PM Departure ");
		LAtoSD.setBounds(36, 163, 408, 23);
		frame.getContentPane().add(LAtoSD);
		
		
	}
}
