package lec52_21_05_23;

import java.util.*;
//min heap ka liya
public class Heap {
	
	private ArrayList<Integer> list = new ArrayList<>();
	public void add(int item) {
		list.add(item);
		upheapify(list.size()-1);//last index pass ki
	}
	private void upheapify(int ci) {//its means ki upar jada hua heap updata kiya and bana diya heap
		int pi = (ci-1)/2;
		if(list.get(pi)>list.get(ci)) {
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
	public int remove() {
		swap(0,list.size()-1);
		int rv = list.remove(list.size()-1);
		downheapify(0);//down jata hua heap bana na hai
		return rv;
	}
	
	
	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2*pi + 1;
		int rci = 2*pi + 2;
		int mini = pi;
		if(lci <list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if(rci <list.size() && list.get(mini) > list.get(rci)) {
			mini = rci;
		}
		if(mini != pi) {
			swap(pi,mini);
			downheapify(mini);
		}
		
	}
	public int get() {
		return list.get(0);
	}
}
