package com.myproject.UI;


	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import java.awt.BorderLayout;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.Font;
	import javax.swing.JTextArea;
	import java.awt.TextField;
	import java.awt.Color;
	import javax.swing.SwingConstants;
	import javax.swing.JLabel;
	import java.awt.Label;
	import javax.swing.UIManager;
	import javax.swing.JFormattedTextField;
	import java.awt.Toolkit;
	import javax.swing.JEditorPane;
	import javax.swing.border.SoftBevelBorder;

import crossbean.CrossBean;

import javax.swing.border.BevelBorder;
	import javax.swing.border.CompoundBorder;
	import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

	@SuppressWarnings("serial")
	public class UIlogin extends JFrame {

		private JFrame frame;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						UIlogin window = new UIlogin();
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
		

		
		/**
		 * Initialize the contents of the frame.
		 */
		public UIlogin(){
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(0, 102, 204));
			frame.getContentPane().setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
			frame.getContentPane().setLayout(null);
			
			JLabel lblStartGame = new JLabel("Start Game");
			lblStartGame.setForeground(new Color(0, 0, 0));
			lblStartGame.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
			lblStartGame.setBounds(224, 392, 152, 43);
			frame.getContentPane().add(lblStartGame);
			
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
				
					Leaderboard.main(null);
					frame.dispose();
				}
			});
			label.setIcon(new ImageIcon(UIlogin.class.getResource("/others/trophy(1).png")));
			label.setBounds(537, 240, 151, 157);
			frame.getContentPane().add(label);
			
			JLabel lblLeaderboard = new JLabel("LeaderBoard");
			lblLeaderboard.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
			lblLeaderboard.setBounds(547, 385, 173, 57);
			frame.getContentPane().add(lblLeaderboard);
			
			JLabel label_1 = new JLabel("");
			label_1.setForeground(new Color(255, 255, 255));
			label_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					Login1 lg=new Login1();
					lg.main(null);
				}
			});
			label_1.setIcon(new ImageIcon(UIlogin.class.getResource("/others/reply.png")));
			label_1.setBounds(12, 13, 79, 64);
			frame.getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					CrossBean bc=new CrossBean();
					
					System.out.println(bc.getUname());
					frame.dispose();
					Level lev=new Level();
					lev.main(null);
				}
			});
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setIcon(new ImageIcon(UIlogin.class.getResource("/others/decree(2).png")));
			label_2.setBounds(232, 289, 162, 108);
			frame.getContentPane().add(label_2);
			
			JLabel label_3 = new JLabel("- - - - - - - - - -- - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - -  - - - - - - - - - - - - -");
			label_3.setForeground(new Color(255, 255, 255));
			label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
			label_3.setBounds(12, 189, 1060, 16);
			frame.getContentPane().add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(UIlogin.class.getResource("/others/boy(1).png")));
			label_4.setBounds(325, 104, 64, 77);
			frame.getContentPane().add(label_4);
			
			JLabel label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon(UIlogin.class.getResource("/others/girl.png")));
			label_5.setBounds(423, 104, 64, 72);
			frame.getContentPane().add(label_5);
			
			JLabel label_6 = new JLabel("");
			label_6.setIcon(new ImageIcon(UIlogin.class.getResource("/others/man.png")));
			label_6.setBounds(519, 104, 64, 72);
			frame.getContentPane().add(label_6);
			 frame.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
			frame.setBounds(100, 100, 936, 606);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

