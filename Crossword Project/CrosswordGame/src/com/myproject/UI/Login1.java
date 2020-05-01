package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.easy.JTextFieldCharLimits;

import crossService.CrossService;
import crossService.CrossService1;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class Login1 extends JFrame {

	public static JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField cname;
	private JTextField gender;
	private JTextField dob1;
	private JTextField phno;
	private JTextField address;
	private JTextField upass1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
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
	public Login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 204));
		frame.setBounds(100, 100, 1093, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel parentpanel = new JPanel();
		parentpanel.setBackground(new Color(0, 102, 204));
		parentpanel.setBounds(0, 161, 1075, 437);
		frame.getContentPane().add(parentpanel);
		parentpanel.setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		login.setBackground(new Color(0, 102, 204));
		parentpanel.add(login, "name_99891592755942");
		login.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblLogin.setBounds(413, 23, 156, 57);
		login.add(lblLogin);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 51, 153));
		textField.setToolTipText("");
		textField.setBounds(243, 150, 521, 38);
		login.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterUsername = new JLabel("Enter username.........");
		lblEnterUsername.setForeground(new Color(255, 255, 255));
		lblEnterUsername.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		lblEnterUsername.setBounds(243, 93, 248, 44);
		login.add(lblEnterUsername);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(0, 51, 153));
		passwordField.setBounds(243, 236, 521, 38);
		login.add(passwordField);
		
		JLabel lblEnterPassword = new JLabel("Enter password....");
		lblEnterPassword.setForeground(new Color(255, 255, 255));
		lblEnterPassword.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		lblEnterPassword.setBounds(243, 201, 248, 22);
		login.add(lblEnterPassword);
		
		JLabel label = new JLabel(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(51, 46, 381, 16);
		login.add(label);
		
		JButton btnClickHereTo = new JButton("Click Here To Login");
		btnClickHereTo.setForeground(new Color(0, 0, 0));
		btnClickHereTo.setBackground(new Color(153, 255, 0));
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String pass=passwordField.getText().toString();
				 
		         
				 CrossService cs=new CrossService();
				         cs.login(name, pass);
				        
		
			}
		});
		

		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClickHereTo.setBounds(389, 301, 248, 38);
		login.add(btnClickHereTo);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(178, 46, 24, 312);
		login.add(label_1);
		
		JLabel label_2 = new JLabel("- - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - -");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(565, 46, 425, 16);
		login.add(label_2);
		
		JPanel register = new JPanel();
		register.setBackground(new Color(0, 102, 204));
		parentpanel.add(register, "name_101996565239188");
		register.setLayout(null);
		
		JLabel lblRegistration = new JLabel("REGISTRATION");
		lblRegistration.setForeground(new Color(255, 255, 255));
		lblRegistration.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblRegistration.setBounds(429, 13, 198, 57);
		register.add(lblRegistration);
		
		cname = new JTextField();
		cname.setForeground(new Color(255, 255, 255));
		cname.setBackground(new Color(51, 51, 153));
		cname.setBounds(204, 104, 281, 34);
		register.add(cname);
		cname.setColumns(10);
		
		gender = new JTextField();
		gender.setForeground(new Color(255, 255, 255));
		gender.setBackground(new Color(51, 51, 153));
		gender.setBounds(533, 104, 281, 34);
		register.add(gender);
		gender.setColumns(10);
		
		dob1 = new JTextField();
		dob1.setForeground(new Color(255, 255, 255));
		dob1.setBackground(new Color(51, 51, 153));
		dob1.setBounds(204, 196, 281, 34);
		register.add(dob1);
		dob1.setColumns(10);
		
		phno = new JTextField();
		phno.setDocument(new JTextFieldCharLimits(10));
		phno.setForeground(new Color(255, 255, 255));
		phno.setBackground(new Color(51, 51, 153));
		phno.setBounds(533, 196, 281, 34);
		register.add(phno);
		phno.setColumns(10);
		
		address = new JTextField();
		address.setForeground(new Color(255, 255, 255));
		address.setBackground(new Color(51, 51, 153));
		address.setBounds(204, 281, 281, 34);
		register.add(address);
		address.setColumns(10);
		
		upass1 = new JTextField();
		upass1.setForeground(new Color(255, 255, 255));
		upass1.setBackground(new Color(51, 51, 153));
		upass1.setBounds(534, 281, 280, 34);
		register.add(upass1);
		upass1.setColumns(10);
		
		JButton btnSaveDetails = new JButton("Save Details");
		btnSaveDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
                	 String fname=cname.getText();
                	 String lname=gender.getText();
                	 String dob=dob1.getText();
                	 String contact=phno.getText();
                	 String uname=address.getText();
                	 String upass=upass1.getText();
                	
                	 CrossService cs=new CrossService();
                	 cs.register(fname, lname, dob, contact, uname, upass);

 			
					
				
				
					/*if(rs.next())
						JOptionPane.showMessageDialog(null,"Registered Successfully...");
						else
							JOptionPane.showMessageDialog(null,"Fill proper data");*/
					//con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					}
			
			}
		});
		btnSaveDetails.setBackground(new Color(153, 255, 0));
		btnSaveDetails.setBounds(407, 347, 198, 25);
		register.add(btnSaveDetails);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lblFirstName.setBounds(204, 67, 118, 24);
		register.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lblLastName.setBounds(533, 68, 118, 23);
		register.add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(new Color(255, 255, 255));
		lblDateOfBirth.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lblDateOfBirth.setBounds(204, 167, 136, 25);
		register.add(lblDateOfBirth);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(new Color(255, 255, 255));
		lblContact.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lblContact.setBounds(532, 167, 126, 16);
		register.add(lblContact);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lblUsername.setBounds(204, 243, 136, 25);
		register.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lblPassword.setBounds(533, 249, 118, 19);
		register.add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(63, 36, 354, 16);
		register.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(596, 36, 455, 16);
		register.add(lblNewLabel_1);
		
		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setForeground(new Color(0, 255, 255));
		lblLogin_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				parentpanel.removeAll();
				parentpanel.add(login);
				parentpanel.repaint();
				parentpanel.revalidate();
			}
		});
		lblLogin_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblLogin_1.setBounds(752, 96, 86, 37);
		frame.getContentPane().add(lblLogin_1);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setForeground(new Color(0, 255, 255));
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				parentpanel.removeAll();
				parentpanel.add(register);
				parentpanel.repaint();
				parentpanel.revalidate();
			}
		});
		lblRegister.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		lblRegister.setBounds(867, 102, 105, 24);
		frame.getContentPane().add(lblRegister);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 146, 1051, 2);
		frame.getContentPane().add(separator);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Login1.class.getResource("/others/boy(1).png")));
		label_3.setBounds(389, 62, 57, 71);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Login1.class.getResource("/others/girl.png")));
		label_4.setBounds(474, 62, 56, 71);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Login1.class.getResource("/others/man.png")));
		label_5.setBounds(557, 62, 56, 71);
		frame.getContentPane().add(label_5);
	}
}
