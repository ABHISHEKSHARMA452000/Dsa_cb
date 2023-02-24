package lec10_4_12_22;

public class Max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4,15,6};
		int max = Maxvalue(arr);
		System.out.println(max);
	}
	public static int Maxvalue(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
