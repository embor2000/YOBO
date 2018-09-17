
/**
 * Write a description of class MovableAnimatedActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import mayflower.*;
public class MovableAnimatedActor extends AnimatedActor
{
    // instance variables - replace the example below with your own
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private String currentAction;

    /**
     * Constructor for objects of class MovableAnimatedActor
     */
    public MovableAnimatedActor()
    {
        currentAction = null;
    }
     public void update()
    {
         super.update();
         if(currentAction == null)
         {
             currentAction = "idle";
             setAnimation(idle);
         }
         
         Keyboard m = getKeyboard();
         
         if(m.isKeyPressed("right") )
         {
             if(!currentAction.equals("walkRight"))
               {
                  currentAction = "walkRight";
                  setAnimation(walkRight);
               }
             move(2, "East");
         }
         else if(m.isKeyPressed("left") )
         {
             if(!currentAction.equals("walkLeft"))
               {
                  currentAction = "walkLeft";
                  setAnimation(walkLeft);
               }
             move(2, "West");
         }
         else if(!currentAction.equals("idle"))
         {
             currentAction = "idle";
             setAnimation(idle);
         }
    }
    public void setWalkRightAnimation(Animation ani)
    {
        walkRight = ani;
    }
   
    public void setWalkLeftAnimation(Animation ani)
    {
        walkLeft = ani;
    }
    public void setIdleAnimation(Animation ani)
    {
        idle = ani;
    }
    
}
