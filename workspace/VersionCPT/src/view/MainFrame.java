package view;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.BtnListener;
import controller.Main;

public class MainFrame extends JFrame {
	private static JPanel cards;
	private static Container c;
	private static BtnListener btnListener;
	
	public MainFrame() {
		c = getContentPane();

		cards = new JPanel(new CardLayout(0, 0));
		cards.add(Main.getLoginPane(), "login");
		/*cards.add(Main.getFileAddPane(), "fileAdd");
		cards.add(Main.getOpinionAddPane(), "opinionAdd");
		cards.add(Main.getProjectAddPane(), "projectAdd");
		cards.add(Main.getProjectListPane(), "projectList");
		cards.add(Main.getPwdChgPane(), "pwdChg");
		cards.add(Main.getVerAddPane(), "verAdd");
		cards.add(Main.getVerListPane(), "verList");
		*/
		cards.add(Main.getLoginPane(), "login");
		//cards.add(Main.getProjectListPane(), "projectList");
		c.add(cards);

		
		//buttonListener
		btnListener = new BtnListener();
		Main.getLoginPane().getBtnStart().addActionListener(btnListener);
		Main.getLoginPane().getBtnExit().addActionListener(btnListener);
		//Main.getProjectListPane().getBtnHome().addActionListener(btnListener);
		
		setTitle("Version Admin CPT");
		this.setSize(420, 700);
		this.setResizable(true);
		this.setVisible(true);
		//this.pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static JPanel getCards() {
		return cards;
	}

	public static void setCards(JPanel cards) {
		MainFrame.cards = cards;
	}

	public static Container getC() {
		return c;
	}

	public static void setC(Container c) {
		MainFrame.c = c;
	}
}
