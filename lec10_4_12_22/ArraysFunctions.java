package lec10_4_12_22;

import java.util.*;
//
public class ArraysFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,4,6,31,56,256,3,1};
		int[] arr2 = {2,4,6,31,56,256,3,1};
		int[] arr3 = {2,4,6,31,56,256,6,1};
		//System.out.println(arr1.contains(2));//contains fuction only a.l. ma chal raha hai
		System.out.println("1 - " + Arrays.equals(arr1,arr2));
		System.out.println("2 - " + Arrays.equals(arr1,arr3));
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		ArrayList<Integer> l1 = new ArrayList<>();//l1.contains
		l1.add(1);
		l1.add(5);
		l1.add(2);
		l1.add(6);
		//Collections.sort(l1);
		System.out.println("3 - " + l1.contains(6));
		System.out.println(l1);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(5);
		l2.add(6);
		l2.add(2);
		
		System.out.println("4 - " + l1.equals(l2));
		
		ArrayList<Integer> l3 = new ArrayList<>();
		l3.add(1);
		l3.add(5);
		l3.add(2);
		l3.add(6);
		System.out.println("5 - " + l1.equals(l3));
		Collections.sort(l3,Collections.reverseOrder());
		System.out.println(l3);
		
		
	}

}
