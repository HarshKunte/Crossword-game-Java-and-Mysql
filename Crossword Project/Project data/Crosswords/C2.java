package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class C2 {

	private JFrame frame;
	private JTextField txtR;
	private JTextField txtN_1;
	private JTextField txtD;
	private JTextField txtC;
	private JTextField txtA;
	private JTextField txtI;
	private JTextField txtM;
	private JTextField txtA_1;
	private JTextField txtL;
	private JTextField txtS;
	private JTextField txtN_2;
	private JTextField txtA_2;
	private JTextField textField_38;
	private JTextField txtT;
	private JTextField txtR_1;
	private JTextField txtI_1;
	private JTextField txtA_3;
	private JTextField txtO;
	private JTextField txtE;
	private JTextField txtN;
	private JButton button;
	private JButton button_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_23;
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
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C2 window = new C2();
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
	public C2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1560, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtR = new JTextField();
		txtR.setEnabled(false);
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setText(" R");
		txtR.setColumns(10);
		txtR.setBackground(new Color(230, 230, 250));
		txtR.setBounds(372, 157, 42, 42);
		frame.getContentPane().add(txtR);
		
		txtN_1 = new JTextField();
		txtN_1.setEnabled(false);
		txtN_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN_1.setText(" N");
		txtN_1.setColumns(10);
		txtN_1.setBackground(new Color(230, 230, 250));
		txtN_1.setBounds(204, 157, 42, 42);
		frame.getContentPane().add(txtN_1);
		
		txtD = new JTextField();
		txtD.setEnabled(false);
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setText(" D");
		txtD.setColumns(10);
		txtD.setBackground(new Color(230, 230, 250));
		txtD.setBounds(120, 240, 42, 42);
		frame.getContentPane().add(txtD);
		
		txtA = new JTextField();
		txtA.setEnabled(false);
		txtA.setBackground(new Color(230, 230, 250));
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(288, 319, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtI = new JTextField();
		txtI.setEnabled(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBackground(new Color(230, 230, 250));
		txtI.setBounds(372, 319, 42, 42);
		frame.getContentPane().add(txtI);
		
		txtM = new JTextField();
		txtM.setEnabled(false);
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setText(" M");
		txtM.setColumns(10);
		txtM.setBackground(new Color(230, 230, 250));
		txtM.setBounds(413, 319, 42, 42);
		frame.getContentPane().add(txtM);
		
		txtA_1 = new JTextField();
		txtA_1.setEnabled(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBackground(new Color(230, 230, 250));
		txtA_1.setBounds(454, 319, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		txtL = new JTextField();
		txtL.setEnabled(false);
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setText(" L");
		txtL.setColumns(10);
		txtL.setBackground(new Color(230, 230, 250));
		txtL.setBounds(496, 319, 42, 42);
		frame.getContentPane().add(txtL);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setText(" S");
		txtS.setColumns(10);
		txtS.setBackground(new Color(230, 230, 250));
		txtS.setBounds(537, 319, 42, 42);
		frame.getContentPane().add(txtS);
		
		txtN_2 = new JTextField();
		txtN_2.setEnabled(false);
		txtN_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN_2.setText(" N");
		txtN_2.setColumns(10);
		txtN_2.setBackground(new Color(230, 230, 250));
		txtN_2.setBounds(372, 403, 42, 42);
		frame.getContentPane().add(txtN_2);
		
		txtA_2 = new JTextField();
		txtA_2.setEnabled(false);
		txtA_2.setText(" A");
		txtA_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_2.setColumns(10);
		txtA_2.setBackground(new Color(230, 230, 250));
		txtA_2.setBounds(496, 486, 42, 42);
		frame.getContentPane().add(txtA_2);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBackground(new Color(255, 255, 255));
		textField_38.setBounds(496, 528, 42, 42);
		frame.getContentPane().add(textField_38);
		
		txtT = new JTextField();
		txtT.setEnabled(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(new Color(230, 230, 250));
		txtT.setBounds(496, 570, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtR_1 = new JTextField();
		txtR_1.setEnabled(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(new Color(230, 230, 250));
		txtR_1.setBounds(661, 570, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		txtI_1 = new JTextField();
		txtI_1.setEnabled(false);
		txtI_1.setText(" I");
		txtI_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_1.setColumns(10);
		txtI_1.setBackground(new Color(230, 230, 250));
		txtI_1.setBounds(372, 611, 42, 42);
		frame.getContentPane().add(txtI_1);
		
		txtA_3 = new JTextField();
		txtA_3.setEnabled(false);
		txtA_3.setText(" A");
		txtA_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_3.setColumns(10);
		txtA_3.setBackground(new Color(230, 230, 250));
		txtA_3.setBounds(372, 734, 42, 42);
		frame.getContentPane().add(txtA_3);
		
		txtO = new JTextField();
		txtO.setEnabled(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(new Color(230, 230, 250));
		txtO.setBounds(454, 611, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtN = new JTextField();
		txtN.setEnabled(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBackground(new Color(230, 230, 250));
		txtN.setBounds(330, 319, 42, 42);
		frame.getContentPane().add(txtN);
		
		button = new JButton("FINISH");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(276, 862, 179, 42);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("GIVE UP!");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(587, 862, 167, 42);
		frame.getContentPane().add(button_1);
		
		label = new JLabel("6");
		label.setBounds(510, 253, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("5");
		label_1.setBounds(388, 253, 14, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(189, 90, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("2");
		label_3.setBounds(296, 90, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("1");
		label_4.setBounds(357, 48, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("4");
		label_5.setBounds(103, 171, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("7");
		label_6.setBounds(357, 500, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("8");
		label_7.setBounds(479, 584, 15, 16);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("10");
		label_8.setBounds(178, 748, 14, 16);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("9");
		label_9.setBounds(276, 625, 15, 16);
		frame.getContentPane().add(label_9);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_161926.jpg"));
		lblNewLabel.setBounds(715, -28, 756, 414);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_161934.jpg"));
		lblNewLabel_1.setBounds(715, 361, 732, 487);
		frame.getContentPane().add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1045);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(121, 282, 42, 42);
		panel.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(121, 197, 42, 42);
		panel.add(textField_7);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_16.setColumns(10);
		textField_16.setBounds(121, 154, 42, 42);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_17.setColumns(10);
		textField_17.setBounds(163, 153, 42, 43);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_18.setColumns(10);
		textField_18.setBounds(204, 115, 42, 42);
		panel.add(textField_18);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(204, 72, 42, 42);
		panel.add(textField_22);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(371, 115, 42, 42);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_25.setColumns(10);
		textField_25.setBounds(371, 72, 42, 42);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(371, 30, 42, 42);
		panel.add(textField_26);
		
		textField = new JTextField();
		textField.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField.setColumns(10);
		textField.setBounds(204, 197, 42, 42);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(204, 239, 42, 42);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(204, 282, 42, 42);
		panel.add(textField_2);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(288, 197, 42, 42);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(288, 239, 42, 42);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(288, 282, 42, 42);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(371, 282, 42, 42);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(288, 361, 42, 42);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(371, 361, 42, 42);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(495, 282, 42, 42);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(495, 361, 42, 42);
		panel.add(textField_15);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_19.setColumns(10);
		textField_19.setBounds(495, 402, 42, 42);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(495, 444, 42, 42);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(371, 571, 42, 42);
		panel.add(textField_21);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(371, 528, 42, 42);
		panel.add(textField_23);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(371, 485, 42, 42);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(413, 485, 42, 42);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_29.setColumns(10);
		textField_29.setBounds(454, 485, 42, 42);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(536, 485, 42, 42);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(578, 485, 42, 42);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(620, 485, 42, 42);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_33.setColumns(10);
		textField_33.setBounds(536, 571, 42, 42);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(578, 571, 42, 42);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(620, 571, 42, 42);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(330, 609, 42, 42);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(288, 609, 42, 42);
		panel.add(textField_37);
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_39.setColumns(10);
		textField_39.setBounds(413, 609, 42, 42);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(371, 653, 42, 42);
		panel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(371, 695, 42, 42);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(288, 736, 42, 42);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(330, 736, 42, 42);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_44.setColumns(10);
		textField_44.setBounds(204, 736, 42, 42);
		panel.add(textField_44);
		
		txtE = new JTextField();
		txtE.setBounds(245, 736, 42, 42);
		panel.add(txtE);
		txtE.setEnabled(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBackground(new Color(230, 230, 250));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(245, 154, 42, 42);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(288, 154, 42, 42);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(330, 154, 42, 42);
		panel.add(textField_6);
		
		txtC = new JTextField();
		txtC.setBounds(288, 115, 42, 42);
		panel.add(txtC);
		txtC.setEnabled(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(new Color(230, 230, 250));
	}
}
