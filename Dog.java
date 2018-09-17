/**
 * @(#)Dog.java
 *
 *	Lab 5 Starter Code
 *
 * @author Mr May
 * @version 1.00 2016/7/18
 */
import mayflower.*;

public class Dog extends MovableAnimatedActor 
{
	Animation walkR;
	Animation walkL;
	Animation idle;
    public Dog() 
    {
    	walkR = new Animation(50, new String[] {
    		"img/dog/Walk (1).png",
    		"img/dog/Walk (2).png",
    		"img/dog/Walk (3).png",
    		"img/dog/Walk (4).png",
    		"img/dog/Walk (5).png",
    		"img/dog/Walk (6).png",
    		"img/dog/Walk (7).png",
    		"img/dog/Walk (8).png",
    		"img/dog/Walk (9).png",
    		"img/dog/Walk (10).png"
    	});
    
    	walkL = new Animation(50, new String[] {
    		"img/dog/Walk (1).png",
    		"img/dog/Walk (2).png",
    		"img/dog/Walk (3).png",
    		"img/dog/Walk (4).png",
    		"img/dog/Walk (5).png",
    		"img/dog/Walk (6).png",
    		"img/dog/Walk (7).png",
    		"img/dog/Walk (8).png",
    		"img/dog/Walk (9).png",
    		"img/dog/Walk (10).png"
    	});
    	
        idle = new Animation(50, new String[] {
    		"img/dog/Idle (1).png",
    		"img/dog/Idle (2).png",
    		"img/dog/Idle (3).png",
    		"img/dog/Idle (4).png",
    		"img/dog/Idle (5).png",
    		"img/dog/Idle (6).png",
    		"img/dog/Idle (7).png",
    		"img/dog/Idle (8).png",
    		"img/dog/Idle (9).png",
    		"img/dog/Idle (10).png"
    	});
    	
    	walkR.resize(100, 87);
    	walkR.setBounds(18,5,54,80);
    	setWalkRightAnimation(walkR);
    	walkL.resize(100, 87);
    	walkL.setBounds(28,5,54,80);
    	
    	walkL.flipHorizontal();
    	setWalkLeftAnimation(walkL);
    	idle.resize(100, 87);
    	idle.setBounds(18,5,54,80);
    	
    	setIdleAnimation(idle);
    }
    
    public void update()
    {
    	super.update();
    }
    
    
}