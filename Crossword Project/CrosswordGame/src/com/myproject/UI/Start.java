package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class Start {

	private JFrame frame;
	public  JProgressBar  progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Start window = new Start();
		window.frame.setVisible(true);
		Login1 login=new Login1();
				try {
					
						for(int i=0;i<=100;i++)
						{
							Thread.sleep(30);
							window.progressBar.setValue(i);
							window.progressBar.setString("");
							if(i==100) {
								window.frame.setVisible(false);
								login.main(null);
							}
						}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the application.
	 */
	public Start() { 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setBackground(new Color(0, 102, 204));
		frame.getContentPane().setLayout(null);
		
		 progressBar = new JProgressBar();
		 progressBar.setBackground(new Color(0, 102, 204));
		 progressBar.setFont(new Font("Tahoma", Font.BOLD, 13));
		progressBar.setForeground(new Color(255, 255, 0));
		progressBar.setStringPainted(true);
		progressBar.setBounds(37, 447, 790, 14);
		frame.getContentPane().add(progressBar);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Start.class.getResource("/others/crossword.png")));
		label.setBounds(227, 99, 354, 270);
		frame.getContentPane().add(label);
		
		JLabel lblChargeYourBrains = new JLabel("Charge your Brains!!!!!");
		lblChargeYourBrains.setHorizontalAlignment(SwingConstants.CENTER);
		lblChargeYourBrains.setForeground(new Color(255, 255, 255));
		lblChargeYourBrains.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 22));
		lblChargeYourBrains.setBounds(190, 358, 419, 83);
		frame.getContentPane().add(lblChargeYourBrains);
		
		JLabel lblcrossword = new JLabel(".CROSSWORD.");
		lblcrossword.setForeground(new Color(255, 255, 255));
		lblcrossword.setFont(new Font("MV Boli", Font.BOLD, 35));
		lblcrossword.setHorizontalAlignment(SwingConstants.CENTER);
		lblcrossword.setBounds(217, 13, 320, 73);
		frame.getContentPane().add(lblcrossword);
		frame.setBounds(100, 100, 857, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
