package lec39_01_04_23;

public class Stack {
//	private int[] arr; //private jissa isma hi access ho
//	private int tos;
	protected int[] arr;
	protected int tos;
	
	public Stack() { //constructor if user na koi value nhi di
		arr = new int[5]; //Stack st = new Stack();
		tos = -1; //ek bhi element nhi hai thats why tos =-1 la liya
	}
	public Stack (int cap) { //contructor if user na capacity provide kari
		arr = new int[cap]; // Stack st1 = new Stack(10);
		tos = -1; ////ek bhi element nhi hai thats why tos =-1 la liya
	}
	public boolean isfull() {
		return tos == arr.length-1;
	}
	public boolean isEmpty() {
		return tos == -1;
	}
	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Baklol Stack full hai");
		}
		tos++;
		arr[tos] = item;
	}
	public int size() {
		return tos+1;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Baklol Stack khaali hai");
		}
		int val =  arr[tos];
		tos--;
		return val;
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Baklol Stack khaali hai");
		}
		int val = arr[tos];
		return val;
	}
	public void Display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
