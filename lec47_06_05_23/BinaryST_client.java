package lec47_06_05_23;

public class BinaryST_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in =  {10,20,34,56,78,89,90};
		BinarySearchTree bst = new BinarySearchTree(in);
		bst.PreOrder();
		System.out.println(bst.min());
	}

}
