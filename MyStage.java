/**
 * @(#)MyStage.java
 *
 *  Lab 5 Starter Code
 *
 * @author Mr May
 * @version 1.00 2016/7/18
 */
import mayflower.*;


public class MyStage extends Stage {

    private Dog dog;
    private Block block;
    private RightBlock rblock;
    private LeftBlock lblock;
    private Actor[][] worldwide;
    private Lava lava;
    //private LeftBlock lblock
    //private CenterCenter cC;
    public MyStage() 
    {
        setBackground("img/BG/BackGround.jpg");
        worldwide = new Actor[40][30];
        dog = new Dog();
        addActor(dog, 50, 150);
        for(int i = 0; i < 16; i++)
        {
            // change to lava objects
            Lava b = new Lava();
            worldwide[i][0] = b;
        }
    }
    public void createPillar(int height, int xCoord)
    {
        for(int i = 0; i < height; i++)
        {
            Block b = new Block();
            worldwide[xCoord][i] =  b;
        }
    }
    public void makePlatform(int xCoord, int yCoord)
    {
        for(int i = 0; i < 2; i++)
        {
            if(i == 0)
            {
                //change to left float
                Block b = new Block();
                worldwide[xCoord][yCoord] = b;
            }
            if(i == 1)
            {
                //change to right float
                Block b = new Block();
                worldwide[xCoord + 1][yCoord] = b;
            }
        }
    }
    public void setWorld()
    {
        
    }
    public void update()
    {
        
    }
    
}