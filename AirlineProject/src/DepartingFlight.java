import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class DepartingFlight {

	private JFrame frame;
	private ButtonGroup buttonGroup;
	FileWriter fw;
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
		
		JButton NextButton = new JButton("Next");
		NextButton.setBounds(327, 224, 117, 29);
		frame.getContentPane().add(NextButton);
		//NextButton.addActionListener(this);
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepartingFlight df = new DepartingFlight();
				df.newScreen();
				//frame_1 = new JFrame();
				//frame_1.setBounds(100, 100, 450, 300);
				//frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame_1.getContentPane().setLayout(null);
				//frame_1.setVisible(true);
				
				
				if (e.getActionCommand() == NextButton.getActionCommand()) 
				{
					try
					{
						fw = new FileWriter("passenger.txt", true);
						buttonGroup.getSelection();
						fw.write(NextButton.getText());
						fw.close();
						JOptionPane.showMessageDialog(null, "File Writing Successful");
				} catch(Exception ae) {JOptionPane.showMessageDialog(null, e + ""); }
			}
			
			}
	});

			

		
		
		
		
		
		
		
		JButton BackButton = new JButton("Back");
		BackButton.setBounds(36, 224, 117, 29);
		frame.getContentPane().add(BackButton);
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(LAtoLV);
		buttonGroup.add(LAtoP);
		buttonGroup.add(LAtoSF);
		buttonGroup.add(LAtoSD);
		
		
		
	}
}


