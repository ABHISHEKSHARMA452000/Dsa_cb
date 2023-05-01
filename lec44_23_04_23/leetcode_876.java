package lec44_23_04_23;
//middle of the linkedlist
public class leetcode_876 {
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
	    public ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast != null && fast.next != null) {
	        	slow = slow.next;
	        	fast = fast.next.next;
	        }	        return slow;
	    }
	}
}
