package Linked_List_Implementation;

public class Client_LL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.Addfirst(10);
		ll.Addfirst(20);
		ll.Addfirst(30);
		ll.Display();
		ll.Addlast(40);
		ll.Addatindex(50, 4);
		ll.Display();
		ll.removeFirst();
		ll.removeFirst();
		ll.Addatindex(20, 1);
		ll.Addatindex(30, 2);
		ll.Display();
		System.out.println(ll.Getatindex(2));
	}

}
