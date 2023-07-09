package lec52_21_05_23;

import java.util.ArrayList;

//ya generic heap hai jisma na toh min hai na max heap  hai isma hum priortiy par baat kar raha hai jasa set kara ga aus tarah chalna laga ga
//isma toh priorty jasa set karoga aus tarah sa kaam karna laga ga
public class generic_heap <T extends Comparable<T>> { //bound set kara hai class ka only vo T jisma compareTo ka logic ho
	private ArrayList<T> list = new ArrayList<>();
	public void add(T item) {
		list.add(item);//logn
		upheapify(list.size()-1);//last index pass ki
		//upar ki taraf heap ko modify kara ga
		//check karaga ki heap hai ya nhi and if nhi hai toh uparr ko heap bana na ka kaam karaga
	}
	private void upheapify(int ci) {//its means ki upar jada hua heap updata kiya and bana diya heap
		int pi = (ci-1)/2;
		if(isLarge(list.get(ci), list.get(pi))>0) { //if child ki priority more then hai parent sa toh swap kar do
			swap(pi,ci);
			upheapify(pi);
		}
	}
	private void swap (int pi,int ci) {
		T pith = list.get(pi);
		T cith = list.get(ci);
		list.set(pi, cith);
		list.set(ci,pith);
	}
	
	public T get() {//get min only min value sabse phele access hogi
		return list.get(0);
	}
	
	public T remove() {
		swap(0,list.size()-1);
		T rv = list.remove(list.size()-1);
		downheapify(0);//down jata hua heap bana na hai
		//yaha niche jata hua heap ko banaya ga and oth index sa start kara ga
		return rv;
	}
	
	
	
	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2*pi + 1;
		int rci = 2*pi + 2;
		int mini = pi;//man kar chala ki minimum pi par hai
		//index ma 3 number check kiya ki konsa minimum hoga
		if(lci <list.size() && isLarge(list.get(lci),list.get(mini))>0 ) {
			mini = lci;
		}
		if(rci <list.size() && isLarge(list.get(rci),list.get(mini))>0 ) {
			mini = rci;
		}
		if(mini != pi) {//ya tab chala ga if check karana ka baad mini change hua toh if change nhi hua toh hamara min heap ban gaya hai
			swap(pi,mini);
			downheapify(mini);
		}
		
	}
	public void display() {
		System.out.println(list);
	}
	
	public int isLarge(T o1,T o2) {
		return o1.compareTo(o2);
	}
	
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
//		return this.speed - o.speed;
//		//return this.color.compareTo(o.color);
//	}
	//sara ka sara is condition par depend kar raha hai kasa heap bana ga
}
