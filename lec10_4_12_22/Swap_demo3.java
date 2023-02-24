package lec10_4_12_22;

public class Swap_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4};
		int[] other = {20,13,11,9};
		int[] arr2 = other; //just arr2 ka ek variable bana hai just address copy kara hai
		
		System.out.println(arr[0] + " " + other[0]);
		swap(arr,other);
		System.out.println(arr[0] + " " + other[0]);
		
	}
	public static void swap(int[] arr,int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}

}
