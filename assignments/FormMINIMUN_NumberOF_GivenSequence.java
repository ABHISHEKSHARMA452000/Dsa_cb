package assignments;
import java.util.*;
public class FormMINIMUN_NumberOF_GivenSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "DIIDIDID";
		String s2 = "IIDDIDDI"; //last ma I hai toh auspa value dali then stack ka D empty kara then s.length par value daala gi
		String s3 = "DDIIDDD"; //for s.length tak jaya ga last ma then stack empty karaga
		//String s = DI(s1);
		//System.out.println(s);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		for(int i=0;i<arr.length;i++) {
			String s = DI(arr[i]);
			System.out.println(s);
		}
	}
	public static String DI(String s) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[s.length()+1];
		int count = 1;
		for(int i=0;i<=s.length();i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				while(!st.isEmpty()) { // if 2 "I"s ek saath aata hai toh stack empty hoga phele sa hi toh ya loop nhi chala ga and hum stack ma index daal raha hai and vo bhi only for D ka liya
					ans[st.pop()] = count;
					count++;
				}
			}else {
				st.push(i);
			}
		}
		String str = "";
		for(int i=0;i<ans.length;i++) {
			str += ans[i];
		}
		return str;
	}
}
