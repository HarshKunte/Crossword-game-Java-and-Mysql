package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class C10 {

	private JFrame frame;
	private JTextField txtO_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtE;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtY;
	private JTextField txtR;
	private JTextField txtT;
	private JTextField txtU;
	private JTextField txtP;
	private JTextField txtM;
	private JTextField txtO;
	private JTextField txtC;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField txtT_1;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField txtR_1;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField txtS;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField txtK;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField txtD;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C10 window = new C10();
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
	public C10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1560, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtO_1 = new JTextField();
		txtO_1.setEnabled(false);
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setText(" O");
		txtO_1.setColumns(10);
		txtO_1.setBackground(Color.WHITE);
		txtO_1.setBounds(420, 206, 42, 42);
		frame.getContentPane().add(txtO_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(420, 164, 42, 42);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(420, 249, 42, 42);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(420, 292, 42, 42);
		frame.getContentPane().add(textField_3);
		
		txtE = new JTextField();
		txtE.setEnabled(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBackground(Color.WHITE);
		txtE.setBounds(420, 333, 42, 42);
		frame.getContentPane().add(txtE);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(379, 206, 42, 42);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(337, 206, 42, 42);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(462, 206, 42, 42);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(503, 206, 42, 42);
		frame.getContentPane().add(textField_8);
		
		txtY = new JTextField();
		txtY.setEnabled(false);
		txtY.setText(" Y");
		txtY.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtY.setColumns(10);
		txtY.setBackground(Color.WHITE);
		txtY.setBounds(545, 206, 42, 42);
		frame.getContentPane().add(txtY);
		
		txtR = new JTextField();
		txtR.setEnabled(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		txtR.setBounds(462, 333, 42, 42);
		frame.getContentPane().add(txtR);
		
		txtT = new JTextField();
		txtT.setEnabled(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(Color.WHITE);
		txtT.setBounds(379, 333, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtU = new JTextField();
		txtU.setEnabled(false);
		txtU.setText(" U");
		txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU.setColumns(10);
		txtU.setBackground(Color.WHITE);
		txtU.setBounds(337, 333, 42, 42);
		frame.getContentPane().add(txtU);
		
		txtP = new JTextField();
		txtP.setEnabled(false);
		txtP.setText(" P");
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setColumns(10);
		txtP.setBackground(Color.WHITE);
		txtP.setBounds(295, 333, 42, 42);
		frame.getContentPane().add(txtP);
		
		txtM = new JTextField();
		txtM.setEnabled(false);
		txtM.setText(" M");
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		txtM.setBounds(253, 333, 42, 42);
		frame.getContentPane().add(txtM);
		
		txtO = new JTextField();
		txtO.setEnabled(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		txtO.setBounds(210, 333, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtC = new JTextField();
		txtC.setEnabled(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		txtC.setBounds(167, 333, 42, 42);
		frame.getContentPane().add(txtC);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(210, 292, 42, 42);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(210, 375, 42, 42);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(210, 417, 42, 42);
		frame.getContentPane().add(textField_19);
		
		txtT_1 = new JTextField();
		txtT_1.setEnabled(false);
		txtT_1.setText(" T");
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setColumns(10);
		txtT_1.setBackground(Color.WHITE);
		txtT_1.setBounds(210, 459, 42, 42);
		frame.getContentPane().add(txtT_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(210, 501, 42, 42);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(210, 542, 42, 42);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(253, 542, 42, 42);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(295, 542, 42, 42);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(253, 459, 42, 42);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(295, 459, 42, 42);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(167, 459, 42, 42);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(124, 459, 42, 42);
		frame.getContentPane().add(textField_28);
		
		txtR_1 = new JTextField();
		txtR_1.setEnabled(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(Color.WHITE);
		txtR_1.setBounds(81, 459, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBackground(Color.WHITE);
		textField_30.setBounds(38, 459, 42, 42);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBackground(Color.WHITE);
		textField_31.setBounds(81, 417, 42, 42);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		textField_32.setBounds(81, 375, 42, 42);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBackground(Color.WHITE);
		textField_33.setBounds(81, 501, 42, 42);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBackground(Color.WHITE);
		textField_34.setBounds(81, 542, 42, 42);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBackground(Color.WHITE);
		textField_35.setBounds(81, 584, 42, 42);
		frame.getContentPane().add(textField_35);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBackground(Color.WHITE);
		txtS.setBounds(81, 626, 42, 42);
		frame.getContentPane().add(txtS);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBackground(Color.WHITE);
		textField_37.setBounds(81, 668, 42, 42);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBackground(Color.WHITE);
		textField_38.setBounds(124, 626, 42, 42);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBackground(Color.WHITE);
		textField_39.setBounds(167, 626, 42, 42);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBackground(Color.WHITE);
		textField_40.setBounds(210, 626, 42, 42);
		frame.getContentPane().add(textField_40);
		
		txtK = new JTextField();
		txtK.setEnabled(false);
		txtK.setText(" K");
		txtK.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtK.setColumns(10);
		txtK.setBackground(Color.WHITE);
		txtK.setBounds(253, 626, 42, 42);
		frame.getContentPane().add(txtK);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBackground(Color.WHITE);
		textField_42.setBounds(295, 626, 42, 42);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBackground(Color.WHITE);
		textField_43.setBounds(337, 626, 42, 42);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBackground(Color.WHITE);
		textField_44.setBounds(295, 292, 42, 42);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBackground(Color.WHITE);
		textField_45.setBounds(295, 375, 42, 42);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBackground(Color.WHITE);
		textField_46.setBounds(545, 164, 42, 42);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBackground(Color.WHITE);
		textField_47.setBounds(545, 121, 42, 42);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBackground(Color.WHITE);
		textField_48.setBounds(545, 249, 42, 42);
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBackground(Color.WHITE);
		textField_49.setBounds(545, 292, 42, 42);
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBackground(Color.WHITE);
		textField_50.setBounds(545, 333, 42, 42);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBackground(Color.WHITE);
		textField_51.setBounds(545, 375, 42, 42);
		frame.getContentPane().add(textField_51);
		
		txtD = new JTextField();
		txtD.setEnabled(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBackground(Color.WHITE);
		txtD.setBounds(545, 417, 42, 42);
		frame.getContentPane().add(txtD);
		
		JButton button = new JButton("GIVE UP!");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(721, 717, 167, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("FINISH");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(448, 717, 167, 42);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(707, 77, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_185625.jpg"));
		lblNewLabel_1.setBounds(618, 29, 590, 244);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_185634.jpg"));
		lblNewLabel_2.setBounds(628, 292, 633, 275);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
	}
}
