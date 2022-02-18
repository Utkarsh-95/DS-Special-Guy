package com.b.linkedList;

public class Add2LinkedList {
	// https://leetcode.com/problems/add-two-numbers/
	static ListNode head1, head2;

	static class ListNode {
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

	static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;
		int carry = 0;

		while (l1 != null || l2 != null || carry > 0) {
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			curr.next = new ListNode(carry % 10);
			carry /= 10;
			curr = curr.next;
		}

		return dummy.next;
	}

	public static void main(String[] args) {

		head1 = new ListNode(2);
		head1.next = new ListNode(4);
		head1.next.next = new ListNode(3);
		System.out.print("First List is : ");
		printList(head1);
		System.out.println("");
		head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(4);
		System.out.print("Second List is: ");
		printList(head2);
		
		/*
		head1 = new ListNode(2);
		head1.next = new ListNode(4);
		head1.next.next = new ListNode(3);
		System.out.print("First List is : ");
		printList(head1);
		System.out.println("");
		head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(4);
		head2.next.next.next = new ListNode(2);
		System.out.print("Second List is: ");
		printList(head2); 
		*/
		
//		Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//		Output: [8,9,9,9,0,0,0,1]
		/*head1 = new ListNode(9);
		head1.next = new ListNode(9);
		head1.next.next = new ListNode(9);
		head1.next.next.next = new ListNode(9);
		head1.next.next.next.next = new ListNode(9);
		head1.next.next.next.next.next = new ListNode(9);
		head1.next.next.next.next.next.next = new ListNode(9);
		System.out.print("First List is : ");
		printList(head1);
		System.out.println("");
		head2 = new ListNode(9);
		head2.next = new ListNode(9);
		head2.next.next = new ListNode(9);
		head2.next.next.next = new ListNode(9);
		System.out.print("Second List is: ");
		printList(head2);
		*/
		

		System.out.println();
		System.out.println("Resultant Linked List :");
		ListNode ress = addTwoNumbers(head1, head2);
		printList(ress);
	}

}
