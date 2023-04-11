package Doubts_solved;

public class leetcode1079_letter_tile_possiblities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABACA";
		int ans = Tile(str,"");
		System.out.println(ans);
	}
	public static int Tile(String ques,String ans) {
		System.out.println(ans);
		int count = 0;
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			boolean b = false;
			for(int j = i+1;j<ques.length();j++) {
				if(ques.charAt(j) == ch) {
					b=true;
					break;
				}
			}
			if(b == false) {
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				count+=Tile(s1+s2,ans+ch)+1; // 1 for that char of this frame tiles
			}
		}
		return count;
	}
}
