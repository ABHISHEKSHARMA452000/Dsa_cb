package assignments;

import java.util.*;

public class Numberladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = 1;
		int row = 1;
		int val=1; // val ko update mat karo bus loops sa bhar kar do toh updation nhi hogi
		while(row<=n) {
			int i=1;	
			while(i<=star) {
				System.out.print(val +" ");
				i++;
				val++;
			}
			System.out.println();
			star++;
			row++;
		}
	}

}


//4
//1 
//2 3 
//4 5 6 
//7 8 9 10 