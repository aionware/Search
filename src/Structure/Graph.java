package Structure;

import java.util.ArrayList;

public class Graph {
	
	ArrayList<Node> nodes;

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}

	public Graph(ArrayList<Node> nodes) {
		super();
		this.nodes = nodes;
	}
	
	public Graph() {
		super();
	}
	public Graph(String string) {
		super();
		
	}

	
}
