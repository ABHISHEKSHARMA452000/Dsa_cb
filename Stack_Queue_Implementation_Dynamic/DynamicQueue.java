package Stack_Queue_Implementation_Dynamic;

import Stack_Queue_Implementation_Static.*;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception{
		if(IsFull()) {
			int[] narr = new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {//example arr 60->0th,70->1st index,front 2nd index 30->2nd,40->3rd,50->4th index par  
				int idx = (front + i)%arr.length; //possiblity hai ki front 0  par na ho toh aus case ma idx aass hi hoga
				narr[i] = arr[idx];
			}
			arr = narr;
			front = 0;//bcoze ab new arr ma value queue ki sahi sa hi assign ho gayi hai
			//0th-30,1st-40,2nd-50,3rd-60,4th-70,other value add to other indexs
		}
		super.Enqueue(item);
	}
}
