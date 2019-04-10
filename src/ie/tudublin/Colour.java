package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colour extends PApplet
{	
    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;

    public void Colour(){

    }

    public String toString(){
        String displayname;
        displayname = colour + Integer.toString(r) + Integer.toString(g) + Integer.toString(b) + Integer.toString(value);
        return displayname;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

}
