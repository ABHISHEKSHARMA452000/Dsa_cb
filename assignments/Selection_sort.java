package assignments;
import java.util.*;
public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int mini = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
