package lec20_21_01_23;

public class Is_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 4;
		if(Isset(n,i)) {
			System.out.println("Set");
		}else {
			System.out.println("Not set");
		}
	}
	public static boolean Isset(int n,int i) {
		int mask = 1<<i;
		if((n&mask) != 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
