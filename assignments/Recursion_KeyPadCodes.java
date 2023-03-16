package assignments;

import java.util.*;

public class Recursion_KeyPadCodes {
	static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans=Codes(str,"");
		System.out.println("\n" + ans);
	}
	public static int Codes(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int val = ch -'0';
		String key = arr[val];
		int num = 0;
		for(int i=0;i<key.length();i++) {
			int count = Codes(ques.substring(1),ans + key.charAt(i));
			//count = count + num;
			num += count;
		}
		
		return num;
	}
}
