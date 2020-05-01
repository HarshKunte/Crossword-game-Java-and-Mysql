package com.easy;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Animals {
	private JFrame frame;
	private JTextField txtR;
	private JTextField txtN_1;
	private JTextField txtD;
	private JTextField txtC;
	private JTextField txtA;
	private JTextField txtI;
	private JTextField txtM;
	private JTextField txtA_1;
	private JTextField txtL;
	private JTextField txtS;
	private JTextField txtN_2;
	private JTextField txtA_2;
	private JTextField textField_38;
	private JTextField txtT;
	private JTextField txtR_1;
	private JTextField txtI_1;
	private JTextField txtA_3;
	private JTextField txtO;
	private JTextField txtE;
	private JTextField txtN;
	private JButton button;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_23;
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
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_45;
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
    		  JOptionPane.showMessageDialog(null,"....Times UP!..."+"Your Score is 0");
    		  frame.dispose();
    		}
    	  }
      }
    };
    private JProgressBar progressBar;
    private JTextField username;
    private JLabel lblTimesRunning;
    private JLabel lblNewLabel_2;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animals window = new Animals();
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
	public Animals() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1515, 1071);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setBackground(new Color(230, 230, 250));
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(288, 319, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBackground(new Color(230, 230, 250));
		txtI.setBounds(372, 319, 42, 42);
		frame.getContentPane().add(txtI);
		
		txtM = new JTextField();
		txtM.setEditable(false);
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setText(" M");
		txtM.setColumns(10);
		txtM.setBackground(new Color(230, 230, 250));
		txtM.setBounds(413, 319, 42, 42);
		frame.getContentPane().add(txtM);
		
		txtA_1 = new JTextField();
		txtA_1.setEditable(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBackground(new Color(230, 230, 250));
		txtA_1.setBounds(454, 319, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setText(" L");
		txtL.setColumns(10);
		txtL.setBackground(new Color(230, 230, 250));
		txtL.setBounds(496, 319, 42, 42);
		frame.getContentPane().add(txtL);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setText(" S");
		txtS.setColumns(10);
		txtS.setBackground(new Color(230, 230, 250));
		txtS.setBounds(537, 319, 42, 42);
		frame.getContentPane().add(txtS);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBackground(new Color(230, 230, 250));
		txtN.setBounds(330, 319, 42, 42);
		frame.getContentPane().add(txtN);
		
		label = new JLabel("6");
		label.setBounds(510, 253, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("5");
		label_1.setBounds(388, 253, 14, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(189, 90, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("2");
		label_3.setBounds(296, 90, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("1");
		label_4.setBounds(357, 48, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("4");
		label_5.setBounds(103, 171, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("7");
		label_6.setBounds(357, 500, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("8");
		label_7.setBounds(479, 584, 15, 16);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("10");
		label_8.setBounds(178, 748, 14, 16);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("9");
		label_9.setBounds(276, 625, 15, 16);
		frame.getContentPane().add(label_9);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 255, 127));
		panel.setBounds(1, 0, 1496, 1035);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(121, 324, 42, 42);
		panel.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(121, 197, 42, 42);
		panel.add(textField_7);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(121, 154, 42, 42);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(163, 153, 42, 43);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(204, 115, 42, 42);
		panel.add(textField_18);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(204, 75, 42, 42);
		panel.add(textField_22);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(371, 109, 42, 42);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(371, 68, 42, 42);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(371, 27, 42, 42);
		panel.add(textField_26);
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(204, 197, 42, 42);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(204, 239, 42, 42);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(204, 282, 42, 42);
		panel.add(textField_2);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(288, 197, 42, 42);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(288, 239, 42, 42);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(288, 282, 42, 42);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(371, 282, 42, 42);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(288, 361, 42, 42);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(371, 361, 42, 42);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(495, 282, 42, 42);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(495, 361, 42, 42);
		panel.add(textField_15);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(495, 402, 42, 42);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(495, 444, 42, 42);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(371, 571, 42, 42);
		panel.add(textField_21);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(371, 528, 42, 42);
		panel.add(textField_23);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(371, 485, 42, 42);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(413, 485, 42, 42);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(454, 485, 42, 42);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(536, 485, 42, 42);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(578, 485, 42, 42);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(620, 485, 42, 42);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(536, 571, 42, 42);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(578, 571, 42, 42);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(620, 571, 42, 42);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(330, 609, 42, 42);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(288, 609, 42, 42);
		panel.add(textField_37);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(413, 609, 42, 42);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(371, 653, 42, 42);
		panel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(371, 695, 42, 42);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setDocument(new JTextFieldCharLimits(1));
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(288, 736, 42, 42);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(330, 736, 42, 42);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		textField_44.setBounds(204, 736, 42, 42);
		panel.add(textField_44);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setBounds(245, 736, 42, 42);
		panel.add(txtE);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBackground(new Color(230, 230, 250));
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(245, 154, 42, 42);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(288, 154, 42, 42);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(330, 154, 42, 42);
		panel.add(textField_6);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(288, 115, 42, 42);
		panel.add(txtC);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(new Color(230, 230, 250));
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_45.setColumns(10);
		textField_45.setBounds(121, 239, 42, 42);
		panel.add(textField_45);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setBounds(121, 282, 42, 42);
		panel.add(txtD);
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setText(" D");
		txtD.setColumns(10);
		txtD.setBackground(new Color(230, 230, 250));
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setBounds(371, 151, 42, 42);
		panel.add(txtR);
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setText(" R");
		txtR.setColumns(10);
		txtR.setBackground(new Color(230, 230, 250));
		
		txtN_2 = new JTextField();
		txtN_2.setEditable(false);
		txtN_2.setBounds(371, 402, 42, 42);
		panel.add(txtN_2);
		txtN_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN_2.setText(" N");
		txtN_2.setColumns(10);
		txtN_2.setBackground(new Color(230, 230, 250));
		
		txtN_1 = new JTextField();
		txtN_1.setEditable(false);
		txtN_1.setBounds(204, 154, 42, 42);
		panel.add(txtN_1);
		txtN_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN_1.setText(" N");
		txtN_1.setColumns(10);
		txtN_1.setBackground(new Color(230, 230, 250));
		
		txtA_2 = new JTextField();
		txtA_2.setEditable(false);
		txtA_2.setBounds(495, 485, 42, 42);
		panel.add(txtA_2);
		txtA_2.setText(" A");
		txtA_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_2.setColumns(10);
		txtA_2.setBackground(new Color(230, 230, 250));
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setBounds(495, 528, 42, 42);
		panel.add(textField_38);
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBackground(new Color(255, 255, 255));
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setBounds(495, 571, 42, 42);
		panel.add(txtT);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(new Color(230, 230, 250));
		
		txtR_1 = new JTextField();
		txtR_1.setEditable(false);
		txtR_1.setBounds(659, 571, 42, 42);
		panel.add(txtR_1);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(new Color(230, 230, 250));
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setBounds(454, 609, 42, 42);
		panel.add(txtO);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(new Color(230, 230, 250));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(713, 13, 770, 864);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Animals.class.getResource("/images/questions/animals.png")));
		
		button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.setBounds(91, 932, 179, 42);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   String f1=textField_26.getText()+textField_25.getText()+textField_24.getText()+"R";
				   String f2=textField_22.getText()+textField_18.getText()+"N"+textField.getText()+textField_1.getText()+textField_2.getText();
				   String f3=textField_16.getText()+textField_17.getText()+"N"+textField_4.getText()+textField_5.getText()+textField_6.getText()+"R";
				   String f4=textField_16.getText()+textField_7.getText()+textField_45.getText()+"D"+textField_3.getText();
				   String f5="C"+textField_5.getText()+textField_8.getText()+textField_9.getText()+textField_10.getText()+"A"+textField_12.getText();
				   String f6=textField_11.getText()+"I"+textField_13.getText()+"N";
				   String f7=textField_14.getText()+"L"+textField_15.getText()+textField_19.getText()+textField_20.getText()+"A"+textField_38.getText()+"T";
				   String f8=textField_27.getText()+textField_28.getText()+textField_29.getText()+"A"+textField_30.getText()+textField_31.getText()+textField_32.getText();
				   String f9="T"+textField_33.getText()+textField_34.getText()+textField_35.getText()+"R";
				   String f10=textField_27.getText()+textField_23.getText()+textField_21.getText()+"I"+textField_40.getText()+textField_41.getText()+"A";
				   String f11=textField_37.getText()+textField_36.getText()+"I"+textField_39.getText()+"O";
				   String f12=textField_44.getText()+"E"+textField_42.getText()+textField_43.getText()+"A";
					
				   if(f1.equals("DEER") && f2.equals("MONKEY") && f3.equals("PANTHER") && f4.equals("PANDA") && f5.equals("CHEETAH") && f6.equals("LION") && f7.equals("ELEPHANT") && f8.equals("GIRAFFE") && f9.equals("TIGER") && f10.equals("GORILLA") && f11.equals("RHINO") && f12.equals("ZEBRA"))				  
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
						if(!f1.equals("DEER"))
						{	
							textField_26.setText(null); textField_25.setText(null); textField_24.setText(null);
						}
						if(!f2.equals("MONKEY"))
						{	
							textField_22.setText(null); textField_18.setText(null); textField.setText(null); textField_1.setText(null);  textField_2.setText(null);
						}
						if(!f3.equals("PANTHER"))
						{	
							textField_16.setText(null); textField_17.setText(null); textField_4.setText(null); textField_5.setText(null); textField_6.setText(null);
						}
						if(!f4.equals("PANDA"))
						{
							textField_16.setText(null); textField_7.setText(null); textField_45.setText(null); textField_3.setText(null);
						}
						if( !f5.equals("CHEETAH"))
						{
							textField_5.setText(null); textField_8.setText(null); textField_9.setText(null); textField_10.setText(null); textField_12.setText(null);
						}
						if(!f6.equals("LION"))
						{	
							textField_11.setText(null); textField_13.setText(null);
						}
						if(!f7.equals("ELEPHANT"))
						{
							textField_14.setText(null); textField_15.setText(null); textField_19.setText(null); textField_20.setText(null); textField_38.setText(null);
						}
						if(!f8.equals("GIRAFFE"))
						{	
							textField_27.setText(null); textField_28.setText(null); textField_29.setText(null); textField_30.setText(null); textField_31.setText(null); textField_32.setText(null);
						}
						if(!f9.equals("TIGER"))
						{
							textField_33.setText(null); textField_34.setText(null); textField_35.setText(null);
						}
						if(!f10.equals("GORILLA"))
						{	
							textField_27.setText(null); textField_23.setText(null); textField_21.setText(null); textField_40.setText(null); textField_41.setText(null);
						}
						if(!f11.equals("RHINO"))
						{
							textField_37.setText(null); textField_36.setText(null); textField_39.setText(null);
						}
						if(!f12.equals("ZEBRA"))
						{
							textField_44.setText(null); textField_42.setText(null); textField_43.setText(null);
						}
						wrong++;
					}	
				
			}
			});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		txtI_1 = new JTextField();
		txtI_1.setEditable(false);
		txtI_1.setBounds(371, 609, 42, 42);
		panel.add(txtI_1);
		txtI_1.setText(" I");
		txtI_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_1.setColumns(10);
		txtI_1.setBackground(new Color(230, 230, 250));
		
		JLabel lblHint = new JLabel("HINT.");
		lblHint.setHorizontalAlignment(SwingConstants.CENTER);
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(371, 949, 54, 25);
		panel.add(lblHint);
		
		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_10.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Animals.class.getResource("/images/solutions/Animals.png")) );
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
		label_10.setIcon(new ImageIcon(Animals.class.getResource("/others/light-bulb.png")));
		label_10.setBounds(425, 911, 71, 63);
		panel.add(label_10);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(17, 855, 671, 14);
		panel.add(progressBar);
		
		lblTimesRunning = new JLabel("Time's Running......");
		lblTimesRunning.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblTimesRunning.setBounds(17, 800, 229, 42);
		panel.add(lblTimesRunning);
		
		JLabel lblNewLabel_1 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(508, 932, 1096, 16);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Animals.class.getResource("/others/if_Previous_2_372909.png")));
		lblNewLabel_2.setBounds(17, 13, 71, 70);
		panel.add(lblNewLabel_2);
		
		txtA_3 = new JTextField();
		txtA_3.setEditable(false);
		txtA_3.setBounds(371, 736, 42, 42);
		panel.add(txtA_3);
		txtA_3.setText(" A");
		txtA_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_3.setColumns(10);
		txtA_3.setBackground(new Color(230, 230, 250));
	}
}
