import java.util.*;

public class LocalSearch {
	public int checkHorizontal(Node node) {
		//TODO
		return 0;
	}
	public int checkDiagonal(Node node) {
		//TODO
		return 0;
	}
	public int heuristic(Node node) {
		//TODO
		return 0;
	}
	public int tryMovingOneQueen(Node node, int x, int y) {
		//TODO
		return 0;
	}
	public SortedMap<Integer,Node> generateNeighbours(Node node){
		//TODO
		return null;
	}
	public void run() {
		Node initial = new Node(8);
		if(heuristic(initial)==0) {
			System.out.println(initial.state);
			return;
		}
		System.out.println("initial state is: "+initial.state);
		Node node = initial;
		SortedMap<Integer, Node> neighbours = generateNeighbours(node);
		Integer bestheuristic = neighbours.firstKey();
		while(bestheuristic<heuristic(node)) {
			node = neighbours.get(bestheuristic);
			neighbours = generateNeighbours(node);
			bestheuristic=neighbours.firstKey();
		}
		if(heuristic(node) == 0) {
			System.out.println("Goal is: "+node.state);
		}
		else {
			System.out.println("Cannot find goal state! Best state is: "+ node.state);
		}
	}
}
