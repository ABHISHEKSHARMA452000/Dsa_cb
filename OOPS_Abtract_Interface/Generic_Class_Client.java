package OOPS_Abtract_Interface;

import java.util.*;

public class Generic_Class_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_Class<Integer,String> gc = new Generic_Class<>();
		gc.Display(1, 2, "three");
		
		LinkedList_Generic<String> list1 = new LinkedList_Generic<>();
		list1.Addfirst("papu");
		list1.Addfirst("tapu");
		list1.Addlast("chapu");
		list1.Display();
		//uncheck or un set exception due to angular brackett missing
		ArrayList ll = new ArrayList();//parent or father of all A.L means koi bhi data type chal sakta hai isma
		ll.add(9);
		ll.add("tappu");
		ll.add(3);
		System.out.print(ll);//
	}

}
