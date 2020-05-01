package om.medium;


	

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.Timer;

import com.easy.School;
import com.myproject.UI.Level;

import com.myproject.UI.Login1;

import crossService.CrossService;
import crossbean.CrossBean;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
	import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

	public class Fashion  {

		private JFrame frame;
		private JTextField txtF;
		private JTextField txtA;
		private JTextField txtS;
		private JTextField txtH;
		private JTextField txtI;
		private JTextField txtO;
		private JTextField txtN;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField txtR;
		private JTextField textField_12;
		private JTextField textField_13;
		private JTextField textField_14;
		private JTextField textField_15;
		private JTextField txtU;
		private JTextField textField_17;
		private JTextField textField_18;
		private JTextField textField_19;
		private JTextField txtS_3;
		private JTextField textField_21;
		private JTextField textField_22;
		private JTextField textField_23;
		private JTextField txtA_1;
		private JTextField txtN_1;
		private JTextField textField_26;
		private JTextField textField_27;
		private JTextField txtJ;
		private JTextField textField_29;
		private JTextField textField_30;
		private JTextField txtT_1;
		private JTextField textField_32;
		private JTextField textField_33;
		private JTextField textField_34;
		private JTextField txtS_1;
		private JTextField textField_36;
		private JTextField textField_37;
		private JTextField textField_38;
		private JTextField textField_39;
		private JTextField txtL;
		private JTextField textField_41;
		private JTextField textField_42;
		private JTextField txtT;
		private JTextField textField_44;
		private JTextField txtO_1;
		private JTextField textField_46;
		private JTextField textField_47;
		private JTextField txtS_2;
		private JTextField textField_49;
		private JTextField txtG;
		private JTextField textField_51;
		private JTextField textField_52;
		private JTextField textField_53;
		private JTextField txtS_4;
		private JTextField textField_55;
		private JTextField txtE;
		private JTextField textField_57;
		private JTextField textField_58;
		private JTextField textField_59;
		private JTextField txtB;
		private JTextField txtW;
		private JTextField textField_62;
		private JTextField textField_63;
		private JTextField txtE_1;
		private JTextField textField_65;
		private JTextField textField_66;
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
		private JLabel label_10;
		private JLabel label_11;
		private JLabel label_12;
		private JLabel lblNewLabel_1;
		int wrong=0;
		 double score=480;
		 int j=0;
	
		Thread ProgressUpdate=new Thread()
		{
public void run()
{
int time=480;//1 min=60 seconds


for(int i=0;i<=time;i++)
    {
    try {
        Thread.sleep(1000);//Thread is made to sleep for 1 sec
        
        } catch (Exception ex) {}
    progressBar.setValue(100*i/480);
    score=score-0.2;
	
    if(progressBar.getValue()==100)
    {
    	JOptionPane.showMessageDialog(null,"....Times UP! ..."+ "Your Score is "+score);
    	frame.dispose();
    }
       //i sec out of 60 sec elapsed.
        // to convert to range of 0 to 100, 100*i/60
    }
}
	};
		
		private JProgressBar progressBar;
		private JLabel lblTimesRunning;
		private JLabel lblHint;
		private JLabel label_13;
		private JLabel label_14;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			CrossBean cb=new CrossBean();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						Fashion window = new Fashion();
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
		public Fashion() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(0, 139, 139));
			frame.getContentPane().setLayout(null);
			frame.setResizable(false);
			
			txtF = new JTextField();
			txtF.setEditable(false);
			txtF.setText(" F");
			txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtF.setColumns(10);
			txtF.setBackground(Color.WHITE);
			txtF.setBounds(336, 68, 42, 42);
			frame.getContentPane().add(txtF);
			
			txtA = new JTextField();
			txtA.setEditable(false);
			txtA.setText(" A");
			txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtA.setColumns(10);
			txtA.setBackground(Color.WHITE);
			txtA.setBounds(378, 68, 42, 42);
			frame.getContentPane().add(txtA);
			
			txtS = new JTextField();
			txtS.setEditable(false);
			txtS.setText(" S");
			txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtS.setColumns(10);
			txtS.setBackground(Color.WHITE);
			txtS.setBounds(420, 68, 42, 42);
			frame.getContentPane().add(txtS);
			
			txtH = new JTextField();
			txtH.setEditable(false);
			txtH.setText(" H");
			txtH.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtH.setColumns(10);
			txtH.setBackground(Color.WHITE);
			txtH.setBounds(462, 68, 42, 42);
			frame.getContentPane().add(txtH);
			
			txtI = new JTextField();
			txtI.setEditable(false);
			txtI.setText(" I");
			txtI.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtI.setColumns(10);
			txtI.setBackground(Color.WHITE);
			txtI.setBounds(504, 68, 42, 42);
			frame.getContentPane().add(txtI);
			
			txtO = new JTextField();
			txtO.setEditable(false);
			txtO.setText(" O");
			txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtO.setColumns(10);
			txtO.setBackground(Color.WHITE);
			txtO.setBounds(545, 68, 42, 42);
			frame.getContentPane().add(txtO);
			
			txtN = new JTextField();
			txtN.setEditable(false);
			txtN.setText(" N");
			txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtN.setColumns(10);
			txtN.setBackground(Color.WHITE);
			txtN.setBounds(586, 68, 42, 42);
			frame.getContentPane().add(txtN);
			
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_7.setDocument(new JTextFieldCharLimits(1));
			textField_7.setColumns(10);
			textField_7.setBackground(Color.WHITE);
			textField_7.setBounds(545, 26, 42, 42);
			frame.getContentPane().add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_8.setDocument(new JTextFieldCharLimits(1));
			textField_8.setColumns(10);
			textField_8.setBackground(Color.WHITE);
			textField_8.setBounds(545, 109, 42, 42);
			frame.getContentPane().add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_9.setDocument(new JTextFieldCharLimits(1));
			textField_9.setColumns(10);
			textField_9.setBackground(Color.WHITE);
			textField_9.setBounds(420, 109, 42, 42);
			frame.getContentPane().add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_10.setDocument(new JTextFieldCharLimits(1));
			textField_10.setColumns(10);
			textField_10.setBackground(Color.WHITE);
			textField_10.setBounds(420, 151, 42, 42);
			frame.getContentPane().add(textField_10);
			
			txtR = new JTextField();
			txtR.setEditable(false);
			txtR.setText(" R");
			txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtR.setColumns(10);
			txtR.setBackground(Color.WHITE);
			txtR.setBounds(420, 193, 42, 42);
			frame.getContentPane().add(txtR);
			
			textField_12 = new JTextField();
			textField_12.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_12.setDocument(new JTextFieldCharLimits(1));
			textField_12.setColumns(10);
			textField_12.setBackground(Color.WHITE);
			textField_12.setBounds(420, 235, 42, 42);
			frame.getContentPane().add(textField_12);
			
			textField_13 = new JTextField();
			textField_13.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_13.setDocument(new JTextFieldCharLimits(1));
			textField_13.setColumns(10);
			textField_13.setBackground(Color.WHITE);
			textField_13.setBounds(420, 276, 42, 42);
			frame.getContentPane().add(textField_13);
			
			textField_14 = new JTextField();
			textField_14.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_14.setDocument(new JTextFieldCharLimits(1));
			textField_14.setColumns(10);
			textField_14.setBackground(Color.WHITE);
			textField_14.setBounds(378, 193, 42, 42);
			frame.getContentPane().add(textField_14);
			
			textField_15 = new JTextField();
			textField_15.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_15.setDocument(new JTextFieldCharLimits(1));
			textField_15.setColumns(10);
			textField_15.setBackground(Color.WHITE);
			textField_15.setBounds(462, 193, 42, 42);
			frame.getContentPane().add(textField_15);
			
			txtU = new JTextField();
			txtU.setEditable(false);
			txtU.setText(" U");
			txtU.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtU.setColumns(10);
			txtU.setBackground(Color.WHITE);
			txtU.setBounds(504, 193, 42, 42);
			frame.getContentPane().add(txtU);
			
			textField_17 = new JTextField();
			textField_17.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_17.setDocument(new JTextFieldCharLimits(1));
			textField_17.setColumns(10);
			textField_17.setBackground(Color.WHITE);
			textField_17.setBounds(545, 193, 42, 42);
			frame.getContentPane().add(textField_17);
			
			textField_18 = new JTextField();
			textField_18.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_18.setDocument(new JTextFieldCharLimits(1));
			textField_18.setColumns(10);
			textField_18.setBackground(Color.WHITE);
			textField_18.setBounds(586, 193, 42, 42);
			frame.getContentPane().add(textField_18);
			
			textField_19 = new JTextField();
			textField_19.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_19.setDocument(new JTextFieldCharLimits(1));
			textField_19.setColumns(10);
			textField_19.setBackground(Color.WHITE);
			textField_19.setBounds(628, 193, 42, 42);
			frame.getContentPane().add(textField_19);
			
			txtS_3 = new JTextField();
			txtS_3.setEditable(false);
			txtS_3.setText(" S");
			txtS_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtS_3.setColumns(10);
			txtS_3.setBackground(Color.WHITE);
			txtS_3.setBounds(670, 193, 42, 42);
			frame.getContentPane().add(txtS_3);
			
			textField_21 = new JTextField();
			textField_21.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_21.setDocument(new JTextFieldCharLimits(1));
			textField_21.setColumns(10);
			textField_21.setBackground(Color.WHITE);
			textField_21.setBounds(504, 151, 42, 42);
			frame.getContentPane().add(textField_21);
			
			textField_22 = new JTextField();
			textField_22.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_22.setDocument(new JTextFieldCharLimits(1));
			textField_22.setColumns(10);
			textField_22.setBackground(Color.WHITE);
			textField_22.setBounds(504, 235, 42, 42);
			frame.getContentPane().add(textField_22);
			
			textField_23 = new JTextField();
			textField_23.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_23.setDocument(new JTextFieldCharLimits(1));
			textField_23.setColumns(10);
			textField_23.setBackground(Color.WHITE);
			textField_23.setBounds(504, 276, 42, 42);
			frame.getContentPane().add(textField_23);
			
			txtA_1 = new JTextField();
			txtA_1.setEditable(false);
			txtA_1.setText(" A");
			txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtA_1.setColumns(10);
			txtA_1.setBackground(Color.WHITE);
			txtA_1.setBounds(504, 317, 42, 42);
			frame.getContentPane().add(txtA_1);
			
			txtN_1 = new JTextField();
			txtN_1.setEditable(false);
			txtN_1.setText(" N");
			txtN_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtN_1.setColumns(10);
			txtN_1.setBackground(Color.WHITE);
			txtN_1.setBounds(378, 276, 42, 42);
			frame.getContentPane().add(txtN_1);
			
			textField_26 = new JTextField();
			textField_26.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_26.setDocument(new JTextFieldCharLimits(1));
			textField_26.setColumns(10);
			textField_26.setBackground(Color.WHITE);
			textField_26.setBounds(336, 276, 42, 42);
			frame.getContentPane().add(textField_26);
			
			textField_27 = new JTextField();
			textField_27.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_27.setDocument(new JTextFieldCharLimits(1));
			textField_27.setColumns(10);
			textField_27.setBackground(Color.WHITE);
			textField_27.setBounds(294, 276, 42, 42);
			frame.getContentPane().add(textField_27);
			
			txtJ = new JTextField();
			txtJ.setEditable(false);
			txtJ.setText(" J");
			txtJ.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtJ.setColumns(10);
			txtJ.setBackground(Color.WHITE);
			txtJ.setBounds(252, 276, 42, 42);
			frame.getContentPane().add(txtJ);
			
			textField_29 = new JTextField();
			textField_29.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_29.setDocument(new JTextFieldCharLimits(1));
			textField_29.setColumns(10);
			textField_29.setBackground(Color.WHITE);
			textField_29.setBounds(294, 235, 42, 42);
			frame.getContentPane().add(textField_29);
			
			textField_30 = new JTextField();
			textField_30.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_30.setDocument(new JTextFieldCharLimits(1));
			textField_30.setColumns(10);
			textField_30.setBackground(Color.WHITE);
			textField_30.setBounds(294, 317, 42, 42);
			frame.getContentPane().add(textField_30);
			
			txtT_1 = new JTextField();
			txtT_1.setEditable(false);
			txtT_1.setText(" T");
			txtT_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtT_1.setColumns(10);
			txtT_1.setBackground(Color.WHITE);
			txtT_1.setBounds(294, 359, 42, 42);
			frame.getContentPane().add(txtT_1);
			
			textField_32 = new JTextField();
			textField_32.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_32.setDocument(new JTextFieldCharLimits(1));
			textField_32.setColumns(10);
			textField_32.setBackground(Color.WHITE);
			textField_32.setBounds(336, 359, 42, 42);
			frame.getContentPane().add(textField_32);
			
			textField_33 = new JTextField();
			textField_33.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_33.setDocument(new JTextFieldCharLimits(1));
			textField_33.setColumns(10);
			textField_33.setBackground(Color.WHITE);
			textField_33.setBounds(252, 359, 42, 42);
			frame.getContentPane().add(textField_33);
			
			textField_34 = new JTextField();
			textField_34.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_34.setDocument(new JTextFieldCharLimits(1));
			textField_34.setColumns(10);
			textField_34.setBackground(Color.WHITE);
			textField_34.setBounds(210, 359, 42, 42);
			frame.getContentPane().add(textField_34);
			
			txtS_1 = new JTextField();
			txtS_1.setEditable(false);
			txtS_1.setText(" S");
			txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtS_1.setColumns(10);
			txtS_1.setBackground(Color.WHITE);
			txtS_1.setBounds(168, 359, 42, 42);
			frame.getContentPane().add(txtS_1);
			
			textField_36 = new JTextField();
			textField_36.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_36.setDocument(new JTextFieldCharLimits(1));
			textField_36.setColumns(10);
			textField_36.setBackground(Color.WHITE);
			textField_36.setBounds(168, 317, 42, 42);
			frame.getContentPane().add(textField_36);
			
			textField_37 = new JTextField();
			textField_37.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_37.setDocument(new JTextFieldCharLimits(1));
			textField_37.setColumns(10);
			textField_37.setBackground(Color.WHITE);
			textField_37.setBounds(168, 276, 42, 42);
			frame.getContentPane().add(textField_37);
			
			textField_38 = new JTextField();
			textField_38.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_38.setDocument(new JTextFieldCharLimits(1));
			textField_38.setColumns(10);
			textField_38.setBackground(Color.WHITE);
			textField_38.setBounds(168, 235, 42, 42);
			frame.getContentPane().add(textField_38);
			
			textField_39 = new JTextField();
			textField_39.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_39.setDocument(new JTextFieldCharLimits(1));
			textField_39.setColumns(10);
			textField_39.setBackground(Color.WHITE);
			textField_39.setBounds(168, 193, 42, 42);
			frame.getContentPane().add(textField_39);
			
			txtL = new JTextField();
			txtL.setForeground(new Color(0, 0, 0));
			txtL.setEditable(false);
			txtL.setText(" L");
			txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtL.setColumns(10);
			txtL.setBackground(Color.WHITE);
			txtL.setBounds(168, 151, 42, 42);
			frame.getContentPane().add(txtL);
			
			textField_41 = new JTextField();
			textField_41.setDocument(new JTextFieldCharLimits(1));
			textField_41.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_41.setColumns(10);
			textField_41.setBackground(Color.WHITE);
			textField_41.setBounds(168, 109, 42, 42);
			frame.getContentPane().add(textField_41);
			
			textField_42 = new JTextField();
			textField_42.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_42.setDocument(new JTextFieldCharLimits(1));
			textField_42.setColumns(10);
			textField_42.setBackground(Color.WHITE);
			textField_42.setBounds(127, 276, 42, 42);
			frame.getContentPane().add(textField_42);
			
			txtT = new JTextField();
			txtT.setEditable(false);
			txtT.setText(" T");
			txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtT.setColumns(10);
			txtT.setBackground(Color.WHITE);
			txtT.setBounds(86, 276, 42, 42);
			frame.getContentPane().add(txtT);
			
			textField_44 = new JTextField();
			textField_44.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_44.setDocument(new JTextFieldCharLimits(1));
			textField_44.setColumns(10);
			textField_44.setBackground(Color.WHITE);
			textField_44.setBounds(336, 401, 42, 42);
			frame.getContentPane().add(textField_44);
			
			txtO_1 = new JTextField();
			txtO_1.setEditable(false);
			txtO_1.setText(" O");
			txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtO_1.setColumns(10);
			txtO_1.setBackground(Color.WHITE);
			txtO_1.setBounds(336, 443, 42, 42);
			frame.getContentPane().add(txtO_1);
			
			textField_46 = new JTextField();
			textField_46.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_46.setDocument(new JTextFieldCharLimits(1));
			textField_46.setColumns(10);
			textField_46.setBackground(Color.WHITE);
			textField_46.setBounds(336, 485, 42, 42);
			frame.getContentPane().add(textField_46);
			
			textField_47 = new JTextField();
			textField_47.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_47.setDocument(new JTextFieldCharLimits(1));
			textField_47.setColumns(10);
			textField_47.setBackground(Color.WHITE);
			textField_47.setBounds(336, 526, 42, 42);
			frame.getContentPane().add(textField_47);
			
			txtS_2 = new JTextField();
			txtS_2.setEditable(false);
			txtS_2.setText(" S");
			txtS_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtS_2.setColumns(10);
			txtS_2.setBackground(Color.WHITE);
			txtS_2.setBounds(336, 566, 42, 42);
			frame.getContentPane().add(txtS_2);
			
			textField_49 = new JTextField();
			textField_49.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_49.setDocument(new JTextFieldCharLimits(1));
			textField_49.setColumns(10);
			textField_49.setBackground(Color.WHITE);
			textField_49.setBounds(670, 359, 42, 42);
			frame.getContentPane().add(textField_49);
			
			txtG = new JTextField();
			txtG.setEditable(false);
			txtG.setText(" G");
			txtG.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtG.setColumns(10);
			txtG.setBackground(Color.WHITE);
			txtG.setBounds(670, 317, 42, 42);
			frame.getContentPane().add(txtG);
			
			textField_51 = new JTextField();
			textField_51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_51.setDocument(new JTextFieldCharLimits(1));
			textField_51.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_51.setColumns(10);
			textField_51.setBackground(Color.WHITE);
			textField_51.setBounds(670, 235, 42, 42);
			frame.getContentPane().add(textField_51);
			
			textField_52 = new JTextField();
			textField_52.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_52.setDocument(new JTextFieldCharLimits(1));
			textField_52.setColumns(10);
			textField_52.setBackground(Color.WHITE);
			textField_52.setBounds(670, 276, 42, 42);
			frame.getContentPane().add(textField_52);
			
			textField_53 = new JTextField();
			textField_53.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_53.setDocument(new JTextFieldCharLimits(1));
			textField_53.setColumns(10);
			textField_53.setBackground(Color.WHITE);
			textField_53.setBounds(670, 401, 42, 42);
			frame.getContentPane().add(textField_53);
			
			txtS_4 = new JTextField();
			txtS_4.setEditable(false);
			txtS_4.setText(" S");
			txtS_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtS_4.setColumns(10);
			txtS_4.setBackground(Color.WHITE);
			txtS_4.setBounds(670, 443, 42, 42);
			frame.getContentPane().add(txtS_4);
			
			textField_55 = new JTextField();
			textField_55.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_55.setDocument(new JTextFieldCharLimits(1));
			textField_55.setColumns(10);
			textField_55.setBackground(Color.WHITE);
			textField_55.setBounds(670, 485, 42, 42);
			frame.getContentPane().add(textField_55);
			
			txtE = new JTextField();
			txtE.setEditable(false);
			txtE.setText(" E");
			txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtE.setColumns(10);
			txtE.setBackground(Color.WHITE);
			txtE.setBounds(670, 526, 42, 42);
			frame.getContentPane().add(txtE);
			
			textField_57 = new JTextField();
			textField_57.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_57.setDocument(new JTextFieldCharLimits(1));
			textField_57.setColumns(10);
			textField_57.setBackground(Color.WHITE);
			textField_57.setBounds(670, 566, 42, 42);
			frame.getContentPane().add(textField_57);
			
			textField_58 = new JTextField();
			textField_58.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_58.setDocument(new JTextFieldCharLimits(1));
			textField_58.setColumns(10);
			textField_58.setBackground(Color.WHITE);
			textField_58.setBounds(628, 443, 42, 42);
			frame.getContentPane().add(textField_58);
			
			textField_59 = new JTextField();
			textField_59.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_59.setDocument(new JTextFieldCharLimits(1));
			textField_59.setColumns(10);
			textField_59.setBackground(Color.WHITE);
			textField_59.setBounds(586, 443, 42, 42);
			frame.getContentPane().add(textField_59);
			
			txtB = new JTextField();
			txtB.setEditable(false);
			txtB.setText(" B");
			txtB.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtB.setColumns(10);
			txtB.setBackground(Color.WHITE);
			txtB.setBounds(545, 443, 42, 42);
			frame.getContentPane().add(txtB);
			
			txtW = new JTextField();
			txtW.setEditable(false);
			txtW.setText(" W");
			txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtW.setColumns(10);
			txtW.setBackground(Color.WHITE);
			txtW.setBounds(586, 401, 42, 42);
			frame.getContentPane().add(txtW);
			
			textField_62 = new JTextField();
			textField_62.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_62.setDocument(new JTextFieldCharLimits(1));
			textField_62.setColumns(10);
			textField_62.setBackground(Color.WHITE);
			textField_62.setBounds(586, 485, 42, 42);
			frame.getContentPane().add(textField_62);
			
			textField_63 = new JTextField();
			textField_63.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_63.setDocument(new JTextFieldCharLimits(1));
			textField_63.setColumns(10);
			textField_63.setBackground(Color.WHITE);
			textField_63.setBounds(586, 526, 42, 42);
			frame.getContentPane().add(textField_63);
			
			txtE_1 = new JTextField();
			txtE_1.setEditable(false);
			txtE_1.setText(" E");
			txtE_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			txtE_1.setColumns(10);
			txtE_1.setBackground(Color.WHITE);
			txtE_1.setBounds(586, 566, 42, 42);
			frame.getContentPane().add(txtE_1);
			
			textField_65 = new JTextField();
			textField_65.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_65.setDocument(new JTextFieldCharLimits(1));
			textField_65.setColumns(10);
			textField_65.setBackground(Color.WHITE);
			textField_65.setBounds(586, 608, 42, 42);
			frame.getContentPane().add(textField_65);
			
			textField_66 = new JTextField();
			textField_66.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
			textField_66.setDocument(new JTextFieldCharLimits(1));
			textField_66.setColumns(10);
			textField_66.setBackground(Color.WHITE);
			textField_66.setBounds(586, 649, 42, 42);
			frame.getContentPane().add(textField_66);
			
			JButton btnFinish = new JButton("FINISH");
			btnFinish.setForeground(new Color(255, 255, 255));
			btnFinish.setBackground(new Color(139, 0, 0));
			btnFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String f1=textField_7.getText()+"O"+textField_8.getText();
					String f2="S"+textField_9.getText()+textField_10.getText()+"R"+textField_12.getText()+textField_13.getText();
					String f3=textField_21.getText()+"U"+textField_22.getText()+textField_23.getText()+"A";
					String f4=textField_41.getText()+"L"+textField_39.getText()+textField_38.getText()+textField_37.getText()+textField_36.getText()+"S";
					String f5=textField_14.getText()+"R"+textField_15.getText()+"U"+textField_17.getText()+textField_18.getText()+textField_19.getText()+"S";
					String f6="S"+textField_51.getText()+textField_52.getText()+"G"+textField_49.getText()+textField_53.getText()+"S"+textField_55.getText()+"E"+textField_57.getText();
					String f7="T"+textField_42.getText()+textField_37.getText();
					String f8=textField_29.getText()+textField_27.getText()+textField_30.getText()+"T";
					String f9="J"+textField_27.getText()+textField_26.getText()+"N"+textField_13.getText();
					String f10="S"+textField_34.getText()+textField_33.getText()+"T"+textField_32.getText();
					String f11=textField_32.getText()+textField_44.getText()+"O"+textField_46.getText()+textField_47.getText()+"S";
					String f12="W"+textField_59.getText()+textField_62.getText()+textField_63.getText()+"E"+textField_65.getText()+textField_66.getText();
					String f13="B"+textField_59.getText()+textField_58.getText()+"S";
					
					if (f1.equals("TOP")&&f2.equals("SHIRTS")&&f3.equals("KURTA")&&f4.equals("BLAZERS")&&f5.equals("TROUSERS")&&f6.equals("SUNGLASSES")&&f7.equals("TIE")&&f8.equals("BELT")&&f9.equals("JEANS")&&f10.equals("SUITS")&&f11.equals("SHORTS")&&f12.equals("WALLETS")&&f13.equals("BAGS"))
					{
						int id=(int)score/3;
						ProgressUpdate.stop();
						 JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\nPls enter your username");
							
							String uname = JOptionPane.showInputDialog(frame, "Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\n Enter username:");

							 System.out.println(uname);
							 String upass = JOptionPane.showInputDialog(frame, "Enter password:");
							 System.out.println(upass);
							 
							 CrossService cs=new CrossService();
								cs.medium(id,uname,upass);
					
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Wrong Answers!");
						if(!f1.equals("TOP")){
							textField_7.setText(null) ;textField_8.setText(null) ;
							
						}
						if(!f2.equals("SHIRTS"))
						{
							textField_9.setText(null); textField_10.setText(null); textField_12.setText(null); textField_13.setText(null);
							
						}
						if(!f3.equals("KURTA")){
							textField_21.setText(null);textField_22.setText(null);textField_23.setText(null);
							
						}
						if(!f4.equals("BLAZERS")){
							textField_41.setText(null);textField_39.setText(null);textField_38.setText(null);textField_37.setText(null);textField_36.setText(null);
							
						}
						if(!f5.equals("TROUSERS")){
							textField_14.setText(null);textField_15.setText(null);textField_17.setText(null);textField_18.setText(null);textField_19.setText(null);
							
						}
						if(!f6.equals("SUNGLASSES")){
							textField_51.setText(null);textField_52.setText(null);textField_49.setText(null);textField_53.setText(null);textField_55.setText(null);textField_57.setText(null);
							
						}
						if(!f7.equals("TIE")){
							textField_42.setText(null) ;textField_37.setText(null) ;
							
						}
						if(!f8.equals("BELT"))
						{
							textField_29.setText(null); textField_27.setText(null); textField_30.setText(null); 
							
						}
						if(!f9.equals("JEANS")){
							textField_27.setText(null);textField_26.setText(null);textField_13.setText(null);
							
						}
						if(!f10.equals("SUITS")){
							textField_34.setText(null);textField_33.setText(null);textField_32.setText(null);
							
						}
						if(!f11.equals("SHORTS")){
							textField_32.setText(null);textField_44.setText(null);textField_46.setText(null);textField_47.setText(null);
							score--;
						}
						if(!f12.equals("WALLETS")){
							textField_59.setText(null);textField_62.setText(null);textField_63.setText(null);textField_65.setText(null);textField_66.setText(null);
							score--;
						
						}
						if(!f13.equals("BAGS")){
							textField_59.setText(null);textField_58.setText(null);
							score--;
						}
						//wrong++;
					}
				}
			});
			btnFinish.setFont(new Font("Tahoma", Font.BOLD, 24));
			btnFinish.setBounds(127, 798, 179, 42);
			frame.getContentPane().add(btnFinish);
			
			label = new JLabel("1");
			label.setBounds(527, 26, 15, 16);
			frame.getContentPane().add(label);
			
			label_1 = new JLabel("2");
			label_1.setBounds(432, 52, 15, 16);
			frame.getContentPane().add(label_1);
			
			label_2 = new JLabel("3");
			label_2.setBounds(514, 135, 15, 16);
			frame.getContentPane().add(label_2);
			
			label_3 = new JLabel("4");
			label_3.setBounds(154, 96, 15, 16);
			frame.getContentPane().add(label_3);
			
			label_4 = new JLabel("5");
			label_4.setBounds(351, 207, 15, 16);
			frame.getContentPane().add(label_4);
			
			label_5 = new JLabel("6");
			label_5.setBounds(677, 179, 15, 16);
			frame.getContentPane().add(label_5);
			
			label_6 = new JLabel("7");
			label_6.setBounds(68, 276, 15, 16);
			frame.getContentPane().add(label_6);
			
			label_7 = new JLabel("9");
			label_7.setBounds(235, 289, 15, 16);
			frame.getContentPane().add(label_7);
			
			label_8 = new JLabel("8");
			label_8.setBounds(282, 219, 15, 16);
			frame.getContentPane().add(label_8);
			
			label_9 = new JLabel("10");
			label_9.setBounds(143, 373, 15, 16);
			frame.getContentPane().add(label_9);
			
			label_10 = new JLabel("11");
			label_10.setBounds(386, 359, 15, 16);
			frame.getContentPane().add(label_10);
			
			label_11 = new JLabel("12");
			label_11.setBounds(586, 383, 15, 16);
			frame.getContentPane().add(label_11);
			
			label_12 = new JLabel("13");
			label_12.setBounds(527, 457, 15, 16);
			frame.getContentPane().add(label_12);
			
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Fashion.class.getResource("/images/questions/fashion.png")));
			lblNewLabel_1.setBounds(763, 122, 498, 646);
			frame.getContentPane().add(lblNewLabel_1);
			
			progressBar = new JProgressBar();
			progressBar.setStringPainted(true);
			progressBar.setForeground(new Color(0, 0, 205));
			progressBar.setBounds(27, 739, 724, 16);
			frame.getContentPane().add(progressBar);
			
			lblTimesRunning = new JLabel("Time's Running.....");
			lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblTimesRunning.setBounds(27, 692, 196, 42);
			frame.getContentPane().add(lblTimesRunning);
			
			lblHint = new JLabel("HINT");
			lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
			lblHint.setBounds(405, 804, 42, 25);
			frame.getContentPane().add(lblHint);
			
			label_13 = new JLabel("");
			label_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(j>=3)
					{
					    lblHint.setVisible(false);
						label_13.setVisible(false);
					}
					else
					{
						j++;
			        int TIME_VISIBLE=2000;
					JLabel label = new JLabel( new ImageIcon(Fashion.class.getResource("/images/solutions/Fashion.png")) );
					//JOptionPane.showMessageDialog(null, label, null, JOptionPane.PLAIN_MESSAGE, null);
					JOptionPane pane = new JOptionPane(label,
					          JOptionPane.INFORMATION_MESSAGE);
					      JDialog dialog = pane.createDialog(null, "Title");
					      dialog.setModal(false);
					      dialog.setVisible(true);

					      new Timer(TIME_VISIBLE, new ActionListener() {
					        @Override
					        public void actionPerformed(ActionEvent e) {
					          dialog.setVisible(false);
					        }
					      }).start();
					      score=score-30;
					      
					}
				}
			});
			label_13.setIcon(new ImageIcon(Fashion.class.getResource("/others/light-bulb.png")));
			label_13.setBounds(448, 775, 70, 76);
			frame.getContentPane().add(label_13);
			
			label_14 = new JLabel("");
			label_14.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					Level lv=new Level();
					lv.main(null);
				}
			});
			label_14.setIcon(new ImageIcon(Fashion.class.getResource("/others/if_Previous_2_372909.png")));
			label_14.setBounds(12, 13, 71, 67);
			frame.getContentPane().add(label_14);
			frame.setBackground(Color.WHITE);
			frame.setBounds(100, 100, 1306, 984);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ProgressUpdate.start();
		}
	}


