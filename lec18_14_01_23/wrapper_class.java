package lec18_14_01_23;

public class wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);  // same reason why string ma value print hoti thi vasa hi interger ma value print 
								//  hoti hai ki string ma value arr ma address and interger ma value
		int  i =189;
		Integer i1 = i; //autoBoxing
		
		
		//Long l = 1899; //int literral bydefault
		Long l = 1899L; // l  lagana sa vo long ma convert ho jata hai
		long ll = l; // unBoxing
		 
		//cache
		Integer x = 19;
		Integer x1 = 19;
		
		Integer y = 781;
		Integer y1 = 781;
		System.out.println(x == x1);
		System.out.println(y == y1);
		
		Character ch = '�';
		Character ch1 = '�';
		char c = (char)(234);
		//System.out.println(c);
		Character ch2 = 'a';
		Character ch3 = 'a';
		System.out.println(ch == ch1);
		System.out.println(ch2 == ch3);
		
		
//		Integer z1 = 100;
//		int z2 = z1;
	}

}
