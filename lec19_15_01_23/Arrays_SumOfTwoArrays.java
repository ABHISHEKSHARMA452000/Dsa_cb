package lec19_15_01_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		SumofTwoArray(arr1,arr2);
	}
	public static void SumofTwoArray(int[] arr1,int[] arr2) {
		int i = arr1.length-1;
		int j = arr2.length-1;
		int carry = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(i>=0 && j>=0) {
			int sum = arr1[i] + arr2[j] + carry;
			list.add(sum%10);
			carry  = sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum = arr1[i] + carry;
			list.add(sum%10);
			carry  = sum/10;
			i--;
		}
		while(j>=0) {
			int sum = arr2[j] + carry;
			list.add(sum%10);
			carry = sum / 10;
			j--;
			
		}
		if(carry != 0) {
			list.add(carry);
		}
		Collections.reverse(list); //to reverse the list and collections.sort for sorting list
		for(int k=0;k<list.size();k++) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.println("END");
		
	}

}
