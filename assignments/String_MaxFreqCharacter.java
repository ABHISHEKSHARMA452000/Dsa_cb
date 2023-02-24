package assignments;

import java.util.Scanner;

public class String_MaxFreqCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[27];
		MaxFreq(str,arr);
		//System.out.println(ans);
	}
	public static void MaxFreq(String str,int[] arr) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int val = 96 - ch;
			//System.out.print(val);
			int abs = Math.abs(val);
			arr[abs]++;
		}
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				idx = i;
			}
		}
		char ch = (char)(96+idx);
		System.out.println(ch);
	}
}
