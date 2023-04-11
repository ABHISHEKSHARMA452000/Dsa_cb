package Leetcode_questions;

import java.util.*;

public class leetcode_1291_SequentialDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 1000;
		int high = 13000;
		List<Integer> list = new ArrayList<>();
		Print(low,high,0,list);
		Collections.sort(list);
		System.out.println();
		System.out.println(list);
		
	}
	public static void Print(int low,int high,int num,List<Integer> list) {
		if(num <= high && num >= low) {
			System.out.print(num  + " ");
			list.add(num);
		}
		if(num >= high) {
			return;
		}
		int rem = num%10;
		for(int i=1;i<=9;i++) {
			if(num == 0 || i-rem == 1) { //n==0 ka liya  call isliya bcoz 1st time sab ka chalna hai 
				Print(low,high,num*10 + i,list); //then last digit check karo "rem" sa if call jiski lagi hai and rem ka difference 1 hai toh ni next level ka liya call lagi hai
			}
		}
	}
}
