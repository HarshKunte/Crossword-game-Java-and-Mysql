package com.hard;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.easy.School;
import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Computer {
	private JFrame frame;
	private JTextField txtO_1;
	private JTextField txtE;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtY;
	private JTextField txtR;
	private JTextField txtT;
	private JTextField txtU;
	private JTextField txtP;
	private JTextField txtM;
	private JTextField txtO;
	private JTextField txtC;
	private JTextField txtT_1;
	private JTextField txtR_1;
	private JTextField txtS;
	private JTextField txtK;
	private JTextField txtD;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_9;
	private JTextField textField_1;
	private JTextField textField_10;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_29;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_26;
	private JTextField textField_25;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_38;
	private JTextField textField_37;
int wrong=0;
int j=0;
       double score=300;
    Thread ProgressUpdate=new Thread()
    {
      public void run()
      {
    	  int time=480;//1 min=60 seconds
    	  for(int i=0;i<=time;i++)
    	  {
    		try {
    			  Thread.sleep(1000);//Thread is made to sleep for 1 sec
    		}catch(Exception ex){}
    		progressBar.setValue(100*i/480);
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
    private JProgressBar progressBar_1;
    private JLabel lblNewLabel_1;
    private JLabel lblHint;
    private JLabel label_9;
    private JLabel lblNewLabel_3;
    private JLabel label_10;
    private JLabel label_11;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Computer window = new Computer();
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
	public Computer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1560, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtO_1 = new JTextField();
		txtO_1.setEditable(false);
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setText(" O");
		txtO_1.setColumns(10);
		txtO_1.setBackground(Color.WHITE);
		txtO_1.setBounds(420, 206, 42, 42);
		frame.getContentPane().add(txtO_1);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBackground(Color.WHITE);
		txtE.setBounds(420, 333, 42, 42);
		frame.getContentPane().add(txtE);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(379, 206, 42, 42);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(337, 206, 42, 42);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(462, 206, 42, 42);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(503, 206, 42, 42);
		frame.getContentPane().add(textField_8);
		
		txtY = new JTextField();
		txtY.setEditable(false);
		txtY.setText(" Y");
		txtY.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtY.setColumns(10);
		txtY.setBackground(Color.WHITE);
		txtY.setBounds(545, 206, 42, 42);
		frame.getContentPane().add(txtY);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		txtR.setBounds(462, 333, 42, 42);
		frame.getContentPane().add(txtR);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(Color.WHITE);
		txtT.setBounds(379, 333, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtU = new JTextField();
		txtU.setEditable(false);
		txtU.setText(" U");
		txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU.setColumns(10);
		txtU.setBackground(Color.WHITE);
		txtU.setBounds(337, 333, 42, 42);
		frame.getContentPane().add(txtU);
		
		txtP = new JTextField();
		txtP.setEditable(false);
		txtP.setText(" P");
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setColumns(10);
		txtP.setBackground(Color.WHITE);
		txtP.setBounds(295, 333, 42, 42);
		frame.getContentPane().add(txtP);
		
		txtM = new JTextField();
		txtM.setEditable(false);
		txtM.setText(" M");
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		txtM.setBounds(253, 333, 42, 42);
		frame.getContentPane().add(txtM);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		txtO.setBounds(210, 333, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		txtC.setBounds(167, 333, 42, 42);
		frame.getContentPane().add(txtC);
		
		txtR_1 = new JTextField();
		txtR_1.setEditable(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(Color.WHITE);
		txtR_1.setBounds(81, 459, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setColumns(10);
		textField.setBounds(546, 126, 42, 42);
		panel.add(textField);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setColumns(10);
		textField_4.setBounds(546, 164, 42, 42);
		panel.add(textField_4);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setColumns(10);
		textField_9.setBounds(420, 164, 42, 42);
		panel.add(textField_9);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setColumns(10);
		textField_1.setBounds(420, 248, 42, 42);
		panel.add(textField_1);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(420, 290, 42, 42);
		panel.add(textField_10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(539, 493, 633, 275);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_185634.jpg"));
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(546, 248, 42, 42);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(546, 290, 42, 42);
		panel.add(textField_3);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(546, 329, 42, 48);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(546, 375, 42, 42);
		panel.add(textField_12);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setBounds(546, 416, 42, 42);
		panel.add(txtD);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBackground(Color.WHITE);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(211, 290, 42, 42);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(294, 290, 42, 42);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(294, 375, 42, 42);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(211, 375, 42, 42);
		panel.add(textField_16);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(211, 416, 42, 42);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(80, 416, 42, 42);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(80, 375, 42, 42);
		panel.add(textField_20);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(39, 457, 42, 42);
		panel.add(textField_29);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(168, 457, 42, 42);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(125, 457, 42, 42);
		panel.add(textField_28);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(80, 499, 42, 42);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(80, 541, 42, 42);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(80, 584, 42, 42);
		panel.add(textField_32);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(211, 499, 42, 42);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(211, 541, 42, 42);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(253, 541, 42, 42);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(294, 541, 42, 42);
		panel.add(textField_24);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(294, 457, 42, 42);
		panel.add(textField_26);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(253, 457, 42, 42);
		panel.add(textField_25);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(125, 627, 42, 42);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(168, 627, 42, 42);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(211, 627, 42, 42);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(294, 627, 42, 42);
		panel.add(textField_36);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(335, 627, 42, 42);
		panel.add(textField_38);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(80, 669, 42, 42);
		panel.add(textField_37);
		
		JLabel label = new JLabel("1");
		label.setBounds(12, 471, 15, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("5");
		label_1.setBounds(195, 555, 15, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("4");
		label_2.setBounds(223, 272, 15, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("6");
		label_3.setBounds(306, 274, 15, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("9");
		label_4.setBounds(551, 97, 15, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("8");
		label_5.setBounds(433, 140, 15, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("3");
		label_6.setBounds(66, 641, 15, 16);
		panel.add(label_6);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setBounds(80, 627, 42, 42);
		panel.add(txtS);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBackground(Color.WHITE);
		
		txtK = new JTextField();
		txtK.setEditable(false);
		txtK.setBounds(253, 627, 42, 42);
		panel.add(txtK);
		txtK.setText(" K");
		txtK.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtK.setColumns(10);
		txtK.setBackground(Color.WHITE);
		
		txtT_1 = new JTextField();
		txtT_1.setEditable(false);
		txtT_1.setBounds(211, 457, 42, 42);
		panel.add(txtT_1);
		txtT_1.setText(" T");
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setColumns(10);
		txtT_1.setBackground(Color.WHITE);
		
		JLabel label_7 = new JLabel("7");
		label_7.setBounds(306, 210, 15, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("2");
		label_8.setBounds(95, 361, 15, 16);
		panel.add(label_8);
		
		JButton button_1 = new JButton("FINISH");
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(139, 0, 0));
		button_1.setBounds(125, 878, 167, 42);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f1=textField_9.getText()+"O"+textField_1.getText()+textField_10.getText()+"E";
				
				String f2=textField_6.getText()+textField_5.getText()+"O"+textField_7.getText()+textField_8.getText()+"Y";
				
				String f3=textField_14.getText()+"P"+textField_15.getText();
				
				String f4=textField_13.getText()+"O"+textField_16.getText()+textField_18.getText()+"T"+textField_21.getText()+textField_22.getText();
				
				String f5=textField_22.getText()+textField_23.getText()+textField_24.getText();
				
				String f6=textField_29.getText()+"R"+textField_28.getText()+textField_27.getText()+"T"+textField_25.getText()+textField_26.getText();
				
				String f7="S"+textField_33.getText()+textField_34.getText()+textField_35.getText()+"K"+textField_36.getText()+textField_38.getText();
				
				String f8=textField_20.getText()+textField_19.getText()+"R"+textField_30.getText()+textField_31.getText()+textField_32.getText()+"S"+textField_37.getText();
				
				String f9=textField.getText()+textField_4.getText()+"Y"+textField_2.getText()+textField_3.getText()+textField_11.getText()+textField_12.getText()+"D";
				
				
				if (f1.equals("MOUSE")&&f2.equals("FLOPPY")&&f3.equals("CPU")&&f4.equals("MONITOR")&&f5.equals("RAM")&&f6.equals("PRINTER")&&f7.equals("SPEAKER")&&f8.equals("HARDDISK")&&f9.equals("KEYBOARD"))
				{
			            int id=(int)score/3;
					
					   ProgressUpdate.stop();
					   JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\nPls enter your username");
						
						String uname = JOptionPane.showInputDialog(frame, "Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\n Enter username:");

						 System.out.println(uname);
						 String upass = JOptionPane.showInputDialog(frame, "Enter password:");
						 System.out.println(upass);
						 
						 CrossService cs=new CrossService();
							cs.hard(id,uname,upass);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Wrong Answers!");
					if(!f1.equals("MOUSE")){
						textField_9.setText(null) ;textField_1.setText(null) ;textField_10.setText(null);
					}
					if(!f2.equals("FLOPPY"))
					{
						textField_6.setText(null); textField_5.setText(null); textField_7.setText(null); textField_8.setText(null);            
					}
					if(!f3.equals("CPU")){
						textField_14.setText(null);textField_15.setText(null);
					}
					if(!f4.equals("MONITOR")){
						textField_13.setText(null);textField_16.setText(null);textField_18.setText(null);textField_21.setText(null);textField_22.setText(null);
					}
					if(!f5.equals("RAM")){
						textField_22.setText(null);textField_23.setText(null);textField_24.setText(null);
					}
					if(!f6.equals("PRINTER")){
						textField_29.setText(null);textField_28.setText(null);textField_27.setText(null);textField_25.setText(null);textField_26.setText(null);
						
					}
					if(!f7.equals("SPEAKER")){
						textField_33.setText(null);textField_34.setText(null);textField_35.setText(null);textField_36.setText(null);textField_38.setText(null);
						
					}
					if(!f8.equals("HARDDISK")){
						textField_20.setText(null);textField_19.setText(null);textField_30.setText(null);textField_31.setText(null);textField_32.setText(null);textField_37.setText(null);
						
					}
					if(!f9.equals("KEYBOARD")){
						textField.setText(null);textField_4.setText(null);textField_2.setText(null);textField_3.setText(null);textField_11.setText(null);textField_12.setText(null);
						
					}
					wrong++;
				}
			}
			
		});
		
			
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 205));
		progressBar.setStringPainted(true);
		progressBar.setBounds(48, 825, 651, 14);
		panel.add(progressBar);
		
		lblNewLabel_1 = new JLabel("Time's  Running.......");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(51, 769, 187, 43);
		panel.add(lblNewLabel_1);
		
		lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(373, 878, 42, 42);
		panel.add(lblHint);
		
		label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_9.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Computer.class.getResource("/images/solutions/Computer.png")) );
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
		label_9.setIcon(new ImageIcon(Computer.class.getResource("/others/light-bulb.png")));
		label_9.setBounds(420, 862, 69, 74);
		panel.add(label_9);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(675, 80, 56, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(705, 97, 625, 573);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Computer.class.getResource("/images/questions/computer.png")));
		
		label_10 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(539, 878, 865, 16);
		panel.add(label_10);
		
		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_11.setIcon(new ImageIcon(Computer.class.getResource("/others/if_Previous_2_372909.png")));
		label_11.setBounds(12, 13, 69, 74);
		panel.add(label_11);
	}

}
