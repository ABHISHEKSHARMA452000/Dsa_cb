package Doubts_solved;

import java.util.*;

public class ImportanceOftime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> calling = new LinkedList<>();
		LinkedList<Integer> processing = new LinkedList<>();
		for(int i=0;i<n;i++) {
			calling.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			processing.add(sc.nextInt());
		}
		System.out.println(Time(calling,processing));
		
	}
	public static int Time(LinkedList<Integer> calling,LinkedList<Integer> processing) {
		int t = 0;
		while(!calling.isEmpty()) {
			if(calling.peek() == processing.peek()) {
				calling.remove();
				processing.remove();
			}else {
				int ii = calling.remove();
				calling.add(ii);
			}
			t++;
			
		}
		return t;
	}

}
