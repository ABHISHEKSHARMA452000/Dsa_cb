package lec10_4_12_22;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,3,1,4,5,6};
		int value = 4;
		int index = find(arr,value);
		System.out.println(index);
		
	}
	public static int find(int[] arr ,int value) {
		int index = 0;
		//if loop nhi chal hai toh isliya bhar return dena need hai thats why bhar bhi return daal na pada ga complierko bata na padaga ki if loop nhi chala toh kya return karu ma 
		for(int i=0;i<arr.length;i++) {
			if(value == arr[index]) {
				return index;
			}
//			else{
//				return -1; ya nhi karna hai bcoze issa first condition false hua and -1 hi return ho gaya
//			}
			index++;
		}
		return -1;
	}

}
