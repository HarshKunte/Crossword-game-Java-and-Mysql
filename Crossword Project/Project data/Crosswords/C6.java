package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class C6 {

	private JFrame frame;
	private JTextField txtT_2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtM;
	private JTextField textField_4;
	private JTextField txtR;
	private JTextField textField_6;
	private JTextField txtL;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtT;
	private JTextField txtA;
	private JTextField txtN;
	private JTextField txtS;
	private JTextField txtP;
	private JTextField txtO;
	private JTextField txtR_1;
	private JTextField txtT_1;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField txtC;
	private JTextField textField_22;
	private JTextField txtH;
	private JTextField textField_24;
	private JTextField txtI;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField txtR_2;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField txtK;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField txtA_1;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField txtX;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField txtI_1;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
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
	private JTextField textField;
	private JTextField textField_3;
	private JLabel lblNewLabel;
	private JLabel lblL;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C6 window = new C6();
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
	public C6() {
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
		
		txtT_2 = new JTextField();
		txtT_2.setEnabled(false);
		txtT_2.setText(" T");
		txtT_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_2.setColumns(10);
		txtT_2.setBackground(Color.WHITE);
		txtT_2.setBounds(166, 44, 42, 42);
		frame.getContentPane().add(txtT_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(208, 44, 42, 42);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(251, 44, 42, 42);
		frame.getContentPane().add(textField_2);
		
		txtM = new JTextField();
		txtM.setEnabled(false);
		txtM.setText(" M");
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		txtM.setBounds(292, 44, 42, 42);
		frame.getContentPane().add(txtM);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(251, 85, 42, 42);
		frame.getContentPane().add(textField_4);
		
		txtR = new JTextField();
		txtR.setEnabled(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		txtR.setBounds(251, 128, 42, 42);
		frame.getContentPane().add(txtR);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(251, 168, 42, 42);
		frame.getContentPane().add(textField_6);
		
		txtL = new JTextField();
		txtL.setEnabled(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setColumns(10);
		txtL.setBackground(Color.WHITE);
		txtL.setBounds(251, 210, 42, 42);
		frame.getContentPane().add(txtL);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(251, 253, 42, 42);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(251, 295, 42, 42);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(251, 336, 42, 42);
		frame.getContentPane().add(textField_10);
		
		txtT = new JTextField();
		txtT.setEnabled(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBackground(Color.WHITE);
		txtT.setBounds(208, 128, 42, 42);
		frame.getContentPane().add(txtT);
		
		txtA = new JTextField();
		txtA.setEnabled(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBackground(Color.WHITE);
		txtA.setBounds(292, 128, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtN = new JTextField();
		txtN.setEnabled(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBackground(Color.WHITE);
		txtN.setBounds(334, 129, 42, 42);
		frame.getContentPane().add(txtN);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBackground(Color.WHITE);
		txtS.setBounds(377, 128, 42, 42);
		frame.getContentPane().add(txtS);
		
		txtP = new JTextField();
		txtP.setEnabled(false);
		txtP.setText(" P");
		txtP.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtP.setColumns(10);
		txtP.setBackground(Color.WHITE);
		txtP.setBounds(419, 128, 42, 42);
		frame.getContentPane().add(txtP);
		
		txtO = new JTextField();
		txtO.setEnabled(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		txtO.setBounds(461, 128, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtR_1 = new JTextField();
		txtR_1.setEnabled(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(Color.WHITE);
		txtR_1.setBounds(504, 128, 42, 42);
		frame.getContentPane().add(txtR_1);
		
		txtT_1 = new JTextField();
		txtT_1.setEnabled(false);
		txtT_1.setText(" T");
		txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT_1.setColumns(10);
		txtT_1.setBackground(Color.WHITE);
		txtT_1.setBounds(547, 128, 42, 42);
		frame.getContentPane().add(txtT_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(208, 210, 42, 42);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(166, 210, 42, 42);
		frame.getContentPane().add(textField_20);
		
		txtC = new JTextField();
		txtC.setEnabled(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		txtC.setBounds(125, 210, 42, 42);
		frame.getContentPane().add(txtC);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(292, 210, 42, 42);
		frame.getContentPane().add(textField_22);
		
		txtH = new JTextField();
		txtH.setEnabled(false);
		txtH.setText(" H");
		txtH.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtH.setColumns(10);
		txtH.setBackground(Color.WHITE);
		txtH.setBounds(208, 336, 42, 42);
		frame.getContentPane().add(txtH);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(292, 336, 42, 42);
		frame.getContentPane().add(textField_24);
		
		txtI = new JTextField();
		txtI.setEnabled(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBackground(Color.WHITE);
		txtI.setBounds(334, 336, 42, 42);
		frame.getContentPane().add(txtI);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(377, 336, 42, 42);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(419, 336, 42, 42);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(461, 336, 42, 42);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBackground(Color.WHITE);
		textField_29.setBounds(504, 336, 42, 42);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBackground(Color.WHITE);
		textField_30.setBounds(547, 336, 42, 42);
		frame.getContentPane().add(textField_30);
		
		txtR_2 = new JTextField();
		txtR_2.setEnabled(false);
		txtR_2.setText(" R");
		txtR_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_2.setColumns(10);
		txtR_2.setBackground(Color.WHITE);
		txtR_2.setBounds(590, 336, 42, 42);
		frame.getContentPane().add(txtR_2);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		textField_32.setBounds(334, 295, 42, 42);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBackground(Color.WHITE);
		textField_33.setBounds(334, 378, 42, 42);
		frame.getContentPane().add(textField_33);
		
		txtK = new JTextField();
		txtK.setEnabled(false);
		txtK.setText(" K");
		txtK.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtK.setColumns(10);
		txtK.setBackground(Color.WHITE);
		txtK.setBounds(334, 421, 42, 42);
		frame.getContentPane().add(txtK);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBackground(Color.WHITE);
		textField_35.setBounds(334, 464, 42, 42);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBackground(Color.WHITE);
		textField_36.setBounds(334, 506, 42, 42);
		frame.getContentPane().add(textField_36);
		
		txtA_1 = new JTextField();
		txtA_1.setEnabled(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBackground(Color.WHITE);
		txtA_1.setBounds(334, 548, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBackground(Color.WHITE);
		textField_38.setBounds(334, 589, 42, 42);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBackground(Color.WHITE);
		textField_39.setBounds(292, 548, 42, 42);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBackground(Color.WHITE);
		textField_40.setBounds(377, 548, 42, 42);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBackground(Color.WHITE);
		textField_41.setBounds(292, 421, 42, 42);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBackground(Color.WHITE);
		textField_42.setBounds(251, 421, 42, 42);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBackground(Color.WHITE);
		textField_43.setBounds(377, 421, 42, 42);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBackground(Color.WHITE);
		textField_44.setBounds(590, 378, 42, 42);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBackground(Color.WHITE);
		textField_45.setBounds(590, 295, 42, 42);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBackground(Color.WHITE);
		textField_46.setBounds(590, 421, 42, 42);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBackground(Color.WHITE);
		textField_47.setBounds(590, 464, 42, 42);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBackground(Color.WHITE);
		textField_48.setBounds(630, 295, 42, 42);
		frame.getContentPane().add(textField_48);
		
		txtX = new JTextField();
		txtX.setEnabled(false);
		txtX.setText(" X");
		txtX.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtX.setColumns(10);
		txtX.setBackground(Color.WHITE);
		txtX.setBounds(672, 295, 42, 42);
		frame.getContentPane().add(txtX);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBackground(Color.WHITE);
		textField_50.setBounds(714, 295, 42, 42);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBackground(Color.WHITE);
		textField_51.setBounds(504, 85, 42, 42);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBackground(Color.WHITE);
		textField_52.setBounds(504, 168, 42, 42);
		frame.getContentPane().add(textField_52);
		
		txtI_1 = new JTextField();
		txtI_1.setEnabled(false);
		txtI_1.setText(" I");
		txtI_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_1.setColumns(10);
		txtI_1.setBackground(Color.WHITE);
		txtI_1.setBounds(504, 210, 42, 42);
		frame.getContentPane().add(txtI_1);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBackground(Color.WHITE);
		textField_54.setBounds(504, 253, 42, 42);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBackground(Color.WHITE);
		textField_55.setBounds(547, 210, 42, 42);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBackground(Color.WHITE);
		textField_56.setBounds(461, 210, 42, 42);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBackground(Color.WHITE);
		textField_57.setBounds(419, 210, 42, 42);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBackground(Color.WHITE);
		textField_58.setBounds(377, 85, 42, 42);
		frame.getContentPane().add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBackground(Color.WHITE);
		textField_59.setBounds(377, 44, 42, 42);
		frame.getContentPane().add(textField_59);
		
		button = new JButton("FINISH");
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(294, 689, 179, 42);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("GIVE UP!");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(636, 689, 167, 42);
		frame.getContentPane().add(button_1);
		
		label = new JLabel("1");
		label.setBounds(139, 58, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(391, 15, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(510, 58, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4");
		label_3.setBounds(108, 210, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5");
		label_4.setBounds(404, 224, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("6");
		label_5.setBounds(193, 349, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("7");
		label_6.setBounds(344, 279, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("8");
		label_7.setBounds(567, 296, 15, 16);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("9");
		label_8.setBounds(230, 435, 15, 16);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("10");
		label_9.setBounds(271, 562, 15, 16);
		frame.getContentPane().add(label_9);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(125, 253, 42, 42);
		frame.getContentPane().add(textField);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(125, 295, 42, 42);
		frame.getContentPane().add(textField_3);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_165035.jpg"));
		lblNewLabel.setBounds(801, 15, 382, 307);
		frame.getContentPane().add(lblNewLabel);
		
		lblL = new JLabel("l");
		lblL.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_165047.jpg"));
		lblL.setBounds(801, 349, 496, 220);
		frame.getContentPane().add(lblL);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
	}
}
