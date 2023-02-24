package lec10_4_12_22;

public class ReverseArray_withoutMakingNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two pointer approach
		int[] arr = {2,3,4,5,6};
		int[] reverse = ReverseArray(arr);
		for(int i=0;i<reverse.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] ReverseArray(int[] arr) { //array ma change kar diya toh no need to return type arr void sa bhi kam chal jaya ga
		int left = 0;
		int right = arr.length-1;
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
