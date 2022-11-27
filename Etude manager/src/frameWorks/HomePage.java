package frameWorks;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame implements ActionListener {

	
	JButton classrom;
	JButton payments;
	JButton settings;
	JButton leave;
	public HomePage(String userName) {
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
		username.setText(userName);
		username.setFont(new Font("",Font.BOLD,20));
		username.setBounds(115, 200, 330, 30);
		infoPanel.add(username);
		
		leave = new JButton();
		leave.setText("Leave");
		leave.setFont(new Font("",Font.BOLD,25));
		leave.setBounds(65, 650, 200, 50);
		leave.setBackground(Color.red);
		infoPanel.add(leave);
		
		
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
