package OOPS_Abtract_Interface;


//multiple inheritence achieved here of DSA_I and DyanmicStack Interfaces
public interface StackI extends DSA_I,DyanmicStack{
	//Interfaces vo hota hai jinma only funtion ka name hota hai body nhi hoti 
	//class ma hum implement karta hai interfaces ka har method ko
	//bydefault interface ka method public and abstract hota hai
	//interface class ka andar hi implement hoga 
	//interface ka object nhi banta bcoz funtion complete nhi
	//Interface inherit ho sakta hai using extends
	void push();
	int pop();
	int size();
	int val = 9;
	
	//java 8 ma allowed
	default void SayHey() {
		System.out.println("hello");
	}
	public static int fun1() {
		return 10;
	}
//	@Override //karna pad ga method when dono DSA_I,DyanmicStackma same method tha super kar ka use kara then
//	default void hello() {
//		// TODO Auto-generated method stub
//		DSA_I.super.hello();
//	}
	
	//java 9 ma private bhi allow kar diya
	private int java9() {
		return 9;
	}
	
}







