package OOPS_Abtract_Interface;

import java.util.*;

public class FunctionGenerics {
	//primitive ka generic nhi hota vo 8 hai 
	//non primitive ka generic hota hai
	public static void main(String[] args) {
		Integer[] arr = {10,20,30,40,50};
		display(arr,"ac");
		String[] arr1 = {"raju","katli","aam"," nuts","cricket"};
		display(arr1,0);
	}
	//ya not generic hai
//	public static  void display(Integer[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//	}
	//ya generic bana diya both T and P generic ko denote kar raha hai
	public static <T,P> void display(T[] arr,P a) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(a);
	}
}
