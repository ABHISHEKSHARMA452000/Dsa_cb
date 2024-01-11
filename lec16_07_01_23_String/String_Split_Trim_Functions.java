package lec16_07_01_23_String;

import java.util.*;

public class String_Split_Trim_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc def ghi fsdsf";
		String[] arr1 = s1.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		String str = "GeeksforforGeeksfor   ";
	    String[] arr2 = str.split("for");
	 
	    for (String a : arr2) {
	        System.out.println(a);
	    }
	    
	    //The trim function in Java String is a built-in function that eliminates leading and trailing spaces.
	    String s2 = "   cfggsg  fwsgwgw ggwrg  wef   ";
	    String s2trim = s2.trim();
	    System.out.println(s2trim);
	    String[] strarr1 = s2trim.split(" ");//ya only ek space sa hi spit karaga 
	    String[] strarr2 = s2trim.split("\s");//ya bhi only one space hi hi spit karaga
	    String[] strarr3 = s2trim.split("\\s");//same hai as \s
	    String[] strarr4 = s2trim.split("\s+");//jinti bhi space thi sab ko remove kar diya or \\s+
	    for(String s:strarr4) {
	    	System.out.println(s);
	    }	    
	    System.out.println();
	    
	    //LowerCase UpperCase 
	    String s = "AbcghijDEF";
	    String low = s.toLowerCase();
	    System.out.println(low);
	    String upper = s.toUpperCase();
	    System.out.println(upper);
	    char[] arr = low.toCharArray();
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	    System.out.println();
	    Arrays.sort(arr);
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
