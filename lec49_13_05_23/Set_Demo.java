package lec49_13_05_23;

import java.util.*;

public class Set_Demo {
	public static void main(String[] args) {
		//1.Hashset //o(1) 
		//similar to a.l but not duplicat value 
		//Set<Integer> set = new HashSet<>();Interface==>Class
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(-11);
		set.add(7);
		set.add(-9);
		set.add(10);
//		System.out.println(set.contains(-9));
//		System.out.println(set.contains(12));
//		System.out.println(set.remove(2));
//		System.out.println(set.remove(20));
//		System.out.println(set.size());
		System.out.println(set);//[2, 3, 4, 7, -9, -11, 10]
		//2.TreeSet complexity=log(n)
		//Set<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(-11);
		set1.add(7);
		set1.add(-9);
		set1.add(10);
		System.out.println(set1);//sorted order ma aata hai //[-11, -9, 2, 3, 4, 7, 10]
		//3.LinkedHashSet
		LinkedHashSet<Integer> set2= new LinkedHashSet<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(-11);
		set2.add(7);
		set2.add(-9);
		set2.add(10);
		System.out.println(set2);
		
		//becoze index nhi  hota hai hashset ma toh ya foreach loop lagana hoga
		for (int val : set) {
			System.out.print(val+ " ");
		}
		System.out.println();
		for (int val : set1) {
			System.out.print(val+ " ");
		}
		
	}
}
