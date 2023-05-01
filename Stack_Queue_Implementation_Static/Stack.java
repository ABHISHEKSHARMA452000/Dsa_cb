package Stack_Queue_Implementation_Static;

public class Stack {
	/*Data member*/
	//private int[] arr; //private bcoze i dont want any one out to access it //arr is just a variable of arr type abhi arr nhi bana hai
	//yahi par new int[] nhi kiya bcoze aussa vo fixed size ka ho jata
	protected int[] arr;
	//private int tos; //index to top ka elemnt ko point kara //kis index par latest value dalee hai vo bata raha hai
	//jaha tak tos hoga vhi tak stack hoga auska baad ki value ka liya nhi 
	protected int tos;
	/*two types of constructor */
	//1.if user na koi size of stack nhi define kiya
	public Stack() {
		arr = new int[5];
		tos = -1;//-1 means abhi koi value nhi dali and stack empty hai
	}
	//2.if user provide size of 
	public Stack(int cap) {
		arr = new int[cap];
		tos = -1;
	}
	// Methods in stack
	public boolean IsEmpty() {
		if(tos == -1) {
			return true;
		}
		return false;
	}
	public boolean IsFull() {
		if(tos == arr.length-1) {
			return true;
		}
		return false;
	}
	public int size() {
		return tos+1;
	}
	public void push(int item) throws Exception{
		if(IsFull()) {
			throw new Exception("Stack is full");
		}
		tos++;
		arr[tos] = item;
	}
	public int pop() throws Exception{
		if(IsEmpty()) {
			throw new Exception("Stack is empty");
		}
		int val = arr[tos];
		tos--;
		return val;
		
	}
	public int peek() throws Exception {
		if(IsEmpty()) {
			throw new Exception("Stack is empty");
		}
		int val = arr[tos];
		return val;
	}
	public void Display() {
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
