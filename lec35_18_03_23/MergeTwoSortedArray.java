package lec35_18_03_23;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,5,11,14,16};
		int[] arr2 = {2,3,5,7,11,13,18,19};
		int[] ans = mergetwosortedarray(arr1,arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	public static int[] mergetwosortedarray(int[] arr1,int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;k++;
			}else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k] = arr1[i];
			i++;k++;
		}
		while(j<m) {
			ans[k] = arr2[j];
			j++;k++;
		}
		return ans;		
	}
}
