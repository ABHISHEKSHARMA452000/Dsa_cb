package lec50_14_05_23;
//by default abstact and public hota hai method
//variable bydefault final hota hi hai
//class ma aasa nhi hota hai 
//interface ki help sa hum return type fix kar sakta hai jissa ka koi ausko baar baar change na kara


public interface StackI {
	
	public void push(int item);
	public int pop();
	public int size();
	
	
	
	
	
	
	//variable in interface bydefault public static and final hota hai
	//int val; bcoze iska object nhi banta hai toh initial nhi hoga
	//isliya variable ko yahi par value di jati hai
//	public static final int val = 90;
	/*
	 * kisi function ka samna final toh vo method override nhi hota hai
	 * kisi variable ka samna final  toh vo variable constant ho gaya vo change nhi kar sakta hai
	 * kis class ma samna final toh aus class ko kabhi inherit nhi kiya ja sakta //class inherit nhi kar sakta
	 */
	
//	//after java 8 ka baat body allowed kiya hai in interface
//	public static void sayhey1() {
//		System.out.println("sndasnklj");
//	}
//	default void sayhey2() {
//		System.out.println("cnkjasnkjnkl");
//	}
//	private static void sayhey3() {
//		System.out.println("cbakjsjkas");
//	}
//	//java 9 ma 
//	private int fun1() {
//		return 9;
//	}
}
