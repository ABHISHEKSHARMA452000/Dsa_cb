package assignments;

import java.util.*;

public class Do_you_know_Table_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int limit = scn.nextInt();
		int i=1;
		while(i<=limit) {
			System.out.println(num*i);
			i++;
		}
	}

}
