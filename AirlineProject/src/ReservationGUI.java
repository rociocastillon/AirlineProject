

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReservationGUI {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationGUI window = new ReservationGUI();
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
	public ReservationGUI() {
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
		
		JButton MakeResButton = new JButton("Make a Reservation");
		MakeResButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeReservation pi = new makeReservation();
				pi.newScreen();
			}
		});
		MakeResButton.setBounds(54, 62, 300, 29);
		frame.getContentPane().add(MakeResButton);
		
		JLabel lblNewLabel = new JLabel("Welcome to Tech Airlines! What would you like to do?");
		lblNewLabel.setBounds(25, 20, 400, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton CancelResButton = new JButton("Cancel my Reservation");
		CancelResButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelReservation deets = new cancelReservation();
				deets.newScreen();
			}
		});
		CancelResButton.setBounds(54, 92, 300, 29);
		frame.getContentPane().add(CancelResButton);
		
		JButton ChangeResButton = new JButton("Change my Reservation");
		ChangeResButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ChangeResButton.setBounds(54, 122, 300, 29);
		frame.getContentPane().add(ChangeResButton);
		
		JButton ReviewResButton= new JButton("Review my Reservation");
		ReviewResButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				reviewReservation reviewWin = new reviewReservation();
				reviewWin.newScreen();
			}
		});
		ReviewResButton.setBounds(54, 153, 300, 29);
		frame.getContentPane().add(ReviewResButton);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitButton.setBounds(54, 183, 300, 29);
		frame.getContentPane().add(ExitButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}