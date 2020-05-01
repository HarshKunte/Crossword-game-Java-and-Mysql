package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import crossDAO.CrossDB;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Leaderboard {
	 Connection con = null;
	  PreparedStatement p= null;
	  ResultSet rs=null;
	  

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leaderboard window = new Leaderboard();
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
	public Leaderboard() {
		initialize();
		try {
			con=CrossDB.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//showtable();
	}
/*private void showtable(){
	String sql="select *from registration";
	try{
	p=con.prepareStatement(sql);
	rs=p.executeQuery(sql);
	table.setModel(DbUtils.resultSetToTableModel(rs));
	}catch(Exception e){System.out.println(e);}
}*/
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 204));
		frame.setBounds(100, 100, 1081, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblSelectLevelFor = new JLabel("Select level for which you want ranking!");
		lblSelectLevelFor.setForeground(new Color(0, 255, 255));
		lblSelectLevelFor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectLevelFor.setBounds(325, 112, 440, 30);
		frame.getContentPane().add(lblSelectLevelFor);
		
		JButton btnEasy = new JButton("Easy");
		btnEasy.setBackground(UIManager.getColor("Button.background"));
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql="select uname ,easy from registration order by easy desc";
				try{
				p=con.prepareStatement(sql);
				rs=p.executeQuery(sql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e){System.out.println(e);}
			}
		});
		btnEasy.setBounds(242, 168, 97, 25);
		frame.getContentPane().add(btnEasy);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql="select uname ,medium from registration order by medium desc";
				try{
				p=con.prepareStatement(sql);
				rs=p.executeQuery(sql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e){System.out.println(e);}
			
			}
		});
		btnMedium.setBounds(519, 168, 97, 25);
		frame.getContentPane().add(btnMedium);
		
		JButton btnHard = new JButton("Hard");
		btnHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="select uname ,hard from registration order by hard desc";
				try{
				p=con.prepareStatement(sql);
				rs=p.executeQuery(sql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){System.out.println(e1);}
			
			}
		});
		btnHard.setBounds(773, 168, 97, 25);
		frame.getContentPane().add(btnHard);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				UIlogin ui=new UIlogin();
				ui.main(null);
			}
		});
		label.setIcon(new ImageIcon(Leaderboard.class.getResource("/others/reply.png")));
		label.setBounds(12, 0, 73, 73);
		frame.getContentPane().add(label);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		
		table.setSurrendersFocusOnKeystroke(true);
		
		table.setBackground(new Color(240, 230, 140));
		table.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 21));
		table.setRowHeight(50);
		table.setModel(new DefaultTableModel(
				
			new Object[][] {
			
			},
			new String[] {
				"UserName", "Score"
			}
		));
		table.setBounds(-217, 190, 178, 229);
		frame.getContentPane().add(table);
		
		JScrollPane scrol = new JScrollPane(table);
		scrol.setBounds(271, 220, 538, 361);
		frame.getContentPane().add(scrol);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Leaderboard.class.getResource("/others/ranking.png")));
		label_1.setBounds(474, 35, 97, 64);
		frame.getContentPane().add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(32, 145, 998, 10);
		frame.getContentPane().add(separator);
	}
}
