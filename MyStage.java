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
    	addActor(block, 528, 600);
    	block = new Block();
    	addActor(block, 400, 600);
    	block = new Block();
    	addActor(block, 656, 600);
    	block = new Block();
    	addActor(block, 272, 600);
    	rblock = new RightBlock();
    	addActor(block, 400, 600);
    	block = new Block();
    	addActor(block, 784, 600);
    	block = new Block();
    	addActor(block, 144, 471);
    	block = new Block();
    	addActor(block, 16, 471);
    }
    
    public void update()
    {
        
    }
    
}