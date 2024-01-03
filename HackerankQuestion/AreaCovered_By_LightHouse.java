package HackerankQuestion;

import java.util.*;

public class AreaCovered_By_LightHouse {

//	Constraints
//	1<=H<=100;
//	angle only 30,45,60
//	pi=3.14
//	use ceil function to round of the value at the end
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int angle = sc.nextInt();
		if(angle == 30 || angle == 45 || angle == 60) {
			if(H<1 || H>100) {
				System.out.println("Invalid Input");
			}else {
				double x = H*Math.tan(Math.toRadians(angle));
				double area = 3.14*x*x;
				System.out.println(area);
				double ans = Math.ceil(area);
				System.out.println(ans);
				int result = (int)ans;
				System.out.println(result);
			}
		}
//		double radian = Math.toRadians(angle);
//		double val = Math.tan(radian);
//		double x = val*H;
//		double area = 3.14*x*x;
//		System.out.println(area);
//		double ans = Math.ceil(area);
//		System.out.println(ans);
//		int result = (int)ans;
//		System.out.println(result);
		
	}
	

}
