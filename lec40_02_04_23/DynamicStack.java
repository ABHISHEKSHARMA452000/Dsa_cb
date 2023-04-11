package lec40_02_04_23;

import lec39_01_04_23.Stack;

public class DynamicStack extends Stack{
	@Override
	public void push(int item) throws Exception {
		if(isfull()) { // double size ka array banaya ga then copy then add karo
			int[] narr = new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				narr[i] = arr[i];
			}
			arr = narr;
 		}
		//push(item); ya recursive call lag jaya gi
		super.push(item);
	}

}
