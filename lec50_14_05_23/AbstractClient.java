package lec50_14_05_23;

public class AbstractClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo2 ab = new AbstractDemo2();
		/*
		 * 1.
		AbstractDemo2 ka object bana sakta hai bcoze ausma abstractdemo ka umimplemented 
		method bhi implemnt kar diya hai and ab dono ka methods use kar sakta hai ek ka object bana ka
		2.
		//always jab bhi abstract class ka method use karna hoga toh aus case ma hum ko phele
		 * abstract class ko inherit karna hoga to other class ma then object bana kar auska method used kar sakta hu
		 * 
		*/
				
		//ya ek method hai jissa ki hum umimplement method ko bhi body de denga
//		Abstract_Demo ab = new Abstract_Demo() {
//		Abstract method ka hum object nhi bana sakta hai because is ma koi unimplemented method hai if object 
//		bana  toh koi aus fun function ko call kar sakta hai jo ki error de dega
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		}
		
		
		//after java 8 ka baad ya feaure mil gaya hai
		//is tarah sa bhi ab implemnet kar sakta hai hum java ma feature aaya hai
		Abstract_Demo ab2 = new Abstract_Demo() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
