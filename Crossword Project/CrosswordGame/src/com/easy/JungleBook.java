package com.easy;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
public class JungleBook {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtW;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtD;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtE_1;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField txtN;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField txtE;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField txtH_1;
	private JTextField textField_40;
	private JTextField textField_39;
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
    private JProgressBar progressBar_1;
    private JLabel lblTimesRunning;
    private JLabel label_9;
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
					JungleBook window = new JungleBook();
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
	public JungleBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 127));
		frame.setBounds(100, 100, 1370, 864);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		textField = new JTextField();
		textField.setDocument(new JTextFieldCharLimits(1));
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(429, 193, 42, 43);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(471, 193, 42, 43);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(512, 193, 42, 43);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(388, 235, 42, 43);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setDocument(new JTextFieldCharLimits(1));
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(429, 235, 42, 43);
		frame.getContentPane().add(textField_4);
		
		txtW = new JTextField();
		txtW.setEditable(false);
		txtW.setText(" W");
		txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtW.setColumns(10);
		txtW.setBounds(429, 278, 42, 43);
		frame.getContentPane().add(txtW);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(471, 278, 42, 43);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setDocument(new JTextFieldCharLimits(1));
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(512, 278, 42, 43);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(554, 278, 42, 43);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(554, 321, 42, 43);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setDocument(new JTextFieldCharLimits(1));
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(595, 321, 42, 43);
		frame.getContentPane().add(textField_10);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBounds(637, 321, 42, 43);
		frame.getContentPane().add(txtD);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(679, 321, 42, 43);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setDocument(new JTextFieldCharLimits(1));
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(721, 321, 42, 43);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setDocument(new JTextFieldCharLimits(1));
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(554, 362, 42, 43);
		frame.getContentPane().add(textField_14);
		
		txtE_1 = new JTextField();
		txtE_1.setEditable(false);
		txtE_1.setText(" E");
		txtE_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_1.setColumns(10);
		txtE_1.setBounds(554, 405, 42, 43);
		frame.getContentPane().add(txtE_1);
		
		textField_16 = new JTextField();
		textField_16.setDocument(new JTextFieldCharLimits(1));
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(637, 405, 42, 43);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setDocument(new JTextFieldCharLimits(1));
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(512, 405, 42, 43);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setDocument(new JTextFieldCharLimits(1));
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(595, 405, 42, 43);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setDocument(new JTextFieldCharLimits(1));
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(348, 278, 42, 43);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(429, 321, 42, 43);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(429, 362, 42, 43);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(429, 405, 42, 43);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(471, 362, 42, 43);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(388, 362, 42, 43);
		frame.getContentPane().add(textField_24);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBounds(348, 362, 42, 43);
		frame.getContentPane().add(txtN);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(305, 362, 42, 43);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(263, 362, 42, 43);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(348, 321, 42, 43);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setDocument(new JTextFieldCharLimits(1));
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(348, 405, 42, 43);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(348, 448, 42, 43);
		frame.getContentPane().add(textField_30);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBounds(348, 490, 42, 43);
		frame.getContentPane().add(txtE);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(348, 533, 42, 43);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setDocument(new JTextFieldCharLimits(1));
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(388, 490, 42, 43);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(305, 490, 42, 43);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(263, 490, 42, 43);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(429, 490, 42, 43);
		frame.getContentPane().add(textField_36);
		
		txtH_1 = new JTextField();
		txtH_1.setEditable(false);
		txtH_1.setText(" H");
		txtH_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtH_1.setColumns(10);
		txtH_1.setBounds(471, 490, 42, 43);
		frame.getContentPane().add(txtH_1);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(512, 490, 42, 43);
		frame.getContentPane().add(textField_40);
		
		textField_39 = new JTextField();
		textField_39.setDocument(new JTextFieldCharLimits(1));
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(554, 490, 42, 43);
		frame.getContentPane().add(textField_39);
		
		JLabel label = new JLabel("1");
		label.setBounds(409, 194, 15, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(370, 236, 15, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(332, 278, 15, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(415, 278, 15, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(554, 262, 15, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(539, 321, 15, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setBounds(246, 362, 15, 16);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setBounds(493, 419, 15, 16);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("9");
		label_8.setBounds(236, 490, 15, 16);
		frame.getContentPane().add(label_8);
		
		
		JButton button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   String f1=textField.getText()+textField_1.getText()+textField_2.getText();
				   
				   String f2=textField.getText()+textField_4.getText()+"W"+textField_20.getText()+textField_21.getText()+textField_22.getText();
				   
				   String f3="W"+textField_6.getText()+textField_7.getText()+textField_8.getText();
				   
				   String f4=textField_19.getText()+textField_28.getText()+"N"+textField_29.getText()+textField_30.getText()+"E"+textField_32.getText();
				   
				   String f5=textField_27.getText()+textField_26.getText()+"N"+textField_24.getText()+textField_21.getText()+textField_23.getText();
				   
				   String f6=textField_35.getText()+textField_34.getText()+"E"+textField_33.getText()+textField_36.getText()+"H"+textField_40.getText()+textField_39.getText();
				   
				   String f7=textField_17.getText()+"E"+textField_18.getText()+textField_16.getText();
				   
				   String f8=textField_9.getText()+textField_10.getText()+"D"+textField_12.getText()+textField_13.getText();
				   
				   String f9=textField_8.getText()+textField_9.getText()+textField_14.getText()+"E";
				   
				   String f10=textField_3.getText()+textField_4.getText();
				   
					
				   if(f1.equals("MAN") && f2.equals("MOWGLI") && f3.equals("WOLF") && f4.equals("PANTHER") && f5.equals("JUNGLE") && f6.equals("SHERKHAN") && f7.equals("BEAR") && f8.equals("INDIA") && f9.equals("FIRE") && f10.equals("NO"))				  
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
						if(!f1.equals("MAN")){
							textField.setText(null) ;textField_1.setText(null) ;textField_2.setText(null);
						}
						if(!f2.equals("MOWGLI"))
						{
							textField.setText(null); textField_4.setText(null); textField_20.setText(null); textField_21.setText(null);textField_22.setText(null);             
						}
						if(!f3.equals("WOLF")){
							textField_6.setText(null);textField_7.setText(null);textField_8.setText(null);
						}
						if(!f4.equals("PANTHER")){
							textField_19.setText(null);textField_28.setText(null);textField_29.setText(null);textField_30.setText(null);textField_32.setText(null);
						}
						if(!f5.equals("JUNGLE")){
							textField_27.setText(null);textField_26.setText(null);textField_24.setText(null);textField_21.setText(null);textField_23.setText(null);
						}
						if(!f6.equals("SHERKHAN")){
							textField_35.setText(null);textField_34.setText(null);textField_33.setText(null);textField_36.setText(null);textField_40.setText(null);textField_39.setText(null);
							
						}
						if(!f7.equals("BEAR")){
							textField_17.setText(null);textField_18.setText(null);textField_16.setText(null);
							
						}
						if(!f8.equals("INDIA")){
							textField_9.setText(null);textField_10.setText(null);textField_12.setText(null);textField_13.setText(null);
							
						}
						if(!f9.equals("FIRE")){
							textField_8.setText(null);textField_9.setText(null);textField_14.setText(null);
							
						}
						if(!f10.equals("NO")){
							textField_3.setText(null);textField_4.setText(null);
							
						}
						wrong++;
					}
			}
		
	});
	
			
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(168, 635, 179, 42);
		frame.getContentPane().add(button);
		
		progressBar= new JProgressBar();
		progressBar.setForeground(new Color(50, 205, 50));
		progressBar.setStringPainted(true);
		progressBar.setBounds(53, 153, 668, 14);
		frame.getContentPane().add(progressBar);
		
		lblTimesRunning = new JLabel("Time's Running.....");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(53, 108, 179, 32);
		frame.getContentPane().add(lblTimesRunning);
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(JungleBook.class.getResource("/images/questions/jungle book.png")));
		label_9.setBounds(814, 29, 525, 648);
		frame.getContentPane().add(label_9);
		
		lblHint = new JLabel("HINT");
		lblHint.setHorizontalAlignment(SwingConstants.CENTER);
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(429, 647, 56, 16);
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
				JLabel label = new JLabel( new ImageIcon(School.class.getResource("/images/solutions/Junglebook.png")) );
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
		label_10.setIcon(new ImageIcon(JungleBook.class.getResource("/others/light-bulb.png")));
		label_10.setBounds(481, 617, 73, 73);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_11.setBounds(86, 719, 1062, 16);
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
		label_12.setIcon(new ImageIcon(JungleBook.class.getResource("/others/if_Previous_2_372909.png")));
		label_12.setBounds(12, 13, 73, 82);
		frame.getContentPane().add(label_12);
	}

}
