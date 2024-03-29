package lec52_21_05_23;

import java.util.*;
//min heap ka liya
public class Heap {//one class should be non static and public 
	//datamember add kar diya
	private ArrayList<Integer> list = new ArrayList<>();
	public void add(int item) {
		list.add(item);//logn
		upheapify(list.size()-1);//last index pass ki
		//upar ki taraf heap ko modify kara ga
		//check karaga ki heap hai ya nhi and if nhi hai toh uparr ko heap bana na ka kaam karaga
	}
	private void upheapify(int ci) {//its means ki upar jada hua heap updata kiya and bana diya heap
		int pi = (ci-1)/2;
		if(list.get(pi)>list.get(ci)) {// there is no need of base case bcoze recusrion par phele hi condition lagi hui hai
			swap(pi,ci);
			upheapify(pi);
		}
	}
	private void swap (int pi,int ci) {
		int pith = list.get(pi);
		int cith = list.get(ci);
		list.set(pi, cith);
		list.set(ci,pith);
	}
	
	public int get() {//get min only min value sabse phele access hogi
		return list.get(0);
	}
	
	public int remove() {
		swap(0,list.size()-1);
		int rv = list.remove(list.size()-1);
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
		if(lci <list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if(rci <list.size() && list.get(mini) > list.get(rci)) {
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
	
}
