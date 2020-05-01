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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;

public class UIlogin {

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
	public UIlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.getContentPane().setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("START GAME");
		btnNewButton.setBounds(189, 310, 195, 34);
		btnNewButton.setFont(new Font("Perpetua Titling MT", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(173, 216, 230));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Desktop\\CWB_LOGO[1].jpg"));
		lblNewLabel.setBounds(0, 0, 570, 336);
		frame.getContentPane().add(lblNewLabel);
		frame.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		frame.setBounds(100, 100, 588, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
