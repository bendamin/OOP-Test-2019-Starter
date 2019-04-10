package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends PApplet
{	
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public int resistor(){
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);


        return value;
    }

    public void render(float y)
    {
        line(width/5,y,width/4,y);
		rect(width/4,y - 40, width/2, 80);
		line(width - (width/5),y,width - (width/4),y);
    }

    
}