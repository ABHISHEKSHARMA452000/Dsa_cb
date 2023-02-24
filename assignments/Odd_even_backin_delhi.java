package assignments;

import java.util.*;

public class Odd_even_backin_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int cn = sc.nextInt();
			int sumo = 0;
			int sume = 0;
			while(cn > 0) {
				//System.out.println(cn);
				int rem = cn%10;
				//System.out.println(rem);
				if(rem%2 == 0) {
					sume = sume + rem;
				}else {
					sumo = sumo + rem;
				}
				cn = cn/10;
				//System.out.println(cn);
			}
			//System.out.println(sume + " " + sumo);
			if(sume%4 == 0 || sumo%3 == 0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}

}
