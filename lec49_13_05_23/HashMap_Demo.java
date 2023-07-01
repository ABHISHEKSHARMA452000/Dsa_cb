package lec49_13_05_23;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inteface hai Map =>Map<String,Integer> map = new HashMap<>();
		//List<....> ll = new ArrayList<>();
		//implemnt ka liya Linkedlist use kiya hai
		//1.HashMap
		HashMap<String,Integer> map = new HashMap<>();
		//add  O(1)
		map.put("Ankit",77);
		map.put("kunal", 67);
		map.put("adi", 32);
		map.put("Raju", 17);
		map.put("Mohan", 87);
		map.put("Amisha", 57);
		map.put("Sunil", 47);
		map.put("Shivani", 89);
		map.put("Shivani",189);//update karta hai value
		//map.put(null, 100);//key as a null ho sakta hai and only one hi possible hai
		System.out.println(map);//{null=100, Shivani=189, Mohan=87, Amisha=57, kunal=67, adi=32, Sunil=47, Raju=17, Ankit=77}
		//System.out.println(map.size());
		
		//searching O(1)
		System.out.println(map.containsKey("anku"));
		System.out.println(map.containsKey("amisha"));
		System.out.println(map.containsKey("Mohan"));
		System.out.println(map.containsValue(89));//it will check value present hai ya nhi
		
		//Get O(1)
//		System.out.println(map.get("Aditya"));//null
//		System.out.println(map.get("adi"));//32
//		System.out.println(map.get(null));//value bhi return kara ga
		
		//remove O(1)
//		System.out.println(map.remove("Mohan"));
//		System.out.println(map);
		
		//insertion and order preserve nhi hota hai in hashmap
		
		
		//2.TreeMap 
		// all ki complexity log(n) hoti hai
		TreeMap<String,Integer> map1 = new TreeMap<>();//implementation red black tree par based hoti hai
		map1.put("Ankit",77);
		map1.put("kunal", 67);
		map1.put("adi", 32);
		map1.put("Raju", 17);
		map1.put("Mohan", 87);
		map1.put("Amisha", 57);
		map1.put("Sunil", 47);
		map1.put("Shivani", 89);
		map1.put("Shivani",189);
		//key null nhi ho sakti bcoze ya par sorting ka logic use kiya jata hai thats why
		//System.out.println(map1);//sorted way ma aata hai lexicograpghically key ka according 
		//{Amisha=57, Ankit=77, Mohan=87, Raju=17, Shivani=189, Sunil=47, adi=32, kunal=67}
		
		//3.LinkedHashMap 
		//isma insertion order preserve hoga //all ki complexity O(1)
		//implement ka liya doubly linkedlist ka use hota hai
		//null as key use kar sakta hai isma
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Ankit",77);
		map2.put("kunal", 67);
		map2.put("adi", 32);
		map2.put("Raju", 17);
		map2.put("Mohan", 87);
		map2.put("Amisha", 57);
		map2.put("Sunil", 47);
		map2.put("Shivani", 89);
		map2.put("Shivani",189);
		map2.put(null, 100);
		//System.out.println(map2);//{Ankit=77, kunal=67, adi=32, Raju=17, Mohan=87, Amisha=57, Sunil=47, Shivani=189, null=100}
		
		
		//keyset
		//System.out.println(map.keySet());//give key
		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(k + " " + map.get(k));
		}
//		for (String k : map.keySet()) {
//			System.out.println(k + " " + map.get(k));
//		}
//		for (String k : new ArrayList<>(map.keySet())) {// ab yaha par index par bhi kar sakta hai
//			System.out.println(k + " " + map.get(k));
//		}
		
		
	}
}

/*
 * HashMAp ek data str hai jisma key value pair ma data store hota hai
 * H.M.Iski implementtation important hai jisma vo bhi collision free hashmap ki 
 * H.M. ka add search delete get sab O(1) ma hota hai
 * Isko vha use kar sakta hai jaha par pair jassi data par kaam kar raha hai and ek cheese unique hai and ek duplicate ya update ho rahi hai
 * */

