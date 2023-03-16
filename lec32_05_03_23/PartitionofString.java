package lec32_05_03_23;

//leetcode-131

public class PartitionofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		Partitioning(ques,"");
		
	}
	public static void Partitioning(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(palindrome(s)) {
				Partitioning(ques.substring(i),ans+ s + "|");
			}
		}
	}
	public static boolean palindrome(String s) { 
		int left = 0;
		int right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
