package assignments;

import java.util.Scanner;

public class DNF_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sort(int[] arr) {
		int l=0;//tell next 0 konsi index par aaya ga
		int r = arr.length-1;//tell next 2 konsi index par aaya ga
		int i=0;
		while(i<=r) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[l];
				arr[l] = temp;
				i++;
				l++;
			}else if(arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[r];
				arr[r] = temp;
				r--;
				//i++ //isliya nhi hoga incase ki 2 hi 2 sa swipe hoga ya and i++ kar diya toh phicha ek 2 raha gaya with sort kiya
			}else {
				i++;
			}
		}
	}

}
//6
//0 1 2 0 1 2 //why we dont do i++ for 2 test case
//8
//1 0 2 1 0 0 2 1