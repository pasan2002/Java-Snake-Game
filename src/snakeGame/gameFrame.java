package snakeGame;

import javax.swing.*;

public class gameFrame extends JFrame{
	
	gamePanel panel;
	
	gameFrame(){
		panel = new gamePanel();
		
		this.add(new gamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.add(panel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
