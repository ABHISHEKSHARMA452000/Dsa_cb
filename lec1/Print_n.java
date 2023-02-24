package lec1;

public class Print_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=10;
		int sum =0;
		int val =1;
		for(i=1;i<=n;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
		for(i=1;i<=n;i++) {
			val = 6*i;
			System.out.println(val);
		}
	}

}
