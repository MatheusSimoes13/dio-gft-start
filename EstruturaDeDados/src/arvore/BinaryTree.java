package arvore;

public class BinaryTree {

	Node root;
	
	public void add(int value) {

		Node newNode = new Node(value);
		
		if(root == null) {
			root = newNode;
			
		} else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				
				if(value < focusNode.value) {
					focusNode = focusNode.left;
					
					if(focusNode == null) {
						parent.left = newNode;
						return;
					}
				}
				else {
					focusNode = focusNode.right;
					
					if(focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
				
			}
			
		}
		
		
	}
	
}
