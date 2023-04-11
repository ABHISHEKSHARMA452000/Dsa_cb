package lec38_26_03_23;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name= "Kaju";
		s.age = 15;
		System.out.println(s.name);
		System.out.println(s.age);
		Student s1 = new Student();
		s1.name = "Raj";
		s1.age = 25;
		s.Intro();
		s1.Intro();
		s.SayHey("kamlesh");
	}

}




