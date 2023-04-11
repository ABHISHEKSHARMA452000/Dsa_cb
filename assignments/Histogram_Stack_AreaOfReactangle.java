package assignments;

import java.util.*;

public class Histogram_Stack_AreaOfReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*some example test case jo question clear kara ga
		 * arr = {4,5,6,4,3,2,1};
		 * arr = {5,4,6,8,3,6,7};
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Histogram(arr);
	}
	public static int Histogram(int[] arr) {
		Stack<Integer> st = new Stack<>(); //stack ma element arrange ho rahai ha according to next greater peek hai hai,and jab next smaller aa raha hai toh hum pop kara hai
		int ans = 0;		//and auska baad jo peek par hai auska next greater vo hai jo abhi pop kara hai
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int r=i;
				int h = arr[st.pop()];
				if(st.isEmpty()) {
					int area = h*r;
					ans = Math.max(ans, area);
				}else {
					int l = st.peek();
					int area = h*(r-l-1);
					ans = Math.max(ans, area);
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while(!st.isEmpty()) {
			int h = arr[st.pop()];
			if(st.isEmpty()) {
				int area  = h*r; //ya kyu hai bcoze jab last element pop hua jo ki 1 tha ya 100% hai ki 1 sabsa choota tha bcoze 1 kiska 
				//next greater nahi bana and 1 sa  element ka area ban gaya and one ka right ma bhi sab bada hi honga 100% bcoze aasa nhi hoga toh jo 
				//one ka right ma hoga one sa chhota vo one ka area calculate karava dega
				//thats why we do h*r for sure
				ans = Math.max(ans, area);
			}else {
				int l = st.peek(); //ya condition 7 jab peek par hoga toh sahi hai,, in this 1 ka NGE 7 hoga and r=arr.length maan kar humna ek elemnt r par 
				//set kar diya of 0 length then 7 ka area calculate kar liya
				int area = h*(r-l-1);
				ans = Math.max(ans, area);
			}
		}
		return ans;
	}

}
