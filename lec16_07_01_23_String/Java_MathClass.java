package lec16_07_01_23_String;

public class Java_MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for sin
		double degrees1 = 45.0;
		// convert degrees to radians
		double radians1 = Math.toRadians(degrees1);// Math.toRadians(double degree)
		// sin() method to get the sine value
		double sinValue = Math.sin(radians1);// Math.sin(double radians)
		// prints the sine value
		System.out.println("sin(" + degrees1 + ") = " + sinValue);

		// for cos
		double degrees2 = 45.0;
		// convert degrees to radians
		double radians2 = Math.toRadians(degrees2);// Math.toRadians(double degree)
		// cos() method to get the cosine value
		double cosValue = Math.cos(radians2);// Math.cos(double radians)
		// prints the cosine value
		System.out.println("cos(" + degrees2 + ") = " + cosValue);

		// for tan
		double degrees3 = 45.0;
		// convert degrees to radians
		double radians3 = Math.toRadians(degrees3);// Math.toRadians(double degree)
		// cos() method to get the tangent value
		double tanValue = Math.tan(radians3);// Math.tan(double radians)
		// prints the tangent value
		System.out.println("tan(" + degrees3 + ") = " + tanValue);

		// ceiling function in java it is least integer function in maths
//		“A ceil function converts a decimal number to the immediate largest integer.” If the number passed is already a whole 
//		number or an integer, then the same number is the ceiling value. However, if you pass a null value to the ceil function 
//		in mathematics you get a “zero”
		// 1.
		double a = Math.ceil(-6.2456677);//// Math.ceil(double val)
		System.out.println(a);
		// 2.
		double b = Math.floor(-6.2456677);// gif greatest integer function ////Math.floor(double val)
		System.out.println(b);
		// 3.
		double c = 4.36;
		double d = Math.sqrt(c);//// Math.sqrt(double val)
		System.out.println(d);

		double e = Math.pow(3, 0.5);//// Math.pow(double val)
		System.out.println(e);

		// Integer.parseInt(String s) covert yo decimal way
		// Integer.parseInt(String s,int radix) convert to decimal from a particular format that particular octal,binary,deciaml system
		
		int x = Integer.parseInt("91");
		double f = Double.parseDouble("5");
		int g = Integer.parseInt("1001", 2);//(100 in binary to decimal ma convert hogaya by providing 2 as binary)

		System.out.println(x);
		System.out.println(f);
		System.out.println(g);
	}

}

//The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, 
//square root, and trigonometric functions.

//1.Java.lang.Math.sin() Method : is an inbuilt method which returns the sine of the value passed as an argument. The value passed 
//in this function should be in radians. If the argument is NaN or an infinity, then the result is NaN. If the argument is zero, 
//then the result is a zero with the same sign as the argument.
//Syntax :
//
//Math.sin(double radians)
//Parameters :
//The method takes one mandatory argument in radians.
//
//Returns :
//It returns a double value. The returned value is the sine of the specified double value passed.
