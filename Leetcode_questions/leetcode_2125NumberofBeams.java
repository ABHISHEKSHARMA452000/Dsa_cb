package Leetcode_questions;

public class leetcode_2125NumberofBeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numberOfBeams(String[] bank) {
        int beams = 0;
        int[] arr = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            arr[i] = CountOnes(bank[i]);
        }
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] == 0){
                continue;
            }
            beams = beams + prev*arr[i];
            prev = arr[i];
        }
        return beams;
    }
    public int CountOnes(String s){
        int ones = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        return ones;
    }

}
