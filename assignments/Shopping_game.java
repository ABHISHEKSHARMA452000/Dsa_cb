package assignments;

import java.util.*;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int h = sc.nextInt();
			int count = 1;
			while(a>=0 && h>=0) {
				if(count%2 == 1) {
					a=a-count;
				}else {
					h = h-count;
				}
				count++;
			}
		}
	}

}
