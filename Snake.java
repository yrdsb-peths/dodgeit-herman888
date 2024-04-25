import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Snake extends Actor
{
    
    public void act()
    {
        move(3);
        if(Greenfoot.isKeyDown("right"))
            setRotation(0);
        if(Greenfoot.isKeyDown("left"))
            setRotation(180);
        if(Greenfoot.isKeyDown("up"))
            setRotation(270);
        if(Greenfoot.isKeyDown("down"))
            setRotation(90);
            
        
    }
}
