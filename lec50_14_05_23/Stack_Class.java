 package lec50_14_05_23;
//interface implemnet hoga and iska bhi object nhi banta hai 
public class Stack_Class implements StackI{

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		/*
		 * int x = StackI.val
		 * StackI.val += 3;*/
		//yaha error aaya ga bcoze final hog Vl in interface ausko change nhi kar sakta hai 
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
