package Leetcode_questions;

public class leetcode_84_PartitionList {

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
		public ListNode partition(ListNode head, int x) {
			if (head == null) {
				return null;
			}
			ListNode b_x = new ListNode();// before_x
			ListNode a_x = new ListNode();// after_x
			ListNode temp = head;
			ListNode b_tail = null;
			ListNode beforetemp = b_x;
			ListNode Aftertemp = a_x;
			while (temp != null) {
				int val = temp.val;
				ListNode nn = new ListNode(val);
				if (val < x) {
					b_x.next = nn;
					b_tail = nn;
					b_x = nn;
				} else if (val >= x) {
					a_x.next = nn;
					a_x = nn;
				}
				temp = temp.next;
			}
			if (beforetemp.next == null) { // list = [1] and x = 0 so ther is a need to return aftertemp bcoze
											// beforetemp.next == null hai
				return Aftertemp.next;
			}
			b_tail.next = Aftertemp.next;
			return beforetemp.next;
			
			
//without making new node it take less space complexity
//			ListNode before = new ListNode(0);
//	        ListNode after = new ListNode(0);
//	        ListNode before_curr = before;
//	        ListNode after_curr = after;
//	        
//	        while(head != null) {
//	            if(head.val < x) {
//	                before_curr.next = head;
//	                before_curr = before_curr.next;
//	            } else {
//	                after_curr.next = head;
//	                after_curr = after_curr.next;
//	            }
//	            head = head.next;
//	        }
//	        
//	        after_curr.next = null;
//	        before_curr.next = after.next;
//	        
//	        return before.next;
		}

	}

}
