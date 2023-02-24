package assignments;

import java.util.*;

public class Do_you_know_Table_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int limit = scn.nextInt();
		int i=1;
		while(num*i <= limit) { // kya mere inside declared var loop ki condition ma chala ga
			System.out.println(num*i);
//			if(num*i <= limit) {
//				System.out.println(num*i);
//			}			
			i++;
		}
	}

}

//count digits

//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int digit = scn.nextInt();
//        int count = 0;
//        while(n>0){
//            int rem = n%10;
//            n = n/10;
//            if(rem == digit){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}