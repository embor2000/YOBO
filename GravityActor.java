
/**
 * Write a description of class GravityActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import mayflower.*;
public class GravityActor extends Actor
{
    // instance variables - replace the example below with your own
        

    /**
     * Constructor for objects of class GravityActor
     */
    public GravityActor()
    {
        
        
    }
     public boolean isGrounded()
    {
        
     Actor[] touching = getTouching();
        for (Actor Dog : touching)
        {
            if(Dog instanceof Block)
            {
                return true;
            }
        }  
        
        return false;
    }
    public boolean rightIsBlocked()
    {
        Actor[] touching = getTouching();
        for (Actor Dog : touching)
        {
            if(Dog instanceof RightBlock)
            {
                return true;
            }
        }  
        return false;
    }
  
    public void update()
    {
        
        if(!isGrounded())
        {
            move(2, "South");
        }
        if(rightIsBlocked())
        {
            move(4, "West");
        }
    }
    
    
}
