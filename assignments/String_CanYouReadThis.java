package assignments;

import java.util.Scanner;

public class String_CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Read_This(str);
	}
	public static void Read_This(String s) {
		String ans = "";
		char ch = s.charAt(0);
		ans = ans + ch;
		for(int i=1;i<s.length();i++) {
			ch = s.charAt(i);
			if(ch >= 65 && ch <= 90) {
				System.out.println(ans);
				ans = "" + ch;
			}else {
				ans += ch;
			}
		}
		System.out.println(ans);
	}
	
//	public static void Read_This(String str) {
//		int i = 0;
//		int j = 0;
//		while(j<str.length()){
//			if(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
//				if(i == 0) {
//					System.out.println(str.substring(i,1));
//					
//				}//else if(str.charAt(j) >= 65 && str.charAt(j) <= 90) {
//					//j++;
//				//}
//				String substr = str.substring(i,j);
//				System.out.println(substr);
//				i=j;
//			}else {
//				j++;
//			}
//		}
//		
//	}
}
