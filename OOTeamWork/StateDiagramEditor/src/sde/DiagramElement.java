package sde;
import java.awt.*;
import java.util.*;

class Point
{
	int x;
	int y;
	Point(int x, int y)
	{
		this.x = x ;
		this.y = y;
	}
}

abstract public class DiagramElement extends Canvas{
	String name;
	Point loc;
	public abstract boolean intersect(Point p);
	public void add(DiagramElement e)
	{
		
	}
	public DiagramElement get()
	{
		return new State();
	}
	public void remove(DiagramElement e)
	{
		
	}

}

