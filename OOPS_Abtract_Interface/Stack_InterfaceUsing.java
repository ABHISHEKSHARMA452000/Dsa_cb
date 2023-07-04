package OOPS_Abtract_Interface;

//Interface ma Inheritence allowed hai
//to use interface we use implements
//interface ki help sa multiple inheritence allowed hai bocze no conflit ki konsa function use karna jo class ma conflit aa raha tha
public class Stack_InterfaceUsing implements StackI{
	//interface client ka ma iska object bana ka use kar liya all functions 
	
	//display method only made once bcoz body of funtion same raha gi for all objects ka liya ab
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean Isfull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Isempty() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
