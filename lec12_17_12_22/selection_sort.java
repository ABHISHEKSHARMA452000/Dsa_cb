package lec12_17_12_22;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,7,8,11,2,9,4,1};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int mini = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[mini] > arr[j]) {
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}
	}

}
