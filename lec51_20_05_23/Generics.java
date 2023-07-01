package lec51_20_05_23;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {10,20,30,40,50};
		Display(arr);
		String[] arr1 = {"Riya","Anku"};
		Display(arr1);
  	}
	//before return type sa phele <JO dil kara>
	//T run time ma Integer ,String ma convert ho jayaga
	//angular brackett bata raha hai generic hai 
	public static <T> void Display(T [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
