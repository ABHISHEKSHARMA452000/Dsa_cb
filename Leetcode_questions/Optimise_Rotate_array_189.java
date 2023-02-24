package Leetcode_questions;

public class Optimise_Rotate_array_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		int k=3;
		Rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Rotate(int[] arr,int k) {
		k = k%arr.length;
		int n = arr.length;
		ReverseArray(arr,0,n-k-1); //1st n-k
		ReverseArray(arr,n-k,n-1); // last k
		ReverseArray(arr,0,n-1);// complete array
	}
	public static int[] ReverseArray(int[] arr,int left,int right) { //array ma change kar diya toh no need to return type arr void sa bhi kam chal jaya ga
		
		while(left < right) { // array ki index ma hi change kar diya hai 
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return arr;
	}

}
