package HashMap_Implementation;

//collison free implementation
//not a genric HashMap
public class HashMap {

	public class Node {
		String key;
		Integer val;// Capital Integer isliya if element nahi hua toh null return kar sakta hai isma
		Node next;// linked list type jasai node hai just string data member extra hai isma

		public Node() {

		}

		public Node(String key, Integer val) {
			this.key = key;
			this.val = val;
		}
	}

	// ek array chahiya jisma Node jasa data hoga so Node data type ka array banaga
	Node[] arr;// ek reference variable arr of type Node array ka
	int size = 0;// hashmap ma kitni nodes hai auska size bataya ga

	public HashMap() {
		arr = new Node[4];
	}

	public HashMap(int n) {
		arr = new Node[n];
	}

	// Ek hashfunction bana liya jisma key jayagi auska liya ek int value return
	// hogi ki kaha par vo key ka add karna hai
	public int HashFun(String key) {
		int bn = key.hashCode() % arr.length;// global scope of arr sa hi arr.length use kar sakta hu
		// bn ki value +ve or -ve both ho sakti hai but index always +ve hoti hai
		// hashcode value -ve or +ve both return karta hai
		// to solve this issue we do add arr.length to bn
		if (bn < 0) {
			bn += arr.length;
		}
		return bn;
	}

	public void put(String key, Integer val) {
		int idx = HashFun(key);// sabsa phele kaam ki hashfuncion call karka idx mangalo
		// do baat hai ab ya vo key present hai phele sa toh update karni hai value or
		// new key add karni hai
		Node temp = arr[idx];// list ka first element ka address mil gaya
		while (temp != null) {// loop tab tak chala jab tak ki list ka list elment check nhi kar liya
			if (temp.key.equals(key)) {// == use nhi kiya bcoze vo address different pa hi return true false kar deta
				temp.val = val;
				return;// yahi sa function sa bahar
			}
			temp = temp.next;
		}
		// if while ka baad niche ka chala matbal key map ma present nhi toh new key
		// pair bana lo
		// new node bana lo and idx hai hi and addfirst karka list ma add kardo
		Node nn = new Node(key, val);
		size++;
		nn.next = arr[idx];// new node ka next ma list ka first elemnt ka address dal diya
		arr[idx] = nn;// nn ko first node of list
		// rehashing concept load factor and threshold factor sahi sa maintain karna hai toh
		double lf = (1.0*size)/arr.length;
		double thf = 2.0;
		if(lf > thf) {
			rehashing();
		}
	}
	private void rehashing() {
		Node[] narr = new Node[2*arr.length];//new array of twice length
		Node[] oarr = arr;//old array ka address
		size = 0;//size pass nhi kiya toh global size ma change aaya ga
		narr=arr;//array pass nhi kiya toh global arr ma change aaya ga
		for(int i=0;i<oarr.length;i++) {
			Node temp = oarr[i];
			while(temp!= null) {
				put(temp.key,temp.val);
				temp = temp.next;
				//size++;//nhi kara ga bcoze put ma size++ ho jayaga
			}
		}
	}

	public Integer get(String key) {
		int idx = HashFun(key);// sabsa phele kaam ki hashfuncion call karka idx mangalo
		// do baat hai ab ya vo key present hai phele sa toh update karni hai value or
		// new key add karni hai
		Node temp = arr[idx];// list ka first element ka address mil gaya
		while (temp != null) {// loop tab tak chala jab tak ki list ka list elment check nhi kar liya
			if (temp.key.equals(key)) {// == use nhi kiya bcoze vo address different pa hi return true false kar deta
				return temp.val;// milgaya toh val return nhi toh null return
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containsKey(String key) {
		int idx = HashFun(key);
		Node temp = arr[idx];// list ka first element ka address mil gaya
		while (temp != null) {// loop tab tak chala jab tak ki list ka list elment check nhi kar liya
			if (temp.key.equals(key)) {// == use nhi kiya bcoze vo address different pa hi return true false kar deta
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//remove karta time node first bhi ho sakti hai remove to bich ki koi node bhi ho sakti hai vo key sa match vali node
	//isliya ek prev previous name ki node chahiya bcoze ausko aaga next node sa link bhi karna hoga
	public Integer remove(String key) {
		int idx = HashFun(key);
		Node temp = arr[idx];
		Node prev = null;
		while(temp != null) {
			if(temp.key.equals(key)) {
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) {//if key present nhi hai map ma
			return null;
		} 
		if(prev == null) {//if first node remove kari hai toh
			arr[idx] = temp.next;
			temp.next = null;
		}else {//if bich ki node remove kari hai toh
			prev.next = temp.next;
			temp.next = null;
		}
		size--;
		return temp.val;
	}
	
	public String toString() {
		String s = "{";
		//ek loop sa ek ek kar har linked list ko lo and loop sa har ek list ki nodes print karta chala jana hai
		for(int i=0;i<arr.length;i++) {
			Node temp = arr[i];
			while(temp != null) {
				s += temp.key + " = " + temp.val + ",";
				temp = temp.next;
			}
		}
		return s + "}";
	}

}
