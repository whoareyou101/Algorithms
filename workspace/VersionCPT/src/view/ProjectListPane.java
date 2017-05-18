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
import javax.swing.JScrollPane;

public class ProjectListPane extends JPanel {
	private Image bgImage, homeImage;
	private JButton btnHome;
	private JScrollPane scroll;
	
	public ProjectListPane() {

		setLayout(null);
		// background

		try {
			bgImage = ImageIO.read(getClass().getResource("resources/bgImage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		btnHome = new JButton("Start");
		try {

			homeImage = ImageIO.read(getClass().getResource("resources/homeImage.png"));
			btnHome.setIcon(new ImageIcon(homeImage));

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error: Cannot open");
			System.exit(-1);
		}
		btnHome.setBounds(10, 10, 100, 50);
		btnHome.setBackground(new Color(242, 242, 242));
		btnHome.setBorderPainted(false);
		add(btnHome);
	
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(JButton btnHome) {
		this.btnHome = btnHome;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgImage, 0, 0, null);

	}
}
