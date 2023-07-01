package OOPS_Comparable_Comparator;

import java.util.Comparator;
//ek class banayi jo comparasion ka logic degi for cars class using comparator interface
public class CarsComparatorSpeed implements Comparator<Cars>{

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.speed - o2.speed;
	}

}
