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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Electronics {
	private JFrame frame;
	private JTextField txtO;
	private JTextField txtR;
	private JTextField txtK;
	private JTextField txtD;
	private JTextField txtM;
	private JTextField txtT;
	private JTextField txtC;
	private JTextField txtE_2;
	private JTextField txtL;
	private JTextField txtE_1;
	private JTextField txtR_1;
	private JTextField txtO_1;
	private JTextField txtN;
	private JTextField txtC_1;
	private JTextField txtC_2;
	private JTextField txtE;
	private JTextField textField_40;
	private JTextField txtA;
	private JTextField textField_44;
	private JTextField txtP;
	private JTextField txtI;
	private JTextField txtY;
	private JTextField txtR_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JPanel panel;
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
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_21;
	private JTextField textField_22;
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
	private JTextField textField_41;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	int wrong=0;
int j=0;
        double score=480;
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
    private JLabel label_10;
    private JLabel label_11;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electronics window = new Electronics();
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
	public Electronics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1560, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		txtO.setBounds(447, 54, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtK = new JTextField();
		txtK.setEditable(false);
		txtK.setText(" K");
		txtK.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtK.setColumns(10);
		txtK.setBackground(Color.WHITE);
		txtK.setBounds(737, 54, 42, 42);
		frame.getContentPane().add(txtK);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBackground(Color.WHITE);
		txtD.setBounds(737, 339, 42, 42);
		frame.getContentPane().add(txtD);
		
		txtM = new JTextField();
		txtM.setEditable(false);
		txtM.setText(" M");
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		txtM.setBounds(447, 96, 42, 42);
		frame.getContentPane().add(txtM);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(Color.WHITE);
		txtT.setBounds(447, 218, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		txtC.setBounds(405, 218, 42, 42);
		frame.getContentPane().add(txtC);
		
		txtE_2 = new JTextField();
		txtE_2.setEditable(false);
		txtE_2.setText(" E");
		txtE_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_2.setColumns(10);
		txtE_2.setBackground(Color.WHITE);
		txtE_2.setBounds(363, 218, 42, 42);
		frame.getContentPane().add(txtE_2);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		txtL.setBackground(Color.WHITE);
		txtL.setBounds(321, 218, 42, 42);
		frame.getContentPane().add(txtL);
		
		txtE_1 = new JTextField();
		txtE_1.setEditable(false);
		txtE_1.setText(" E");
		txtE_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_1.setColumns(10);
		txtE_1.setBackground(Color.WHITE);
		txtE_1.setBounds(281, 218, 42, 42);
		frame.getContentPane().add(txtE_1);
		
		txtR_1 = new JTextField();
		txtR_1.setEditable(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(Color.WHITE);
		txtR_1.setBounds(487, 218, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		txtO_1 = new JTextField();
		txtO_1.setEditable(false);
		txtO_1.setText(" O");
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setColumns(10);
		txtO_1.setBackground(Color.WHITE);
		txtO_1.setBounds(529, 218, 42, 42);
		frame.getContentPane().add(txtO_1);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBackground(Color.WHITE);
		txtN.setBounds(571, 218, 42, 42);
		frame.getContentPane().add(txtN);
		
		txtC_1 = new JTextField();
		txtC_1.setEditable(false);
		txtC_1.setText(" I");
		txtC_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC_1.setColumns(10);
		txtC_1.setBackground(Color.WHITE);
		txtC_1.setBounds(613, 218, 42, 42);
		frame.getContentPane().add(txtC_1);
		
		txtC_2 = new JTextField();
		txtC_2.setEditable(false);
		txtC_2.setText(" C");
		txtC_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC_2.setColumns(10);
		txtC_2.setBackground(Color.WHITE);
		txtC_2.setBounds(656, 218, 42, 42);
		frame.getContentPane().add(txtC_2);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBackground(Color.WHITE);
		txtE.setBounds(656, 339, 42, 42);
		frame.getContentPane().add(txtE);
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setColumns(10);
		textField_40.setBackground(Color.WHITE);
		textField_40.setBounds(656, 380, 42, 47);
		frame.getContentPane().add(textField_40);
		
		txtR_2 = new JTextField();
		txtR_2.setEditable(false);
		txtR_2.setText(" R");
		txtR_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_2.setColumns(10);
		txtR_2.setBackground(Color.WHITE);
		txtR_2.setBounds(281, 505, 42, 42);
		frame.getContentPane().add(txtR_2);
		
		label = new JLabel("1");
		label.setBounds(432, 13, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(390, 68, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(747, 26, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4");
		label_3.setBounds(292, 161, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5");
		label_4.setBounds(375, 161, 15, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(539, 161, 15, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setBounds(594, 353, 15, 16);
		frame.getContentPane().add(label_6);
		
		panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(0, 0, 1555, 1033);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(447, 13, 42, 42);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(405, 53, 42, 42);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(529, 53, 42, 42);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(488, 53, 42, 42);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(613, 53, 42, 42);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(655, 53, 42, 42);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(695, 53, 42, 42);
		panel.add(textField_6);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setBounds(572, 53, 42, 42);
		panel.add(txtR);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(447, 138, 42, 42);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(447, 177, 42, 42);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(364, 177, 42, 42);
		panel.add(textField_9);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(282, 177, 42, 42);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(529, 177, 42, 42);
		panel.add(textField_17);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(736, 96, 42, 42);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(736, 138, 42, 42);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(736, 177, 42, 42);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(736, 219, 42, 42);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(736, 261, 42, 42);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(736, 300, 42, 42);
		panel.add(textField_15);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(655, 261, 42, 42);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(655, 300, 42, 42);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(529, 261, 42, 42);
		panel.add(textField_20);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(529, 300, 42, 42);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(529, 342, 42, 42);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(529, 383, 42, 42);
		panel.add(textField_25);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(447, 261, 42, 42);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(447, 300, 42, 42);
		panel.add(textField_22);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(364, 261, 42, 42);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(364, 300, 42, 42);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(364, 342, 42, 42);
		panel.add(textField_28);
		
		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setBounds(364, 383, 42, 42);
		panel.add(txtI);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBackground(Color.WHITE);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(364, 425, 42, 42);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(364, 465, 42, 42);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(282, 261, 42, 42);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(282, 300, 42, 42);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(282, 342, 42, 42);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(282, 425, 42, 42);
		panel.add(textField_34);
		
		txtY = new JTextField();
		txtY.setEditable(false);
		txtY.setBounds(282, 383, 42, 42);
		panel.add(txtY);
		txtY.setText(" Y");
		txtY.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtY.setColumns(10);
		txtY.setBackground(Color.WHITE);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(282, 465, 42, 42);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(282, 547, 42, 42);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(613, 339, 42, 42);
		panel.add(textField_37);
		
		JLabel label_7 = new JLabel("8");
		label_7.setBounds(597, 409, 15, 16);
		panel.add(label_7);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(695, 339, 42, 42);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(777, 339, 42, 42);
		panel.add(textField_39);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(818, 339, 42, 42);
		panel.add(textField_41);
		
		textField_48 = new JTextField();
		textField_48.setDocument(new JTextFieldCharLimits(1));
		textField_48.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_48.setColumns(10);
		textField_48.setBounds(897, 339, 42, 42);
		panel.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setDocument(new JTextFieldCharLimits(1));
		textField_49.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_49.setColumns(10);
		textField_49.setBounds(856, 339, 42, 42);
		panel.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setDocument(new JTextFieldCharLimits(1));
		textField_50.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_50.setColumns(10);
		textField_50.setBounds(939, 339, 42, 42);
		panel.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setDocument(new JTextFieldCharLimits(1));
		textField_51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_51.setColumns(10);
		textField_51.setBounds(777, 425, 42, 42);
		panel.add(textField_51);
		
		txtP = new JTextField();
		txtP.setEditable(false);
		txtP.setBounds(818, 425, 42, 42);
		panel.add(txtP);
		txtP.setText(" P");
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setColumns(10);
		txtP.setBackground(Color.WHITE);
		
		textField_52 = new JTextField();
		textField_52.setDocument(new JTextFieldCharLimits(1));
		textField_52.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_52.setColumns(10);
		textField_52.setBounds(736, 425, 42, 42);
		panel.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setDocument(new JTextFieldCharLimits(1));
		textField_53.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_53.setColumns(10);
		textField_53.setBounds(695, 425, 42, 42);
		panel.add(textField_53);
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setBounds(655, 425, 42, 42);
		panel.add(txtA);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBackground(Color.WHITE);
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setBounds(613, 426, 42, 42);
		panel.add(textField_44);
		textField_44.setColumns(10);
		textField_44.setBackground(Color.WHITE);
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.setForeground(new Color(255, 255, 255));
		btnFinish.setBackground(new Color(139, 0, 0));
		btnFinish.setBounds(207, 778, 191, 42);
		panel.add(btnFinish);
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   String f1=textField_1.getText()+"O"+textField_3.getText()+textField_2.getText()+"R"+textField_4.getText()+textField_5.getText()+textField_6.getText()+"K";
				   
				   String f2=textField.getText()+"O"+"M"+textField_7.getText()+textField_8.getText()+"T"+textField_21.getText()+textField_22.getText();
				   
				   String f3=textField_16.getText()+"E"+textField_31.getText()+textField_32.getText()+textField_33.getText()+"Y"+textField_34.getText()+textField_35.getText()+"R"+textField_36.getText();
				   
				   String f4=textField_9.getText()+"E"+textField_26.getText()+textField_27.getText()+textField_28.getText()+"I"+textField_29.getText()+textField_30.getText();
				   
				   String f5=textField_17.getText()+"O"+textField_20.getText()+textField_23.getText()+textField_24.getText()+textField_25.getText();
				   
				   String f6="K"+textField_10.getText()+textField_11.getText()+textField_12.getText()+textField_13.getText()+textField_14.getText()+textField_15.getText()+"D";
				   
				   String f7=textField_37.getText()+"E"+textField_38.getText()+"D"+textField_39.getText()+textField_41.getText()+textField_49.getText()+textField_48.getText()+textField_50.getText();
				   
				   String f8=textField_44.getText()+"A"+textField_53.getText()+textField_52.getText()+textField_51.getText()+"P";
				   
				   String f9="C"+textField_18.getText()+textField_19.getText()+"E"+textField_40.getText()+"A";
				   
				  
					
				   if(f1.equals("POWERBANK") && f2.equals("COMPUTER") && f3.equals("MEMORYCARD") && f4.equals("PENDRIVE") && f5.equals("MOBILE") && f6.equals("KEYBOARD") && f7.equals("HEADPHONE") && f8.equals("LAPTOP") && f9.equals("CAMERA"))				  
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
						if(!f1.equals("POWERBANK"))
						{
							textField_1.setText(null); textField_3.setText(null); textField_2.setText(null); textField_4.setText(null); textField_5.setText(null); textField_6.setText(null);
						}
						if( !f2.equals("COMPUTER"))
						{
							textField.setText(null); textField_7.setText(null); textField_8.setText(null); textField_21.setText(null); textField_22.setText(null);
						}
						if(!f3.equals("MEMORYCARD"))
						{
							textField_16.setText(null); textField_31.setText(null); textField_32.setText(null); textField_33.setText(null); textField_34.setText(null); textField_35.setText(null); textField_36.setText(null);
						}
						if(!f4.equals("PENDRIVE"))
						{
							textField_9.setText(null); textField_26.setText(null); textField_27.setText(null); textField_28.setText(null); textField_29.setText(null); textField_30.setText(null);
						}
						if(!f5.equals("MOBILE"))
						{
							textField_17.setText(null); textField_20.setText(null); textField_23.setText(null); textField_24.setText(null);
						}
						if(!f6.equals("KEYBOARD"))
						{
							textField_10.setText(null); textField_11.setText(null); textField_12.setText(null); textField_13.setText(null); textField_14.setText(null); textField_15.setText(null);
						}
						if(!f7.equals("HEADPHONE"))
						{
							textField_37.setText(null); textField_38.setText(null); textField_39.setText(null); textField_41.setText(null); textField_49.setText(null); textField_48.setText(null); textField_50.setText(null);
						}
						if(!f8.equals("LAPTOP"))
						{	
							textField_44.setText(null); textField_53.setText(null); textField_52.setText(null); textField_51.setText(null);
						}
						if(!f9.equals("CAMERA"))
						{
							textField_18.setText(null); textField_19.setText(null); textField_40.setText(null);
						}
						wrong++;
					}
			}
		});
		btnFinish.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		 progressBar = new JProgressBar();
		progressBar.setForeground(Color.BLUE);
		progressBar.setStringPainted(true);
		progressBar.setBounds(48, 701, 786, 14);
		panel.add(progressBar);
		
		JLabel lblTimesRunning = new JLabel("Time's Running..........");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(50, 645, 170, 43);
		panel.add(lblTimesRunning);
		
		JLabel lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(515, 778, 47, 42);
		panel.add(lblHint);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_8.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Electronics.class.getResource("/images/solutions/Electronics.png")) );
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
		label_8.setIcon(new ImageIcon(Electronics.class.getResource("/others/light-bulb.png")));
		label_8.setBounds(558, 749, 66, 71);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Electronics.class.getResource("/images/questions/electronics.png")));
		label_9.setBounds(987, 53, 545, 454);
		panel.add(label_9);
		
		label_10 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(669, 773, 837, 16);
		panel.add(label_10);
		
		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_11.setIcon(new ImageIcon(Electronics.class.getResource("/others/if_Previous_2_372909.png")));
		label_11.setBounds(12, 13, 66, 71);
		panel.add(label_11);
	}
}
