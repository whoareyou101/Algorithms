package controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MainFrame;

public class BtnListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == Main.getLoginPane().getBtnStart()) {
			CardLayout cards = (CardLayout) MainFrame.getCards().getLayout();
			cards.show(MainFrame.getCards(), "projectList");
		
		} else if (e.getSource() == Main.getProjectListPane().getBtnHome()) {
			CardLayout cards = (CardLayout) MainFrame.getCards().getLayout();
			cards.show(MainFrame.getCards(), "projectList");
		
		} 
		
		
		
		
	}

}
