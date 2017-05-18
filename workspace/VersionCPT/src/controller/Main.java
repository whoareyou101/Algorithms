package controller;

import view.FileAddPane;
import view.LoginPane;
import view.MainFrame;
import view.OpinionAddPane;
import view.ProjectAddPane;
import view.ProjectListPane;
import view.PwdChgPane;
import view.VerAddPane;
import view.VerListPane;

public class Main {

	private static MainFrame mainFrame;
	private static FileAddPane fileAddPane;
	private static LoginPane loginPane;
	private static OpinionAddPane opinionAddPane;
	private static ProjectAddPane projectAddPane;
	private static ProjectListPane projectListPane;
	private static PwdChgPane pwdChgPane;
	private static VerAddPane verAddPane;
	private static VerListPane verListPane;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fileAddPane = new FileAddPane();
		loginPane = new LoginPane();
		//opinionAddPane = new OpinionAddPane();
		//projectAddPane = new ProjectAddPane();
		//projectListPane = new ProjectListPane();
		//pwdChgPane = new PwdChgPane();
		//verAddPane = new VerAddPane();
		//verListPane = new VerListPane();
			
		mainFrame = new MainFrame();

		// 갑자기 종료할 경우 처리
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				// saveObject();

			}
		}));
	}
	
	public static FileAddPane getFileAddPane(){
		return fileAddPane;
	}

	public static LoginPane getLoginPane(){
		return loginPane;
	}
	
	public static OpinionAddPane getOpinionAddPane(){
		return opinionAddPane;
	}
	
	public static ProjectAddPane getProjectAddPane(){
		return projectAddPane;
	}
	
	public static ProjectListPane getProjectListPane(){
		return projectListPane;
	}
	
	public static PwdChgPane getPwdChgPane(){
		return pwdChgPane;
	}
	
	public static VerAddPane getVerAddPane(){
		return verAddPane;
	}
	
	public static VerListPane getVerListPane(){
		return verListPane;
	}
}
