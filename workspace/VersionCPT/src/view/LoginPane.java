package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPane extends JPanel {
	private Image bgImage, startImage, exitImage;
	private JTextField txtId;
	private JPasswordField txtPwd;
	private JButton btnStart, btnExit;
	// public JButton btnHome;

	public LoginPane() {

		setLayout(null);
		// background
		try {
			bgImage = ImageIO.read(getClass().getResource("resources/background.png"));

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Cannot open");
			System.exit(-1);
		}

		txtId = new JTextField("ID");
		txtId.setBounds(130, 250, 150, 30);
		add(txtId);

		txtPwd = new JPasswordField("Password");
		txtPwd.setBounds(130, 300, 150, 30);
		add(txtPwd);

		btnStart = new JButton("Start");
		//color or image! select
		try {
			startImage = ImageIO.read(getClass().getResource("resources/startBtn.png"));
			btnStart.setIcon(new ImageIcon(startImage));
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Cannot open");
			System.exit(-1);
		}
		btnStart.setBounds(100, 400, 120, 60);
		btnStart.setBorderPainted(false);
		add(btnStart);
		
		btnExit = new JButton("Exit");
		//color or image! select
		/*try {
			startImage = ImageIO.read(getClass().getResource("resources/btnStart.png"));
			btnStart.setIcon(new ImageIcon(startImage));
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Cannot open");
			System.exit(-1);
		}*/
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(250, 400, 120, 60);
		btnExit.setBorderPainted(false);
		add(btnExit);

	}

	public String getId(){
		return txtId.getText();
	}

	public void setId(String id){
		txtId.setText(id);
	}
	
	public char[] getPwd(){
		return txtPwd.getPassword();
	}
	
	public void setPwd(String pwd){
		txtPwd.setText(pwd);
	}
	
	public JButton getBtnStart() {
		return btnStart;
	}

	public void setBtnStart(JButton btnStart) {
		this.btnStart = btnStart;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgImage, 0, 0, null);

	}
}
