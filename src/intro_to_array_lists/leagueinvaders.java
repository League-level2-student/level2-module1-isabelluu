package intro_to_array_lists;

public class leagueinvaders {

}

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	
	 JFrame frame;
	 public static final int WIDTH = 500;
	 public static final int HEIGHT = 800;
	 gamepanel panel = new gamepanel();
	
	
	public void setup()
	{
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.show(true);
		frame.addKeyListener(panel);
	
		
	}
	

}

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;



public class gamepanel extends JPanel implements ActionListener, KeyListener{
	
	 final int MENU = 0;
	 final int GAME = 1;
	 final int END = 2;
	 int currentState = MENU;
	 Font titlefont;
	 Font enter;
	 Font space;
	 Timer frameDraw;

	 
	@Override
	 
	public void paintComponent(Graphics g){
		titlefont = new Font("Arial", Font.PLAIN, 30);
		enter = new Font("Arial", Font.PLAIN, 20);
		space = new Font("Arial", Font.PLAIN, 20);
		if(currentState == MENU)
		{
		    drawMenuState(g);
		}
		else if(currentState == GAME)
		{
		    drawGameState(g);
		}
		else if(currentState == END)
		{
		    drawEndState(g);
		}
		
		
		 frameDraw = new Timer(1000/60,this);
		 frameDraw.start();
		
		
	}
	 
	void updateMenuState() 
	{  
		
	}
	
	
	void updateGameState() 
	{ 
		 
	}
	 
	 
	void updateEndState()  
	{ 
		 
	}

	void drawMenuState(Graphics g) 
	{  
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titlefont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 120, 150);
		
		g.setFont(enter);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to start", 150, 400);
		
		g.setFont(space);
		g.setColor(Color.YELLOW);
		g.drawString("Press SPACE for instructions", 125, 600);
	}
	
	void drawGameState(Graphics g) 
	{  
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	
	void drawEndState(Graphics g)  
	{  
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titlefont);
		g.setColor(Color.YELLOW);
		g.drawString("GAME OVER", 100, 200);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU)
		{
		    updateMenuState();
		}
		else if(currentState == GAME)
		{
		    updateGameState();
		}
		else if(currentState == END)
		{
		    updateEndState();
		}
		//System.out.println("action");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) 
		    {
		        currentState = MENU;
		        System.out.println("ENTER");
		    } 
		    else {
		        currentState++;
		    }
		}   

		if (e.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("UP");
		}
		
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		}
		
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		    System.out.println("LEFT");
		}
		
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("RIGHT");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}



public class runner {

	public static void main(String[] args) {
		new LeagueInvaders().setup();
	
	}
}
