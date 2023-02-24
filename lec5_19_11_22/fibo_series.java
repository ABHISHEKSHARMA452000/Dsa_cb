package lec5_19_11_22;

import java.util.*;

public class fibo_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b= 1;
		int i=1;
		while(i<=n) { //if i<=n-1 toh b print and i<=n toh a print
			int c= a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
	}

}
