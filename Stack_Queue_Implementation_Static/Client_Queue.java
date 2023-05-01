package Stack_Queue_Implementation_Static;

public class Client_Queue {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Display();
		q.Dequeue();
		q.Dequeue();
		q.Display();
		q.Enqueue(50);
		q.Display();
		//ya enqueue possblie bcoz of circular queue bana le
		q.Enqueue(60);
		q.Display();
		q.Enqueue(70);
		q.Display();
		q.Enqueue(80);
	}

}
