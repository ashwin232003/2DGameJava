package main;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame window=new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAutoRequestFocus(false);
		window.setTitle("BLUE BOY ADVENTURE");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		gamePanel.setUpGame();
		gamePanel.startGameaThread();
		
		

	}

}
