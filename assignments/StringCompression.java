package assignments;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//Stringcompress(s);
		compression(s);
		System.out.println();
	}

	public static void Stringcompress(String str) {
		String ans = "";
		int count = 1;
		int p = 0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				//ans += str.charAt(i) + count; isma phele right calculate hua  a + 3 in ascii 97 + 3 and 100 diya
				ans = ans +  str.charAt(i) + count; //isma ans + a = str bana then 3 add hua toh problem nhi aaya ek or way tha ans += str.charAt(i) + "" + count is ma ab acsii sa nhi calculate ho 
				//issa kya pata laga ki char and value seedha add ki toh ascii sa add kar liya seedha  
				count = 1;
				p=i+1;
			}else {
				count++;
			}
		}
		count = 0;
		for(int i=p;i<str.length();i++) {
			count++;
		}
		ans += str.charAt(p);
		ans = ans + count;
		
		
		System.out.println(ans);
	}
	public static void compression(String str) {
		String ans = "";
		int count = 1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				ans += str.charAt(i);
				ans += count;
				count=1;
			}
		}
		ans += str.charAt(str.length()-1);
		ans += count;
		System.out.println(ans);
	}
}
