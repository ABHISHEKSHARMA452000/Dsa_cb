package Leetcode_questions;

public class leetcode_58_LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   fly me   to   the moon  ";
		int ans= lengthOfLastWord(s);
		System.out.println(ans);
	}
	public static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }else{
                count++;
            }
        }
        return count;

        // String[] words = s.split(" ");
        // return words[words.length - 1].length();
    }

}
