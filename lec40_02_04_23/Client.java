package lec40_02_04_23;

final class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		//case2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)(obj)).d2); //type cast karta time compile time 
//		System.out.println(((C)(obj)).d);
//		obj.fun();
//		obj.fun1();
//		((C)(obj)).fun2();
		//case 3
//		C obj = new P();
//		//not  allowed
		//case 4
		
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)(obj)).d);
		obj.fun();
		obj.fun1();
		obj.fun2(); 
		
	}

}
