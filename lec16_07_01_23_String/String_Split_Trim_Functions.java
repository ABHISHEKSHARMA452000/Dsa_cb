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
	    
	    System.out.println();
	    
	
	}

}
