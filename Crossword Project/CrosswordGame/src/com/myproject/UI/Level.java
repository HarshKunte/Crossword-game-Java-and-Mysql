package com.myproject.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.easy.Animals;
import com.easy.Fruits;
import com.easy.JungleBook;
import com.easy.Planets;
import com.easy.School;
import com.hard.Computer;
import com.hard.Electronics;
import com.hard.Footwear;
import com.hard.Occupation;
import com.hard.Transport;

import om.medium.Beach;
import om.medium.Elements;
import om.medium.Fashion;
import om.medium.Picnic;
import om.medium.Sports;

import java.awt.Font;
import javax.swing.JSeparator;

public class Level {

	private JFrame frame;
     private JLabel lblMedium;
     private JLabel lblHard;
     private JLabel lblEasy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level window = new Level();
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
	public Level() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 204));
		frame.setBounds(100, 100, 979, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel parentpanel = new JPanel();
		parentpanel.setBounds(0, 135, 961, 377);
		frame.getContentPane().add(parentpanel);
		parentpanel.setLayout(new CardLayout(0, 0));
		parentpanel.setVisible(false);
		
		
		JPanel medium = new JPanel();
		medium.setBackground(new Color(0, 102, 204));
		parentpanel.add(medium, "name_283976039930898");
		medium.setLayout(null);
		
		JLabel lblFashion = new JLabel("Beach");
		lblFashion.setForeground(new Color(255, 255, 255));
		lblFashion.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblFashion.setHorizontalAlignment(SwingConstants.CENTER);
		lblFashion.setBounds(44, 213, 68, 33);
		medium.add(lblFashion);
		
		JLabel lblElemenys = new JLabel("Elements");
		lblElemenys.setHorizontalAlignment(SwingConstants.CENTER);
		lblElemenys.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblElemenys.setForeground(new Color(255, 255, 255));
		lblElemenys.setBounds(166, 209, 104, 41);
		medium.add(lblElemenys);
		
		JLabel lblFashion_1 = new JLabel("Fashion");
		lblFashion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFashion_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblFashion_1.setForeground(new Color(255, 255, 255));
		lblFashion_1.setBounds(312, 209, 84, 41);
		medium.add(lblFashion_1);
		
		JLabel lblPicnic = new JLabel("Picnic");
		lblPicnic.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblPicnic.setForeground(new Color(255, 255, 255));
		lblPicnic.setBounds(462, 216, 87, 26);
		medium.add(lblPicnic);
		
		JLabel lblSports = new JLabel("Sports");
		lblSports.setHorizontalAlignment(SwingConstants.CENTER);
		lblSports.setForeground(new Color(255, 255, 255));
		lblSports.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblSports.setBounds(591, 213, 77, 33);
		medium.add(lblSports);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Beach.main(null);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Level.class.getResource("/others/beach.png")));
		lblNewLabel.setBounds(44, 134, 68, 77);
		medium.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Elements.main(null);
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Level.class.getResource("/others/periodic-table.png")));
		label.setBounds(166, 134, 87, 77);
		medium.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Fashion.main(null);
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(Level.class.getResource("/others/raincoat(1).png")));
		label_1.setBounds(302, 134, 104, 83);
		medium.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Picnic.main(null);
			}
		});
		label_2.setIcon(new ImageIcon(Level.class.getResource("/others/picnic.png")));
		label_2.setBounds(462, 134, 87, 77);
		medium.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Sports.main(null);
				
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon(Level.class.getResource("/others/cricket.png")));
		label_3.setBounds(593, 134, 87, 77);
		medium.add(label_3);
		
		JPanel easy = new JPanel();
		easy.setBackground(new Color(0, 102, 204));
		parentpanel.add(easy, "name_284008337877333");
		easy.setLayout(null);
		
		JLabel lblAnimals = new JLabel("Animals");
		lblAnimals.setForeground(new Color(255, 255, 255));
		lblAnimals.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblAnimals.setBounds(63, 188, 82, 36);
		easy.add(lblAnimals);
		
		JLabel lblFruits = new JLabel("Fruits");
		lblFruits.setForeground(new Color(255, 255, 255));
		lblFruits.setHorizontalAlignment(SwingConstants.CENTER);
		lblFruits.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblFruits.setBounds(202, 188, 82, 36);
		easy.add(lblFruits);
		
		JLabel lblJunglebook = new JLabel("Junglebook");
		lblJunglebook.setForeground(new Color(255, 255, 255));
		lblJunglebook.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblJunglebook.setBounds(333, 188, 109, 36);
		easy.add(lblJunglebook);
		
		JLabel lblPlanets = new JLabel("Planets");
		lblPlanets.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanets.setForeground(new Color(255, 255, 255));
		lblPlanets.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblPlanets.setBounds(503, 188, 109, 36);
		easy.add(lblPlanets);
		
		JLabel lblSchool = new JLabel("School");
		lblSchool.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblSchool.setForeground(new Color(255, 255, 255));
		lblSchool.setBounds(675, 195, 82, 23);
		easy.add(lblSchool);
		
		JLabel label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Animals.main(null);
			}
		});
		label_9.setIcon(new ImageIcon(Level.class.getResource("/others/dog(1).png")));
		label_9.setBounds(71, 118, 86, 70);
		easy.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Fruits.main(null);
			}
		});
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setIcon(new ImageIcon(Level.class.getResource("/others/raspberry(1).png")));
		label_10.setBounds(202, 106, 82, 82);
		easy.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JungleBook.main(null);
			}
		});
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setIcon(new ImageIcon(Level.class.getResource("/others/tiger(1).png")));
		label_11.setBounds(342, 118, 86, 70);
		easy.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Planets.main(null);
			}
		});
		label_12.setIcon(new ImageIcon(Level.class.getResource("/others/telescope.png")));
		label_12.setBounds(516, 126, 82, 62);
		easy.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				School.main(null);
			}
		});
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setIcon(new ImageIcon(Level.class.getResource("/others/student(1).png")));
		label_13.setBounds(665, 118, 83, 70);
		easy.add(label_13);
		
		JPanel hard = new JPanel();
		hard.setBackground(new Color(0, 102, 204));
		parentpanel.add(hard, "name_284035673017971");
		hard.setLayout(null);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setForeground(new Color(255, 255, 255));
		lblComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblComputer.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblComputer.setBounds(82, 189, 103, 36);
		hard.add(lblComputer);
		
		JLabel lblElectronics = new JLabel("Electronics");
		lblElectronics.setForeground(new Color(255, 255, 255));
		lblElectronics.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblElectronics.setBounds(225, 195, 116, 24);
		hard.add(lblElectronics);
		
		JLabel lblFootwear = new JLabel("Footwear");
		lblFootwear.setForeground(new Color(255, 255, 255));
		lblFootwear.setHorizontalAlignment(SwingConstants.CENTER);
		lblFootwear.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblFootwear.setBounds(353, 189, 113, 36);
		hard.add(lblFootwear);
		
		JLabel lblOccupation = new JLabel("Occupation");
		lblOccupation.setForeground(new Color(255, 255, 255));
		lblOccupation.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblOccupation.setBounds(501, 195, 116, 24);
		hard.add(lblOccupation);
		
		JLabel lblTransport = new JLabel("Transport");
		lblTransport.setForeground(new Color(255, 255, 255));
		lblTransport.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblTransport.setBounds(657, 194, 122, 27);
		hard.add(lblTransport);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Computer.main(null);
			}
		});
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setIcon(new ImageIcon(Level.class.getResource("/others/responsive.png")));
		label_4.setBounds(103, 111, 82, 84);
		hard.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Electronics.main(null);
			}
		});
		label_5.setIcon(new ImageIcon(Level.class.getResource("/others/innovation.png")));
		label_5.setBounds(242, 115, 78, 70);
		hard.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Footwear.main(null);
			}
		});
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setIcon(new ImageIcon(Level.class.getResource("/others/boots.png")));
		label_6.setBounds(371, 128, 82, 67);
		hard.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				Occupation.main(null);
			}
		});
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setIcon(new ImageIcon(Level.class.getResource("/others/engineer.png")));
		label_7.setBounds(507, 115, 88, 70);
		hard.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Transport.main(null);
			}
		});
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setIcon(new ImageIcon(Level.class.getResource("/others/car.png")));
		label_8.setBounds(647, 115, 103, 70);
		hard.add(label_8);
		
		 lblEasy = new JLabel("Easy");
		lblEasy.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblEasy.setForeground(new Color(0, 255, 255));
		lblEasy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				parentpanel.setVisible(true);
				lblEasy.setForeground(new Color( 255, 255,0));
				lblMedium.setForeground(new Color(0, 255, 255));
				lblHard.setForeground(new Color(0, 255, 255));
				parentpanel.removeAll();
				parentpanel.add(easy);
				parentpanel.repaint();
				parentpanel.revalidate();
			}
		});
		lblEasy.setBounds(37, 86, 73, 36);
		frame.getContentPane().add(lblEasy);
		
		lblMedium = new JLabel("Medium");
		lblMedium.setForeground(new Color(0, 255, 255));
		lblMedium.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblMedium.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				parentpanel.setVisible(true);
				lblMedium.setForeground(new Color( 255, 255,0));
				lblEasy.setForeground(new Color(0, 255, 255));
				lblHard.setForeground(new Color(0, 255, 255));
				parentpanel.removeAll();
				parentpanel.add(medium);
				parentpanel.repaint();
				parentpanel.revalidate();
			}
		});
		lblMedium.setBounds(155, 86, 119, 36);
		frame.getContentPane().add(lblMedium);
		
	    lblHard = new JLabel("Hard");
		lblHard.setForeground(new Color(0, 255, 255));
		lblHard.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblHard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				parentpanel.setVisible(true);
				lblMedium.setForeground(new Color( 0,255, 255));
				lblEasy.setForeground(new Color(0, 255, 255));
				lblHard.setForeground(new Color( 255, 255,0));	
				parentpanel.removeAll();
				parentpanel.add(hard);
				parentpanel.repaint();
				parentpanel.revalidate();
			}
		});
		lblHard.setBounds(316, 87, 73, 35);
		frame.getContentPane().add(lblHard);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 120, 949, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblSelectLevelTo = new JLabel("Select level to play");
		lblSelectLevelTo.setForeground(new Color(255, 255, 0));
		lblSelectLevelTo.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblSelectLevelTo.setBounds(316, 13, 246, 49);
		frame.getContentPane().add(lblSelectLevelTo);
		
		JLabel label_14 = new JLabel("");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				UIlogin.main(null);
			}
		});
		label_14.setIcon(new ImageIcon(Level.class.getResource("/others/reply.png")));
		label_14.setBounds(12, 13, 64, 49);
		frame.getContentPane().add(label_14);
//		if(easy.)
	//		lblEasy.setForeground(new Color( 255, 255, 0));
			
		
			
			
		
			
		
	}
}
