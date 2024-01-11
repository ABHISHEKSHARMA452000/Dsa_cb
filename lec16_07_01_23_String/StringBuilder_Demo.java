package lec16_07_01_23_String;

import java.lang.*;
import java.util.*;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);//empty stringbuilder hai
		//append
		sb.append("a");
		sb.append('b');
		sb.append("cdefghi");
		System.out.println(sb);
		//charAt()
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(sb.length()-1));
		//deleteCharAt(Index) or deleteCharAt(starting Index,end index)
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(0, 1);//end index exclusive
		System.out.println(sb);
		//toString() return a string of data of Stringbuilder sb
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		//length()
		System.out.println(sb.length());
		//substring
		String s = sb.substring(4);
		System.out.println(s);
		//setCharAt(index,val)
		sb.setCharAt(0, 'a');
		System.out.println(sb);
		//insert
		sb.insert(1, 'b');
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("ABCD");
		System.out.println(sb1);
		System.out.println("String = " + sb1);
		
		StringBuilder sb2 = new StringBuilder(sb1.toString());
		System.out.println(sb2);
	}

}


//StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
//StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
//StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
//StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string. 

//Java Code to illustrate StringBuilder

//import java.util.*;
//import java.util.concurrent.LinkedBlockingQueue;
//
//public class GFG1 {
//	public static void main(String[] argv) throws Exception
//	{
//		// Create a StringBuilder object
//		// using StringBuilder() constructor
//		StringBuilder str = new StringBuilder();
//
//		str.append("GFG");
//
//		// print string
//		System.out.println("String = " + str.toString());
//
//		// create a StringBuilder object
//		// using StringBuilder(CharSequence) constructor
//		StringBuilder str1
//			= new StringBuilder("AAAABBBCCCC");
//
//		// print string
//		System.out.println("String1 = " + str1.toString());
//
//		// create a StringBuilder object
//		// using StringBuilder(capacity) constructor
//		StringBuilder str2 = new StringBuilder(10);
//
//		// print string
//		System.out.println("String2 capacity = "
//						+ str2.capacity());
//
//		// create a StringBuilder object
//		// using StringBuilder(String) constructor
//		StringBuilder str3
//			= new StringBuilder(str1.toString());
//
//		// print string
//		System.out.println("String3 = " + str3.toString());
//	}
//}
