package HashMap_Implementation;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("a", 10);
		map.put("d", 1);
		map.put("c", 45);
		map.put("e", 23);
		map.put("f", 105);
		map.put("g", 104);
		map.put("h", 110);
		map.put("h", 120);
		map.put("e", 230);
		System.out.println(map);
		map.put("a", 65);
		System.out.println(map);
		System.out.println(map.get("a"));
		System.out.println(map.get("r"));
		System.out.println(map.containsKey("h"));
		System.out.println(map.containsKey("v"));
		System.out.println(map.remove("c"));
		System.out.println(map);
	}

}
