package sde;

import java.awt.*;
import java.awt.geom.*;


public class Transition extends DiagramElement{
	Point first;
	Point second;
	Transition(Point x,Point y){
		first = x;
		second = y;
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		s = new Line2D.Double(first.x,first.y,second.x,second.y);
		
        g2d.draw(s);
	}
	@Override
	public boolean intersect(Point p) {
		return true;
		
	}

	
	

	
	
	
}
