package lec40_02_04_23;

import lec39_01_04_23.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] narr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (i + front) % arr.length;
				narr[i] = arr[idx];

			}
			arr = narr;
			front = 0;
		}

		super.Enqueue(item); //if queue not full toh normal vala enqueue chal na chahiya toh thats why super keyword use kiya jissa ki Parent class ka enqueue function yaha aa gaya
	}
}
