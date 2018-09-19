
/**
 * Write a description of class Block here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import mayflower.*;

public class RightBlock extends Actor
{
    

    /**
     * Constructor for objects of class Block
     */
    public RightBlock()
    {
        
      Picture p = new Picture("img/Tiles/4.png");
      p.resize(50,50);
      setPicture(p);
    }
    
    public void update()
    {
        
    }
    
}

