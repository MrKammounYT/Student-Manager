package frameWorks;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomePage extends JFrame implements ActionListener {

	
	JButton classrom;
	JButton payments;
	JButton settings;
	public HomePage() {
		JPanel infoPanel = new JPanel();
		infoPanel.setSize(330, 800);
		infoPanel.setBounds(0,0,333,800);
		infoPanel.setBackground(new Color(0,0,0,9));
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(""));
		
		classrom = new JButton("classrom ");
		classrom.setBounds(65, 280, 200, 50);
		classrom.setFont(new Font("",Font.BOLD,25));
		classrom.setBackground(Color.white);
		infoPanel.add(classrom);

		
		payments = new JButton("Payments");
		payments.setBounds(65,350,200,50);
		payments.setBackground(Color.white);
		payments.setFont(new Font("",Font.BOLD,25));
		infoPanel.add(payments);
		
		settings = new JButton("Settings");
		settings.setBounds(65,420,200,50);
		settings.setBackground(Color.white);
		settings.setFont(new Font("",Font.BOLD,25));
		infoPanel.add(settings);
		
		JLabel icon = new JLabel();
		icon.setIcon(new ImageIcon("user image.png"));
		icon.setBounds(85,20,180,180);
		infoPanel.add(icon);
		
		JLabel username = new JLabel();
		username.setText("user 1");
		username.setFont(new Font("",Font.BOLD,20));
		username.setBounds(135, 200, 100, 30);
		username.setAlignmentX(CENTER_ALIGNMENT);
		username.setAlignmentY(CENTER_ALIGNMENT);
		infoPanel.add(username);
		
		
		
		infoPanel.setLayout(null);
		
		
		
	
		
		
		
		
		
		this.setLayout(null);
		this.add(infoPanel);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.setTitle("(Student Manger) Home Page");
		this.setSize(1200, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
