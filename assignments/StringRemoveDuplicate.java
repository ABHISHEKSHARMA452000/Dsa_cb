package assignments;
import java.util.*;
public class StringRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		RemoveDuplicate(s);
	}
	public static void RemoveDuplicate(String str) {
		String ans = "";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				continue;
			}else {
				ans +=str.charAt(i);
			}
		}
		ans+=str.charAt(str.length()-1);
		System.out.println(ans);
	}
}
