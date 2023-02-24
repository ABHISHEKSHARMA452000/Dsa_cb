package lec17_08_01_23;

import java.util.Iterator;

public class FindingCBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "699239";
		printsubstring(s);
	}
	public static void printsubstring(String s) {
		int count = 0;
		boolean [] visited = new boolean[s.length()];
		for(int len =1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i = j-len;
				String str = s.substring(i,j);
				//Long.parseLong(str) --> string to number ma convert for numeric string ko
				//Integer.parseInt(str) --> string to int
				if(iscbnumber(Long.parseLong(str)) == true && isvisited(visited,i,j-1) == true) {
					count++;
					for(int k=i;k<j;k++) { // kisi or ka sath invole na ho
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean iscbnumber(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
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
	public static boolean isvisited(boolean[] visited,int si,int ei) {
		for(int i=si;i<=ei;i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		return true;
	}

}
