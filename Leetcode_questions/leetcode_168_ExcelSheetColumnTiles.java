package Leetcode_questions;

import java.util.Scanner;

public class leetcode_168_ExcelSheetColumnTiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] array = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println(convertToTitle(n));
		
	}
	public static String convertToTitle(int n) {
        int temp = n;
        String ans = "";
        while(temp > 0){
        	temp--;
            int rem = temp%26;
            char ch = (char)(65+rem);
            temp = temp/26;
            ans = ""+ch + ans;
        } 
        return ans;
   }

}
