package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class C3 {

	private JFrame frame;
	private JTextField txtS;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtT;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtL;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtE;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField txtO_1;
	private JTextField txtO;
	private JTextField txtF;
	private JTextField txtW;
	private JTextField txtE_1;
	private JTextField txtA;
	private JTextField txtR;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField txtS_1;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField txtB;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField txtA_1;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField txtL_1;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField txtN;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField txtL_2;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField txtE_2;
	private JTextField textField_56;
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
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C3 window = new C3();
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
	public C3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setBackground(new Color(230, 230, 250));
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(507, 13, 42, 42);
		frame.getContentPane().add(txtS);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(507, 55, 42, 42);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(507, 97, 42, 42);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(507, 139, 42, 42);
		frame.getContentPane().add(textField_3);
		
		txtT = new JTextField();
		txtT.setEnabled(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBounds(507, 180, 42, 42);
		frame.getContentPane().add(txtT);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(507, 222, 42, 42);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(466, 55, 42, 42);
		frame.getContentPane().add(textField_6);
		
		txtL = new JTextField();
		txtL.setEnabled(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setBackground(new Color(230, 230, 250));
		txtL.setColumns(10);
		txtL.setBounds(424, 55, 42, 42);
		frame.getContentPane().add(txtL);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(383, 55, 42, 42);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(548, 55, 42, 42);
		frame.getContentPane().add(textField_9);
		
		txtE = new JTextField();
		txtE.setEnabled(false);
		txtE.setBackground(new Color(230, 230, 250));
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setText(" E");
		txtE.setColumns(10);
		txtE.setBounds(590, 55, 42, 42);
		frame.getContentPane().add(txtE);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(632, 55, 42, 42);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(673, 55, 42, 42);
		frame.getContentPane().add(textField_12);
		
		txtO_1 = new JTextField();
		txtO_1.setEnabled(false);
		txtO_1.setText(" O");
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setColumns(10);
		txtO_1.setBounds(466, 180, 42, 42);
		frame.getContentPane().add(txtO_1);
		
		txtO = new JTextField();
		txtO.setEnabled(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBounds(424, 180, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtF = new JTextField();
		txtF.setEnabled(false);
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setText(" F");
		txtF.setColumns(10);
		txtF.setBounds(383, 180, 42, 42);
		frame.getContentPane().add(txtF);
		
		txtW = new JTextField();
		txtW.setEnabled(false);
		txtW.setText(" W");
		txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtW.setColumns(10);
		txtW.setBounds(548, 180, 42, 42);
		frame.getContentPane().add(txtW);
		
		txtE_1 = new JTextField();
		txtE_1.setEnabled(false);
		txtE_1.setText(" E");
		txtE_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_1.setColumns(10);
		txtE_1.setBounds(590, 181, 42, 42);
		frame.getContentPane().add(txtE_1);
		
		txtA = new JTextField();
		txtA.setEnabled(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(632, 180, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtR = new JTextField();
		txtR.setEnabled(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBounds(673, 180, 42, 42);
		frame.getContentPane().add(txtR);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(424, 139, 42, 42);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(424, 222, 42, 42);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(424, 264, 42, 42);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(424, 306, 42, 42);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(424, 348, 42, 42);
		frame.getContentPane().add(textField_24);
		
		txtS_1 = new JTextField();
		txtS_1.setEnabled(false);
		txtS_1.setText(" S");
		txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS_1.setColumns(10);
		txtS_1.setBounds(424, 389, 42, 42);
		frame.getContentPane().add(txtS_1);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(383, 389, 42, 42);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(341, 389, 42, 42);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(299, 389, 42, 42);
		frame.getContentPane().add(textField_28);
		
		txtB = new JTextField();
		txtB.setEnabled(false);
		txtB.setText(" B");
		txtB.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtB.setColumns(10);
		txtB.setBounds(258, 389, 42, 42);
		frame.getContentPane().add(txtB);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(299, 348, 42, 42);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(299, 428, 42, 42);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(299, 469, 42, 42);
		frame.getContentPane().add(textField_32);
		
		txtA_1 = new JTextField();
		txtA_1.setEnabled(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBounds(299, 510, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(299, 552, 42, 42);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(258, 510, 42, 42);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(341, 510, 42, 42);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(383, 510, 42, 42);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(424, 510, 42, 42);
		frame.getContentPane().add(textField_38);
		
		txtL_1 = new JTextField();
		txtL_1.setEnabled(false);
		txtL_1.setText(" L");
		txtL_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL_1.setColumns(10);
		txtL_1.setBounds(466, 510, 42, 42);
		frame.getContentPane().add(txtL_1);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(673, 222, 42, 42);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(673, 264, 42, 42);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(673, 306, 42, 42);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(673, 348, 42, 42);
		frame.getContentPane().add(textField_43);
		
		txtN = new JTextField();
		txtN.setEnabled(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBounds(673, 389, 42, 42);
		frame.getContentPane().add(txtN);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(673, 428, 42, 42);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(632, 390, 42, 42);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(590, 390, 42, 42);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(713, 390, 42, 42);
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(755, 390, 42, 42);
		frame.getContentPane().add(textField_49);
		
		txtL_2 = new JTextField();
		txtL_2.setEnabled(false);
		txtL_2.setText(" L");
		txtL_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL_2.setColumns(10);
		txtL_2.setBounds(797, 389, 42, 42);
		frame.getContentPane().add(txtL_2);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(797, 348, 42, 42);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(797, 428, 42, 42);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(797, 469, 42, 42);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(797, 511, 42, 42);
		frame.getContentPane().add(textField_54);
		
		txtE_2 = new JTextField();
		txtE_2.setEnabled(false);
		txtE_2.setText(" E");
		txtE_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_2.setColumns(10);
		txtE_2.setBounds(797, 551, 42, 42);
		frame.getContentPane().add(txtE_2);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(797, 592, 42, 42);
		frame.getContentPane().add(textField_56);
		
		button = new JButton("FINISH");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(303, 694, 179, 42);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("GIVE UP!");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(603, 694, 167, 42);
		frame.getContentPane().add(button_1);
		
		label = new JLabel("1");
		label.setBounds(488, 13, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(356, 68, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(406, 134, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4");
		label_3.setBounds(640, 152, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5");
		label_4.setBounds(316, 319, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("6");
		label_5.setBounds(239, 389, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("7");
		label_6.setBounds(563, 403, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("8");
		label_7.setBounds(773, 338, 24, 23);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("9");
		label_8.setBounds(239, 524, 15, 16);
		frame.getContentPane().add(label_8);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_165104.jpg"));
		lblNewLabel.setBounds(727, 13, 821, 307);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_165137.jpg"));
		lblNewLabel_1.setBounds(877, 348, 627, 290);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1031);
		frame.getContentPane().add(panel);
		frame.setBounds(100, 100, 1560, 1078);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
