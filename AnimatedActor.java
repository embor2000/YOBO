/**
 * @(#)AnimatedActor.java
 *
 *  Lab 5 Starter Code
 *
 *
 * @author Mr May
 * @version 1.00 2016/7/21
 */
import mayflower.*;

public class AnimatedActor extends GravityActor 
{
    private Animation animation;
    private Timer animationTimer;

    public AnimatedActor() 
    {
        animation = null;
        animationTimer = new Timer();
    }
    
    public void setAnimation(Animation a)
    {
        animation = a;
        animationTimer.reset();
    }
    
    public void update()
    {
        if(animation != null)
        {
            if (animationTimer.hasTimePassed(animation.getFrameRate()))
            {    
                    animationTimer.reset();         
                 setPicture(animation.getNextFrame());
            }
        }
        super.update();
    }
    
    
}