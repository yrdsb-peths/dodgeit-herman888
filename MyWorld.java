import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
    Counter snakeCounter = new Counter();
    

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 600, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Apple apple = new Apple();
        addObject(apple, 100, 200);
        
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        
        Snake snake = new Snake();
        addObject(snake, 200, 200);
        
        addObject(snakeCounter, 450,50);
    }
}
