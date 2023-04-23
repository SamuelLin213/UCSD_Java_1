package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PConstants;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.pushStyle();
		
		pg.fill(255, 165, 0);
		pg.strokeWeight(1);
		pg.ellipse(x, y, 5, 5); // draws circle for each airport
		
		pg.popStyle();
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		// show rectangle with title
		String name = getName().substring(1, getName().length()-1) + "(" + getCode().substring(1, getCode().length()-1) + "):"; 
		String place = getCity().substring(1, getCity().length()-1) + ", " + getCountry().substring(1, getCountry().length()-1);
		
		pg.pushStyle();
				
		pg.rectMode(PConstants.CORNER);
		
		pg.stroke(110);
		pg.fill(255,255,255);
		pg.rect(x, y + 15, Math.max(pg.textWidth(name), pg.textWidth(place))+6, 39);
		
		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.fill(0);
		pg.text(name, x + 3 , y +18);
		pg.text(place, x+3, y+36);
		
		pg.popStyle();
		
		// show routes
	}
	
	private String getName()
	{
		return (String)getProperty("name");
	}
	
	private String getCountry()
	{
		return (String)getProperty("country");
	}
	
	private String getCity()
	{
		return (String)getProperty("city");
	}
	
	private String getCode()
	{
		return (String)getProperty("code");
	}
}
