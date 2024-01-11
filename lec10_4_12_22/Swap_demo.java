package lec10_4_12_22;

public class Swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int[] arr = {2,3,1,4,5,6};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0],arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
		
	}
	public static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a + " " + b);
	}

}
