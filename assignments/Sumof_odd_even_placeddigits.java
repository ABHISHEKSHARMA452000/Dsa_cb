package assignments;

import java.util.Scanner;

public class Sumof_odd_even_placeddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sume = 0;
		int sumo = 0;
		int count = 1;
		while(n > 0) {
			int rem = n%10;
			if(count%2 == 1) {
				sumo = sumo + rem;
			}else {
				sume = sume + rem;
			}
			count++;
			n = n/10;
		}
		System.out.println(sumo);
		System.out.println(sume);
	}

}
