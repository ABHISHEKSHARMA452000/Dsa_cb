package assignments;

import java.util.*;
public class print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int val = 0;
        while(n>0){
            int rem = n%10;
            val = val*10 + rem;
            n = n/10;
        }
        System.out.println(val);
	}

}

//count digits code 
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