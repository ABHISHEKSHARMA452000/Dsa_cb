package Stack_Queue_Implementation_Dynamic;

public class DequeueEfficientQueue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DequeueEfficientQueue_UsingStack dq = new DequeueEfficientQueue_UsingStack();
		dq.Enqueue(10);
		System.out.println(dq.GetFront());
		dq.Enqueue(20);
		System.out.println(dq.GetFront());
		dq.Dequeue();
		System.out.println(dq.GetFront());
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.GetFront());
		System.out.println(dq.size());
		
		
	}

}
