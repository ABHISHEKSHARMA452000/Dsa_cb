package OOPS_Comparable_Comparator;

public class Cars {//implements Comparable<Cars> {

	int price;
	int speed;
	String color;

	public Cars() {

	}

	public Cars(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	@Override
	public String toString() {
		return "P: " + this.price + " S: " + this.speed + " C: " + this.color;
	}

//	@Override
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
//		//return this.price - o.price;
//		//return this.color.compareTo(o.color);
//		return this.speed - o.speed;
//	}
}
