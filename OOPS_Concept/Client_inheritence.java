package OOPS_Concept;

public class Client_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*There are 4 case of inheritence 
		 * 1. P ka reference variable and P ka hi object;
		 * 2. P ka reference variable and C ka object;
		 * 3. C ka reference variable and P ka object;
		 * 4. C ka reference variable and C ka hi object
		 */
		
		//Case-1 No problem simple same type of reference variable and same type of object
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		System.out.println("**********");
		//Case-2 P ka reference variable and C ka object
		/*yaha par bcoze object c ka hoga toh rumtime par object ma p and c dono ka data members ko space allocated hui hogi
		 * but code run hona sa phele compile time ma hota hai toh P ka according chala ga toh is case ma obj2 ko d2 nhi dehka ga
		 * but d2 ko memory toh mila ga toh ausko type cast karna lana hoga
		 * complie time ma right to left progrma kaam kara ga toh thats why only jiska reference variable hoga auska hi data member and function visible aa raha honga
		 * rum time ma left to right toh is ma phele obj2 ka data member ko space mil jayagi*/
		P obj2 = new C();
		System.out.println(obj2.d); //jiska Refernce variable auska d 
		System.out.println(obj2.d1);
		System.out.println(((C)(obj2)).d); //type cast
		System.out.println(((C)(obj2)).d2); //type cast karta time compile time
		
		obj2.fun();//yaha hai baat ki if child ka object hai and fun override ho gaya hai toh always vo child ka hi aayaga parent ka kabhi nhi aayaga
		obj2.fun1(); //koi problem nhi P ka hai
		((C)(obj2)).fun2(); //type cast sa fun2 C ka aagaya
		System.out.println("************");
		
		//Case-3 Not allowed in Java 
		//becoze P ka object and C ka reference variable hoga toh C d2 ko dehka ga but p ka object ma vo runtime par nhi hoga toh error de de ga jabki compile 
		//time pa d2 dehk raha hoga
		
		//Case-4 simple same as case1
		C obj4 = new C();
		System.out.println(obj4.d);// d of c
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		System.out.println(((P)(obj4)).d); //to get d of P
		
		obj4.fun();
		obj4.fun1();
		obj4.fun2();
		
	}

}
