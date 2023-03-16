package Doubts_solved;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AXAXA";
		System.out.println(Count_Twins(s));
		
	}
	public static int Count_Twins(String ques) {
		if(ques.length() <= 2) {
			return 0;
		}
		int ans =0;
		if(ques.charAt(0) == ques.charAt(2)) {
			ans = 1 + Count_Twins(ques.substring(1));
		}else {
			ans = Count_Twins(ques.substring(1));
		}
		return ans;
	}

}
