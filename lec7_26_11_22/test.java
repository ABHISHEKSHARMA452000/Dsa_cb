package lec7_26_11_22;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = (byte)(191); //b byte type hai 8 bits only
		System.out.println(b);
		int a = 10; // a int type hai 32bits
		//b=a; cannot convert from int to byte 32bits 8 bits ma nahi rahk sakta thats why conversion needed hai
		b=(byte)a;
		System.out.println(b);
		a = 132;
		//b=a; cannot convert from int to byte
		b=(byte)a;
		System.out.println(b);
		//float f = 8.9;//cannot convert from double to float ma float likta time isma literal double hai toh conversion always karna hi pada ga
		float f1 = (float)8.9;
		float f2 = 8.8f;
		System.out.println(f1+ "  " + f2);
		
		char ch1 = 48;
		System.out.println(ch1);  // char ko value di toh ausna according character da diya;
		int ch2 = '0';
		System.out.println(ch2); // int ko char diya toh auska according ascii value da di
		
		int x = 2;
		int y = 68;
		char ch3 =(char) y;//ya line error da rahi hai
		System.out.println(ch3);
		char c = (char)(y-x); 
		System.out.println(c);
		
		int d = 'd';
		int e = 'e';
		int result = e-d;
		System.out.println(result);
		
		char ch4 = 'd';
		char ch5 = 'f';
		int ch6 = ch5 -ch4;
		System.out.println(ch6);
		
	}

}
