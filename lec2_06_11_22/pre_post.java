package lec2_06_11_22;

public class pre_post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println(a);
		System.out.println(a++); //post increment hai toh phele print hoga then update hogi value
		System.out.println(a);
		int c = a++ + a-- + 8 - a-- - a++;
		System.out.println(c);
		int d = a++ + a-- + 8 + a-- - a++ - a++;
		System.out.println(d);
	}

}
