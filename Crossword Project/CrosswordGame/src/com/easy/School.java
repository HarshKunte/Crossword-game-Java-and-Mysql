package com.easy;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import com.myproject.UI.Level;
import com.myproject.UI.Login1;

import crossService.CrossService;
import crossbean.CrossBean;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

//import com.sun.prism.paint.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import crossService.CrossService;
import crossbean.CrossBean;

@SuppressWarnings("serial")
public class School extends JFrame {
	private JFrame frame;
	private JTextField txtS;
	private JTextField textField_1;
	private JTextField txtH;
	private JTextField txtO;
	private JTextField txtO_1;
	private JTextField txtL;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtD;
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
	private JTextField txtD_1;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField txtT;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField txtK;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField txtS_1;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField;
	private JTextField textField_2;
	int j=0;
	int wrong=0;

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
    		  JOptionPane.showMessageDialog(null,"....Times UP!....");
    		  frame.dispose();
    		}
    	  }
      }
    };
    private JProgressBar progressBar;
   
    private JLabel lblNewLabel_1;
    private JLabel lblHintYouWill;
    private JLabel lblNewLabel;
    private JLabel lblHint;
    private JLabel label_1;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					School window = new School();
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
	public School() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 127));
		frame.setBounds(100, 100, 1285, 819);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(429, 99, 42, 42);
		frame.getContentPane().add(txtS);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(429, 142, 42, 42);
		frame.getContentPane().add(textField_1);
		
		txtH = new JTextField();
		txtH.setEditable(false);
		txtH.setText(" H");
		txtH.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtH.setColumns(10);
		txtH.setBounds(429, 183, 42, 42);
		frame.getContentPane().add(txtH);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBounds(429, 225, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtO_1 = new JTextField();
		txtO_1.setEditable(false);
		txtO_1.setText(" O");
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setColumns(10);
		txtO_1.setBounds(429, 267, 42, 42);
		frame.getContentPane().add(txtO_1);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		txtL.setBounds(429, 309, 42, 42);
		frame.getContentPane().add(txtL);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(469, 99, 42, 42);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(512, 99, 42, 42);
		frame.getContentPane().add(textField_7);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBounds(554, 99, 42, 42);
		frame.getContentPane().add(txtD);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(597, 99, 42, 42);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(640, 99, 42, 42);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(683, 99, 42, 42);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(389, 142, 42, 42);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(346, 142, 42, 42);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(303, 142, 42, 42);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(469, 142, 42, 42);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(512, 142, 42, 42);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(554, 142, 42, 42);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(597, 142, 42, 42);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(640, 142, 42, 42);
		frame.getContentPane().add(textField_19);
		
		txtD_1 = new JTextField();
		txtD_1.setEditable(false);
		txtD_1.setText(" D");
		txtD_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD_1.setColumns(10);
		txtD_1.setBounds(683, 142, 42, 42);
		frame.getContentPane().add(txtD_1);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(389, 183, 42, 42);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(346, 183, 42, 42);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(303, 183, 42, 42);
		frame.getContentPane().add(textField_23);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBounds(260, 183, 42, 42);
		frame.getContentPane().add(txtT);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(469, 183, 42, 42);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(512, 183, 42, 42);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(389, 225, 42, 42);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(469, 225, 42, 42);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(512, 225, 42, 42);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(554, 225, 42, 42);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(597, 225, 42, 42);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(640, 225, 42, 42);
		frame.getContentPane().add(textField_32);
		
		txtK = new JTextField();
		txtK.setEditable(false);
		txtK.setText(" K");
		txtK.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtK.setColumns(10);
		txtK.setBounds(683, 225, 42, 42);
		frame.getContentPane().add(txtK);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(469, 267, 42, 42);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(389, 267, 42, 42);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(346, 267, 42, 42);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(303, 267, 42, 42);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(389, 309, 42, 42);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(469, 309, 42, 42);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(512, 309, 42, 42);
		frame.getContentPane().add(textField_40);
		
		txtS_1 = new JTextField();
		txtS_1.setEditable(false);
		txtS_1.setText(" S");
		txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS_1.setColumns(10);
		txtS_1.setBounds(554, 309, 42, 42);
		frame.getContentPane().add(txtS_1);
		
		textField_42 = new JTextField();
		textField_42.setDocument(new JTextFieldCharLimits(1));
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(597, 309, 42, 42);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(640, 309, 42, 42);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		textField_44.setBounds(683, 309, 42, 42);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_45.setColumns(10);
		textField_45.setBounds(726, 309, 42, 42);
		frame.getContentPane().add(textField_45);
		
		JButton button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			   String f1="S"+textField_6.getText()+textField_7.getText()+"D"+textField_9.getText()+textField_10.getText()+textField_11.getText();
			   String f2=textField_14.getText()+textField_13.getText()+textField_12.getText()+textField_1.getText()+textField_15.getText()+textField_16.getText()+textField_17.getText()+textField_18.getText()+textField_19.getText()+"D";
			   String f3="T"+textField_23.getText()+textField_22.getText()+textField_21.getText()+"H"+textField_25.getText()+textField_26.getText();
			   String f4=textField_27.getText()+"O"+textField_28.getText()+textField_29.getText()+textField_30.getText()+textField_31.getText()+textField_32.getText()+"K";
			   String f5=textField.getText()+textField_37.getText()+textField_36.getText()+textField_35.getText()+"O"+textField_34.getText()+textField_2.getText();
			   String f6=textField_38.getText()+"L"+textField_39.getText()+textField_40.getText()+"S"+textField_42.getText()+textField_43.getText()+textField_44.getText()+textField_45.getText();
			   if(f1.equals("STUDENT") && f2.equals("BLACKBOARD") && f3.equals("TEACHER") && f4.equals("NOTEBOOK") && f5.equals("LESSONS") && f6.equals("CLASSROOM"))
			   {
				  
				   
				   ProgressUpdate.stop();
					JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\nPls enter your username");
					int id=(int)score/3;
					
					 String uname = JOptionPane.showInputDialog(frame, "Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\n Enter username:");

					 System.out.println(uname);
					 String upass = JOptionPane.showInputDialog(frame, "Enter password:");
					 System.out.println(upass);
					 
					 CrossService cs=new CrossService();
						cs.easy(id,uname,upass);
					 
					//JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"Your Score is "+score);
					
								   }
			   else
				{
					JOptionPane.showMessageDialog(null,"Wrong Answers!");
					
					if(!f1.equals("STUDENT")){
						textField_6.setText(null) ;textField_7.setText("") ;textField_9.setText("");textField_10.setText("");textField_11.setText("");
					}
					if(!f2.equals("BLACKBOARD"))
					{
						textField_14.setText(null); textField_13.setText(null); textField_12.setText(null); textField_1.setText(null);textField_15.setText(null); textField_16.setText(null);textField_17.setText(null);textField_18.setText(null);textField_19.setText(null);             
					}
					if(!f3.equals("TEACHER")){
						textField_23.setText(null);textField_22.setText(null);textField_21.setText(null);textField_25.setText(null);textField_26.getText();
					}
					if(!f4.equals("NOTEBOOK")){
						textField_27.setText(null);textField_28.setText(null);textField_29.setText(null);textField_30.setText(null);textField_31.setText(null);textField_32.setText(null);
					}
					if(!f5.equals("LESSONS")){
						textField.setText(null);textField_37.setText(null);textField_36.setText(null);textField_35.setText(null);textField_34.setText(null);textField_2.setText(null);
					}
					if(!f6.equals("CLASSROOM")){
						textField_38.setText(null);textField_39.setText(null);textField_40.setText(null);textField_42.setText(null);textField_43.setText(null);textField_44.setText(null);textField_45.setText(null);
					}
					wrong++;
				}
		}
	});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(346, 557, 179, 42);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(260, 267, 42, 42);
		frame.getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(512, 267, 42, 42);
		frame.getContentPane().add(textField_2);
		

		 progressBar = new JProgressBar();
		 progressBar.setToolTipText("\r\n");
		 progressBar.setStringPainted(true);
		 progressBar.setBounds(68, 462, 764, 16);
		progressBar.setForeground(new Color(0, 0, 205));
		frame.getContentPane().add(progressBar);
		
		JLabel lblTimeIsRunning = new JLabel("Time is  Running........!");
		lblTimeIsRunning.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTimeIsRunning.setBounds(141, 407, 359, 42);
		frame.getContentPane().add(lblTimeIsRunning);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(School.class.getResource("/images/questions/school.png")));
		lblNewLabel_1.setBounds(852, 80, 359, 288);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblHintYouWill = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		lblHintYouWill.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHintYouWill.setBounds(68, 612, 1178, 24);
		frame.getContentPane().add(lblHintYouWill);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					lblNewLabel.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(School.class.getResource("/images/solutions/School.png")) );
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
		lblNewLabel.setIcon( new ImageIcon(School.class.getResource("/others/light-bulb.png")) );
		lblNewLabel.setBounds(733, 543, 70, 64);
		frame.getContentPane().add(lblNewLabel);
		
		lblHint = new JLabel("HINT");
		lblHint.setHorizontalAlignment(SwingConstants.CENTER);
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(683, 574, 42, 24);
		frame.getContentPane().add(lblHint);
		
		label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_1.setIcon(new ImageIcon(School.class.getResource("/others/if_Previous_2_372909.png")));
		label_1.setBounds(12, 13, 70, 71);
		frame.getContentPane().add(label_1);

		 
	}
}
