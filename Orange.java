import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orange extends Actor
{
    /**
     * Act - do whatever the Orange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-10);
        
        if(getX() <= 0)
        {
            resetOrange();
        }
    }
    
    public void resetOrange()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
        
    }

}
