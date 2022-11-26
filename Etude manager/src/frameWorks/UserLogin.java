package frameWorks;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

import SQL.AccountDB;

public class UserLogin extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField textField;
	JPasswordField passwordField;
	JButton login;
	JLabel incorrect;


	public UserLogin() {
		this.setContentPane(new JLabel(new ImageIcon("bg.png")));
		this.setTitle("(Student Manager) Login In Page");
	//	Image ii = new ImageIcon(this.getClass().getResource("icon.png")).getImage();
		//this.setIconImage(ii);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setBounds(190, 30, 400, 500);
		panel.setSize(400, 500);
		panel.setVisible(true);

		JLabel userImage = new JLabel(new ImageIcon("user.png"));
		userImage.setBounds(120, 5, 150, 125);
		panel.add(userImage);

		
		JLabel EmailText = new JLabel("Email: ");
		EmailText.setBounds(50, 130, 120, 50);
		EmailText.setFont(new Font("", Font.BOLD, 20));
		panel.add(EmailText);

		textField = new JTextField("Please input:");
		Font fieldFont = new Font("Arial", Font.PLAIN, 20);
		textField.setFont(fieldFont);
		textField.setBounds(50, 180, 300, 50);
		textField.addMouseListener(new FieldMouseListener());
		textField.setBackground(Color.white);
		textField.setForeground(Color.gray.brighter());
		textField.setColumns(30);
		textField.setBorder(
				BorderFactory.createCompoundBorder(new CustomeBorder(), new EmptyBorder(new Insets(15, 25, 15, 25))));
		panel.add(textField);

		JLabel PasswordText = new JLabel("Password: ");
		PasswordText.setBounds(50, 240, 120, 50);
		PasswordText.setFont(new Font("", Font.BOLD, 20));
		panel.add(PasswordText);

		passwordField = new JPasswordField("Please input:");
		passwordField.setFont(fieldFont);
		passwordField.setBounds(50, 290, 300, 50);
		passwordField.addMouseListener(new FieldMouseListener());
		passwordField.setBackground(Color.white);
		passwordField.setForeground(Color.gray.brighter());
		passwordField.setColumns(30);
		passwordField.setBorder(
				BorderFactory.createCompoundBorder(new CustomeBorder(), new EmptyBorder(new Insets(15, 25, 15, 25))));
		panel.add(passwordField);

		incorrect = new JLabel("");
		incorrect.setBounds(100, 350, 300, 20);
		panel.add(incorrect);

		
		
		login = new JButton("Login");
		login.setFont(new Font("", Font.BOLD, 30));
		login.setBackground(Color.white);
		login.addActionListener(this);
		login.setBounds(90, 380, 220, 50);
		login.setBorder(
				BorderFactory.createCompoundBorder(new CustomeBorder2(), new EmptyBorder(new Insets(12, 25, 15, 25))));
		panel.add(login);

		panel.setLayout(null);
		this.add(panel);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class CustomeBorder extends AbstractBorder {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			// TODO Auto-generated method stubs
			super.paintBorder(c, g, x, y, width, height);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.gray);
			g2d.drawRoundRect(x, y, width - 1, height - 1, 25, 25);
		}
	}

	class CustomeBorder2 extends AbstractBorder {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			// TODO Auto-generated method stubs
			super.paintBorder(c, g, x, y, width, height);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.black);
			g2d.drawRoundRect(x, y, width - 1, height - 1, 40, 40);
		}
	}

	boolean activate = false;
	boolean activate2 = false;

	class FieldMouseListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == textField) {
				if (activate == false) {
					textField.setText("");
					textField.setFont(new Font("Arial", Font.PLAIN, 15));
				}
				activate = true;
				textField.setForeground(Color.black);
			}
			if (e.getSource() == passwordField) {
				if (activate2 == false) {
					passwordField.setText("");
					passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
				}
				activate2 = true;
				passwordField.setForeground(Color.black);

			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			AccountDB adb = new AccountDB();
			if (adb.UserExists(textField.getText())) {
				if (adb.isPasswordCorrect(textField.getText(), passwordField.getText())) {
					incorrect.setText("loging....");
					incorrect.setFont(new Font("", Font.BOLD, 15));
					incorrect.setForeground(Color.green);
					JComponent comp = (JComponent) e.getSource();
					  Window win = SwingUtilities.getWindowAncestor(comp);
					  win.dispose();
					new HomePage();
					
					  
				}
				else {
					incorrect.setText("Uncorrect Password");
					incorrect.setFont(new Font("", Font.BOLD, 15));
					incorrect.setForeground(Color.red);
				}
			}else {

				incorrect.setVisible(true);
				incorrect.setText("This Account dosent exists!");
				incorrect.setFont(new Font("", Font.BOLD, 15));
				incorrect.setForeground(Color.red);


			}

		}

	}
}
