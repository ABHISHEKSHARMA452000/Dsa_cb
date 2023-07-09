package lec52_21_05_23;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode23_MergeKSortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
//			PriorityQueue<ListNode> pq = new PriorityQueue<>(); yaha par pq hai and listnode jasa type data hai toh <,> kasa ho so we need comparator here
//			list.get(mini) > list.get(rci) and if(list.get(pi)>list.get(ci))  iski waja sa problem aa rahi hogi
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					//simple min heap use karta time aap ko rank ma aoolta karna hota hai 
					return o1.val - o2.val;// ya rank jasa hai jisma kaam number ki jayada priority hai 34 ,55,77, toh isma 34 ki priorty more hai
					//return o2.val - o1.val; ya asa max heap ki tara kaam karna laga ga [2,6,1,4,5,1,3,4]===[[1,4,5],[1,3,4],[2,6]]
				}
			});
			for (ListNode node : lists) {
				if(node != null) {//P.Q ma start points daal diya har list ka
					pq.add(node);
				}
			}
			ListNode Dummy = new ListNode();//ya har node ko kis ka baad laga na hai auska liya
			ListNode temp = Dummy;//temp.next return karna ka liya just address jissa lost na ho start ka
			while(!pq.isEmpty()) {//jabtak pq empty nhi ho rahi tab tak chalana hai
				ListNode node = pq.poll();//remove hoga
				Dummy.next = node;
				Dummy = Dummy.next;
				if(node.next != null) {//if node ka next exist kara hai toh ausko P.Q ma daal denga
					pq.add(node.next); 
				}
			}
			return temp.next;
		}
	}
}
