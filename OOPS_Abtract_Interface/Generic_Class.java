package OOPS_Abtract_Interface;

public class Generic_Class <T,P>{//it can be any thing t,p,a,name,etc
	//data members
	T x;//x is of type T
	T y;//y is a type T;
	P z;//z is a type of P
	public void Display(T x,T y,P z) {
		System.out.println(x + " " + y + " " + z);
	}
}
