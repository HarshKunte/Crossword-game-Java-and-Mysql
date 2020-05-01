package om.medium;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import com.easy.School;
import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Picnic {
	private JFrame frame;
	private JTextField textField;
	private JTextField txtS;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtL;
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
	private JTextField txtE;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField txtR;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField txtC;
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
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField txtR_1;
	private JTextField textField_48;
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
	private JTextField txtE_1;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField txtS_1;
	private JTextField textField_63;
	private JTextField textField_64;
	private JLabel lblNewLabel;
	private JLabel label_10;
	private JTextField textField_1;
	private JTextField textField_9;
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
    private JLabel label_11;
    private JLabel label_12;
    private JLabel label_13;
 
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Picnic window = new Picnic();
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
	public Picnic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1454, 1082);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ProgressUpdate.start();
		frame.setResizable(false);
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(539, 104, 42, 43);
		frame.getContentPane().add(textField);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(539, 62, 42, 43);
		frame.getContentPane().add(txtS);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(539, 147, 42, 43);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(539, 190, 42, 43);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(539, 233, 42, 43);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(539, 276, 42, 43);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(539, 318, 42, 43);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(539, 361, 42, 43);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));	
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(497, 190, 42, 43);
		frame.getContentPane().add(textField_8);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		txtL.setBounds(455, 190, 42, 43);
		frame.getContentPane().add(txtL);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(412, 190, 42, 43);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(369, 190, 42, 43);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(455, 147, 42, 43);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(455, 104, 42, 43);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(455, 62, 42, 43);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(455, 233, 42, 43);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(455, 276, 42, 43);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(369, 233, 42, 43);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(369, 276, 42, 43);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(369, 318, 42, 43);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(369, 361, 42, 43);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(369, 404, 42, 43);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(369, 447, 42, 43);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(369, 491, 42, 43);
		frame.getContentPane().add(textField_23);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBounds(369, 535, 42, 43);
		frame.getContentPane().add(txtE);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(369, 577, 42, 43);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(327, 404, 42, 43);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(412, 404, 42, 43);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(285, 404, 42, 43);
		frame.getContentPane().add(textField_28);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBounds(242, 404, 42, 43);
		frame.getContentPane().add(txtR);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(200, 404, 42, 43);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(157, 404, 42, 43);
		frame.getContentPane().add(textField_31);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBounds(114, 404, 42, 43);
		frame.getContentPane().add(txtC);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(114, 361, 42, 43);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(114, 318, 42, 43);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(114, 447, 42, 43);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(114, 491, 42, 43);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(114, 535, 42, 43);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(327, 535, 42, 43);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(285, 535, 42, 43);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(242, 535, 42, 43);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(412, 535, 42, 43);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setDocument(new JTextFieldCharLimits(1));
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(455, 535, 42, 43);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(497, 535, 42, 43);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		textField_44.setBounds(539, 535, 42, 43);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_45.setColumns(10);
		textField_45.setBounds(582, 535, 42, 43);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setDocument(new JTextFieldCharLimits(1));
		textField_46.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_46.setColumns(10);
		textField_46.setBounds(582, 318, 42, 43);
		frame.getContentPane().add(textField_46);
		
		txtR_1 = new JTextField();
		txtR_1.setEditable(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBounds(624, 318, 42, 43);
		frame.getContentPane().add(txtR_1);
		
		textField_48 = new JTextField();
		textField_48.setDocument(new JTextFieldCharLimits(1));
		textField_48.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_48.setColumns(10);
		textField_48.setBounds(666, 318, 42, 43);
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setDocument(new JTextFieldCharLimits(1));
		textField_49.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_49.setColumns(10);
		textField_49.setBounds(624, 276, 42, 43);
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setDocument(new JTextFieldCharLimits(1));
		textField_50.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_50.setColumns(10);
		textField_50.setBounds(624, 233, 42, 43);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setDocument(new JTextFieldCharLimits(1));
		textField_51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_51.setColumns(10);
		textField_51.setBounds(624, 190, 42, 43);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setDocument(new JTextFieldCharLimits(1));
		textField_52.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_52.setColumns(10);
		textField_52.setBounds(624, 147, 42, 43);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setDocument(new JTextFieldCharLimits(1));
		textField_53.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_53.setColumns(10);
		textField_53.setBounds(624, 104, 42, 43);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setDocument(new JTextFieldCharLimits(1));
		textField_54.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_54.setColumns(10);
		textField_54.setBounds(624, 361, 42, 43);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setDocument(new JTextFieldCharLimits(1));
		textField_55.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_55.setColumns(10);
		textField_55.setBounds(624, 404, 42, 43);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setDocument(new JTextFieldCharLimits(1));
		textField_56.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_56.setColumns(10);
		textField_56.setBounds(624, 447, 42, 43);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setDocument(new JTextFieldCharLimits(1));
		textField_57.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_57.setColumns(10);
		textField_57.setBounds(582, 447, 42, 43);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setDocument(new JTextFieldCharLimits(1));
		textField_58.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_58.setColumns(10);
		textField_58.setBounds(666, 447, 42, 43);
		frame.getContentPane().add(textField_58);
		
		txtE_1 = new JTextField();
		txtE_1.setEditable(false);
		txtE_1.setText(" E");
		txtE_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_1.setColumns(10);
		txtE_1.setBounds(709, 447, 42, 43);
		frame.getContentPane().add(txtE_1);
		
		textField_60 = new JTextField();
		textField_60.setDocument(new JTextFieldCharLimits(1));
		textField_60.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_60.setColumns(10);
		textField_60.setBounds(752, 447, 42, 43);
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setDocument(new JTextFieldCharLimits(1));
		textField_61.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_61.setColumns(10);
		textField_61.setBounds(666, 233, 42, 43);
		frame.getContentPane().add(textField_61);
		
		txtS_1 = new JTextField();
		txtS_1.setEditable(false);
		txtS_1.setText(" S");
		txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS_1.setColumns(10);
		txtS_1.setBounds(709, 233, 42, 43);
		frame.getContentPane().add(txtS_1);
		
		textField_63 = new JTextField();
		textField_63.setDocument(new JTextFieldCharLimits(1));
		textField_63.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_63.setColumns(10);
		textField_63.setBounds(752, 233, 42, 43);
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setDocument(new JTextFieldCharLimits(1));
		textField_64.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_64.setColumns(10);
		textField_64.setBounds(794, 233, 42, 43);
		frame.getContentPane().add(textField_64);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(0, 0, 1436, 1035);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(895, 562, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("1");
		label.setBounds(462, 39, 16, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(348, 196, 22, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(548, 39, 22, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(607, 244, 16, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(632, 81, 16, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(518, 324, 16, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setBounds(554, 459, 16, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setBounds(115, 244, 16, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("9");
		label_8.setBounds(88, 410, 16, 16);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("10");
		label_9.setBounds(219, 545, 16, 16);
		panel.add(label_9);
		
		label_10 = new JLabel("11");
		label_10.setBounds(373, 168, 22, 16);
		panel.add(label_10);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setBounds(114, 275, 42, 43);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(835, 233, 42, 43);
		panel.add(textField_9);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 205));
		progressBar.setStringPainted(true);
		progressBar.setBounds(43, 690, 722, 14);
		panel.add(progressBar);
		
		lblTimesRunning = new JLabel("Time's Running.......");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(43, 650, 166, 36);
		panel.add(lblTimesRunning);
		
		JButton button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.setBounds(160, 755, 179, 42);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String f1=textField_14.getText()+textField_13.getText()+textField_12.getText()+"L"+textField_15.getText()+textField_16.getText();
			String f2=textField_11.getText()+textField_10.getText()+"L"+textField_8.getText()+textField_3.getText();	
			String f3="S"+textField.getText()+textField_2.getText()+textField_3.getText()+textField_4.getText()+textField_5.getText()+textField_6.getText()+textField_7.getText();
			String f4=textField_50.getText()+textField_61.getText()+"S"+textField_63.getText()+textField_64.getText()+textField_9.getText();
			String f5=textField_53.getText()+textField_52.getText()+textField_51.getText()+textField_50.getText()+textField_49.getText()+"R"+textField_54.getText()+textField_55.getText()+textField_56.getText();
			String f6=textField_6.getText()+textField_46.getText()+"R"+textField_48.getText();
			String f7=textField_57.getText()+textField_56.getText()+textField_58.getText()+"E"+textField_60.getText();
			String f8=textField_1.getText()+textField_34.getText()+textField_33.getText()+"C"+textField_35.getText()+textField_36.getText()+textField_37.getText();
			String f9="C"+textField_31.getText()+textField_30.getText()+"R"+textField_28.getText()+textField_26.getText()+textField_21.getText()+textField_27.getText();
			String f10=textField_40.getText()+textField_39.getText()+textField_38.getText()+"E"+textField_41.getText()+textField_42.getText()+textField_43.getText()+textField_44.getText()+textField_45.getText();
			String f11=textField_11.getText()+textField_17.getText()+textField_18.getText()+textField_19.getText()+textField_20.getText()+textField_21.getText()+textField_22.getText()+textField_23.getText()+"E"+textField_25.getText();
			
			if (f1.equals("COOLER")&&f2.equals("SALAD")&&f3.equals("SANDWICH")&&f4.equals("BASKET")&&f5.equals("HAMBURGER")&&f6.equals("CORN")&&f7.equals("TREES")&&f8.equals("KETCHUP")&&f9.equals("CHARCOAL")&&f10.equals("FIREWORKS")&&f11.equals("SUNGLASSES"))
			{
				int id=(int)score/3;
				 ProgressUpdate.stop();
				 JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\nPls enter your username");
					
					String uname = JOptionPane.showInputDialog(frame, "Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\n Enter username:");

					 System.out.println(uname);
					 String upass = JOptionPane.showInputDialog(frame, "Enter password:");
					 System.out.println(upass);
					 
					 CrossService cs=new CrossService();
						cs.medium(id,uname,upass);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Wrong Answers!");
				if(!f1.equals("COOLER")){
					textField_14.setText(null);textField_13.setText(null);textField_12.setText(null);textField_15.setText(null);textField_16.setText(null);
					}
					if(!f2.equals("SALAD")){
					textField_11.setText(null);textField_10.setText(null);textField_8.setText(null);textField_3.setText(null);	

						}
					if(!f3.equals("SANDWICH")){
						textField.setText(null);textField_2.setText(null);textField_3.setText(null);textField_4.setText(null);textField_5.setText(null);textField_6.setText(null);textField_7.setText(null);
							
					}
					if(!f4.equals("BASKET")){
					textField_50.setText(null);textField_61.setText(null);textField_63.setText(null);textField_64.setText(null);textField_9.setText(null);
	
					}
					if(!f5.equals("HAMBURGER")){
						textField_53.setText(null);textField_52.setText(null);textField_51.setText(null);textField_50.setText(null);textField_49.setText(null);textField_54.setText(null);textField_55.setText(null);textField_56.setText(null);
						
					}
					if(!f6.equals("CORN")){
						textField_6.setText(null);textField_46.setText(null);textField_48.setText(null);
						
					}
					if(!f7.equals("TREES")){
						textField_57.setText(null);textField_56.setText(null);textField_58.setText(null);textField_60.setText(null);

					}
					if(!f8.equals("KETCHUP")){
						textField_1.setText(null);textField_34.setText(null);textField_33.setText(null);textField_35.setText(null);textField_36.setText(null);textField_37.setText(null);
							
					}
					if(!f9.equals("CHARCOAL")){
						textField_31.setText(null);textField_30.setText(null);textField_28.setText(null);textField_26.setText(null);textField_21.setText(null);textField_27.setText(null);	
					}
					if(!f10.equals("FIREWORKS")){
						textField_40.setText(null);textField_39.setText(null);textField_38.setText(null);textField_41.setText(null);textField_42.setText(null);textField_43.setText(null);textField_44.setText(null);textField_45.setText(null);
						
					}
					if(!f11.equals("SUNGLASSES")){
						textField_11.setText(null);textField_17.setText(null);textField_18.setText(null);textField_19.setText(null);textField_20.setText(null);textField_21.setText(null);textField_22.setText(null);textField_23.setText(null);textField_25.setText(null);

					}
					wrong++;
			}	
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblHint = new JLabel("HINT");
		lblHint.setHorizontalAlignment(SwingConstants.CENTER);
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(444, 755, 49, 29);
		panel.add(lblHint);
		
		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_11.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Picnic.class.getResource("/images/solutions/Picnic.png")) );
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
		label_11.setIcon(new ImageIcon(Picnic.class.getResource("/others/light-bulb.png")));
		label_11.setBounds(491, 736, 71, 67);
		panel.add(label_11);
		
		label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(Picnic.class.getResource("/images/questions/picnic.png")));
		label_12.setBounds(889, 104, 515, 632);
		panel.add(label_12);
		
		label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_13.setIcon(new ImageIcon(Picnic.class.getResource("/others/if_Previous_2_372909.png")));
		label_13.setBounds(12, 13, 71, 67);
		panel.add(label_13);
	}
}
