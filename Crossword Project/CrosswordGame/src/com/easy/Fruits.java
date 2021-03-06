package com.easy;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
public class Fruits {
	private JFrame frame;
	private JTextField txtA;
	private JTextField txtT_1;
	private JTextField txtA_1;
	private JTextField txtF;
	private JTextField txtR;
	private JTextField txtI;
	private JTextField txtT;
	private JTextField txtS;
	private JTextField txtD;
	private JTextField txtU;
	private JTextField txtT_2;
	private JTextField txtR_1;
	private JTextField txtD_1;
	private JTextField txtP;
	private JTextField txtN;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField txtE;
	private JTextField txtO;
	private JTextField txtW;
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
	private JTextField textField_3;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_14;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_19;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_35;
	private JTextField textField_43;
	private JTextField textField_42;
	private JTextField textField_41;
	private JTextField textField_40;
	private JTextField textField_39;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_29;
	private JTextField textField_34;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField txtEnterUsername;
	private JLabel lblHint;
	int wrong=0;
    double score=300;
    int j=0;
	private JLabel lblNewLabel;
	private JLabel lblHint_1;
	private JLabel label_10;


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
	    		  JOptionPane.showMessageDialog(null,"....Times UP!..."+"Your Score is"+score+1);
	    		  frame.dispose();
	    		}
	    	  }
	      }
	    };
	 private JLabel lblNewLabel_1;
	 private JLabel label_11;
	private JProgressBar progressBar;
		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fruits window = new Fruits();
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
	public Fruits() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1340, 995);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(139, 128, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtT_1 = new JTextField();
		txtT_1.setEditable(false);
		txtT_1.setText(" T");
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setColumns(10);
		txtT_1.setBounds(222, 423, 42, 42);
		frame.getContentPane().add(txtT_1);
		
		txtA_1 = new JTextField();
		txtA_1.setEditable(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBounds(222, 128, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		txtF = new JTextField();
		txtF.setEditable(false);
		txtF.setText(" F");
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setColumns(10);
		txtF.setBounds(222, 256, 42, 42);
		frame.getContentPane().add(txtF);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBounds(264, 256, 42, 42);
		frame.getContentPane().add(txtR);
		
		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBounds(347, 256, 42, 42);
		frame.getContentPane().add(txtI);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBounds(389, 256, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(429, 256, 42, 42);
		frame.getContentPane().add(txtS);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBounds(307, 464, 42, 42);
		frame.getContentPane().add(txtD);
		
		txtU = new JTextField();
		txtU.setEditable(false);
		txtU.setText(" U");
		txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU.setColumns(10);
		txtU.setBounds(307, 256, 42, 42);
		frame.getContentPane().add(txtU);
		
		txtD_1 = new JTextField();
		txtD_1.setDocument(new JTextFieldCharLimits(1));
		txtD_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD_1.setColumns(10);
		txtD_1.setBounds(429, 171, 42, 42);
		frame.getContentPane().add(txtD_1);
		
		txtP = new JTextField();
		txtP.setEditable(false);
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setText(" P");
		txtP.setColumns(10);
		txtP.setBounds(513, 171, 42, 42);
		frame.getContentPane().add(txtP);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBounds(513, 464, 42, 42);
		frame.getContentPane().add(txtN);
		
		textField_47 = new JTextField();
		textField_47.setDocument(new JTextFieldCharLimits(1));
		textField_47.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_47.setColumns(10);
		textField_47.setBounds(513, 548, 42, 42);
		frame.getContentPane().add(textField_47);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBounds(513, 588, 42, 42);
		frame.getContentPane().add(txtE);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBounds(389, 464, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtW = new JTextField();
		txtW.setEditable(false);
		txtW.setText(" W");
		txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtW.setColumns(10);
		txtW.setBounds(264, 588, 42, 42);
		frame.getContentPane().add(txtW);
		
		label = new JLabel("1");
		label.setBounds(77, 141, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(150, 114, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("6");
		label_2.setBounds(227, 72, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_4 = new JLabel("3");
		label_4.setBounds(409, 184, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("4");
		label_5.setBounds(416, 46, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("10");
		label_6.setBounds(529, 153, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("5");
		label_7.setBounds(374, 478, 15, 16);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("7");
		label_8.setBounds(249, 602, 15, 16);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("8");
		label_9.setBounds(249, 506, 15, 16);
		frame.getContentPane().add(label_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 127));
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(429, 130, 42, 42);
		panel.add(textField_3);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(223, 169, 42, 42);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(100, 130, 42, 42);
		panel.add(textField_11);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(263, 130, 42, 42);
		panel.add(textField_14);
		
		txtR_1 = new JTextField();
		txtR_1.setEditable(false);
		txtR_1.setBounds(429, 89, 42, 42);
		panel.add(txtR_1);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(180, 130, 42, 42);
		panel.add(textField_18);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(138, 169, 42, 42);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(138, 212, 42, 42);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(138, 248, 42, 52);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(138, 300, 42, 42);
		panel.add(textField_23);
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(223, 212, 42, 42);
		panel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(305, 130, 42, 42);
		panel.add(textField_2);
		
		label_3 = new JLabel("9");
		label_3.setBounds(290, 226, 15, 16);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(223, 300, 42, 42);
		panel.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(223, 340, 42, 42);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(223, 382, 42, 42);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(305, 212, 42, 42);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(305, 300, 42, 42);
		panel.add(textField_7);
		
		txtT_2 = new JTextField();
		txtT_2.setEditable(false);
		txtT_2.setBounds(305, 340, 42, 42);
		panel.add(txtT_2);
		txtT_2.setText(" T");
		txtT_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_2.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(305, 382, 42, 42);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(305, 422, 42, 42);
		panel.add(textField_9);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(263, 507, 42, 42);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(263, 549, 42, 42);
		panel.add(textField_13);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(263, 629, 42, 42);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(305, 588, 42, 42);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(348, 588, 42, 42);
		panel.add(textField_17);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(390, 588, 42, 42);
		panel.add(textField_19);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(429, 588, 42, 42);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(471, 588, 42, 42);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(555, 588, 42, 42);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(595, 588, 42, 42);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(636, 588, 42, 42);
		panel.add(textField_28);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(429, 463, 42, 42);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(471, 463, 42, 42);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(555, 463, 42, 42);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(595, 463, 42, 42);
		panel.add(textField_33);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(512, 422, 42, 42);
		panel.add(textField_35);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(512, 382, 42, 42);
		panel.add(textField_43);
		
		textField_42 = new JTextField();
		textField_42.setDocument(new JTextFieldCharLimits(1));
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(512, 340, 42, 42);
		panel.add(textField_42);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(512, 300, 42, 42);
		panel.add(textField_41);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(512, 258, 42, 42);
		panel.add(textField_40);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(512, 212, 42, 52);
		panel.add(textField_39);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(555, 169, 42, 42);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(595, 169, 42, 42);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(636, 169, 42, 42);
		panel.add(textField_38);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(429, 212, 42, 42);
		panel.add(textField_29);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(471, 169, 42, 42);
		panel.add(textField_34);
		
		textField_46 = new JTextField();
		textField_46.setDocument(new JTextFieldCharLimits(1));
		textField_46.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_46.setBounds(512, 508, 42, 42);
		panel.add(textField_46);
		textField_46.setColumns(10);
		
		textField_44 = new JTextField();
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		textField_44.setBounds(223, 89, 42, 42);
		panel.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_45.setColumns(10);
		textField_45.setBounds(429, 47, 42, 42);
		panel.add(textField_45);
		
		JButton button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.setBounds(201, 793, 167, 42);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f1=textField_11.getText()+"A"+textField_18.getText()+"A"+textField_14.getText()+textField_2.getText();
				
				String f2="A"+textField_20.getText()+textField_21.getText()+textField_22.getText()+textField_23.getText();
				
				String f3=txtD_1.getText()+textField_34.getText()+"P"+textField_36.getText()+textField_37.getText()+textField_38.getText();
				
				String f4=textField_45.getText()+"R"+textField_3.getText()+txtD_1.getText()+textField_29.getText()+"S";
				
				String f5="O"+textField_30.getText()+textField_31.getText()+"N"+textField_32.getText()+textField_33.getText();
				
				String f6=textField_44.getText()+"A"+textField_10.getText()+textField.getText()+"F"+textField_1.getText()+textField_4.getText()+textField_5.getText()+"T";
				
				String f7="W"+textField_16.getText()+textField_17.getText()+textField_19.getText()+textField_24.getText()+textField_25.getText()+"E"+textField_26.getText()+textField_27.getText()+textField_28.getText();
				
				String f8=textField_12.getText()+textField_13.getText()+"W"+textField_15.getText();
				
				String f9=textField_6.getText()+"U"+textField_7.getText()+"T"+textField_8.getText()+textField_9.getText()+"D";
				
				String f10="P"+textField_39.getText()+textField_40.getText()+textField_41.getText()+textField_42.getText()+textField_43.getText()+textField_35.getText()+"N"+textField_46.getText()+textField_47.getText()+"E";
				
				
				if (f1.equals("BANANA")&&f2.equals("APPLE")&&f3.equals("PAPAYA")&&f4.equals("GRAPES")&&f5.equals("ORANGE")&&f6.equals("JACKFRUIT")&&f7.equals("WATERMELON")&&f8.equals("KIWI")&&f9.equals("CUSTARD")&&f10.equals("POMEGRANATE"))
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
					if(!f1.equals("BANANA")){
						textField_11.setText(null);textField_18.setText(null); textField_14.setText(null);textField_2.setText(null);
					}
					if(!f2.equals("APPLE")){ 
						
						textField_20.setText(null); textField_21.setText(null); textField_22.setText(null); textField_23.setText(null);
					}
					if(!f3.equals("PAPAYA")){
						txtD_1.setText(null);textField_34.setText(null);textField_36.setText(null);textField_37.setText(null);textField_38.setText(null);
					}
					if(!f4.equals("GRAPES")){
						textField_45.setText(null);textField_3.setText(null);txtD_1.setText(null);textField_29.setText(null);
						
					}
					if(!f5.equals("ORANGE")){
						textField_30.setText(null);textField_31.setText(null);textField_32.setText(null);textField_33.setText(null);
					}
					if(!f6.equals("JACKFRUIT")){
						textField_44.setText(null);textField_10.setText(null);textField.setText(null);textField_1.setText(null);textField_4.setText(null);textField_5.setText(null);
						
					}
					if(!f7.equals("WATERMELON")){
						textField_16.setText(null);textField_17.setText(null);textField_19.setText(null);textField_24.setText(null);textField_25.setText(null);textField_26.setText(null);textField_27.setText(null);textField_28.setText(null);
					}
					if(!f8.equals("KIWI")){
						textField_12.setText(null);textField_13.setText(null);textField_15.setText(null);
					}
					if(!f9.equals("CUSTARD")){
						textField_6.setText(null);textField_7.setText(null);textField_8.setText(null);textField_9.setText(null);
					}	
					if(!f10.equals("POMEGRANATE")){
						textField_39.setText(null);textField_40.setText(null);textField_41.setText(null);textField_42.setText(null);textField_43.setText(null);textField_35.setText(null);textField_46.setText(null);textField_47.setText(null);
					}
					wrong++;
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon(Fruits.class.getResource("/images/questions/fruits.png")));
		lblNewLabel1.setBounds(724, 108, 535, 584);
		panel.add(lblNewLabel1);
		
		lblHint_1 = new JLabel("HINT");
		lblHint_1.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHint_1.setBounds(457, 805, 71, 16);
		panel.add(lblHint_1);
		
		label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(j>=3)
				{
				    label_10.setVisible(false);
				    lblHint_1.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=1000;
				JLabel label = new JLabel( new ImageIcon(Fruits.class.getResource("/images/solutions/Fruits.png")) );
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
		label_10.setIcon(new ImageIcon(Fruits.class.getResource("/others/light-bulb.png")));
		label_10.setBounds(512, 767, 71, 70);
		panel.add(label_10);
		
		 progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(73, 737, 649, 14);
		progressBar.setForeground(new Color(0, 0, 205));
		panel.add(progressBar);
		
		JLabel lblTimesRunning = new JLabel("Time's Running.........");
		lblTimesRunning.setFont(new Font("Myanmar Text", Font.BOLD, 21));
		lblTimesRunning.setBounds(73, 684, 262, 53);
		panel.add(lblTimesRunning);
		
		lblNewLabel_1 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(31, 854, 1100, 52);
		panel.add(lblNewLabel_1);
		
		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_11.setIcon(new ImageIcon(Fruits.class.getResource("/others/if_Previous_2_372909.png")));
		label_11.setBounds(12, 13, 71, 76);
		panel.add(label_11);
		
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
				      score=score-10;
				      
				}
				
				

			}
		});
		

	}
}
