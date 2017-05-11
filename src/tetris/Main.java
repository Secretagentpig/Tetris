package tetris;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame
{
	public static final String name = "Tetris";
	public static final int play = 0;
	public static final int xSize = 600;
	public static final int ySize = 900;
	
	public Main(String name) 
	{
		super(name);
		this.addState(new Play());
	}

	public static void main(String[] args) 
	{
	      AppGameContainer appgc;
	      try{
	         appgc = new AppGameContainer(new Main(name));
	         appgc.setDisplayMode(xSize, ySize, false);
	         appgc.setTargetFrameRate(60);
	         appgc.setShowFPS(false);
	         appgc.start();
	      }catch(SlickException e){
	         e.printStackTrace();
	      }
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException 
	{
	      this.getState(play).init(gc, this);
	      this.enterState(play);
	}

}
