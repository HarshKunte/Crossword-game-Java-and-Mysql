package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class C9{

	private JFrame frame;
	private JTextField textField;
	private JTextField txtA;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtT_1;
	private JTextField txtA_1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField txtF;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField txtR;
	private JTextField textField_19;
	private JTextField txtI;
	private JTextField txtT;
	private JTextField txtS;
	private JTextField txtD;
	private JTextField txtU;
	private JTextField textField_25;
	private JTextField txtT_2;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField txtR_1;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField txtP;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField txtN;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField txtE;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField txtO;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField txtW;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C9 window = new C9();
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
	public C9() {
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 128, 42, 42);
		frame.getContentPane().add(textField);
		
		txtA = new JTextField();
		txtA.setEnabled(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(139, 128, 42, 42);
		frame.getContentPane().add(txtA);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 128, 42, 42);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(222, 88, 42, 42);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(264, 128, 42, 42);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(307, 128, 42, 42);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(139, 171, 42, 42);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(139, 213, 42, 42);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(139, 256, 42, 42);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(139, 297, 42, 42);
		frame.getContentPane().add(textField_9);
		
		txtT_1 = new JTextField();
		txtT_1.setEnabled(false);
		txtT_1.setText(" T");
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setColumns(10);
		txtT_1.setBounds(222, 423, 42, 42);
		frame.getContentPane().add(txtT_1);
		
		txtA_1 = new JTextField();
		txtA_1.setEnabled(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBounds(222, 128, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(222, 171, 42, 42);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(222, 213, 42, 42);
		frame.getContentPane().add(textField_13);
		
		txtF = new JTextField();
		txtF.setEnabled(false);
		txtF.setText(" F");
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setColumns(10);
		txtF.setBounds(222, 256, 42, 42);
		frame.getContentPane().add(txtF);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(222, 297, 42, 42);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(222, 340, 42, 42);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(222, 380, 42, 42);
		frame.getContentPane().add(textField_17);
		
		txtR = new JTextField();
		txtR.setEnabled(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBounds(264, 256, 42, 42);
		frame.getContentPane().add(txtR);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(307, 213, 42, 42);
		frame.getContentPane().add(textField_19);
		
		txtI = new JTextField();
		txtI.setEnabled(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBounds(347, 256, 42, 42);
		frame.getContentPane().add(txtI);
		
		txtT = new JTextField();
		txtT.setEnabled(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBounds(389, 256, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(429, 256, 42, 42);
		frame.getContentPane().add(txtS);
		
		txtD = new JTextField();
		txtD.setEnabled(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBounds(307, 464, 42, 42);
		frame.getContentPane().add(txtD);
		
		txtU = new JTextField();
		txtU.setEnabled(false);
		txtU.setText(" U");
		txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtU.setColumns(10);
		txtU.setBounds(307, 256, 42, 42);
		frame.getContentPane().add(txtU);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(307, 297, 42, 42);
		frame.getContentPane().add(textField_25);
		
		txtT_2 = new JTextField();
		txtT_2.setEnabled(false);
		txtT_2.setText(" T");
		txtT_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_2.setColumns(10);
		txtT_2.setBounds(307, 340, 42, 42);
		frame.getContentPane().add(txtT_2);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(307, 380, 42, 42);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(307, 423, 42, 42);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(429, 213, 42, 42);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(429, 128, 42, 42);
		frame.getContentPane().add(textField_30);
		
		txtR_1 = new JTextField();
		txtR_1.setEnabled(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBounds(429, 88, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(429, 46, 42, 42);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(429, 171, 42, 42);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(470, 171, 42, 42);
		frame.getContentPane().add(textField_34);
		
		txtP = new JTextField();
		txtP.setEnabled(false);
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setText(" P");
		txtP.setColumns(10);
		txtP.setBounds(513, 171, 42, 42);
		frame.getContentPane().add(txtP);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(555, 171, 42, 42);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(597, 171, 42, 42);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(638, 171, 42, 42);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(513, 213, 42, 42);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(513, 256, 42, 42);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(513, 297, 42, 42);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(513, 340, 42, 42);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(513, 380, 42, 42);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(513, 423, 42, 42);
		frame.getContentPane().add(textField_44);
		
		txtN = new JTextField();
		txtN.setEnabled(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBounds(513, 464, 42, 42);
		frame.getContentPane().add(txtN);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(513, 506, 42, 42);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(513, 548, 42, 42);
		frame.getContentPane().add(textField_47);
		
		txtE = new JTextField();
		txtE.setEnabled(false);
		txtE.setText(" E");
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setColumns(10);
		txtE.setBounds(513, 588, 42, 42);
		frame.getContentPane().add(txtE);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(555, 588, 42, 42);
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(597, 588, 42, 42);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(638, 588, 42, 42);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(555, 464, 42, 42);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(597, 464, 42, 42);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(470, 464, 42, 42);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(429, 464, 42, 42);
		frame.getContentPane().add(textField_55);
		
		txtO = new JTextField();
		txtO.setEnabled(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBounds(389, 464, 42, 42);
		frame.getContentPane().add(txtO);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(470, 588, 42, 42);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(429, 588, 42, 42);
		frame.getContentPane().add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(389, 588, 42, 42);
		frame.getContentPane().add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(347, 588, 42, 42);
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(307, 588, 42, 42);
		frame.getContentPane().add(textField_61);
		
		txtW = new JTextField();
		txtW.setEnabled(false);
		txtW.setText(" W");
		txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtW.setColumns(10);
		txtW.setBounds(264, 588, 42, 42);
		frame.getContentPane().add(txtW);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(264, 548, 42, 42);
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(264, 630, 42, 42);
		frame.getContentPane().add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(264, 506, 42, 42);
		frame.getContentPane().add(textField_65);
		
		JButton button = new JButton("FINISH");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(373, 720, 167, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("GIVE UP!");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(669, 720, 167, 42);
		frame.getContentPane().add(button_1);
		
		label = new JLabel("1");
		label.setBounds(77, 141, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(150, 114, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("6");
		label_2.setBounds(227, 72, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("9");
		label_3.setBounds(307, 197, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("3");
		label_4.setBounds(409, 184, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("4");
		label_5.setBounds(416, 46, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("10");
		label_6.setBounds(529, 153, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("5");
		label_7.setBounds(374, 478, 15, 16);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("7");
		label_8.setBounds(249, 602, 15, 16);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("8");
		label_9.setBounds(249, 506, 15, 16);
		frame.getContentPane().add(label_9);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_184132.jpg"));
		lblNewLabel.setBounds(740, 11, 588, 287);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_184139.jpg"));
		lblNewLabel_1.setBounds(762, 324, 630, 306);
		frame.getContentPane().add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
	}
}
