package lec43_15_04_23;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.Addfirst(10);
		ll.Addfirst(-10);
		ll.Addfirst(4);
		ll.Display();
		ll.Addlast(80);
		ll.Addatindex(3,2);
	}

}
