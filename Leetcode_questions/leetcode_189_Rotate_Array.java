package Leetcode_questions;

public class leetcode_189_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k=3;
		Rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Rotate(int[] arr,int k) {
		while(k >0) {
			k=k%arr.length;
			int temp = arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = temp;
			k--;
		}	
	}

}
