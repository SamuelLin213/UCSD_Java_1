package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	public void setup()
	{
		size(400, 400); // sets up size of app
		background(200, 200, 200); // sets up background color
	}
	
	public void draw()
	{
		fill(255, 255, 0); // fill w/ yellow
		ellipse(200, 200, 395, 395); // draw ellipse shape, at position 50, 100 and radius of 75
		
		fill(0, 0, 0); // fill for eyes
		ellipse(120, 130, 50, 70); // first eye
		ellipse(280, 130, 50, 70); // second eye
		
		noFill();
		arc(200, 280, 75, 75, 0, PI); // smiley face
	}
}
