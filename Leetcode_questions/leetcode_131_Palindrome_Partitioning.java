package Leetcode_questions;

import java.util.*;

public class leetcode_131_Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(ques,list,ans);
		System.out.println(ans);
		/*jab list ma list ka question ho toh phele simple ans bana lo then single list ma ans daalo then double list ma ans karo 
		 Yahi way sahi hai question karna ka 
		 */
	}
	public static void Partitioning(String ques,List<String> list,List<List<String>> ans) {
//		if(ques.length() == 0) {
//			list.add(ans);
//			System.out.println(list);
//			list.remove(list.size()-1);
//			return;
//		}
		if(ques.length() == 0) {
			/*copy of List isliya bcoz list and ans dono heap ma hai so when list sa jab remove hoga toh same list jab ans ma bhi hai toh 
			aus list ma bhi reflect hoga that whys if ans list print karta toh [[],[],[]] 3 empty Al aa rahi hai thats why copy bana ni 
			padi thi of list ki
			*/
			ans.add(new ArrayList<>(list)); //copy of the list 
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(palindrome(s)) {
				list.add(s);
				Partitioning(ques.substring(i),list,ans);
				list.remove(list.size()-1); //backtracking
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
