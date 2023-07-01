package lec18_14_01_23;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
	
		//back ma addd karta hai list ma
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		//size of al;
		System.out.println(list.size());
		//to get value of index
		System.out.println(list.get(1));
		list.add(1,-9); //to add elemnt in between and shift hua hai add hua hai update nhi
		System.out.println(list);
		//to remove
		System.out.println(list.remove(2));
		//System.out.println(list.remove());index deni mandatory hai in al ki kis index ko remove kar raha hu
		System.out.println(list);
		//update kara ga value
		list.set(1,-11);
		System.out.println(list);
		
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(257);
		list.add(235);
		System.out.println(list.size());
		System.out.println(list);
		list.add(26);
		list.add(28);
		System.out.println(list.size());
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) +  " ");
		}
		System.out.println();
		for(int val :list) {
			System.out.print(val + " ");
		}
		
		
	}

}
