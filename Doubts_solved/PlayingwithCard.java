package Doubts_solved;

import java.util.*;

public class PlayingwithCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<n;i++) {
			s.push(sc.nextInt());
		}
	}
	//b divisle vala
	//a not divisble
	
	public static boolean Isprime(int i) {
		int div =2;
		while(div*div<=i) {
			if(i%div == 0) {
				return false;
			}
		}
		return true;
	}

}
