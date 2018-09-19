
/**
 * Write a description of class Lava here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import mayflower.*;

public class Lava extends Actor
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Lava
     */
    public Lava()
    {
        Picture p = new Picture("img/Lava.png");
      p.resize(50,50);
      setPicture(p);
    }

     public void update()
    {
    	
    }
}
