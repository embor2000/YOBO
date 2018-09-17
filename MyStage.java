/**
 * @(#)MyStage.java
 *
 *	Lab 5 Starter Code
 *
 * @author Mr May
 * @version 1.00 2016/7/18
 */
import mayflower.*;


public class MyStage extends Stage {

	private Dog dog;
	private Block block;
	private RightBlock rblock;
    public MyStage() 
    {
    	setBackground("img/BG/BackGround.jpg");
    	
    	dog = new Dog();
    	addActor(dog, 400, 300);
    	block = new Block();
    	addActor(block, 525, 600);
    	block = new Block();
    	addActor(block, 400, 600);
    	rblock = new RightBlock();
    	addActor(rblock, 500, 500);
    }
    
    public void update()
    {
    }
    
}