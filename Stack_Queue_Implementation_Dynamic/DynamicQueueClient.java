package Stack_Queue_Implementation_Dynamic;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		dq.Dequeue();
		dq.Dequeue();
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Display();
		dq.Enqueue(80);
		dq.Display();
	}

}
