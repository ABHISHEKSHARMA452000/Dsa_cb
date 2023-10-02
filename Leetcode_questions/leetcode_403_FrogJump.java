package Leetcode_questions;

import java.util.*;

public class leetcode_403_FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	public static boolean canCross(int[] stones) {
//		HashSet<Integer> set = new HashSet<>();
//		for (int i = 0; i < stones.length; i++) {
//			set.add(stones[i]);
//		}
//		if(stones[1] == 1+stones[0]) {
//			return ispossible(stones,set,1,1);
//		}else {
//			return false;
//		}
//	}
//	public static boolean ispossible(int[] stones,HashSet<Integer> set,int LJ,int i) {
//		
//		
//		if(LJ-1>=0 && set.contains(stones[i] + LJ-1)) {
//			boolean k_M1 = ispossible(stones,set,LJ-1,i+LJ-1);
//		}
//		if(set.contains(stones[i] + LJ)) {
//			boolean k = ispossible(stones,set,LJ,i+LJ);
//		}
//		if(set.contains(stones[i] + LJ+1)) {
//			boolean k_P1 = ispossible(stones,set,LJ+1,i+LJ);
//		}
//		
//		
//	}

}
