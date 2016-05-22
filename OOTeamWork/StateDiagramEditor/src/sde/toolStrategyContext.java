package sde;

import java.awt.Graphics;

public class toolStrategyContext {
	ToolStrategy strategy;
	DiagramElement m;
	public toolStrategyContext(ToolStrategy strategy)
	{
		this.strategy = strategy;
	}
	public void ExecuteDrawStrategy(DiagramElement d,Graphics g)
	{
		this.strategy.draw(d,g);
	}
}
