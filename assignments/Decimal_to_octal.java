package assignments;

import java.util.*;

public class Decimal_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%8;
            sum = sum + rem*mul;
            mul = mul*10;
            n = n/8;
        }
        System.out.println(sum);
	}

}
