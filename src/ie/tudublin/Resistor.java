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
        this.hundreds = (value / 100);
        this.tens = (value - (hundreds * 100)) / 10;
        this.ones = value - ((hundreds * 100)  + (tens * 10));
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

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public int getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    
}