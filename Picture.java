/**
 * This image is supposed to be a person in a house, which changes to a starry night sky in B&W
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Nathan Paget
 * @version 2016.9.19
 */
public class Picture
{
    private Square background;
    private Square grass;
    private Square wall;
    private Square window;
    private Square windowcover;
    private Square stem;
    private Square stem2;
    private Square stem3;
    private Circle flower;    
    private Triangle roof;
    private Circle sun;
    private Person human;
    private Triangle star_1;
    private Triangle star_2;
    private Triangle star_3;
    private Triangle star_4;
    private Triangle star_5;
    private Triangle star_6;
    private Triangle star_7;
    private Triangle star_8;
    private Triangle star_9;
    private Triangle star_10;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.changeColor("white");
        background.moveHorizontal(0);
        background.moveVertical(0);
        background.changeSize(1060);
        background.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.moveHorizontal(0);
        grass.moveVertical(200);
        grass.changeSize(1060);
        grass.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(140);
        wall.moveVertical(100);
        wall.changeSize(160);
        wall.makeVisible();
        
        roof = new Triangle();  
        roof.changeSize(60, 280);
        roof.moveHorizontal(220);
        roof.moveVertical(40);
        roof.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(170);
        window.moveVertical(140);
        window.changeSize(70);
        window.makeVisible();
        
        stem = new Square();
        stem.changeColor("blue");
        stem.moveHorizontal(370);
        stem.moveVertical(240);
        stem.changeSize(15);
        stem.makeVisible();
        
        stem2 = new Square();
        stem2.changeColor("green");
        stem2.moveHorizontal(361);
        stem2.moveVertical(240);
        stem2.changeSize(15);
        stem2.makeVisible();
        
        stem3 = new Square();
        stem3.changeColor("green");
        stem3.moveHorizontal(378);
        stem3.moveVertical(240);
        stem3.changeSize(15);
        stem3.makeVisible();
        
        flower = new Circle();
        flower.changeColor("yellow");
        flower.moveHorizontal(372);
        flower.moveVertical(230);
        flower.changeSize(10);
        flower.makeVisible();
        
        human = new Person();
        human.moveHorizontal(190);
        human.moveVertical(190);
        human.makeVisible();
        human.changeColor("blue");
        
        windowcover = new Square();
        windowcover.moveHorizontal(170);
        windowcover.moveVertical(210);
        windowcover.changeSize(40);
        windowcover.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(390);
        sun.moveVertical(40);
        sun.changeSize(80);
        sun.makeVisible();
        
        star_1 = new Triangle();  
        star_1.changeColor("white");
        star_1.changeSize(10, 10);
        star_1.moveHorizontal(70);
        star_1.moveVertical(40);
        star_1.makeVisible();
        
        star_2 = new Triangle(); 
        star_2.changeColor("white"); 
        star_2.changeSize(-10, 10);
        star_2.moveHorizontal(70);
        star_2.moveVertical(54);
        star_2.makeVisible();
        
        star_3 = new Triangle();  
        star_3.changeColor("yellow");
        star_3.changeSize(10, 10);
        star_3.moveHorizontal(420);
        star_3.moveVertical(40);
        star_3.makeVisible();
        
        star_4 = new Triangle(); 
        star_4.changeColor("yellow"); 
        star_4.changeSize(-10, 10);
        star_4.moveHorizontal(420);
        star_4.moveVertical(54);
        star_4.makeVisible();
        
        star_5 = new Triangle();  
        star_5.changeColor("white");
        star_5.changeSize(10, 10);
        star_5.moveHorizontal(220);
        star_5.moveVertical(10);
        star_5.makeVisible();
        
        star_6 = new Triangle(); 
        star_6.changeColor("white"); 
        star_6.changeSize(-10, 10);
        star_6.moveHorizontal(220);
        star_6.moveVertical(24);
        star_6.makeVisible();
        
        star_7 = new Triangle();  
        star_7.changeColor("white");
        star_7.changeSize(10, 10);
        star_7.moveHorizontal(420);
        star_7.moveVertical(140);
        star_7.makeVisible();
        
        star_8 = new Triangle(); 
        star_8.changeColor("white"); 
        star_8.changeSize(-10, 10);
        star_8.moveHorizontal(420);
        star_8.moveVertical(154);
        star_8.makeVisible();
        
        star_9 = new Triangle();  
        star_9.changeColor("white");
        star_9.changeSize(10, 10);
        star_9.moveHorizontal(20);
        star_9.moveVertical(90);
        star_9.makeVisible();
        
        star_10 = new Triangle(); 
        star_10.changeColor("white"); 
        star_10.changeSize(-10, 10);
        star_10.moveHorizontal(20);
        star_10.moveVertical(104);
        star_10.makeVisible();
        
        
        
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            background.changeColor("black");
            grass.changeColor("black");
            wall.changeColor("white");
            window.changeColor("black");
            stem.changeColor("white");
            stem2.changeColor("black");
            stem3.changeColor("black");
            flower.changeColor("white");
            windowcover.changeColor("white");
            roof.changeColor("white");
            sun.changeColor("black");
            human.changeColor("white");
            star_1.changeColor("white");
            star_2.changeColor("white");
            star_3.changeColor("white");
            star_4.changeColor("white");
            star_5.changeColor("white");
            star_6.changeColor("white");
            star_7.changeColor("white");
            star_8.changeColor("white");
            star_9.changeColor("white");
            star_10.changeColor("white");
            
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            background.changeColor("white");
            grass.changeColor("green");
            wall.changeColor("red");
            window.changeColor("black");
            human.changeColor("blue");
            windowcover.changeColor("red");
            roof.changeColor("green");
            sun.changeColor("yellow");
            star_1.changeColor("white");
            star_2.changeColor("white");
            star_3.changeColor("yellow");
            star_4.changeColor("yellow");
            star_5.changeColor("white");
            star_6.changeColor("white");
            star_7.changeColor("white");
            star_8.changeColor("white");
            star_9.changeColor("white");
            star_10.changeColor("white");
            stem.changeColor("blue");
            stem2.changeColor("green");
            stem3.changeColor("green");
            flower.changeColor("yellow");
        }
    }
}
