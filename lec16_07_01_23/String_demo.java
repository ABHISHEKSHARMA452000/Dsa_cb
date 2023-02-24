package lec16_07_01_23;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 = new String("heblo");
		String s2= "hello";
		String s3 = new String("hello");
		System.out.println(s1);
		System.out.println(s == s1);
		System.out.println(s2 == s);
		System.out.println(s1 == s3);
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(Equals(s,s2));
		System.out.println(Equals(s,s1)); //apna content check ka liya funtion
		System.out.println(s.equals(s2));//java predefined content check ka liya 
		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i) == s1.charAt(i)) {
//				System.out.println(s.charAt(i));
//			}else {
//				break;
//			}
//		}
	}
	//content compare kara hai
	public static boolean Equals(String s1,String s2) {
		if(s1 == s2) {
			return true; //address equal hai toh value same
		}
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
