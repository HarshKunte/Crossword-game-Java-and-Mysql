package com.easy;

import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
public class Planets {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	int wrong=0;
       int j=0;
      double score=300;
    Thread ProgressUpdate=new Thread()
    {
      public void run()
      {
    	  int time=300;//1 min=60 seconds
    	  for(int i=0;i<=time;i++)
    	  {
    		try {
    			  Thread.sleep(1000);//Thread is made to sleep for 1 sec
    		}catch(Exception ex){}
    		progressBar.setValue(100*i/300);
    		score=score-0.2;
    		
    		if(progressBar.getValue()==100)
    		{
    		  JOptionPane.showMessageDialog(null,"....Times UP!..."+"Your Score is"+score);
    		  frame.dispose();
    		}
    	  }
      }
    };
    private JProgressBar progressBar;
    private JTextField username;
    private JLabel label_9;
    private JProgressBar progressBar_1;
    private JLabel lblTimesRunning;
    private JLabel lblHint;
    private JLabel label_10;
    private JLabel label_11;
    private JLabel label_12;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planets window = new Planets();
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
	public Planets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 127));
		frame.setBounds(100, 100, 1559, 899);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(343, 322, 42, 43);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(385, 322, 42, 43);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();    
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(427, 322, 42, 43);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(468, 322, 42, 43);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(510, 322, 42, 43);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(551, 322, 42, 43);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(593, 322, 42, 43);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(343, 280, 42, 43);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(343, 238, 42, 43);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(343, 364, 42, 43);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(343, 407, 42, 43);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(301, 407, 42, 43);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(258, 407, 42, 43);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(215, 407, 42, 43);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(427, 280, 42, 43);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(427, 238, 42, 43);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(427, 364, 42, 43);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(427, 407, 42, 43);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(427, 449, 42, 43);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(427, 491, 42, 43);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(385, 491, 42, 43);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(343, 491, 42, 43);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(468, 491, 42, 43);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(510, 491, 42, 43);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(551, 491, 42, 43);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(593, 491, 42, 43);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(510, 364, 42, 43);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(510, 407, 42, 43);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(510, 449, 42, 43);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(510, 533, 42, 43);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(551, 280, 42, 43);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(551, 238, 42, 43);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(551, 195, 42, 43);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(551, 152, 42, 43);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(551, 110, 42, 43);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(510, 152, 42, 43);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(593, 152, 42, 43);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(635, 152, 42, 43);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(677, 152, 42, 43);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(635, 110, 42, 43);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(635, 67, 42, 43);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(635, 24, 42, 43);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setDocument(new JTextFieldCharLimits(1));
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(635, 195, 42, 43);
		frame.getContentPane().add(textField_42);
		
		JLabel label = new JLabel("3");
		label.setBounds(495, 166, 15, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("6");
		label_1.setBounds(316, 336, 15, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("8");
		label_2.setBounds(183, 421, 15, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("9");
		label_3.setBounds(316, 505, 15, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("1");
		label_4.setBounds(614, 26, 15, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("2");
		label_5.setBounds(551, 94, 15, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("4");
		label_6.setBounds(328, 219, 15, 16);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("5");
		label_7.setBounds(430, 219, 15, 16);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("7");
		label_8.setBounds(522, 300, 17, 16);
		frame.getContentPane().add(label_8);
		
		JButton button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   String f1=textField_41.getText()+textField_40.getText()+textField_39.getText()+textField_37.getText()+textField_42.getText();
				   
				   String f2=textField_34.getText()+textField_33.getText()+textField_32.getText()+textField_31.getText()+textField_30.getText()+textField_5.getText();
				   
				   String f5=textField_15.getText()+textField_14.getText()+textField_2.getText()+textField_16.getText()+textField_17.getText()+textField_18.getText()+textField_19.getText();
				   
				   String f4=textField_8.getText()+textField_7.getText()+textField.getText()+textField_9.getText()+textField_10.getText();
				   
				   String f3=textField_35.getText()+textField_33.getText()+textField_36.getText()+textField_37.getText()+textField_38.getText();
				   
				   String f6=textField.getText()+textField_1.getText()+textField_2.getText()+textField_3.getText()+textField_4.getText()+textField_5.getText()+textField_6.getText();
				   
				   String f7=textField_13.getText()+textField_12.getText()+textField_11.getText()+textField_10.getText();
				   
				   String f8=textField_21.getText()+textField_20.getText()+textField_19.getText()+textField_22.getText()+textField_23.getText()+textField_24.getText()+textField_25.getText();
				   
				   String f9=textField_4.getText()+textField_26.getText()+textField_27.getText()+textField_28.getText()+textField_23.getText()+textField_29.getText();
				   
				  
					
				   if(f1.equals("PLUTO") && f2.equals("SATURN") && f3.equals("EARTH") && f4.equals("VENUS") && f5.equals("JUPITER") && f6.equals("NEPTUNE") && f7.equals("MARS") && f8.equals("MERCURY") && f9.equals("URANUS"))				  
				   {
					  
					   int id=(int)score/3;
					   ProgressUpdate.stop();
						JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\nPls enter your username");
					
						String uname = JOptionPane.showInputDialog(frame, "Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\n Enter username:");

						 System.out.println(uname);
						 String upass = JOptionPane.showInputDialog(frame, "Enter password:");
						 System.out.println(upass);
						 
						 CrossService cs=new CrossService();
							cs.easy(id,uname,upass);
				   }
				   else
					{
						JOptionPane.showMessageDialog(null,"Wrong Answers!");
						if(!f1.equals("PLUTO"))
						   {   
							   textField_41.setText(null); textField_40.setText(null); textField_39.setText(null); textField_37.setText(null); textField_42.setText(null);  
						   }
						   if(!f2.equals("SATURN")) 
						   {
							   textField_34.setText(null); textField_33.setText(null); textField_32.setText(null); textField_31.setText(null); textField_30.setText(null); textField_5.setText(null);
						   }
						   if(!f3.equals("EARTH")) 
						   {
							   textField_35.setText(null); textField_33.setText(null); textField_36.setText(null); textField_37.setText(null); textField_38.setText(null);
						   }
						   if(!f4.equals("VENUS")) 
						   {
							   textField_8.setText(null); textField_7.setText(null); textField.setText(null); textField_9.setText(null); textField_10.setText(null);
						   }
						   if(!f5.equals("JUPITER")) 
						   {
							   textField_15.setText(null); textField_14.setText(null); textField_2.setText(null); textField_16.setText(null); textField_17.setText(null); textField_18.setText(null); textField_19.setText(null);
						   }
						   if(!f6.equals("NEPTUNE")) 
						   {
							   textField.setText(null); textField_1.setText(null); textField_2.setText(null); textField_3.setText(null); textField_4.setText(null); textField_5.setText(null); textField_6.setText(null);
						   }
						   if(!f7.equals("MARS"))
						   {
							   textField_13.setText(null); textField_12.setText(null); textField_11.setText(null); textField_10.setText(null);
						   }
						   if(!f8.equals("MERCURY")) 
						   {
							   textField_21.setText(null); textField_20.setText(null); textField_19.setText(null); textField_22.setText(null); textField_23.setText(null); textField_24.setText(null); textField_25.setText(null);
						   }
						   if(!f9.equals("URANUS"))		
						   {
							   textField_4.setText(null); textField_26.setText(null); textField_27.setText(null); textField_28.setText(null); textField_23.setText(null); textField_29.setText(null);
						   }	
						   wrong++;
					}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(152, 738, 179, 42);
		frame.getContentPane().add(button);
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Planets.class.getResource("/images/questions/planets.png")));
		label_9.setBounds(801, 38, 523, 509);
		frame.getContentPane().add(label_9);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(52, 657, 684, 14);
		frame.getContentPane().add(progressBar);
		
		lblTimesRunning = new JLabel("Time's  Running.........");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTimesRunning.setBounds(52, 614, 237, 30);
		frame.getContentPane().add(lblTimesRunning);
		
		lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(468, 749, 42, 25);
		frame.getContentPane().add(lblHint);
		
		label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_10.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(School.class.getResource("/images/solutions/Planets.png")) );
				//JOptionPane.showMessageDialog(null, label, null, JOptionPane.PLAIN_MESSAGE, null);
				JOptionPane pane = new JOptionPane(label,
				          JOptionPane.INFORMATION_MESSAGE);
				      JDialog dialog = pane.createDialog(null, "Title");
				      dialog.setModal(false);
				      dialog.setVisible(true);

				      new Timer(TIME_VISIBLE, new ActionListener() {
				        @Override
				        public void actionPerformed(ActionEvent e) {
				          dialog.setVisible(false);
				        }
				      }).start();
				      score=score-30;
				} 
			}
		});
		label_10.setIcon(new ImageIcon(Planets.class.getResource("/others/light-bulb.png")));
		label_10.setBounds(510, 719, 64, 64);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_11.setBounds(593, 738, 921, 16);
		frame.getContentPane().add(label_11);
		
		label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_12.setIcon(new ImageIcon(Planets.class.getResource("/others/if_Previous_2_372909.png")));
		label_12.setBounds(12, 13, 73, 72);
		frame.getContentPane().add(label_12);
	}
}
