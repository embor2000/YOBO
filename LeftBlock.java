
/**
 * Write a description of class Block here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import mayflower.*;

public class LeftBlock extends Actor
{
    

    /**
     * Constructor for objects of class Block
     */
    public LeftBlock()
    {
      Picture p = new Picture("img/Tiles/6.png");
      p.resize(50,50);
      setPicture(p);
    }
    
    public void update()
    {
    	
    }
    
}

