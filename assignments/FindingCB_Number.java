package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class FindingCB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		LengthWise(str);
	}
	public static void LengthWise(String s) {
		int count = 0;
		boolean[] Visited = new boolean[s.length()];
		for(int len = 1;len<=s.length();len++) {
			for(int j = len;j<=s.length();j++) {
				int i = j-len;
				//System.out.println(s.substring(i,j));
				String str = s.substring(i,j);
				if(IsCbNumber(Long.parseLong(str)) == true && IsVisited(Visited,i,j-1) == true) {
					//System.out.println(str);
					count++;
					for(int k=i;k<j;k++) {
						Visited[k] = true; //to set toh number to true so that they cannot be used in further cb number
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean IsCbNumber(long n) {
		if(n == 0 || n==1) {
			return false;
		}
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(n == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean IsVisited(boolean[] arr,int i,int j) {
		for(int k=i;k<=j;k++) {
			if(arr[k] == true) {
				return false;
			}
		}
		return true;
	}
	
}
