package Doubts_solved;

public class SubsetPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		Print(arr,0,"",3,0);
	}
	public static void Print(int[] arr,int i,String ans,int target,int sum) {
		if(i==arr.length) {
			if(sum == target) {
				System.out.print(ans + " ");
				
			}
			return;
		}
		Print(arr,i+1,ans + arr[i] + " ",target,sum + arr[i]);
		Print(arr,i+1,ans,target,sum);
	}
}
