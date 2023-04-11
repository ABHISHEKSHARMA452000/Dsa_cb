package Leetcode_questions;

public class leetcode_357_CountNumberWithUniqueDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int limit = (int)Math.pow(10, n);
		boolean[] marked = new boolean[10];
		//System.out.println(limit);
		if(n == 0) {
			System.out.println(1);
		}else {
			int ans = Count(n,limit,marked,0);
			System.out.println(ans + 1);
		}
		
	}
	public static int Count(int n,int limit,boolean[] marked,int num) {
		int count = 0;
		if(num < limit && num > 0) {
			count++;
			//System.out.println(num);
		}
		if(num > limit) {
			return 0;
		}
		int i=0;
		if(num == 0) {
			i=1;
		}
		for(;i<=9;i++) {
			if(marked[i] != true) {
				marked[i] = true;
				int a1 = Count(n,limit,marked,num*10+i);
				count += a1;
				marked[i] = false;
			}
		}
		return count;
	}
}
