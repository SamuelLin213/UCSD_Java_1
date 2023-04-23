package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	PImage img;
	
	public void setup() {
		// add setup code for MyPApplet
		size(400, 400); // set canvas size
		background(255); // set canvas color
		stroke(0); // set pen size
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		img.resize(0,  height); // resize image according to height
		image(img, 0, 0); // display image
	}
	
	public void draw() 
	{
		// add drawing code
		int[] color = sunColorSec(second()); // calc color for sun
		fill(color[0], color[1], color[2]); // set sun color
		ellipse(width/4, height/5, width/4, height/5); // draw sun
	}
	
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		
		float diffFrom30 = Math.abs(30-seconds); // get distance to nearest 30
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = (int)(255*ratio);
		
		return rgb;
	}
}
