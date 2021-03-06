package om.medium;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
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
import java.awt.Color;

public class Beach {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtA;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtU;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField txtW;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField txtN;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField txtL;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField txtF;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField txtS;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField txtG;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField txtU_1;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField txtE;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField txtB;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField txtO;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
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
    		  JOptionPane.showMessageDialog(null,"....Times UP!..."+"Your Score is 0");
    		  frame.dispose();
    		}
    	  }
      }
    };
    private JProgressBar progressBar;
    private JLabel lblTimesRunning;
    private JLabel lblHint;
    private JLabel label_15;
    private JLabel label_16;
    private JLabel label_17;
    private JLabel label_18;
    
    
    
    
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Beach window = new Beach();
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
	public Beach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 1394, 1048);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setBounds(162, 125, 42, 43);
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setBounds(203, 125, 42, 43);
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setBounds(245, 125, 42, 43);
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setBounds(286, 125, 42, 43);
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setBounds(327, 125, 42, 43);
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setBounds(368, 125, 42, 43);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		frame.getContentPane().add(txtA);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setBounds(409, 125, 42, 43);
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setBounds(451, 125, 42, 43);
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setBounds(493, 125, 42, 43);
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setBounds(535, 125, 42, 43);
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9);
		
		txtU = new JTextField();
		txtU.setEditable(false);
		txtU.setBounds(245, 82, 42, 43);
		txtU.setText(" U");
		txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU.setColumns(10);
		frame.getContentPane().add(txtU);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setBounds(245, 166, 42, 43);
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setBounds(245, 210, 42, 43);
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setBounds(245, 254, 42, 43);
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13);
		
		txtW = new JTextField();
		txtW.setEditable(false);
		txtW.setBounds(245, 296, 42, 43);
		txtW.setText(" W");
		txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtW.setColumns(10);
		frame.getContentPane().add(txtW);
		
		textField_15 = new JTextField();
		textField_15.setDocument(new JTextFieldCharLimits(1));
		textField_15.setBounds(245, 339, 42, 43);
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setBounds(245, 383, 42, 43);
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setBounds(245, 427, 42, 43);
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setBounds(245, 471, 42, 43);
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setBounds(162, 166, 42, 43);
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		frame.getContentPane().add(textField_19);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setBounds(162, 210, 42, 43);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		frame.getContentPane().add(txtN);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setBounds(162, 254, 42, 43);
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setBounds(162, 296, 42, 43);
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setBounds(162, 339, 42, 43);
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setBounds(203, 471, 42, 43);
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setDocument(new JTextFieldCharLimits(1));
		textField_25.setBounds(162, 471, 42, 43);
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		frame.getContentPane().add(textField_25);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setBounds(162, 512, 42, 43);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		frame.getContentPane().add(txtL);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setBounds(162, 552, 42, 43);
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setBounds(162, 594, 42, 43);
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setBounds(162, 637, 42, 43);
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setBounds(493, 82, 42, 43);
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setBounds(493, 166, 42, 43);
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setBounds(493, 210, 42, 43);
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		frame.getContentPane().add(textField_32);
		
		txtF = new JTextField();
		txtF.setEditable(false);
		txtF.setBounds(493, 254, 42, 43);
		txtF.setText(" F");
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setColumns(10);
		frame.getContentPane().add(txtF);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setBounds(493, 296, 42, 43);
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setBounds(493, 339, 42, 43);
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setBounds(493, 383, 42, 43);
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setBounds(451, 254, 42, 43);
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setBounds(409, 254, 42, 43);
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setColumns(10);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setBounds(368, 254, 42, 43);
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setBounds(368, 296, 42, 43);
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		frame.getContentPane().add(textField_40);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setBounds(535, 254, 42, 43);
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setDocument(new JTextFieldCharLimits(1));
		textField_44.setBounds(576, 254, 42, 43);
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setBounds(618, 254, 42, 43);
		textField_45.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_45.setColumns(10);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setDocument(new JTextFieldCharLimits(1));
		textField_46.setBounds(576, 210, 42, 43);
		textField_46.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_46.setColumns(10);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setDocument(new JTextFieldCharLimits(1));
		textField_47.setBounds(576, 296, 42, 43);
		textField_47.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_47.setColumns(10);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setDocument(new JTextFieldCharLimits(1));
		textField_48.setBounds(368, 339, 42, 43);
		textField_48.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_48.setColumns(10);
		frame.getContentPane().add(textField_48);
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setBounds(368, 383, 42, 43);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		frame.getContentPane().add(txtS);
		
		textField_50 = new JTextField();
		textField_50.setDocument(new JTextFieldCharLimits(1));
		textField_50.setBounds(368, 427, 42, 43);
		textField_50.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_50.setColumns(10);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setDocument(new JTextFieldCharLimits(1));
		textField_51.setBounds(368, 471, 42, 43);
		textField_51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_51.setColumns(10);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setDocument(new JTextFieldCharLimits(1));
		textField_52.setBounds(327, 471, 42, 43);
		textField_52.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_52.setColumns(10);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setDocument(new JTextFieldCharLimits(1));
		textField_53.setBounds(409, 471, 42, 43);
		textField_53.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_53.setColumns(10);
		frame.getContentPane().add(textField_53);
		
		txtG = new JTextField();
		txtG.setEditable(false);
		txtG.setBounds(451, 471, 42, 43);
		txtG.setText(" G");
		txtG.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtG.setColumns(10);
		frame.getContentPane().add(txtG);
		
		textField_55 = new JTextField();
		textField_55.setDocument(new JTextFieldCharLimits(1));
		textField_55.setBounds(493, 471, 42, 43);
		textField_55.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_55.setColumns(10);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setDocument(new JTextFieldCharLimits(1));
		textField_56.setBounds(535, 471, 42, 43);
		textField_56.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_56.setColumns(10);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setDocument(new JTextFieldCharLimits(1));
		textField_57.setBounds(576, 471, 42, 43);
		textField_57.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_57.setColumns(10);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setDocument(new JTextFieldCharLimits(1));
		textField_58.setBounds(368, 512, 42, 43);
		textField_58.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_58.setColumns(10);
		frame.getContentPane().add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setDocument(new JTextFieldCharLimits(1));
		textField_59.setBounds(368, 552, 42, 43);
		textField_59.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_59.setColumns(10);
		frame.getContentPane().add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setDocument(new JTextFieldCharLimits(1));
		textField_60.setBounds(409, 552, 42, 43);
		textField_60.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_60.setColumns(10);
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setDocument(new JTextFieldCharLimits(1));
		textField_61.setBounds(451, 552, 42, 43);
		textField_61.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_61.setColumns(10);
		frame.getContentPane().add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setDocument(new JTextFieldCharLimits(1));
		textField_62.setBounds(493, 552, 42, 43);
		textField_62.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_62.setColumns(10);
		frame.getContentPane().add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setDocument(new JTextFieldCharLimits(1));
		textField_63.setBounds(535, 552, 42, 43);
		textField_63.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_63.setColumns(10);
		frame.getContentPane().add(textField_63);
		
		txtU_1 = new JTextField();
		txtU_1.setEditable(false);
		txtU_1.setBounds(576, 552, 42, 43);
		txtU_1.setText(" U");
		txtU_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU_1.setColumns(10);
		frame.getContentPane().add(txtU_1);
		
		textField_65 = new JTextField();
		textField_65.setDocument(new JTextFieldCharLimits(1));
		textField_65.setBounds(618, 552, 42, 43);
		textField_65.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_65.setColumns(10);
		frame.getContentPane().add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setDocument(new JTextFieldCharLimits(1));
		textField_66.setBounds(659, 552, 42, 43);
		textField_66.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_66.setColumns(10);
		frame.getContentPane().add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setDocument(new JTextFieldCharLimits(1));
		textField_67.setBounds(701, 552, 42, 43);
		textField_67.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_67.setColumns(10);
		frame.getContentPane().add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setDocument(new JTextFieldCharLimits(1));
		textField_68.setBounds(409, 594, 42, 43);
		textField_68.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_68.setColumns(10);
		frame.getContentPane().add(textField_68);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setBounds(409, 637, 42, 43);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		frame.getContentPane().add(txtE);
		
		textField_70 = new JTextField();
		textField_70.setDocument(new JTextFieldCharLimits(1));
		textField_70.setBounds(368, 637, 42, 43);
		textField_70.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_70.setColumns(10);
		frame.getContentPane().add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setDocument(new JTextFieldCharLimits(1));
		textField_71.setBounds(327, 637, 42, 43);
		textField_71.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_71.setColumns(10);
		frame.getContentPane().add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setDocument(new JTextFieldCharLimits(1));
		textField_72.setBounds(451, 637, 42, 43);
		textField_72.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_72.setColumns(10);
		frame.getContentPane().add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setDocument(new JTextFieldCharLimits(1));
		textField_73.setBounds(493, 637, 42, 43);
		textField_73.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_73.setColumns(10);
		frame.getContentPane().add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setDocument(new JTextFieldCharLimits(1));
		textField_74.setBounds(701, 512, 42, 43);
		textField_74.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_74.setColumns(10);
		frame.getContentPane().add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setDocument(new JTextFieldCharLimits(1));
		textField_75.setBounds(701, 471, 42, 43);
		textField_75.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_75.setColumns(10);
		frame.getContentPane().add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setDocument(new JTextFieldCharLimits(1));
		textField_76.setBounds(701, 427, 42, 43);
		textField_76.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_76.setColumns(10);
		frame.getContentPane().add(textField_76);
		
		txtB = new JTextField();
		txtB.setEditable(false);
		txtB.setBounds(701, 383, 42, 43);
		txtB.setText(" B");
		txtB.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtB.setColumns(10);
		frame.getContentPane().add(txtB);
		
		textField_78 = new JTextField();
		textField_78.setDocument(new JTextFieldCharLimits(1));
		textField_78.setBounds(701, 339, 42, 43);
		textField_78.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_78.setColumns(10);
		frame.getContentPane().add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setDocument(new JTextFieldCharLimits(1));
		textField_79.setBounds(701, 296, 42, 43);
		textField_79.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_79.setColumns(10);
		frame.getContentPane().add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setDocument(new JTextFieldCharLimits(1));
		textField_80.setBounds(701, 254, 42, 43);
		textField_80.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_80.setColumns(10);
		frame.getContentPane().add(textField_80);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setBounds(701, 210, 42, 43);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		frame.getContentPane().add(txtO);
		
		textField_82 = new JTextField();
		textField_82.setDocument(new JTextFieldCharLimits(1));
		textField_82.setBounds(701, 166, 42, 43);
		textField_82.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_82.setColumns(10);
		frame.getContentPane().add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setDocument(new JTextFieldCharLimits(1));
		textField_83.setBounds(701, 125, 42, 43);
		textField_83.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_83.setColumns(10);
		frame.getContentPane().add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setDocument(new JTextFieldCharLimits(1));
		textField_84.setBounds(659, 383, 42, 43);
		textField_84.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_84.setColumns(10);
		frame.getContentPane().add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setDocument(new JTextFieldCharLimits(1));
		textField_85.setBounds(618, 383, 42, 43);
		textField_85.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_85.setColumns(10);
		frame.getContentPane().add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setDocument(new JTextFieldCharLimits(1));
		textField_86.setBounds(576, 383, 42, 43);
		textField_86.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_86.setColumns(10);
		frame.getContentPane().add(textField_86);
		
		JButton button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String f1="U"+textField_2.getText()+textField_11.getText()+textField_12.getText()+textField_13.getText()+"W"+textField_15.getText()+textField_16.getText()+textField_17.getText()+textField_18.getText();
				String f2=textField_30.getText()+textField_8.getText()+textField_31.getText()+textField_32.getText()+"F"+textField_34.getText()+textField_35.getText()+textField_36.getText();
				String f3=textField.getText()+textField_1.getText()+textField_2.getText()+textField_3.getText()+textField_4.getText()+"A"+textField_6.getText()+textField_7.getText()+textField_8.getText()+textField_9.getText();
				String f4=textField.getText()+textField_19.getText()+"N"+textField_21.getText()+textField_22.getText()+textField_23.getText();
				String f5=textField_83.getText()+textField_82.getText()+"O"+textField_80.getText()+textField_79.getText()+textField_78.getText()+"B"+textField_76.getText()+textField_75.getText()+textField_74.getText()+textField_67.getText();
				String f6=textField_46.getText()+textField_44.getText()+textField_47.getText();
				String f7=textField_39.getText()+textField_40.getText()+textField_48.getText()+"S"+textField_50.getText()+textField_51.getText()+textField_58.getText()+textField_59.getText();
				String f8=textField_39.getText()+textField_38.getText()+textField_37.getText()+"F"+textField_43.getText()+textField_44.getText()+textField_45.getText();
				String f9=textField_86.getText()+textField_85.getText()+textField_84.getText()+"B";
				String f10=textField_25.getText()+"L"+textField_27.getText()+textField_28.getText()+textField_29.getText();
				String f11=textField_25.getText()+textField_24.getText()+textField_18.getText();
         		String f12=textField_52.getText()+textField_51.getText()+textField_53.getText()+"G"+textField_55.getText()+textField_56.getText()+textField_57.getText();
				String f13=textField_59.getText()+textField_60.getText()+textField_61.getText()+textField_62.getText()+textField_63.getText()+"U"+textField_65.getText()+textField_66.getText()+textField_67.getText();
				String f14=textField_60.getText()+textField_68.getText()+"E";
				String f15=textField_71.getText()+textField_70.getText()+"E"+textField_72.getText()+textField_73.getText();
				if (f1.equals("UNDERWATER")&&f2.equals("FLIPFLOP")&&f3.equals("SANDCASTLE")&&f4.equals("SUNTAN")&&f5.equals("BOOGIEBOARD")&&f6.equals("ROW")&&f7.equals("SEASHELL")&&f8.equals("SEAFOOD")&&f9.equals("CRAB")&&f10.equals("OLIVE")&&f11.equals("OAR")&&f12.equals("SEAGULL")&&f13.equals("LIFEGUARD")&&f14.equals("ICE")&&f15.equals("CREAM"))
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
					if(!f1.equals("UNDERWATER")){
	                       textField_2.setText(null) ;textField_11.setText(null) ;textField_12.setText(null);textField_13.setText(null);textField_15.setText(null);textField_16.setText(null);textField_17.setText(null);textField_18.setText(null);
						}
						if(!f2.equals("FLIPFLOP"))
						{
							textField_30.setText(null); textField_8.setText(null); textField_31.setText(null); textField_32.setText(null);textField_34.setText(null); textField_35.setText(null);textField_36.setText(null);             
						}
						if(!f3.equals("SANCASTLE")){
							textField.setText(null);textField_1.setText(null);textField_2.setText(null);textField_3.setText(null);textField_4.setText(null);textField_6.setText(null);textField_7.setText(null);textField_8.setText(null);textField_9.setText(null);
						}
						if(!f4.equals("SUNTAN")){
							textField.setText(null);textField_19.setText(null);textField_21.setText(null);textField_22.setText(null);textField_23.setText(null);
						}
						if(!f5.equals("BOOGIEBOARD")){
							textField_83.setText(null);textField_82.setText(null);textField_80.setText(null);textField_79.setText(null);textField_78.setText(null);textField_76.setText(null);textField_75.setText(null);textField_74.setText(null);textField_67.setText(null);
						}
						if(!f6.equals("ROW")){
							textField_46.setText(null);textField_44.setText(null);textField_47.setText(null);
						}
						if(!f7.equals("SEASHELL")){
							textField_39.setText(null);textField_40.setText(null);textField_48.setText(null);textField_50.setText(null);textField_51.setText(null);textField_58.setText(null);textField_59.setText(null);
						}
						if(!f8.equals("SEAFOOD")){
							textField_39.setText(null);textField_38.setText(null);textField_37.setText(null);textField_43.setText(null);textField_44.setText(null);textField_45.setText(null);
						}
						if(!f9.equals("CRAB")){
							textField_86.setText(null);textField_85.setText(null);textField_84.setText(null);
						}
						if(!f10.equals("OLIVE")){
							textField_25.setText(null);textField_27.setText(null);textField_28.setText(null);textField_29.setText(null);
						}
						if(!f11.equals("OAR")){
							textField_25.setText(null);textField_24.setText(null);textField_18.setText(null);
						}
						if(!f12.equals("SEAGULL")){
							textField_52.setText(null);textField_51.setText(null);textField_53.setText(null);textField_55.setText(null);textField_56.setText(null);textField_57.setText(null);
						}
						if(!f13.equals("LIFEGUARD")){
							textField_59.setText(null);textField_60.setText(null);textField_61.setText(null);textField_62.setText(null);textField_63.setText(null);textField_65.setText(null);textField_66.setText(null);textField_67.setText(null);
						}
						if(!f14.equals("ICE")){
							textField_60.setText(null);textField_68.setText(null);
						}
						if(!f15.equals("CREAM")){
							textField_71.setText(null);textField_70.setText(null);textField_72.setText(null);textField_73.setText(null);
						}
						
				}
			}
		});
		button.setBounds(132, 825, 179, 42);
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("1");
		label.setBounds(225, 82, 18, 22);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("3");
		label_1.setBounds(132, 139, 18, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("8");
		label_3.setBounds(350, 254, 18, 22);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("11");
		label_4.setBounds(132, 471, 18, 22);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("12");
		label_5.setBounds(310, 471, 18, 22);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("13");
		label_6.setBounds(339, 555, 18, 22);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("14");
		label_7.setBounds(409, 533, 18, 22);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("15");
		label_8.setBounds(299, 637, 18, 22);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("2");
		label_9.setBounds(493, 61, 18, 22);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("6");
		label_10.setBounds(579, 180, 18, 22);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("9");
		label_11.setBounds(559, 383, 18, 22);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("5");
		label_12.setBounds(701, 96, 18, 22);
		frame.getContentPane().add(label_12);
		
		JLabel label_2 = new JLabel("4");
		label_2.setBounds(173, 90, 18, 22);
		frame.getContentPane().add(label_2);
		
		JLabel label_13 = new JLabel("7");
		label_13.setBounds(373, 227, 18, 22);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("10");
		label_14.setBounds(162, 444, 18, 22);
		frame.getContentPane().add(label_14);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 205));
		progressBar.setStringPainted(true);
		progressBar.setBounds(74, 771, 669, 14);
		frame.getContentPane().add(progressBar);
		
		lblTimesRunning = new JLabel("Time's  Running......");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(74, 731, 193, 27);
		frame.getContentPane().add(lblTimesRunning);
		
		lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(395, 830, 42, 16);
		frame.getContentPane().add(lblHint);
		
		label_15 = new JLabel("");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_15.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Beach.class.getResource("/images/solutions/Beach.png")) );
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
		label_15.setIcon(new ImageIcon(Beach.class.getResource("/others/light-bulb.png")));
		label_15.setBounds(437, 803, 71, 64);
		frame.getContentPane().add(label_15);
		
		label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(Beach.class.getResource("/images/questions/beach.png")));
		label_16.setBounds(801, 96, 522, 735);
		frame.getContentPane().add(label_16);
		
		label_17 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_17.setBounds(59, 893, 1060, 16);
		frame.getContentPane().add(label_17);
		
		label_18 = new JLabel("");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_18.setIcon(new ImageIcon(Beach.class.getResource("/others/if_Previous_2_372909.png")));
		label_18.setBounds(12, 13, 71, 70);
		frame.getContentPane().add(label_18);
	}
}

