package com.hard;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import com.easy.School;
import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Transport {
	private JFrame frame;
	private JTextField txtT_2;
	private JTextField txtM;
	private JTextField txtR;
	private JTextField txtL;
	private JTextField txtT;
	private JTextField txtA;
	private JTextField txtN;
	private JTextField txtS;
	private JTextField txtP;
	private JTextField txtO;
	private JTextField txtR_1;
	private JTextField txtT_1;
	private JTextField txtC;
	private JTextField txtH;
	private JTextField txtI;
	private JTextField txtR_2;
	private JTextField txtK;
	private JTextField txtA_1;
	private JTextField txtX;
	private JTextField txtI_1;
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
	private JLabel lblL;
	private JPanel panel;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_6;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_10;
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
    
    private JLabel lblTimesRunning;
    private JLabel lblHint;
    private JLabel label_10;
    private JLabel lblNewLabel_1;
    private JLabel label_11;
   
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transport window=new Transport();
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
	public Transport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1302, 978);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtT_2 = new JTextField();
		txtT_2.setEditable(false);
		txtT_2.setText(" T");
		txtT_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_2.setColumns(10);
		txtT_2.setBackground(Color.WHITE);
		txtT_2.setBounds(166, 44, 42, 42);
		frame.getContentPane().add(txtT_2);
		
		txtM = new JTextField();
		txtM.setEditable(false);
		txtM.setText(" M");
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		txtM.setBounds(292, 44, 42, 42);
		frame.getContentPane().add(txtM);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		txtR.setBounds(251, 128, 42, 42);
		frame.getContentPane().add(txtR);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		txtL.setBackground(Color.WHITE);
		txtL.setBounds(251, 210, 42, 42);
		frame.getContentPane().add(txtL);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(Color.WHITE);
		txtT.setBounds(208, 128, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBackground(Color.WHITE);
		txtA.setBounds(292, 128, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBackground(Color.WHITE);
		txtN.setBounds(334, 129, 42, 42);
		frame.getContentPane().add(txtN);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBackground(Color.WHITE);
		txtS.setBounds(377, 128, 42, 42);
		frame.getContentPane().add(txtS);
		
		txtP = new JTextField();
		txtP.setEditable(false);
		txtP.setText(" P");
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setColumns(10);
		txtP.setBackground(Color.WHITE);
		txtP.setBounds(419, 128, 42, 42);
		frame.getContentPane().add(txtP);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		txtO.setBounds(461, 128, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtR_1 = new JTextField();
		txtR_1.setEditable(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(Color.WHITE);
		txtR_1.setBounds(504, 128, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		txtT_1 = new JTextField();
		txtT_1.setEditable(false);
		txtT_1.setText(" T");
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setColumns(10);
		txtT_1.setBackground(Color.WHITE);
		txtT_1.setBounds(547, 128, 42, 42);
		frame.getContentPane().add(txtT_1);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		txtC.setBounds(125, 210, 42, 42);
		frame.getContentPane().add(txtC);
		
		txtH = new JTextField();
		txtH.setEditable(false);
		txtH.setText(" H");
		txtH.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtH.setColumns(10);
		txtH.setBackground(Color.WHITE);
		txtH.setBounds(208, 336, 42, 42);
		frame.getContentPane().add(txtH);
		
		txtI_1 = new JTextField();
		txtI_1.setEditable(false);
		txtI_1.setText(" I");
		txtI_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_1.setColumns(10);
		txtI_1.setBackground(Color.WHITE);
		txtI_1.setBounds(504, 210, 42, 42);
		frame.getContentPane().add(txtI_1);
		
		label = new JLabel("1");
		label.setBounds(139, 58, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(391, 15, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(510, 58, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4");
		label_3.setBounds(108, 210, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5");
		label_4.setBounds(404, 224, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("6");
		label_5.setBounds(193, 349, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("7");
		label_6.setBounds(344, 279, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("8");
		label_7.setBounds(567, 296, 15, 16);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("9");
		label_8.setBounds(230, 435, 15, 16);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("10");
		label_9.setBounds(271, 562, 15, 16);
		frame.getContentPane().add(label_9);
		
		panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(250, 43, 42, 42);
		panel.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(208, 43, 42, 42);
		panel.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(250, 86, 42, 42);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(377, 43, 42, 42);
		panel.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(377, 86, 42, 42);
		panel.add(textField_7);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(503, 86, 42, 42);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(503, 169, 42, 42);
		panel.add(textField_12);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(250, 169, 42, 42);
		panel.add(textField_6);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(166, 210, 42, 42);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(208, 210, 42, 42);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(293, 210, 42, 42);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(418, 210, 42, 42);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(462, 210, 42, 42);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(547, 210, 42, 42);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(503, 251, 42, 42);
		panel.add(textField_19);
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(125, 251, 42, 42);
		panel.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(125, 292, 42, 42);
		panel.add(textField_3);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(250, 251, 42, 42);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(250, 292, 42, 42);
		panel.add(textField_9);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(335, 292, 42, 42);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(589, 292, 42, 42);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(630, 292, 42, 42);
		panel.add(textField_22);
		
		txtX = new JTextField();
		txtX.setEditable(false);
		txtX.setBounds(674, 292, 42, 42);
		panel.add(txtX);
		txtX.setText(" X");
		txtX.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtX.setColumns(10);
		txtX.setBackground(Color.WHITE);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(716, 292, 42, 42);
		panel.add(textField_23);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(250, 334, 42, 42);
		panel.add(textField_10);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(293, 334, 42, 42);
		panel.add(textField_24);
		
		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setBounds(335, 334, 42, 42);
		panel.add(txtI);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBackground(Color.WHITE);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(377, 334, 42, 42);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(418, 334, 42, 42);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(462, 334, 42, 42);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(503, 334, 42, 42);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(547, 334, 42, 42);
		panel.add(textField_29);
		
		txtR_2 = new JTextField();
		txtR_2.setEditable(false);
		txtR_2.setBounds(589, 334, 42, 42);
		panel.add(txtR_2);
		txtR_2.setText(" R");
		txtR_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_2.setColumns(10);
		txtR_2.setBackground(Color.WHITE);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(335, 376, 42, 42);
		panel.add(textField_30);
		
		txtK = new JTextField();
		txtK.setEditable(false);
		txtK.setBounds(335, 416, 42, 42);
		panel.add(txtK);
		txtK.setText(" K");
		txtK.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtK.setColumns(10);
		txtK.setBackground(Color.WHITE);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(377, 416, 42, 42);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(293, 416, 42, 42);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(250, 416, 42, 42);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(335, 457, 42, 42);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(335, 499, 42, 42);
		panel.add(textField_35);
		
		txtA_1 = new JTextField();
		txtA_1.setEditable(false);
		txtA_1.setBounds(335, 541, 42, 42);
		panel.add(txtA_1);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBackground(Color.WHITE);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(377, 541, 42, 42);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(293, 541, 42, 42);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(335, 583, 42, 42);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(589, 376, 42, 42);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(589, 416, 42, 42);
		panel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(589, 457, 42, 42);
		panel.add(textField_41);
		
		
		button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.setBounds(125, 785, 179, 42);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				   String f1="T"+textField_1.getText()+textField_2.getText()+"M";
				   
				   String f2=textField_2.getText()+textField_4.getText()+"R"+textField_6.getText()+"L"+textField_8.getText()+textField_9.getText()+textField_10.getText();
				   
				   String f3=textField_5.getText()+textField_7.getText()+"S";
				   
				   String f4="C"+textField_13.getText()+textField_14.getText()+"L"+textField_15.getText();
				  
				   String f5="C"+textField.getText()+textField_3.getText();
				  
				   String f6=textField_11.getText()+"R"+textField_12.getText()+"I"+textField_19.getText();
				  
				   String f7="H"+textField_10.getText()+textField_24.getText()+"I"+textField_25.getText()+textField_26.getText()+textField_27.getText()+textField_28.getText()+textField_29.getText()+"R";
				  
				   String f8=textField_21.getText()+textField_22.getText()+"X"+textField_23.getText();
				  
				   String f9=textField_21.getText()+"R"+textField_39.getText()+textField_40.getText()+textField_41.getText();
				  
				   String f10=textField_20.getText()+"I"+textField_30.getText()+"K"+textField_34.getText()+textField_35.getText()+"A"+textField_38.getText();
				  
				   String f11=textField_33.getText()+textField_32.getText()+"K"+textField_31.getText();
				  
				   String f12=textField_37.getText()+"A"+textField_36.getText();
				  
				   String f13=textField_16.getText()+textField_17.getText()+"I"+textField_18.getText();
					
					
				   if(f1.equals("TRAM") && f2.equals("AIRPLANE") && f3.equals("BUS") && f4.equals("CYCLE") && f5.equals("CAR") && f6.equals("TRAIN") && f7.equals("HELICOPTER") && f8.equals("TAXI") && f9.equals("TRUCK") && f10.equals("RICKSHAW") && f11.equals("BIKE") && f12.equals("VAN") && f13.equals("SHIP"))				  
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
						if(!f1.equals("TRAM")){
							textField_1.setText(null) ;textField_2.setText(null) ;
						}
						if(!f2.equals("AIRPLANE"))
						{
							textField_2.setText(null); textField_4.setText(null); textField_6.setText(null); textField_8.setText(null);textField_9.setText(null); textField_10.setText(null);          
						}
						if(!f3.equals("BUS")){
							textField_5.setText(null);textField_7.setText(null);
						}
						if(!f4.equals("CYCLE")){
							textField_13.setText(null);textField_14.setText(null);textField_15.setText(null);
						}
						if(!f5.equals("CAR")){
							textField.setText(null);textField_3.setText(null);
						}
						if(!f6.equals("TRAIN")){
							textField_11.setText(null);textField_12.setText(null);textField_19.setText(null);
						}
						if(!f7.equals("HELICOPTER")){
							textField_10.setText(null) ;textField_24.setText(null) ;textField_25.setText(null);textField_26.setText(null);textField_27.setText(null);textField_28.setText(null);textField_29.setText(null);
						}
						if(!f8.equals("TAXI"))
						{
							textField_21.setText(null); textField_22.setText(null); textField_23.setText(null); 
						}
						if(!f9.equals("TRUCK")){
							textField_21.setText(null);textField_39.setText(null);textField_40.setText(null);textField_41.setText(null);
						}
						if(!f10.equals("RICKSHAW")){
							textField_20.setText(null);textField_30.setText(null);textField_34.setText(null);textField_35.setText(null);textField_38.setText(null);
						}
						if(!f11.equals("BIKE")){
							textField_33.setText(null);textField_32.setText(null);textField_31.setText(null);
						}
						if(!f12.equals("VAN")){
							textField_37.setText(null);textField_36.setText(null);
						
						}
						if(!f13.equals("SHIP")){
							textField_16.setText(null);textField_17.setText(null);textField_18.setText(null);
						}
						wrong++;
					}
			}
		});
		
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 205));
		progressBar.setStringPainted(true);
		progressBar.setBounds(43, 725, 715, 14);
		panel.add(progressBar);
		
		lblTimesRunning = new JLabel("Time's Running.......");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(43, 676, 179, 36);
		panel.add(lblTimesRunning);
		
		lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));	
		lblHint.setBounds(438, 791, 54, 25);
		panel.add(lblHint);
		
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
				JLabel label = new JLabel( new ImageIcon(Transport.class.getResource("/images/solutions/Transport.png")) );
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
		label_10.setIcon(new ImageIcon(Transport.class.getResource("/others/light-bulb.png")));
		label_10.setBounds(487, 765, 64, 74);
		panel.add(label_10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(787, 65, 464, 565);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Transport.class.getResource("/images/questions/transport1.png")));
		
		
		
		lblNewLabel_1 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 854, 958, 16);
		panel.add(lblNewLabel_1);
		
		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_11.setIcon(new ImageIcon(Transport.class.getResource("/others/if_Previous_2_372909.png")));
		label_11.setBounds(12, 13, 75, 72);
		panel.add(label_11);
			
		}
		

}
