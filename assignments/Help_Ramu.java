package assignments;

import java.util.*;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] riskused = new int[n];
			for(int i =0;i<n;i++) {
				riskused[i] = sc.nextInt();
			}
			int[] cabused = new int[m];
			for(int i=0;i<m;i++) {
				cabused[i] = sc.nextInt();
			}
			System.out.println(Min_Cost(c1,c2,c3,c4,riskused,cabused));
		}
	}
	public static int Min_Cost(int c1,int c2,int c3,int c4,int[] rick,int[] cab) {
		int sum = 0;
		int rickcost = 0;
		int cabcost = 0;
		int totrick = 0;
		int totcab = 0;
		for(int i=0;i<rick.length;i++) {
			rickcost += Math.min((rick[i]*c1), c2);
		}
		totrick = Math.min(rickcost, c3);
		for(int i=0;i<cab.length;i++) {
			cabcost += Math.min((cab[i]*c1), c2);
		}
		totcab = Math.min(cabcost, c3);
		
		sum = Math.min(totcab + totrick, c4);
		
		
		return sum;
	}

}
