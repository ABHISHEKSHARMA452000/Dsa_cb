package Doubts_solved;

public class leetcode_2596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
		System.out.println(Tour(arr,0,0,0));
	}
	public static boolean Tour(int[][] arr,int cr,int cc,int count) {
		if(count == arr.length*arr[0].length) {
			return true;
		}
		int[] r = {-2,-2,2,2,1,-1,1,-1};
		int[] c = {-1,1,-1,1,2,2,-2,-2};
		if(cr<0 || cc<0 || cr >= arr.length || cc>=arr[0].length || arr[cr][cc] != count){
			return false;
		}
		for(int i =0;i<c.length;i++) {
			boolean ans = Tour(arr,cr + r[i],cc+c[i],count +1);
			if(ans) {
				return true;
			}
		}
		return false;
	}
}
