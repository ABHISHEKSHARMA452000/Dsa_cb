package lec26_12_02_23;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(1);
		list.add(-19);
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		list.add(2,20); //(index,value);
		//index ki range isma 0 to size() tak possible hai valid range for index in A.L.
		System.out.println(list);
		//remove
		System.out.println(list.remove(1)); //index lata hai isma and range of index 0 to size()-1;
		list.add(101);
		list.add(102);
		System.out.println(list);
		//get value
		System.out.println(list.get(2));
		System.out.println(list);
		//sort
		Collections.sort(list);
		System.out.println(list);
		//Collections.reverseOrder(list);
		
	}

}
