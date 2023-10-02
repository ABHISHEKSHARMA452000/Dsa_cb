package lec17_08_01_23;

public class leetcode_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    a  bye  hello    ";
		//System.out.println(s.trim());//jitni aaga piche sa extra space hai unko trim kar deta hai
		System.out.println(Reverse(s));
	}
	public static String Reverse(String s) {
		s = s.trim();
		
		//String [] arr = s.split("\s");
		String [] arr = s.split("\s+");//split kar diya by single space separated sa
		String ans = "";
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			ans =ans + arr[i] + " ";
		}
		return ans.trim();
	}

}
