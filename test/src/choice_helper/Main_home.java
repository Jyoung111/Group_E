package choice_helper;

import javax.swing.JFrame;

public class Main_home {
	
	
	
	public void HomeTest() {
		JFrame f = new JFrame("Ȩ ȭ�� �׽�Ʈ");
		f.setSize(900,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setLocation(480,280);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main test!");
		Main_home test = new Main_home();
		test.HomeTest();
	}
	
	
	

}
