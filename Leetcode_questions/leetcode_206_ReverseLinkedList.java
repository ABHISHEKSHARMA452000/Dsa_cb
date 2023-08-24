package Leetcode_questions;

import lec44_23_04_23.leetcode206_ReverseLL.ListNode;

public class leetcode_206_ReverseLinkedList {
	
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
		public ListNode reverseList(ListNode head) {
			ListNode prev = null;
			ListNode curr = head;
			while(curr != null) {
				ListNode ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			return prev;
		}
	}
	
}
