package lec38_26_03_23;

public class Person_Client {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		System.out.println("bye");
		Person p = new Person("pinku",22);
//		p.age = -90;
//		System.out.println(p.name);
//		System.out.println(p.age);
		p.setAge(-90);
		System.out.println(p.getAge());
	}

}
