package sde;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StateDiagramView 
{
	JButton stateBtn;
	JButton transitionBtn;
	Canvas canvas;
	StateDiagramView()
	{
		JFrame sdeFrame = new JFrame();
		sdeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sdeFrame.setBounds(100, 100, 800, 600);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setSize(300, 200);
		toolBar.setBackground(Color.lightGray);
		toolBar.setToolTipText("ToolBar");
		sdeFrame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		stateBtn = new JButton("state");
		toolBar.add(stateBtn);
		
		transitionBtn = new JButton("transition");
		toolBar.add(transitionBtn);
		
		canvas = new Canvas();
		sdeFrame.getContentPane().add(canvas, BorderLayout.CENTER);
		sdeFrame.setVisible(true);
	}
//	public StateDiagram getSD()
//	{
//		return sd;
//	}
	public Graphics getGraphics()
	{
		return canvas.getGraphics();
	}
	public void addStateBtnListener(ActionListener listener) {
		stateBtn.addActionListener(listener);
    }
	public void addTransitionBtnListener(ActionListener listener) {
		transitionBtn.addActionListener(listener);
    }
}
