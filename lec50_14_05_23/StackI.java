package lec50_14_05_23;
//by default abstact and public hota hai method
//variable bydefault final hota hi hai
//class ma aasa nhi hota hai 
public interface StackI {
	
	public void push(int item);
	public int pop();
	public int size();
	//variable in interface and it final hota hai
	//int val; bcoze iska object nhi banta hai toh initial nhi hoga
//	public static final int val = 90;
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
