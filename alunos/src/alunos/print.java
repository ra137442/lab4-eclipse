package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel DataLabel = new JLabel("Data Nasc.");
	JLabel EmailLabel = new JLabel("Email");
	JLabel CPFLabel = new JLabel("CPF");
	JLabel PhoneLabel = new JLabel("Phone");
	JLabel Ad1Label = new JLabel("Address 1");
	JLabel Ad2Label = new JLabel("Address 2");
	JLabel CEPLabel = new JLabel("CEP");
	JLabel CityLabel = new JLabel("City");
	JLabel StateLabel = new JLabel("State");
	JLabel CountryLabel = new JLabel("Country");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 600, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));				
		firstNameLabel.setBounds(102, 82, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(102, 109, 216, 15);
		contentPane.add(lastNameLabel);
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(62, 55, 216, 15);
		contentPane.add(titleLabel);
		
		DataLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		DataLabel.setBounds(102, 50, 90, 190);
		contentPane.add(DataLabel);
		
		EmailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		EmailLabel.setBounds(102, 70, 150, 190);
		contentPane.add(EmailLabel);
		
		CPFLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CPFLabel.setBounds(102, 90, 90, 190);
		contentPane.add(CPFLabel);
		
		PhoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		PhoneLabel.setBounds(102, 110, 90, 190);
		contentPane.add(PhoneLabel);
		
		Ad1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		Ad1Label.setBounds(102, 130, 90, 190);
		contentPane.add(Ad1Label);
		
		Ad2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		Ad2Label.setBounds(102, 150, 90, 190);
		contentPane.add(Ad2Label);
		
		CEPLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CEPLabel.setBounds(102, 170, 90, 190);
		contentPane.add(CEPLabel);
		
		CityLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CityLabel.setBounds(102, 190, 90, 190);
		contentPane.add(CityLabel);
		
		StateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		StateLabel.setBounds(102, 210, 90, 190);
		contentPane.add(StateLabel);
		
		CountryLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CountryLabel.setBounds(102, 230, 90, 190);
		contentPane.add(CountryLabel);	
		
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(12, 82, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(12, 109, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 12);
		contentPane.add(lblNewLabel_2);			
				
		JLabel lblNewLabel_3 = new JLabel("Form Printed");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(139, 12, 159, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data Nasc.:");
		lblNewLabel_4.setBounds(12, 50, 90, 190);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(12, 70, 90, 190);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CPF:");
		lblNewLabel_6.setBounds(12, 90, 90, 190);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Phone:");
		lblNewLabel_7.setBounds(12, 110, 90, 190);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address 1:");
		lblNewLabel_8.setBounds(12, 130, 90, 190);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address 2:");
		lblNewLabel_9.setBounds(12, 150, 90, 190);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CEP:");
		lblNewLabel_10.setBounds(12, 170, 90, 190);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("City:");
		lblNewLabel_11.setBounds(12, 190, 90, 190);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("State:");
		lblNewLabel_12.setBounds(12, 210, 90, 190);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Country:");
		lblNewLabel_13.setBounds(12, 230, 90, 190);
		contentPane.add(lblNewLabel_13);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 500, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				System.exit(0);
			}
		});

	}

}
