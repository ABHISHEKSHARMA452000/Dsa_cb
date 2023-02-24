package lec19_15_01_23;
import java.util.ArrayList;
import java.util.Collections;
public class leetcode_498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		Traverse(arr);
	}
	public static void Traverse(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] ans = new int[n*m];
		int idx = 0;
		for(int d=0;d<n+m-1;d++) {
			int r=0,c=0;
			if(d<m) {
				c=d;
			}else {
				r = d - m+1;
				c= m-1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while(r<n && c>= 0) {
				//System.out.print(arr[r][c] + " ");
				list.add(arr[r][c]);
				r++;
				c--;
			}
			if(d%2 == 0) {
				Collections.reverse(list);
			}
			for(int i = 0;i<list.size();i++) {
				ans[idx] = list.get(i);
				idx++;
			}
			//System.out.println(list);
			
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
