package lec30_26_02_23;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		toh(n,"A","C","B");
	}
	public static void toh(int n,String src,String des,String hlp) {
		if(n==0) {
			return;
		}
		
		toh(n-1,src,hlp,des);
		System.out.println("Move " + n + " th disk from " + src + " to " + des); // ya vala humara kaam hai
		toh(n-1,hlp,des,src);
	}

}
