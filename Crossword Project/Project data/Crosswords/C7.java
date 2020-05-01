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

public class C7 {

	private JFrame frame;
	private JTextField txtF;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtS;
	private JTextField textField_5;
	private JTextField txtI_2;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtD;
	private JTextField textField_13;
	private JTextField txtC_1;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField txtS_1;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField txtM_1;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField txtY_1;
	private JTextField txtI;
	private JTextField textField_28;
	private JTextField txtC;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField txtO_1;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField txtM;
	private JTextField textField_38;
	private JTextField txtA_2;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField txtR;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField txtI_1;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField txtO;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField txtA;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField txtA_1;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField txtY;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField txtN;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField txtR_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_18;
	private JTextField textField_21;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_33;
	private JTextField textField_37;
	private JTextField textField_39;
	private JTextField textField_43;
	private JTextField textField_46;
	private JTextField textField_51;
	private JTextField textField_58;
	private JTextField textField_61;
	private JTextField textField_66;
	private JTextField textField_70;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C7 window = new C7();
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
	public C7() {
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
		
		txtF = new JTextField();
		txtF.setBounds(220, 106, 42, 42);
		txtF.setEnabled(false);
		txtF.setText(" F");
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setColumns(10);
		txtF.setBackground(Color.WHITE);
		frame.getContentPane().add(txtF);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 106, 42, 42);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 106, 42, 42);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(347, 106, 42, 42);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_3);
		
		txtS = new JTextField();
		txtS.setBounds(305, 66, 42, 42);
		txtS.setEnabled(false);
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBackground(Color.WHITE);
		frame.getContentPane().add(txtS);
		
		textField_5 = new JTextField();
		textField_5.setBounds(388, 106, 42, 42);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_5);
		
		txtI_2 = new JTextField();
		txtI_2.setBounds(430, 106, 42, 42);
		txtI_2.setEnabled(false);
		txtI_2.setText(" I");
		txtI_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_2.setColumns(10);
		txtI_2.setBackground(Color.WHITE);
		frame.getContentPane().add(txtI_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(470, 106, 42, 42);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(510, 106, 42, 42);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(305, 147, 42, 42);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(305, 189, 42, 42);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(305, 232, 42, 42);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_11);
		
		txtD = new JTextField();
		txtD.setBounds(305, 273, 42, 42);
		txtD.setEnabled(false);
		txtD.setText(" D");
		txtD.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtD.setColumns(10);
		txtD.setBackground(Color.WHITE);
		frame.getContentPane().add(txtD);
		
		textField_13 = new JTextField();
		textField_13.setBounds(347, 232, 42, 42);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_13);
		
		txtC_1 = new JTextField();
		txtC_1.setBounds(388, 232, 42, 42);
		txtC_1.setEnabled(false);
		txtC_1.setText(" C");
		txtC_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC_1.setColumns(10);
		txtC_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtC_1);
		
		textField_15 = new JTextField();
		textField_15.setBounds(430, 232, 42, 42);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(470, 232, 42, 42);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBounds(510, 232, 42, 42);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_17);
		
		txtS_1 = new JTextField();
		txtS_1.setBounds(553, 232, 42, 42);
		txtS_1.setEnabled(false);
		txtS_1.setText(" S");
		txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS_1.setColumns(10);
		txtS_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtS_1);
		
		textField_19 = new JTextField();
		textField_19.setBounds(388, 273, 42, 42);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setBounds(388, 316, 42, 42);
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_20);
		
		txtM_1 = new JTextField();
		txtM_1.setBounds(388, 397, 42, 42);
		txtM_1.setEnabled(false);
		txtM_1.setText(" M");
		txtM_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM_1.setColumns(10);
		txtM_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtM_1);
		
		textField_22 = new JTextField();
		textField_22.setBounds(388, 355, 42, 42);
		textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setBounds(388, 440, 42, 42);
		textField_23.setColumns(10);
		textField_23.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setBounds(388, 480, 42, 42);
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setBounds(388, 521, 42, 42);
		textField_25.setColumns(10);
		textField_25.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_25);
		
		txtY_1 = new JTextField();
		txtY_1.setBounds(388, 563, 42, 42);
		txtY_1.setEnabled(false);
		txtY_1.setText(" Y");
		txtY_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtY_1.setColumns(10);
		txtY_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtY_1);
		
		txtI = new JTextField();
		txtI.setBounds(430, 480, 42, 42);
		txtI.setEnabled(false);
		txtI.setText(" I");
		txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI.setColumns(10);
		txtI.setBackground(Color.WHITE);
		frame.getContentPane().add(txtI);
		
		textField_28 = new JTextField();
		textField_28.setBounds(347, 480, 42, 42);
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_28);
		
		txtC = new JTextField();
		txtC.setBounds(305, 480, 42, 42);
		txtC.setEnabled(false);
		txtC.setText(" C");
		txtC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		frame.getContentPane().add(txtC);
		
		textField_30 = new JTextField();
		textField_30.setBounds(470, 480, 42, 42);
		textField_30.setColumns(10);
		textField_30.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setBounds(510, 480, 42, 42);
		textField_31.setColumns(10);
		textField_31.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setBounds(553, 480, 42, 42);
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_32);
		
		txtO_1 = new JTextField();
		txtO_1.setBounds(510, 440, 42, 42);
		txtO_1.setEnabled(false);
		txtO_1.setText(" O");
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setColumns(10);
		txtO_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtO_1);
		
		textField_34 = new JTextField();
		textField_34.setBounds(510, 398, 42, 42);
		textField_34.setColumns(10);
		textField_34.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setBounds(510, 356, 42, 42);
		textField_35.setColumns(10);
		textField_35.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setBounds(510, 316, 42, 42);
		textField_36.setColumns(10);
		textField_36.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_36);
		
		txtM = new JTextField();
		txtM.setBounds(470, 316, 42, 42);
		txtM.setEnabled(false);
		txtM.setText(" M");
		txtM.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		frame.getContentPane().add(txtM);
		
		textField_38 = new JTextField();
		textField_38.setBounds(510, 521, 42, 42);
		textField_38.setColumns(10);
		textField_38.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_38);
		
		txtA_2 = new JTextField();
		txtA_2.setBounds(510, 563, 42, 42);
		txtA_2.setEnabled(false);
		txtA_2.setText(" A");
		txtA_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_2.setColumns(10);
		txtA_2.setBackground(Color.WHITE);
		frame.getContentPane().add(txtA_2);
		
		textField_40 = new JTextField();
		textField_40.setBounds(553, 316, 42, 42);
		textField_40.setColumns(10);
		textField_40.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setBounds(596, 316, 42, 42);
		textField_41.setColumns(10);
		textField_41.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setBounds(639, 316, 42, 42);
		textField_42.setColumns(10);
		textField_42.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_42);
		
		txtR = new JTextField();
		txtR.setBounds(681, 316, 42, 42);
		txtR.setEnabled(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		frame.getContentPane().add(txtR);
		
		textField_44 = new JTextField();
		textField_44.setBounds(681, 274, 42, 42);
		textField_44.setColumns(10);
		textField_44.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setBounds(681, 232, 42, 42);
		textField_45.setColumns(10);
		textField_45.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_45);
		
		txtI_1 = new JTextField();
		txtI_1.setBounds(681, 189, 42, 42);
		txtI_1.setEnabled(false);
		txtI_1.setText(" I");
		txtI_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtI_1.setColumns(10);
		txtI_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtI_1);
		
		textField_47 = new JTextField();
		textField_47.setBounds(681, 147, 42, 42);
		textField_47.setColumns(10);
		textField_47.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setBounds(681, 356, 42, 42);
		textField_48.setColumns(10);
		textField_48.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setBounds(681, 398, 42, 42);
		textField_49.setColumns(10);
		textField_49.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setBounds(681, 440, 42, 42);
		textField_50.setColumns(10);
		textField_50.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_50);
		
		txtO = new JTextField();
		txtO.setBounds(681, 480, 42, 42);
		txtO.setEnabled(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		frame.getContentPane().add(txtO);
		
		textField_52 = new JTextField();
		textField_52.setBounds(681, 521, 42, 42);
		textField_52.setColumns(10);
		textField_52.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setBounds(305, 440, 42, 42);
		textField_53.setColumns(10);
		textField_53.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setBounds(305, 398, 42, 42);
		textField_54.setColumns(10);
		textField_54.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setBounds(305, 356, 42, 42);
		textField_55.setColumns(10);
		textField_55.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setBounds(262, 356, 42, 42);
		textField_56.setColumns(10);
		textField_56.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setBounds(220, 356, 42, 42);
		textField_57.setColumns(10);
		textField_57.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_57);
		
		txtA = new JTextField();
		txtA.setBounds(177, 356, 42, 42);
		txtA.setEnabled(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBackground(Color.WHITE);
		frame.getContentPane().add(txtA);
		
		textField_59 = new JTextField();
		textField_59.setBounds(177, 316, 42, 42);
		textField_59.setColumns(10);
		textField_59.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setBounds(177, 273, 42, 42);
		textField_60.setColumns(10);
		textField_60.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_60);
		
		txtA_1 = new JTextField();
		txtA_1.setBounds(177, 232, 42, 42);
		txtA_1.setEnabled(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtA_1);
		
		textField_62 = new JTextField();
		textField_62.setBounds(177, 398, 42, 42);
		textField_62.setColumns(10);
		textField_62.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setBounds(177, 440, 42, 42);
		textField_63.setColumns(10);
		textField_63.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setBounds(305, 521, 42, 42);
		textField_64.setColumns(10);
		textField_64.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setBounds(305, 563, 42, 42);
		textField_65.setColumns(10);
		textField_65.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_65);
		
		txtY = new JTextField();
		txtY.setBounds(305, 603, 42, 42);
		txtY.setEnabled(false);
		txtY.setText(" Y");
		txtY.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtY.setColumns(10);
		txtY.setBackground(Color.WHITE);
		frame.getContentPane().add(txtY);
		
		textField_67 = new JTextField();
		textField_67.setBounds(262, 603, 42, 42);
		textField_67.setColumns(10);
		textField_67.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setBounds(220, 603, 42, 42);
		textField_68.setColumns(10);
		textField_68.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setBounds(177, 603, 42, 42);
		textField_69.setColumns(10);
		textField_69.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_69);
		
		txtN = new JTextField();
		txtN.setBounds(136, 603, 42, 42);
		txtN.setEnabled(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBackground(Color.WHITE);
		frame.getContentPane().add(txtN);
		
		textField_71 = new JTextField();
		textField_71.setBounds(94, 603, 42, 42);
		textField_71.setColumns(10);
		textField_71.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setBounds(51, 603, 42, 42);
		textField_72.setColumns(10);
		textField_72.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setBounds(51, 563, 42, 42);
		textField_73.setColumns(10);
		textField_73.setBackground(Color.WHITE);
		frame.getContentPane().add(textField_73);
		
		txtR_1 = new JTextField();
		txtR_1.setBounds(51, 521, 42, 42);
		txtR_1.setEnabled(false);
		txtR_1.setText(" R");
		txtR_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR_1.setColumns(10);
		txtR_1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtR_1);
		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.setBounds(250, 743, 167, 42);
		btnFinish.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(btnFinish);
		
		JButton button = new JButton("GIVE UP!");
		button.setBounds(510, 743, 167, 42);
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(button);
		
		label = new JLabel("1");
		label.setBounds(305, 47, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(201, 106, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("5");
		label_2.setBounds(402, 203, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("6");
		label_3.setBounds(688, 132, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("3");
		label_4.setBounds(158, 232, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("7");
		label_5.setBounds(158, 370, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("8");
		label_6.setBounds(452, 329, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("9");
		label_7.setBounds(289, 493, 15, 16);
		frame.getContentPane().add(label_7);
		
		JLabel label_9 = new JLabel("11");
		label_9.setBounds(35, 617, 15, 16);
		frame.getContentPane().add(label_9);
		
		JFrame frame_1 = new JFrame();
		frame_1.setBounds(-10009, -10038, 1174, 770);
		frame_1.getContentPane().setLayout(null);
		frame_1.getContentPane().setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 128, 42, 42);
		frame_1.getContentPane().add(textField);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(139, 128, 42, 42);
		frame_1.getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(181, 128, 42, 42);
		frame_1.getContentPane().add(textField_6);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(222, 88, 42, 42);
		frame_1.getContentPane().add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(264, 128, 42, 42);
		frame_1.getContentPane().add(textField_14);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(307, 128, 42, 42);
		frame_1.getContentPane().add(textField_18);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(139, 171, 42, 42);
		frame_1.getContentPane().add(textField_21);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(139, 213, 42, 42);
		frame_1.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(139, 256, 42, 42);
		frame_1.getContentPane().add(textField_27);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(139, 297, 42, 42);
		frame_1.getContentPane().add(textField_29);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(222, 423, 42, 42);
		frame_1.getContentPane().add(textField_33);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(222, 128, 42, 42);
		frame_1.getContentPane().add(textField_37);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(222, 171, 42, 42);
		frame_1.getContentPane().add(textField_39);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(222, 213, 42, 42);
		frame_1.getContentPane().add(textField_43);
		
		textField_46 = new JTextField();
		textField_46.setText(" F");
		textField_46.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_46.setEnabled(false);
		textField_46.setColumns(10);
		textField_46.setBounds(222, 256, 42, 42);
		frame_1.getContentPane().add(textField_46);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(222, 297, 42, 42);
		frame_1.getContentPane().add(textField_51);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(222, 340, 42, 42);
		frame_1.getContentPane().add(textField_58);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(222, 380, 42, 42);
		frame_1.getContentPane().add(textField_61);
		
		textField_66 = new JTextField();
		textField_66.setText(" R");
		textField_66.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_66.setEnabled(false);
		textField_66.setColumns(10);
		textField_66.setBounds(264, 256, 42, 42);
		frame_1.getContentPane().add(textField_66);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(307, 213, 42, 42);
		frame_1.getContentPane().add(textField_70);
		
		textField_74 = new JTextField();
		textField_74.setText(" I");
		textField_74.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_74.setEnabled(false);
		textField_74.setColumns(10);
		textField_74.setBounds(347, 256, 42, 42);
		frame_1.getContentPane().add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setText(" T");
		textField_75.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_75.setEnabled(false);
		textField_75.setColumns(10);
		textField_75.setBounds(389, 256, 42, 42);
		frame_1.getContentPane().add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setText(" S");
		textField_76.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_76.setEnabled(false);
		textField_76.setColumns(10);
		textField_76.setBounds(429, 256, 42, 42);
		frame_1.getContentPane().add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(307, 464, 42, 42);
		frame_1.getContentPane().add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setText(" U");
		textField_78.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		textField_78.setEnabled(false);
		textField_78.setColumns(10);
		textField_78.setBounds(307, 256, 42, 42);
		frame_1.getContentPane().add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(307, 297, 42, 42);
		frame_1.getContentPane().add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(307, 340, 42, 42);
		frame_1.getContentPane().add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(307, 380, 42, 42);
		frame_1.getContentPane().add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(307, 423, 42, 42);
		frame_1.getContentPane().add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(429, 213, 42, 42);
		frame_1.getContentPane().add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(429, 128, 42, 42);
		frame_1.getContentPane().add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(429, 88, 42, 42);
		frame_1.getContentPane().add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(429, 46, 42, 42);
		frame_1.getContentPane().add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(429, 171, 42, 42);
		frame_1.getContentPane().add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(470, 171, 42, 42);
		frame_1.getContentPane().add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(513, 171, 42, 42);
		frame_1.getContentPane().add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(555, 171, 42, 42);
		frame_1.getContentPane().add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(597, 171, 42, 42);
		frame_1.getContentPane().add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(638, 171, 42, 42);
		frame_1.getContentPane().add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(513, 213, 42, 42);
		frame_1.getContentPane().add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(513, 256, 42, 42);
		frame_1.getContentPane().add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(513, 297, 42, 42);
		frame_1.getContentPane().add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(513, 340, 42, 42);
		frame_1.getContentPane().add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBounds(513, 380, 42, 42);
		frame_1.getContentPane().add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(513, 423, 42, 42);
		frame_1.getContentPane().add(textField_98);
		
		textField_99 = new JTextField();
		textField_99.setColumns(10);
		textField_99.setBounds(513, 464, 42, 42);
		frame_1.getContentPane().add(textField_99);
		
		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(513, 506, 42, 42);
		frame_1.getContentPane().add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(513, 548, 42, 42);
		frame_1.getContentPane().add(textField_101);
		
		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(513, 588, 42, 42);
		frame_1.getContentPane().add(textField_102);
		
		textField_103 = new JTextField();
		textField_103.setColumns(10);
		textField_103.setBounds(555, 588, 42, 42);
		frame_1.getContentPane().add(textField_103);
		
		textField_104 = new JTextField();
		textField_104.setColumns(10);
		textField_104.setBounds(597, 588, 42, 42);
		frame_1.getContentPane().add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setColumns(10);
		textField_105.setBounds(638, 588, 42, 42);
		frame_1.getContentPane().add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setColumns(10);
		textField_106.setBounds(555, 464, 42, 42);
		frame_1.getContentPane().add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setColumns(10);
		textField_107.setBounds(597, 464, 42, 42);
		frame_1.getContentPane().add(textField_107);
		
		textField_108 = new JTextField();
		textField_108.setColumns(10);
		textField_108.setBounds(470, 464, 42, 42);
		frame_1.getContentPane().add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setColumns(10);
		textField_109.setBounds(429, 464, 42, 42);
		frame_1.getContentPane().add(textField_109);
		
		textField_110 = new JTextField();
		textField_110.setColumns(10);
		textField_110.setBounds(389, 464, 42, 42);
		frame_1.getContentPane().add(textField_110);
		
		textField_111 = new JTextField();
		textField_111.setColumns(10);
		textField_111.setBounds(470, 588, 42, 42);
		frame_1.getContentPane().add(textField_111);
		
		textField_112 = new JTextField();
		textField_112.setColumns(10);
		textField_112.setBounds(429, 588, 42, 42);
		frame_1.getContentPane().add(textField_112);
		
		textField_113 = new JTextField();
		textField_113.setColumns(10);
		textField_113.setBounds(389, 588, 42, 42);
		frame_1.getContentPane().add(textField_113);
		
		textField_114 = new JTextField();
		textField_114.setColumns(10);
		textField_114.setBounds(347, 588, 42, 42);
		frame_1.getContentPane().add(textField_114);
		
		textField_115 = new JTextField();
		textField_115.setColumns(10);
		textField_115.setBounds(307, 588, 42, 42);
		frame_1.getContentPane().add(textField_115);
		
		textField_116 = new JTextField();
		textField_116.setColumns(10);
		textField_116.setBounds(264, 588, 42, 42);
		frame_1.getContentPane().add(textField_116);
		
		textField_117 = new JTextField();
		textField_117.setColumns(10);
		textField_117.setBounds(264, 548, 42, 42);
		frame_1.getContentPane().add(textField_117);
		
		textField_118 = new JTextField();
		textField_118.setColumns(10);
		textField_118.setBounds(264, 630, 42, 42);
		frame_1.getContentPane().add(textField_118);
		
		textField_119 = new JTextField();
		textField_119.setColumns(10);
		textField_119.setBounds(264, 506, 42, 42);
		frame_1.getContentPane().add(textField_119);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(frame_1);
		
		JLabel label_8 = new JLabel("4");
		label_8.setBounds(276, 245, 15, 16);
		frame.getContentPane().add(label_8);
		
		JLabel label_10 = new JLabel("10");
		label_10.setBounds(35, 518, 15, 16);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("12");
		label_11.setBounds(305, 342, 15, 16);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("13");
		label_12.setBounds(520, 299, 15, 16);
		frame.getContentPane().add(label_12);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(735, 13, 590, 339);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_154450.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(735, 397, 609, 402);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Manasi Malkar\\Documents\\IMG_20180812_154519.jpg"));
		frame.getContentPane().add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1542, 1033);
		frame.getContentPane().add(panel);
	}
}
