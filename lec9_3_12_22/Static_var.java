package lec9_3_12_22;

public class Static_var {
	static int val = 100;// class ka andar funtion ka bahar global variable //global variable bhi update hota hai and ek bar change hona baad value reflect bhi hoti hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 9;
		fun(8,5);
		System.out.println(val);
		
	}
	public static void fun(int x,int y) {
		x =x+9;
		System.out.println(x);
		System.out.println(val); //color diifer bhi hai
		int val = 9;
		val = val+6;
		System.out.println(val);
		Static_var.val = Static_var.val + 10; //if global ma update karna hai toh class name ka sath dot kar da
		System.out.println(Static_var.val);
		
	}

}
