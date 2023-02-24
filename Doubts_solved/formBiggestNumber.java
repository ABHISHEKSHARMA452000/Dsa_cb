package Doubts_solved;

public class formBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {54,546,548,60};
		IsNumber(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void IsNumber(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(compare(arr[j],arr[j+1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static long compare(int a,int b) {
		String n1n2 = "" + a + b;
		String n2n1 = "" + b + a;
		return Long.parseLong(n2n1) - Long.parseLong(n1n2);
	}

}
