package sde;



public class test{
	public static void main(String[] args) {
			StateDiagramView v = new StateDiagramView();
			DiagramElement m = new StateDiagram();
			StatediagramController c = new StatediagramController(v,m);
	}

}
