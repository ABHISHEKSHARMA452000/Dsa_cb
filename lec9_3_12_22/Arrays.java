package lec9_3_12_22;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // normal array;
		int[] arr = new int[5]; //array
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		boolean[] arr1 = new boolean[5];
//		System.out.println(arr1[0]);
//		
//		char[] ar = new char[5];
//		System.out.println(ar[0]);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
