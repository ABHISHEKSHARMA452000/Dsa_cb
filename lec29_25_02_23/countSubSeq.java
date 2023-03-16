package lec29_25_02_23;

public class countSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSub("abc","");
		System.out.println(count);
	}
	static int count=0; //global variable class ka andar and func ka bahar kahi bhi //global static sa bana ga
	public static void PrintSub(String ques,String ans) {
		if(ques.length() == 0) {
			//System.out.println(ans + " ");
			count++;
			return;
		}
		
		char ch = ques.charAt(0);
		PrintSub(ques.substring(1),ans);
		PrintSub(ques.substring(1),ans + ch);
	}

}
