package lec30_26_02_23;

public class PhoneNumber {
	
	static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "189";
		Print(ques,"");
	}
	public static void Print(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		char ch = ques.charAt(0);
		String key = arr[ch-'0'];
		for(int i=0;i<key.length();i++) {
			Print(ques.substring(1),ans+ key.charAt(i));
		}
	}

}
