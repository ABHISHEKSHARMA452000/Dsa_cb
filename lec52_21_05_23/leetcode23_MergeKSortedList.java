package lec52_21_05_23;

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
			PriorityQueue<ListNode> pq = new PriorityQueue<>();
			for (ListNode node : lists) {
				if(node != null) {
					pq.add(node);
				}
			}
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while(pq.isEmpty()) {
				ListNode node = pq.poll();//remove hoga
				Dummy.next = node;
				Dummy = Dummy.next;
				if(node.next != null) {
					pq.add(node.next);
				}
			}
			return temp.next;
		}
	}
}
