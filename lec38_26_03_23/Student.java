package lec38_26_03_23;

public class Student {
	int age;
	String name;
	
	public void Intro() {
		System.out.println("My name is " + name + " and age is " + age);
	}
	public void SayHey(String name) {
		System.out.println(name + " Say Hey " + this.name);
	}
	public static void fun() {
		System.out.println("I am in Fun");
	}
	static { //main sa bhi phele pre main method hota hai ya sabsa phele chal ta hai
		System.out.println("hello");
	}
	static {
		System.out.println("bye");
	}
}
