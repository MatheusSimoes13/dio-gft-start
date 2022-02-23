package arvore;

public class Node {

	protected int value;
	protected Node left;
	protected Node right;
	
	Node(int value){
		this.value = value;
		right = null;
		left = null;
	}
	
}
