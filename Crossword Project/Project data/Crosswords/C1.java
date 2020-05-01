

package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class C1 {

	private JFrame frame;
	private JTextField txtS;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtT_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtP;
	private JTextField txtO;
	private JTextField txtR;
	private JTextField txtS_1;
	private JTextField txtT;
	private JTextField txtF;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField txtL;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField txtB;
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
	private JTextField txtX;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField txtG;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JLabel lblNewLabel;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C1 window = new C1();
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
	public C1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setBounds(63, 258, 42, 42);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		frame.getContentPane().add(txtS);
		txtS.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setBounds(63, 91, 42, 42);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setBounds(147, 216, 42, 42);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		txtT_1 = new JTextField();
		txtT_1.setEnabled(false);
		txtT_1.setBounds(63, 50, 42, 42);
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setText(" T");
		txtT_1.setColumns(10);
		frame.getContentPane().add(txtT_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setBounds(63, 132, 42, 42);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setBounds(63, 174, 42, 42);
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setBounds(63, 216, 42, 42);
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		txtP = new JTextField();
		txtP.setEnabled(false);
		txtP.setBounds(105, 258, 42, 42);
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setText(" P");
		txtP.setColumns(10);
		frame.getContentPane().add(txtP);
		
		txtO = new JTextField();
		txtO.setEnabled(false);
		txtO.setBounds(147, 258, 42, 42);
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setText(" O");
		txtO.setColumns(10);
		frame.getContentPane().add(txtO);
		
		txtR = new JTextField();
		txtR.setEnabled(false);
		txtR.setBounds(189, 258, 42, 42);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		frame.getContentPane().add(txtR);
		
		txtS_1 = new JTextField();
		txtS_1.setEnabled(false);
		txtS_1.setBounds(273, 258, 42, 42);
		txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS_1.setText(" S");
		txtS_1.setColumns(10);
		frame.getContentPane().add(txtS_1);
		
		txtT = new JTextField();
		txtT.setEnabled(false);
		txtT.setBounds(231, 258, 42, 42);
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setText(" T");
		txtT.setColumns(10);
		frame.getContentPane().add(txtT);
		
		txtF = new JTextField();
		txtF.setEnabled(false);
		txtF.setBounds(147, 174, 42, 42);
		txtF.setText(" F");
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setColumns(10);
		frame.getContentPane().add(txtF);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setBounds(147, 298, 42, 42);
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setBounds(147, 340, 42, 42);
		textField_14.setColumns(10);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setBounds(147, 381, 42, 42);
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15);
		
		txtL = new JTextField();
		txtL.setEnabled(false);
		txtL.setBounds(147, 421, 42, 42);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		frame.getContentPane().add(txtL);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setBounds(147, 463, 42, 42);
		textField_17.setColumns(10);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setBounds(105, 421, 42, 42);
		textField_18.setColumns(10);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setBounds(63, 421, 42, 42);
		textField_19.setColumns(10);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setBounds(22, 421, 42, 42);
		textField_20.setColumns(10);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setBounds(189, 421, 42, 42);
		textField_21.setColumns(10);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setBounds(231, 421, 42, 42);
		textField_22.setColumns(10);
		frame.getContentPane().add(textField_22);
		
		txtB = new JTextField();
		txtB.setEnabled(false);
		txtB.setBounds(273, 421, 42, 42);
		txtB.setText(" B");
		txtB.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtB.setForeground(new Color(0, 0, 0));
		txtB.setColumns(10);
		frame.getContentPane().add(txtB);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setBounds(313, 421, 42, 42);
		textField_24.setColumns(10);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setBounds(355, 422, 42, 42);
		textField_25.setColumns(10);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setBounds(397, 421, 42, 42);
		textField_26.setColumns(10);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setBounds(273, 381, 42, 42);
		textField_27.setColumns(10);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setBounds(273, 298, 42, 42);
		textField_28.setColumns(10);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setBounds(273, 340, 42, 42);
		textField_29.setColumns(10);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setBounds(273, 463, 42, 42);
		textField_30.setColumns(10);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setBounds(273, 504, 42, 42);
		textField_31.setColumns(10);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setBounds(273, 545, 42, 42);
		textField_32.setColumns(10);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setBounds(273, 216, 42, 42);
		textField_33.setColumns(10);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setBounds(273, 174, 42, 42);
		textField_34.setColumns(10);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setBounds(313, 174, 42, 42);
		textField_35.setColumns(10);
		frame.getContentPane().add(textField_35);
		
		txtX = new JTextField();
		txtX.setEnabled(false);
		txtX.setBounds(355, 174, 42, 42);
		txtX.setText(" X");
		txtX.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtX.setColumns(10);
		frame.getContentPane().add(txtX);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setBounds(397, 174, 42, 42);
		textField_37.setColumns(10);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_38.setBounds(439, 174, 42, 42);
		textField_38.setColumns(10);
		frame.getContentPane().add(textField_38);
		
		txtG = new JTextField();
		txtG.setEnabled(false);
		txtG.setBounds(481, 174, 42, 42);
		txtG.setText(" G");
		txtG.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtG.setColumns(10);
		frame.getContentPane().add(txtG);
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setBounds(481, 216, 42, 42);
		textField_40.setColumns(10);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setBounds(481, 258, 42, 42);
		textField_41.setColumns(10);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setBounds(481, 298, 42, 42);
		textField_42.setColumns(10);
		frame.getContentPane().add(textField_42);
		
		JButton btnGiveUp = new JButton("GIVE UP!");
		btnGiveUp.setBounds(576, 659, 167, 42);
		btnGiveUp.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnGiveUp);
		
		JButton button = new JButton("FINISH");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(260, 659, 179, 42);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("1");
		label.setBounds(36, 50, 15, 16);
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
		
		lblNewLabel = new JLabel("l");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG-20180812-WA0059.jpg"));
		lblNewLabel.setBounds(540, 91, 602, 434);
		frame.getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1032);
		frame.getContentPane().add(panel);
		frame.setBounds(100, 100, 1560, 1079);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
