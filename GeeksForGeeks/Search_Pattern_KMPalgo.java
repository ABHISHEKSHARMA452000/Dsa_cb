package GeeksForGeeks;

public class Search_Pattern_KMPalgo {

}


//my solution taking little bit more time
//class Solution
//{
//    
//    ArrayList<Integer> search(String pat, String txt)
//    {
//        // your code here
//        ArrayList<Integer> list = new ArrayList<>();
//        //int si=0;
//        //int ei=pat.length()-1;
//        for(int i=0;i<txt.length();i++){
//            if(txt.charAt(i)==pat.charAt(0)){
//                if((i+pat.length()-1)<txt.length()){
//                    String s = txt.substring(i,i+pat.length());
//                    if(s.equals(pat)){
//                        list.add(i);
//                    }
//                }
//            }
//        }
//        for(int i=0;i<list.size();i++){
//            int val = list.get(i);
//            list.set(i,val+1);
//        }
//        return list;
//    }
//}

