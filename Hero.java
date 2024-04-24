import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
   
    boolean atTop = true;
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        }
        
        if(atTop) {
            setLocation(100,150);
            
        } else {
            setLocation(400,100);
        }
    }
}
