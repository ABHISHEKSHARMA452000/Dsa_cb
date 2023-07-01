package lec50_14_05_23;
//most important
public class HashMap {

	public class Node {
		String key;
		Integer val;//return null in case element nhi mila toh
		Node next;

		public Node(String key, Integer val) {
			this.key = key;
			this.val = val;
		}
	}

	Node[] arr;// node type ka array hai // bucket bana na ka liya node ka arr bana liya jisma addess of node aaya ga 
	int size = 0;//ki hashmap ma kitna elememnt added hai

	public HashMap() {//by default if size of bucket nhi diya user na toh 4 size ka bana diya 
		arr = new Node[4];
	}

	public HashMap(int n) {//if value provide kari user na kis size ka buckket bana lena hai
		arr = new Node[n];
	}

	public int Hashfun(String key) {// index array ka liya
		int bn = key.hashCode() % arr.length;// hashcode ki value negative bhi aati hai //bn bucket index
		if (bn < 0) {//hashcode ek interger value dete hai jisko hum na arr.length sa divide kiya hai jissa ki index maintain raha
			bn += arr.length; //hashcode value can be negative but index negative nhi hoti ttoh isliya if bn -ve aaya toh ausma hum arr.length ko add kar dete hai
		}
		return bn;// bucket index
	}
	//put ma do case hai ya toh vo key phele sa hogi ya nnew dalagi 
	public void put(String key, Integer val) {
		int idx = Hashfun(key);
		Node temp = arr[idx];
		while (temp != null) {//yaha if key present hai in map
			if (temp.key.equals(key)) {// temp.key == key ya address dehk ta hai toh mere ko value chaiya toh equals
										// use kara ga
				temp.val = val;  
				return;
			}
			temp = temp.next;
		}
		//while loop sa tab out hoga jab key map ma present nhi hogi
		Node node = new Node(key, val);
		size++;
		node.next = arr[idx];
		arr[idx] = node;
		double lf = (1.0*size)/arr.length;
		double thf = 2.0;
		if(lf > thf) {
			rehashing();
		}
	}
	private void rehashing() {
		Node[] newarr = new Node[arr.length*2];
		Node[] oba = arr;
		arr = newarr;//array pass nhi kiya toh global arr ma change aaya ga
		size=0;
		for(Node nn :oba) {
			while(nn != null) {
				put(nn.key ,nn.val);
				nn= nn.next;
			}
		}
	}
	public boolean containsKey(String key) {
		int idx = Hashfun(key);//index manga li kis index par put karna hai 
		Node temp = arr[idx];//address nikal liya that list  ka jisma put hona hai
		while (temp != null) {
			if (temp.key.equals(key)) {// temp.key == key ya address dehk ta hai toh mere ko value chaiya toh equals
										// use kara ga

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public Integer get(String key) {
		int idx = Hashfun(key);
		Node temp = arr[idx];
		while (temp != null) {
			if (temp.key.equals(key)) {// temp.key == key ya address dehk ta hai toh mere ko value chaiya toh equals
										// use kara ga
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}

	public Integer remove(String key) {
		int idx = Hashfun(key);
		Node temp = arr[idx];
		Node prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {// temp.key == key ya address dehk ta hai toh mere ko value chaiya toh equals
										// use kara ga
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return null;
		}
		if (prev == null) {
			arr[idx] = temp.next;
			temp.next = null;
		} else {
			prev.next = temp.next;
			temp.next = null;
		}
		size--;
		return temp.val;
	}

	

	@Override
	public String toString() {
		String s = "{";
		for (Node nn : arr) {
			while (nn != null) {
				s = s + nn.key + "=" + nn.val + ",";
				nn = nn.next;
			}
		}
		return s + "}";
	}

}
