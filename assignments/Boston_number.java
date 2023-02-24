package assignments;

import java.util.Scanner;

public class Boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //basically code hai to find prime factor aata hai ya nhi find karna
		//prime factor :factor of number which are prime number and factor of the number eg 24=2*2*2*3
		//factors 24=2,3,6,12,24
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tempnum = n;
		int sum1 = 0;
		while(tempnum > 0) {
			int rem = tempnum%10;
			sum1 = sum1 + rem;
			tempnum = tempnum/10;
		}
		tempnum = n;
		int sum2 = 0;
		int fac = 2;
		while(tempnum > 0) { //fac bhi prime number hona chahiya and divide kar == 0  bhi toh phele fac check karo then sum2 ma add
			if(tempnum/fac == 0) {
				sum2 = sum2 + fac;
			}
			fac++;
		}
	}

}
