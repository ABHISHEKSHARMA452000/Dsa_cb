package BinaryTree_Implementation;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {10,20,30,40,50,60};
		BST bt = new BST(in);
		bt.PreOrder();
		System.out.println(bt.min());
	}

}
