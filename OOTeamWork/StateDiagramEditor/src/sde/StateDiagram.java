package sde;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;


public class StateDiagram extends DiagramElement{
	String path;
	ArrayList<DiagramElement> des = new ArrayList<>();
	public void paint(Graphics g) {
		for(DiagramElement d : des)
		{
			d.paint(g);
		}
	}
	public void add(DiagramElement d){
		des.add(d);
	}
	@Override
	public boolean intersect(Point p) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
