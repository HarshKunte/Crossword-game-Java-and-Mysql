package com.hard;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.easy.School;
import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
public class Occupation {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtI;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtI_1;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField txtR;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField txtT;
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
	private JTextField txtG;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField txtS;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField txtU;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField txtI_2;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField txtA;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField txtO;
	private JTextField textField_87;
	private JTextField textField_88;
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
    private JProgressBar progressBar_1;
    private JLabel lblTimesRunning;
    private JLabel lblHint;
    private JLabel label_13;
    private JLabel label_14;
    private JTextField textField_4;
    private JLabel label_15;
    private JTextField textField_9;
    
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Occupation window = new Occupation();
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
	public Occupation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.setBounds(100, 100, 1357, 1072);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(284, 122, 42, 43);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(325, 122, 42, 43);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(366, 122, 42, 43);
		frame.getContentPane().add(textField_2);
		
		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBounds(408, 122, 42, 43);
		frame.getContentPane().add(txtI);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(492, 122, 42, 43);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(533, 122, 42, 43);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(575, 122, 42, 43);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(616, 122, 42, 43);
		frame.getContentPane().add(textField_8);
		
		txtI_1 = new JTextField();
		txtI_1.setEditable(false);
		txtI_1.setText(" I");
		txtI_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_1.setColumns(10);
		txtI_1.setBounds(657, 122, 42, 43);
		frame.getContentPane().add(txtI_1);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(699, 122, 42, 43);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(741, 122, 42, 43);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(408, 79, 42, 43);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(408, 164, 42, 43);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(408, 207, 42, 43);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(408, 250, 42, 43);
		frame.getContentPane().add(textField_15);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBounds(408, 292, 42, 43);
		frame.getContentPane().add(txtR);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(450, 250, 42, 43);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(366, 250, 42, 43);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(325, 250, 42, 43);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(284, 250, 42, 43);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(241, 250, 42, 43);
		frame.getContentPane().add(textField_21);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBounds(199, 250, 42, 43);
		frame.getContentPane().add(txtT);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(199, 207, 42, 43);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(199, 164, 42, 43);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(199, 122, 42, 43);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(199, 292, 42, 43);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(199, 336, 42, 43);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(325, 292, 42, 43);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(325, 336, 42, 43);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(325, 380, 42, 43);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(492, 207, 42, 43);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(533, 207, 42, 43);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(575, 207, 42, 43);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(616, 207, 42, 43);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(657, 207, 42, 43);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(699, 207, 42, 43);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(741, 207, 42, 43);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(657, 164, 42, 43);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(657, 79, 42, 43);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(657, 250, 42, 43);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(657, 292, 42, 43);
		frame.getContentPane().add(textField_41);
		
		txtG = new JTextField();
		txtG.setEditable(false);
		txtG.setText(" G");
		txtG.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtG.setColumns(10);
		txtG.setBounds(657, 336, 42, 43);
		frame.getContentPane().add(txtG);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(657, 380, 42, 43);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		textField_44.setBounds(657, 423, 42, 43);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_45.setColumns(10);
		textField_45.setBounds(657, 466, 42, 43);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setDocument(new JTextFieldCharLimits(1));
		textField_46.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_46.setColumns(10);
		textField_46.setBounds(657, 507, 42, 43);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setDocument(new JTextFieldCharLimits(1));
		textField_47.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_47.setColumns(10);
		textField_47.setBounds(699, 423, 42, 43);
		frame.getContentPane().add(textField_47);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(741, 423, 42, 43);
		frame.getContentPane().add(txtS);
		
		textField_49 = new JTextField();
		textField_49.setDocument(new JTextFieldCharLimits(1));
		textField_49.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_49.setColumns(10);
		textField_49.setBounds(783, 423, 42, 43);
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setDocument(new JTextFieldCharLimits(1));
		textField_50.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_50.setColumns(10);
		textField_50.setBounds(616, 423, 42, 43);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setDocument(new JTextFieldCharLimits(1));
		textField_51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_51.setColumns(10);
		textField_51.setBounds(575, 423, 42, 43);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setDocument(new JTextFieldCharLimits(1));
		textField_52.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_52.setColumns(10);
		textField_52.setBounds(533, 423, 42, 43);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setDocument(new JTextFieldCharLimits(1));
		textField_53.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_53.setColumns(10);
		textField_53.setBounds(741, 380, 42, 43);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setDocument(new JTextFieldCharLimits(1));
		textField_54.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_54.setColumns(10);
		textField_54.setBounds(741, 336, 42, 43);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setDocument(new JTextFieldCharLimits(1));
		textField_55.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_55.setColumns(10);
		textField_55.setBounds(741, 292, 42, 43);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setDocument(new JTextFieldCharLimits(1));
		textField_56.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_56.setColumns(10);
		textField_56.setBounds(741, 466, 42, 43);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setDocument(new JTextFieldCharLimits(1));
		textField_57.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_57.setColumns(10);
		textField_57.setBounds(533, 380, 42, 43);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setDocument(new JTextFieldCharLimits(1));
		textField_58.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_58.setColumns(10);
		textField_58.setBounds(533, 336, 42, 43);
		frame.getContentPane().add(textField_58);
		
		txtU = new JTextField();
		txtU.setEditable(false);
		txtU.setText(" U");
		txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU.setColumns(10);
		txtU.setBounds(533, 292, 42, 43);
		frame.getContentPane().add(txtU);
		
		textField_60 = new JTextField();
		textField_60.setDocument(new JTextFieldCharLimits(1));
		textField_60.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_60.setColumns(10);
		textField_60.setBounds(533, 250, 42, 43);
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setDocument(new JTextFieldCharLimits(1));
		textField_61.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_61.setColumns(10);
		textField_61.setBounds(533, 466, 42, 43);
		frame.getContentPane().add(textField_61);
		
		txtI_2 = new JTextField();
		txtI_2.setEditable(false);
		txtI_2.setText(" I");
		txtI_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_2.setColumns(10);
		txtI_2.setBounds(533, 507, 42, 43);
		frame.getContentPane().add(txtI_2);
		
		textField_63 = new JTextField();
		textField_63.setDocument(new JTextFieldCharLimits(1));
		textField_63.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_63.setColumns(10);
		textField_63.setBounds(533, 550, 42, 43);
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setDocument(new JTextFieldCharLimits(1));
		textField_64.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_64.setColumns(10);
		textField_64.setBounds(533, 593, 42, 43);
		frame.getContentPane().add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setDocument(new JTextFieldCharLimits(1));
		textField_65.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_65.setColumns(10);
		textField_65.setBounds(533, 637, 42, 43);
		frame.getContentPane().add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setDocument(new JTextFieldCharLimits(1));
		textField_66.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_66.setColumns(10);
		textField_66.setBounds(575, 507, 42, 43);
		frame.getContentPane().add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setDocument(new JTextFieldCharLimits(1));
		textField_67.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_67.setColumns(10);
		textField_67.setBounds(616, 507, 42, 43);
		frame.getContentPane().add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setDocument(new JTextFieldCharLimits(1));
		textField_68.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_68.setColumns(10);
		textField_68.setBounds(492, 507, 42, 43);
		frame.getContentPane().add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setDocument(new JTextFieldCharLimits(1));
		textField_69.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_69.setColumns(10);
		textField_69.setBounds(450, 507, 42, 43);
		frame.getContentPane().add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setDocument(new JTextFieldCharLimits(1));
		textField_70.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_70.setColumns(10);
		textField_70.setBounds(408, 507, 42, 43);
		frame.getContentPane().add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setDocument(new JTextFieldCharLimits(1));
		textField_71.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_71.setColumns(10);
		textField_71.setBounds(366, 507, 42, 43);
		frame.getContentPane().add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setDocument(new JTextFieldCharLimits(1));
		textField_72.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_72.setColumns(10);
		textField_72.setBounds(325, 507, 42, 43);
		frame.getContentPane().add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setDocument(new JTextFieldCharLimits(1));
		textField_73.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_73.setColumns(10);
		textField_73.setBounds(575, 637, 42, 43);
		frame.getContentPane().add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setDocument(new JTextFieldCharLimits(1));
		textField_74.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_74.setColumns(10);
		textField_74.setBounds(616, 637, 42, 43);
		frame.getContentPane().add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setDocument(new JTextFieldCharLimits(1));
		textField_75.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_75.setColumns(10);
		textField_75.setBounds(657, 637, 42, 43);
		frame.getContentPane().add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setDocument(new JTextFieldCharLimits(1));
		textField_76.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_76.setColumns(10);
		textField_76.setBounds(492, 637, 42, 43);
		frame.getContentPane().add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setDocument(new JTextFieldCharLimits(1));
		textField_77.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_77.setColumns(10);
		textField_77.setBounds(450, 637, 42, 43);
		frame.getContentPane().add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setDocument(new JTextFieldCharLimits(1));
		textField_78.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_78.setColumns(10);
		textField_78.setBounds(408, 637, 42, 43);
		frame.getContentPane().add(textField_78);
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(366, 637, 42, 43);
		frame.getContentPane().add(txtA);
		
		textField_80 = new JTextField();
		textField_80.setDocument(new JTextFieldCharLimits(1));
		textField_80.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_80.setColumns(10);
		textField_80.setBounds(325, 637, 42, 43);
		frame.getContentPane().add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setDocument(new JTextFieldCharLimits(1));
		textField_81.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_81.setColumns(10);
		textField_81.setBounds(284, 637, 42, 43);
		frame.getContentPane().add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setDocument(new JTextFieldCharLimits(1));
		textField_82.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_82.setColumns(10);
		textField_82.setBounds(241, 637, 42, 43);
		frame.getContentPane().add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setDocument(new JTextFieldCharLimits(1));
		textField_83.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_83.setColumns(10);
		textField_83.setBounds(199, 637, 42, 43);
		frame.getContentPane().add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setDocument(new JTextFieldCharLimits(1));
		textField_84.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_84.setColumns(10);
		textField_84.setBounds(241, 593, 42, 43);
		frame.getContentPane().add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setDocument(new JTextFieldCharLimits(1));
		textField_85.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_85.setColumns(10);
		textField_85.setBounds(241, 550, 42, 43);
		frame.getContentPane().add(textField_85);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBounds(241, 507, 42, 43);
		frame.getContentPane().add(txtO);
		
		textField_87 = new JTextField();
		textField_87.setDocument(new JTextFieldCharLimits(1));
		textField_87.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_87.setColumns(10);
		textField_87.setBounds(241, 466, 42, 43);
		frame.getContentPane().add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setDocument(new JTextFieldCharLimits(1));
		textField_88.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_88.setColumns(10);
		textField_88.setBounds(241, 680, 42, 43);
		frame.getContentPane().add(textField_88);
		
		JLabel label = new JLabel("1");
		label.setBounds(413, 55, 15, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(657, 55, 15, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("4");
		label_2.setBounds(268, 124, 15, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("5");
		label_3.setBounds(477, 208, 15, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("7");
		label_4.setBounds(172, 264, 15, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("10");
		label_5.setBounds(506, 437, 15, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("12");
		label_6.setBounds(306, 521, 15, 16);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("13");
		label_7.setBounds(183, 651, 15, 16);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("3");
		label_8.setBounds(199, 105, 15, 16);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("6");
		label_9.setBounds(543, 189, 15, 16);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("8");
		label_10.setBounds(334, 231, 15, 16);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("9");
		label_11.setBounds(722, 295, 15, 16);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("11");
		label_12.setBounds(241, 447, 15, 16);
		frame.getContentPane().add(label_12);
		
		JButton button = new JButton("FINISH");
		button.setBackground(new Color(139, 0, 0));
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String f1=textField_12.getText()+"I"+textField_13.getText()+textField_14.getText()+textField_15.getText()+"R";
				
				String f2=textField_39.getText()+"I"+textField_38.getText()+textField_35.getText()+textField_40.getText()+textField_41.getText()+"G"+textField_43.getText()+textField_44.getText()+textField_45.getText()+textField_46.getText();
				
				String f3=textField_25.getText()+textField_24.getText()+textField_23.getText()+"T"+textField_26.getText()+textField_27.getText();
				
				String f4=textField.getText()+textField_1.getText()+textField_2.getText()+"I"+textField_4.getText()+textField_5.getText()+textField_6.getText()+textField_7.getText()+textField_8.getText()+"I"+textField_10.getText()+textField_11.getText()+textField_9.getText();
				
				String f5=textField_31.getText()+textField_32.getText()+textField_33.getText()+textField_34.getText()+textField_35.getText()+textField_36.getText()+textField_37.getText();
				
				String f6=textField_32.getText()+textField_60.getText()+"U"+textField_58.getText()+textField_57.getText()+textField_52.getText()+textField_61.getText()+"I"+textField_63.getText()+textField_64.getText()+textField_65.getText();
				
				String f7="T"+textField_21.getText()+textField_20.getText()+textField_19.getText()+textField_18.getText()+textField_15.getText()+textField_17.getText();
				
				String f8=textField_19.getText()+textField_28.getText()+textField_29.getText()+textField_30.getText();
				
				String f9=textField_55.getText()+textField_54.getText()+textField_53.getText()+"S"+textField_56.getText();
				
				String f10=textField_52.getText()+textField_51.getText()+textField_50.getText()+textField_44.getText()+textField_47.getText()+"S"+textField_49.getText();
				
				String f11=textField_87.getText()+"O"+textField_85.getText()+textField_84.getText()+textField_82.getText()+textField_88.getText();
				
				String f12=textField_72.getText()+textField_71.getText()+textField_70.getText()+textField_69.getText()+textField_68.getText()+"I"+textField_66.getText()+textField_67.getText()+textField_46.getText();
				
				String f13=textField_83.getText()+textField_82.getText()+textField_81.getText()+textField_80.getText()+"A"+textField_78.getText()+textField_77.getText()+textField_76.getText()+textField_65.getText()+textField_73.getText()+textField_74.getText()+textField_75.getText();
				
				if (f1.equals("SINGER")&&f2.equals("FIREFIGHTER")&&f3.equals("WAITER")&&f4.equals("POLICEOFFICER")&&f5.equals("STUDENT")&&f6.equals("TRUCKDRIVER")&&f7.equals("TEACHER")&&f8.equals("CHEF")&&f9.equals("NURSE")&&f10.equals("DENTIST")&&f11.equals("DOCTOR")&&f12.equals("BUSDRIVER")&&f13.equals("POSTALWORKER"))
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
					if(!f1.equals("SINGER")){
						textField_12.setText(null);textField_13.setText(null);textField_14.setText(null);textField_15.setText(null);
					}
					if(!f2.equals("FIREFIGHTER")){
						textField_39.setText(null);textField_38.setText(null);textField_35.setText(null);textField_40.setText(null);textField_41.setText(null);textField_43.setText(null);textField_44.setText(null);textField_45.setText(null);textField_46.setText(null);
					}
					if(!f3.equals("WAITER")){
						textField_25.setText(null);textField_24.setText(null);textField_23.setText(null);textField_26.setText(null);textField_27.setText(null);						
					}
					if(!f4.equals("POLICEOFFICER")){
						textField.setText(null);textField_1.setText(null);textField_2.setText(null);textField_4.setText(null);textField_5.setText(null);textField_6.setText(null);textField_7.setText(null);textField_8.setText(null);textField_10.setText(null);textField_11.setText(null);				
					}
					if(!f5.equals("STUDENT")){
						textField_31.setText(null);textField_32.setText(null);textField_33.setText(null);textField_34.setText(null);textField_35.setText(null);textField_36.setText(null);textField_37.setText(null);						
					}
					if(!f6.equals("TRUCKDRIVER")){
						textField_32.setText(null);textField_60.setText(null);textField_58.setText(null);textField_57.setText(null);textField_52.setText(null);textField_61.setText(null);textField_63.setText(null);textField_64.setText(null);textField_65.setText(null);						
					}
					if(!f7.equals("TEACHER")){
						textField_21.setText(null);textField_20.setText(null);textField_19.setText(null);textField_18.setText(null);textField_15.setText(null);textField_17.setText(null);						
					}
					if(!f8.equals("CHEF")){
						textField_19.setText(null);textField_28.setText(null);textField_29.setText(null);textField_30.setText(null);						
					}
					if(!f9.equals("NURSE")){
						textField_55.setText(null);textField_54.setText(null);textField_53.setText(null);textField_56.setText(null);						
					}
					if(!f10.equals("DENTIST")){
						textField_52.setText(null);textField_51.setText(null);textField_50.setText(null);textField_44.setText(null);textField_47.setText(null);textField_49.setText(null);						

					}
					if(!f11.equals("DOCTOR")){
						textField_87.setText(null);textField_85.setText(null);textField_84.setText(null);textField_82.setText(null);textField_88.setText(null);						
					}
					if(!f12.equals("BUSDRIVER")){
						textField_72.setText(null);textField_71.setText(null);textField_70.setText(null);textField_69.setText(null);textField_68.setText(null);textField_66.setText(null);textField_67.setText(null);textField_46.setText(null);						
					}
					if(!f13.equals("POSTALWORKER")){
						textField_83.setText(null);textField_82.setText(null);textField_81.setText(null);textField_80.setText(null);textField_78.setText(null);textField_77.setText(null);textField_76.setText(null);textField_65.setText(null);textField_73.setText(null);textField_74.setText(null);textField_75.setText(null);						
					}
					
				}
			}
		});
		
		
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(172, 880, 179, 42);
		frame.getContentPane().add(button);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 205));
		progressBar.setStringPainted(true);
		progressBar.setBounds(76, 815, 749, 14);
		frame.getContentPane().add(progressBar);
		
		lblTimesRunning = new JLabel("Time's Running........");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(76, 772, 179, 43);
		frame.getContentPane().add(lblTimesRunning);
		
		lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(478, 880, 43, 24);
		frame.getContentPane().add(lblHint);
		
		label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_13.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Occupation.class.getResource("/images/solutions/Occupation.png")) );
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
		label_13.setIcon(new ImageIcon(Occupation.class.getResource("/others/light-bulb.png")));
		label_13.setBounds(519, 857, 66, 65);
		frame.getContentPane().add(label_13);
		
		label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(Occupation.class.getResource("/images/questions/occupation.png")));
		label_14.setBounds(843, 79, 473, 583);
		frame.getContentPane().add(label_14);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setBounds(450, 122, 42, 43);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		label_15 = new JLabel("");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_15.setIcon(new ImageIcon(Occupation.class.getResource("/others/if_Previous_2_372909.png")));
		label_15.setBounds(12, 13, 74, 74);
		frame.getContentPane().add(label_15);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setBounds(783, 122, 42, 43);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblHintYouWill = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		lblHintYouWill.setFont(new Font("Myanmar Text", Font.BOLD, 16));
		lblHintYouWill.setBounds(79, 936, 1131, 16);
		frame.getContentPane().add(lblHintYouWill);
	}
}
