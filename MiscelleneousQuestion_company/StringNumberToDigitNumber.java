package MiscelleneousQuestion_company;
//seven triple three four six double one nine
import java.util.*;

public class StringNumberToDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // we can not use next(it take only one char at at time) we use nextLine(it take all character it a line end) 
		String[] arr = str.split(" ");
//		int len = arr.length;
//		System.out.println(len);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		String ans = "";
		HashMap<String,String> map = new HashMap<>();
		map.put("zero", "0");
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		//there is a case when we use double and triple for phone number and it is sure we always use valid case and all are lowercase letter
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("double")) {
				ans = ans + map.get(arr[i+1]) + map.get(arr[i+1]);
				i++;
			}
			else if(arr[i].equals("triple")) {
				ans = ans + map.get(arr[i+1])+ map.get(arr[i+1]) + map.get(arr[i+1]);
				i++;
			}else {
				String s = arr[i];
				String sget = map.get(s);
				ans = ans + sget;
			}
			
		}
		int number = Integer.parseInt(ans);
		System.out.println(number);
		System.out.println(ans);
	}

} 




