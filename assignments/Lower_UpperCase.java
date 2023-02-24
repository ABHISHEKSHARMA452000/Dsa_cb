package assignments;

import java.util.Scanner;

public class Lower_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			if(ch >= 97 && ch <=122) { // ch>= 'A' && ch <= 'Z'
				System.out.println("lowercase");
			}else if(ch >= 65 && ch <= 90 ){
				System.out.println("UPPERCASE");
			}else {
				System.out.println("Invalid");
			}
	}

}
