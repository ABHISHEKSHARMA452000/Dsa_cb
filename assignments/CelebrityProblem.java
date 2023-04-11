package assignments;

import java.util.*;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //number of persons
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int who = Celebrity(arr,n);
		if(who == -1) {
			System.out.println("No Celebrity");
		}else {
			System.out.println(who);
		}
		
	}
	public static int Celebrity(int[][] arr,int n) {
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++) {
			st.push(i);
		}
		while(st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if(Knows(a,b,arr) == true) {
				st.push(b); //means a mere celebrity nhi hai
			}else {
				st.push(a); // means a -> b ko nhi jaan ta
			}
		}
		int possibleCandidate = st.pop();
		for(int i=0;i<n;i++) {
			if(i == possibleCandidate) {
				continue;
			}else if(Knows(i,possibleCandidate,arr) == false && Knows(possibleCandidate,i,arr) == true) {
				return -1;
			}
		}
		return possibleCandidate;
	}
	public static boolean Knows(int a,int b,int[][] arr) {
		if(arr[a][b] == 1) {
			return true;
		}
		return false;
	}

}
