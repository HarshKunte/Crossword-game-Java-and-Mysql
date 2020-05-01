package om.medium;


	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import java.awt.Color;
	import javax.swing.JTextField;
import javax.swing.Timer;

import com.easy.School;
import com.hard.JTextFieldCharLimits;
import com.myproject.UI.Level;
import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.Font;
	import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

	public class Sports {

		private JFrame frame;
		private JTextField t16;
		private JTextField t12;
		private JTextField t22;
		private JTextField t11;
		private JTextField t13;
		private JTextField t14;
		private JTextField t15;
		private JTextField t7;
		private JTextField t23;
		private JTextField txtR;
		private JTextField t33;
		private JTextField txtT;
		private JTextField t21;
		private JTextField t24;
		private JTextField t25;
		private JTextField t26;
		private JTextField t27;
		private JTextField t28;
		private JTextField t53;
		private JTextField t52;
		private JTextField t51;
		private JTextField t55;
		private JTextField t56;
		private JTextField t37;
		private JTextField t58;
		private JTextField t59;
		private JTextField t510;
		private JTextField t36;
		private JTextField t34;
		private JTextField t35;
		private JTextField t38;
		private JTextField t39;
		private JTextField t310;
		private JTextField t32;
		private JTextField t31;
		private JTextField t322;
		private JTextField t323;
		private JTextField t333;
		private JTextField t234;
		private JTextField t41;
		private JTextField t42;
		private JTextField t43;
		private JTextField t44;
		private JLabel lblNewLabel;
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
	    private JLabel lblNewLabel_1;
	    private JLabel lblHint;
	    private JLabel label_6;
	    private JLabel label_7;
	    private JLabel label_8;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Sports window = new Sports();
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
		public Sports() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(0, 139, 139));
			frame.getContentPane().setLayout(null);
			ProgressUpdate.start();
			
			t16 = new JTextField();
			
			t16.setEditable(false);
			t16.setBounds(63, 258, 42, 42);
			t16.setText(" S");
			t16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			frame.getContentPane().add(t16);
			t16.setColumns(10);
			
			t12 = new JTextField();
			t12.setDocument(new JTextFieldCharLimits(1));
			t12.setForeground(new Color(165, 42, 42));
			t12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t12.setBounds(63, 91, 42, 42);
			t12.setColumns(10);
			frame.getContentPane().add(t12);
			
			t22 = new JTextField();
			t22.setDocument(new JTextFieldCharLimits(1));
			t22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t22.setBounds(147, 216, 42, 42);
			t22.setColumns(10);
			frame.getContentPane().add(t22);
			
			t11 = new JTextField();
			t11.setEditable(false);
			t11.setForeground(new Color(0, 0, 0));
			t11.setText("T");
			t11.setBounds(63, 50, 42, 42);
			t11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t11.setColumns(10);
			frame.getContentPane().add(t11);
			
			t13 = new JTextField();
		t13.setDocument(new JTextFieldCharLimits(1));
			t13.setForeground(new Color(165, 42, 42));
			t13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t13.setBounds(63, 132, 42, 42);
			t13.setColumns(10);
			frame.getContentPane().add(t13);
			
			t14 = new JTextField();
			t14.setDocument(new JTextFieldCharLimits(1));
			t14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t14.setBounds(63, 174, 42, 42);
			t14.setColumns(10);
			frame.getContentPane().add(t14);
			
			t15 = new JTextField();
			t15.setDocument(new JTextFieldCharLimits(1));
			t15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t15.setBounds(63, 216, 42, 42);
			t15.setColumns(10);
			frame.getContentPane().add(t15);
			
			t7 = new JTextField();
			t7.setEditable(false);
			t7.setBounds(105, 258, 42, 42);
			t7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t7.setText(" P");
			t7.setColumns(10);
			frame.getContentPane().add(t7);
			
			t23 = new JTextField();
			t23.setEditable(false);
			t23.setBounds(147, 258, 42, 42);
			t23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t23.setText(" O");
			t23.setColumns(10);
			frame.getContentPane().add(t23);
			
			txtR = new JTextField();
			txtR.setEditable(false);
			txtR.setBounds(189, 258, 42, 42);
			txtR.setText(" R");
			txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtR.setColumns(10);
			frame.getContentPane().add(txtR);
			
			t33 = new JTextField();
			t33.setEditable(false);
			t33.setBounds(273, 258, 42, 42);
			t33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t33.setText(" S");
			t33.setColumns(10);
			frame.getContentPane().add(t33);
			
			txtT = new JTextField();
			txtT.setEditable(false);
			txtT.setBounds(231, 258, 42, 42);
			txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtT.setText(" T");
			txtT.setColumns(10);
			frame.getContentPane().add(txtT);
			
			t21 = new JTextField();
			t21.setEditable(false);
			t21.setBounds(147, 174, 42, 42);
			t21.setText(" F");
			t21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t21.setColumns(10);
			frame.getContentPane().add(t21);
			
			t24 = new JTextField();
			t24.setDocument(new JTextFieldCharLimits(1));
			t24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t24.setBounds(147, 298, 42, 42);
			t24.setColumns(10);
			frame.getContentPane().add(t24);
			
			t25 = new JTextField();
			t25.setDocument(new JTextFieldCharLimits(1));
			t25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t25.setBounds(147, 340, 42, 42);
			t25.setColumns(10);
			frame.getContentPane().add(t25);
			
			t26 = new JTextField();
			t26.setDocument(new JTextFieldCharLimits(1));
			t26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t26.setBounds(147, 381, 42, 42);
			t26.setColumns(10);
			frame.getContentPane().add(t26);
			
			t27 = new JTextField();
			t27.setEditable(false);
			t27.setBounds(147, 421, 42, 42);
			t27.setText(" L");
			t27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t27.setColumns(10);
			frame.getContentPane().add(t27);
			
			t28 = new JTextField();
			t28.setDocument(new JTextFieldCharLimits(1));
			t28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t28.setBounds(147, 463, 42, 42);
			t28.setColumns(10);
			frame.getContentPane().add(t28);
			
			t53 = new JTextField();
			t53.setDocument(new JTextFieldCharLimits(1));
			t53.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t53.setBounds(105, 421, 42, 42);
			t53.setColumns(10);
			frame.getContentPane().add(t53);
			
			t52 = new JTextField();
			t52.setDocument(new JTextFieldCharLimits(1));
			t52.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t52.setBounds(63, 421, 42, 42);
			t52.setColumns(10);
			frame.getContentPane().add(t52);
			
			t51 = new JTextField();
			t51.setDocument(new JTextFieldCharLimits(1));
			t51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t51.setBounds(22, 421, 42, 42);
			t51.setColumns(10);
			frame.getContentPane().add(t51);
			
			t55 = new JTextField();
			t55.setDocument(new JTextFieldCharLimits(1));
			t55.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t55.setBounds(189, 421, 42, 42);
			t55.setColumns(10);
			frame.getContentPane().add(t55);
			
			t56 = new JTextField();
			t56.setDocument(new JTextFieldCharLimits(1));
			t56.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t56.setBounds(231, 421, 42, 42);
			t56.setColumns(10);
			frame.getContentPane().add(t56);
			
			t37 = new JTextField();
			t37.setEditable(false);
			t37.setBounds(273, 421, 42, 42);
			t37.setText(" B");
			t37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t37.setForeground(new Color(0, 0, 0));
			t37.setColumns(10);
			frame.getContentPane().add(t37);
			
			t58 = new JTextField();
			t58.setDocument(new JTextFieldCharLimits(1));
			t58.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t58.setBounds(313, 421, 42, 42);
			t58.setColumns(10);
			frame.getContentPane().add(t58);
			
			t59 = new JTextField();
			t59.setDocument(new JTextFieldCharLimits(1));
			t59.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t59.setBounds(355, 422, 42, 42);
			t59.setColumns(10);
			frame.getContentPane().add(t59);
			
			t510 = new JTextField();
			t510.setDocument(new JTextFieldCharLimits(1));
			t510.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t510.setBounds(397, 421, 42, 42);
			t510.setColumns(10);
			frame.getContentPane().add(t510);
			
			t36 = new JTextField();
			t36.setDocument(new JTextFieldCharLimits(1));
			t36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t36.setBounds(273, 381, 42, 42);
			t36.setColumns(10);
			frame.getContentPane().add(t36);
			
			t34 = new JTextField();
			t34.setDocument(new JTextFieldCharLimits(1));
			t34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t34.setBounds(273, 298, 42, 42);
			t34.setColumns(10);
			frame.getContentPane().add(t34);
			
			t35 = new JTextField();
			t35.setDocument(new JTextFieldCharLimits(1));
			t35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t35.setBounds(273, 340, 42, 42);
			t35.setColumns(10);
			frame.getContentPane().add(t35);
			
			t38 = new JTextField();
			t38.setDocument(new JTextFieldCharLimits(1));
			t38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t38.setBounds(273, 463, 42, 42);
			t38.setColumns(10);
			frame.getContentPane().add(t38);
			
			t39 = new JTextField();
			t39.setDocument(new JTextFieldCharLimits(1));
			t39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t39.setBounds(273, 504, 42, 42);
			t39.setColumns(10);
			frame.getContentPane().add(t39);
			
			t310 = new JTextField();
			t310.setDocument(new JTextFieldCharLimits(1));
			t310.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t310.setBounds(273, 545, 42, 42);
			t310.setColumns(10);
			frame.getContentPane().add(t310);
			
			t32 = new JTextField();
			t32.setDocument(new JTextFieldCharLimits(1));
			t32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t32.setBounds(273, 216, 42, 42);
			t32.setColumns(10);
			frame.getContentPane().add(t32);
			
			t31 = new JTextField();
			t31.setDocument(new JTextFieldCharLimits(1));
			t31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t31.setBounds(273, 174, 42, 42);
			t31.setColumns(10);
			frame.getContentPane().add(t31);
			
			t322 = new JTextField();
			t322.setDocument(new JTextFieldCharLimits(1));
			t322.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t322.setBounds(313, 174, 42, 42);
			t322.setColumns(10);
			frame.getContentPane().add(t322);
			
			t323 = new JTextField();
			t323.setEditable(false);
			t323.setBounds(355, 174, 42, 42);
			t323.setText(" X");
			t323.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t323.setColumns(10);
			frame.getContentPane().add(t323);
			
			t333 = new JTextField();
			t333.setDocument(new JTextFieldCharLimits(1));
			t333.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t333.setBounds(397, 174, 42, 42);
			t333.setColumns(10);
			frame.getContentPane().add(t333);
			
			t234 = new JTextField();
			t234.setDocument(new JTextFieldCharLimits(1));
			t234.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t234.setBounds(439, 174, 42, 42);
			t234.setColumns(10);
			frame.getContentPane().add(t234);
			
			t41 = new JTextField();
			t41.setEditable(false);
			t41.setBounds(481, 174, 42, 42);
			t41.setText(" G");
			t41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t41.setColumns(10);
			frame.getContentPane().add(t41);
			
			t42 = new JTextField();
			t42.setDocument(new JTextFieldCharLimits(1));
			t42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t42.setBounds(481, 216, 42, 42);
			t42.setColumns(10);
			frame.getContentPane().add(t42);
			
			t43 = new JTextField();
			t43.setDocument(new JTextFieldCharLimits(1));
			t43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t43.setBounds(481, 258, 42, 42);
			t43.setColumns(10);
			frame.getContentPane().add(t43);
			
			t44 = new JTextField();
			t44.setDocument(new JTextFieldCharLimits(1));
			t44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			t44.setBounds(481, 298, 42, 42);
			t44.setColumns(10);
			frame.getContentPane().add(t44);
			
			JButton button = new JButton("FINISH");
			button.setForeground(new Color(255, 255, 255));
			button.setBackground(new Color(139, 0, 0));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s1="T"+t12.getText()+t13.getText()+t14.getText()+t15.getText()+"S";
					String s2="F"+t22.getText()+"O"+t24.getText()+t25.getText()+t26.getText()+"L"+t28.getText();
					String s3=t31.getText()+t32.getText()+"S"+t34.getText()+t35.getText()+t36.getText()+"B"+t38.getText()+t39.getText()+t310.getText();
					String s4="G"+t42.getText()+t43.getText()+t44.getText();
					String s5=t51.getText()+t52.getText()+t53.getText()+"L"+t55.getText()+t56.getText()+"B"+t58.getText()+t59.getText()+t510.getText();
					String s6=t31.getText()+t322.getText()+"X"+t333.getText()+t234.getText()+"G";
					if((s1.equals("TENNIS"))&&(s2.equals("FOOTBALL"))&&(s3.equals("BASKETBALL"))&&(s4.equals("GOLF"))&&(s5.equals("VOLLEYBALL"))&&(s6.equals("BOXING"))) {
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
					else{
						JOptionPane.showMessageDialog(null,"Wrong answer(s)!");
						if(!s1.equals("TENNIS")){
							t12.setText(null);t13.setText(null);t14.setText(null);t15.setText(null);
						}
						if(!s2.equals("FOOTBALL"))
						{
							t22.setText(null);t24.setText(null);t25.setText(null);t26.setText(null);t28.setText(null);
						}
						if(!s3.equals("BASKETBALL")){
							t31.setText(null);t32.setText(null);t34.setText(null);t35.setText(null);t36.setText(null);t38.setText(null);t39.setText(null);t310.setText(null);
						}
						if(!s4.equals("GOLF")){
							t42.setText(null);t43.setText(null);t44.setText(null);
						}
						if(!s5.equals("VOLLEYBALL")){
							t51.setText(null);t52.setText(null);t53.setText(null);t55.setText(null);t56.setText(null);t58.setText(null);t59.setText(null);t510.setText(null);
						}
						if(!s6.equals("BOXING")){
							t31.setText(null);t322.setText(null);t333.setText(null);t234.setText(null);
							
						}
						wrong++;
		
					}
				}
			});
			button.setFont(new Font("Tahoma", Font.BOLD, 24));
			button.setBounds(105, 713, 179, 42);
			frame.getContentPane().add(button);
			
			JLabel label = new JLabel("1");
			label.setBounds(49, 76, 15, 16);
			frame.getContentPane().add(label);
			
			JLabel label_1 = new JLabel("2");
			label_1.setBounds(154, 146, 15, 16);
			frame.getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("3");
			label_2.setBounds(260, 188, 15, 16);
			frame.getContentPane().add(label_2);
			
			JLabel label_3 = new JLabel("4");
			label_3.setBounds(488, 146, 15, 16);
			frame.getContentPane().add(label_3);
			
			JLabel label_4 = new JLabel("5");
			label_4.setBounds(24, 395, 14, 16);
			frame.getContentPane().add(label_4);
			
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Sports.class.getResource("/images/questions/sports.png")));
			lblNewLabel.setBounds(574, 96, 595, 429);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel label_5 = new JLabel("6");
			label_5.setBounds(273, 158, 15, 16);
			frame.getContentPane().add(label_5);
			
			progressBar = new JProgressBar();
			progressBar.setForeground(new Color(0, 0, 205));
			progressBar.setStringPainted(true);
			progressBar.setBounds(22, 671, 517, 14);
			frame.getContentPane().add(progressBar);
			
			lblNewLabel_1 = new JLabel("Time's Running.....");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel_1.setBounds(23, 626, 166, 32);
			frame.getContentPane().add(lblNewLabel_1);
			
			lblHint = new JLabel("HINT");
			lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
			lblHint.setBounds(365, 720, 42, 35);
			frame.getContentPane().add(lblHint);
			
			label_6 = new JLabel("");
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(j>=3)
					{
					    lblHint.setVisible(false);
						label_6.setVisible(false);
					}
					else
					{
						j++;
			        int TIME_VISIBLE=2000;
					JLabel label = new JLabel( new ImageIcon(Sports.class.getResource("/images/solutions/Sports.png")) );
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
			label_6.setIcon(new ImageIcon(Sports.class.getResource("/others/light-bulb.png")));
			label_6.setBounds(407, 698, 74, 69);
			frame.getContentPane().add(label_6);
			
			label_7 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
			label_7.setBounds(525, 713, 644, 16);
			frame.getContentPane().add(label_7);
			
			label_8 = new JLabel("");
			label_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					Level lv=new Level();
					lv.main(null);
				}
			});
			label_8.setIcon(new ImageIcon(Sports.class.getResource("/others/if_Previous_2_372909.png")));
			label_8.setBounds(0, 0, 64, 69);
			frame.getContentPane().add(label_8);
			frame.setBounds(100, 100, 1279, 911);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


