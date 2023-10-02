package Leetcode_questions;

public class leetcode_97_InterleavingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isInterleaveTD("aabcc","dbbca","aadbbcaaac", 0, 0));
	}

	public static boolean isInterleaveTD(String s1, String s2, String s3,int i,int j) {
		if(s1.length() + s2.length() != s3.length()) {
			return false;
		}
		if(i==s1.length() && j == s2.length()) {
			return true;
		}
		if(i<s1.length() && s1.charAt(i) == s3.charAt(i+j)) {
			boolean f1 = isInterleaveTD(s1, s2, s3, i+1, j);
			if(f1 == true) {
				return true;
			}
		}
		if(j<s2.length() && s2.charAt(j) == s3.charAt(i+j)) {
			boolean f2 = isInterleaveTD(s1, s2, s3, i, j+1);
			if(f2 == true) {
				return true;
			}
		}
		
		return false;
	}

}
