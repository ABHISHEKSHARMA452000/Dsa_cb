package Leetcode_questions;

public class leetcode_9_Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -121;
		Palindrome1(x);
	}
	public static boolean Palindrome1(int x) {
		String str = Integer.toString(x);
        int left = 0;
        int right = str.length()-1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
	}
	public static boolean Palindrome2(int x) {
		if(x<0){
            return false;
        }

        //reversed number logic
        int rev = 0;
        int temp  = x;
        while(temp != 0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        return (rev == x);
	}

}
