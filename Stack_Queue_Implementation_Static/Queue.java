package Stack_Queue_Implementation_Static;
//fifo
public class Queue {
//	private int[] arr;
//	private int front=0;//
//	private int size=0;// staring ma = size ko hi use kara ga to give size and rear/last elemnt tak jana ka liya bhi point ka liya same size ka hi use karaha hai     
	
	protected int[] arr;
	protected int front=0;//
	protected int size=0;
	
	public Queue(){
		arr = new int[5];
	}
	public Queue(int cap) {
		arr = new int[cap];
	}
	public boolean IsEmpty() {
		return size == 0;
	}
	public boolean IsFull() {
		return size == arr.length;
	}
	public int size() {
		return size;
	}
	public void Enqueue(int item) throws Exception{ //enqueue means last ma add karana hai
		if(IsFull()) {
			throw new Exception("Queue is Full");
		}
		int idx = (front + size)%arr.length;
		arr[idx] = item;
		size++;
	}
	public int Dequeue() throws Exception{ //remove from front
		if(IsEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int val = arr[front];
		front = (front + 1)%arr.length;
		size--;
		return val;
	}
	public int GetFront() throws Exception{
		if(IsEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int val = arr[front];
		return val;
	}
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx = (front + i)%arr.length; //front 2 so 2+0,2+1,2+2 = index par
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
