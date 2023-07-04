package lec51_20_05_23;

public class CarsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[7];
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		//Display(arr);
		//Sort(arr);
		Display(arr);
	}

	public static void Display(Cars[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// Comparable_Comparators.Cars@76ed5528 == packagename.classname + @ + hexcode
		}
	}

	// bound set kar diya only vo t aaya ga jo
//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//		for (int iteration = 1; iteration < arr.length; iteration++) {
//			for (int idx = 0; idx < arr.length - iteration; idx++) {
//				if (arr[idx].compareTo(arr[idx + 1]) > 0) {// error dega bcoze addres compare nhi hoga for anytype ka
//															// liya like cars,color,prices,etc
//					T temp = arr[idx];
//					arr[idx] = arr[idx + 1];
//					arr[idx + 1] = temp;
//				}
//			}
//		}
//	}
}
