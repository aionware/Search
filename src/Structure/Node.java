package Structure;

import java.util.ArrayList;

public class Node {
	
	int id;
	String name;
	ArrayList<Integer> neighborId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Integer> getNeighborId() {
		return neighborId;
	}
	public void setNeighborId(ArrayList<Integer> neighborId) {
		this.neighborId = neighborId;
	}
	
	

	

	
}
