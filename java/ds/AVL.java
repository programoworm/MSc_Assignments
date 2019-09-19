class Node{
	public int item;
	public Node left,right;
	Node(int item){
		this.item=item;
		left=right=null;
	}
}
//class BSTree{
class Tree{
	//Node root=null;
	public static Node insert(Node temp, int item){
		//System.out.println(item+" Hi");
		if(temp==null){
			//System.out.println(item+" Hi I am root");
			temp=new Node(item);
		}
		else if(item<temp.item){
			//System.out.println(item+" Hi I am left");
			temp.left=insert(temp.left,item);
		}
		else{
			//System.out.println(item+" Hi I am right");
			temp.right=insert(temp.right,item);
		}
		return temp;
	}
	public static void inorder(Node root){
		if(root==null){
			//System.out.println("No node");
			return;
		}
		inorder(root.left);
		System.out.println(root.item);//+" ");
		inorder(root.right);
	}
	public static void preorder(Node root){
		if(root==null){
			//System.out.println("No node");
			return;
		}
		System.out.println(root.item);
		preorder(root.left);
		//+" ");
		preorder(root.right);
	}
}
//}
class AVL{
	public static void main(String[] args) {
		//Node root=new Node(10);
		//root.left=new Node(4);
		//root.right=new Node(20);
		Node root=new Node(5);
		//root.insert(1);
		Tree.insert(root,3);
		Tree.insert(root,1);
		Tree.insert(root,2);
		Tree.insert(root,4);
		Tree.inorder(root);
		System.out.println("\n");
		Tree.preorder(root);
		//System.out.println("Node created, Item is: "+root.item+" "+root.left.item+" "+root.right.item);
	}
}