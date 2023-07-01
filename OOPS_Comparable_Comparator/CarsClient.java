package OOPS_Comparable_Comparator;

import java.util.*;
 
public class CarsClient {

	public static void main(String[] args) {
		// int[] arr = new int[5];///integer type ka 5 size ka array bana hai jisma
		// by-default 0 value
		// Integer[] a = {1,2,3,4,5};
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		// Display(a);
		Display(arr);
		System.out.println("*********************");
		//sort(arr,new CarsComparatorSpeed());
		Arrays.sort(arr,new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.price - o2.price;
			}
			
		});
		Display(arr);
	}

	// making generic display jo sab ka liya chal sakaa
	public static <T> void Display(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);//OOPS_Comparable_Comparator.Cars@76ed5528 == print ma ya na aaya thats why otString method override karna hoga
		}
	}

//Comparable sa karta time
	
	// generic sorting ka function bana diya
//	public static <T extends Comparable<T>> void sort(T[] arr) {//is line ma bound set kiya ki asa wasa t nhi aayaga is function ma only those t possible hai jinka class ma comparsion ka logic likha hai
//		for (int turn = 1; turn < arr.length; turn++) {
//			for(int idx = 0;idx < arr.length-turn;idx++) {
////				if(arr[idx] > arr[idx+1]) { //ya line error degi bcoz hum address par comparasion nhi kar sakta hai 
////					T temp = arr[idx];
////					arr[idx] = arr[idx+1];
////					arr[idx + 1] = temp;
////				}
//				if(arr[idx].compareTo(arr[idx + 1]) > 0) {
//					T temp = arr[idx];
//					arr[idx] = arr[idx+1];
//					arr[idx + 1] = temp;
//				}
//			}
//		}
//		/*
//		 * is type ka comparable ma problem ya hai ki baar baar ja ka logic change karna hoga if client na price na bol kar speed 
//		 * par karna laga then fir change kar ka color pa kar diya so if source code hi change nhi kar sakta hoga toh
//		 * comparable sa aacha comparator interface use kar lo*/
//		
//	}
	
	
	
	//comparator ka liya
//	public static <T> void sort(T[] arr,Comparator<T> camp) {
//		for (int turn = 1; turn < arr.length; turn++) {
//			for(int idx = 0;idx < arr.length-turn;idx++) {
//				if(camp.compare(arr[idx],arr[idx+1]) > 0) {
//					T temp = arr[idx];
//					arr[idx] = arr[idx+1];
//					arr[idx + 1] = temp;
//				}
//			}
//		}	
//	}
	
}
