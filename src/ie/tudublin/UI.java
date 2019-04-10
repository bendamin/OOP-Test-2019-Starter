package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);

		loadColours();
		printColours();
	}

	public void setup() 
	{
		loadColours();
		loadResistors();
	}
	
	public void draw()
	{	
		background(255);

		stroke(0);
		float y;
		y = height/(resistors.size()*2);
		
		for(int i = 0; i < resistors.size(); i++){
			int temp = resistors.get(i).resistor();

			line(width/5,y,width/4,y);
			rect(width/4,y - 40, width/2, 80);
			line(width - (width/5),y,width - (width/4),y);


		}
	}

	public void loadColours(){
		Table table = new Table();

		
		table = loadTable("colours.csv", "header");

  		//println(table.getRowCount() + " total rows in table"); 

		for (TableRow row : table.rows()) {
			
			String colour = row.getString("colour");
			int r = row.getInt("r");
			int g = row.getInt("g");
			int b = row.getInt("b");
			
			Colour c;
			c = new Colour();
			

			c.setColour(colour);
			c.r = r;
			c.g = g;
			c.b = b;

			colours.add(c);

		}
		
	}

	public void loadResistors(){
		Table table = new Table();

		
		table = loadTable("resistors.csv"); 
		int i = 0;

		for (TableRow row : table.rows()) {
			int value = row.getInt(i);
			
			Resistor resist;
			resist = new Resistor();
			resist.value = value;
			resistors.add(resist);

		}

		for(int j = 0; j < resistors.size(); j++){
		resistors.get(j).resistor();
		}
		
	}

	public void printColours(){
		for(int i = 0; i < colours.size(); i++){
			//System.out.println(colours.get(i));
		}
	}
}
