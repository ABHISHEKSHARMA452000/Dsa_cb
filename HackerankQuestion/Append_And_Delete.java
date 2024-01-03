package HackerankQuestion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
        if(s.length() + t.length() <= k){
            return "Yes";
        }
        int slen = s.length();
        int tlen = t.length();
        int min = Math.min(slen,tlen);
        for(int i=0;i<min;i++){
            if(s.charAt(i) != t.charAt(i)){
                min=i;
                break;
            }
        }
        int sl = s.length()-min;
        int tl = t.length()-min;
        k = k-sl;
        k = k-tl;
        if(k>=0 && k%2 == 0){
            return "Yes";
        }else{
            return "No";
        }
    }

}

public class Append_And_Delete {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}









//my approach
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//	/*
//	 * Complete the 'appendAndDelete' function below.
//	 *
//	 * The function is expected to return a STRING. The function accepts following
//	 * parameters: 1. STRING s 2. STRING t 3. INTEGER k
//	 */
//
//	public static String appendAndDelete(String s, String t, int k) {
//		boolean result = Check(s, t, k, false);
//		if (result == true) {
//			return "Yes";
//		}
//		return "No";
//	}
//
//	public static boolean Check(String s, String t, int k, boolean res) {
//		if ((s.equals(t) && k == 0) || res == true) {
//			return true;
//		}
//		if (s.length() == 0 && k > 0) {
//			boolean delete = Check("", t, k - 1, res);
//			res = res || delete;
//		} else {
//			boolean delete = Check(s.substring(0, s.length() - 1), t, k - 1, res);
//			res = res || delete;
//		}
//		if (s.length() <= t.length()) {
//			int idx = s.length();
//			char ch = t.charAt(idx);
//			boolean append = Check(s + ch, t, k - 1, res);
//			res = res || append;
//		}
//
//		return res;
//	}
//
//}
//
//public class Solution {
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String s = bufferedReader.readLine();
//
//		String t = bufferedReader.readLine();
//
//		int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String result = Result.appendAndDelete(s, t, k);
//
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}
//}
