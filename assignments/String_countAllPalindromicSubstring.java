package assignments;

import java.util.Scanner;

public class String_countAllPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	    //1.	//PrintAllSubString(str); 
		PrintAllPalindromicSubString(str);
				
	}
	//1.
	public static void PrintAllSubString(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String SubStr = str.substring(i,j);
				System.out.println(SubStr);
			}
		}
	}
	//2. jo check karaga
	public static void PrintAllPalindromicSubString(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String SubStr = str.substring(i,j);
				if(isPal(SubStr) == true) {
					//System.out.println(SubStr);
					count++;
				}
			}
		}
		System.out.println(count); 
	}
	
	public static boolean isPal(String s) { 
		int left = 0;
		int right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
