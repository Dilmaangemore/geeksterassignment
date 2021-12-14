package com.geekster;

public class IntersectionofAll {
	public static void main(String[] args) {
		LinkedList headA = new LinkedList(4);
		LinkedList headA1 = new LinkedList(3);
		LinkedList headA2 = new LinkedList(2);
		LinkedList headA3 = new LinkedList(5);
		LinkedList headA4 = new LinkedList(8);
		LinkedList headA5 = new LinkedList(1);
		LinkedList headA6 = new LinkedList(7);
		
		LinkedList headB = new LinkedList(2);
		LinkedList headB1 = new LinkedList(6);
		LinkedList headB2 = new LinkedList(3);
		LinkedList headB3 = new LinkedList(9);
		LinkedList headB4 = new LinkedList(5);
		LinkedList headB5 = new LinkedList(8);
		LinkedList headB6 = new LinkedList(1);
		LinkedList headB7 = new LinkedList(7);
		
		headA.next = headA1;
		headA1.next = headA2;
		headA2.next = headA3;
		headA3.next = headA4;
		headA4.next = headA5;
		headA5.next = headA6;
		
		headB.next = headB1;
		headB1.next = headB2;
		headB2.next = headB3;
		headB3.next = headB4;
		headB4.next = headB5;
		headB5.next = headB6;
		headB6.next = headB7;
		
		System.out.println("Intersected at '"+soln(headA, headB).data+"'");
	}
	private static LinkedList soln(LinkedList headA, LinkedList headB) {
		if(headA==null || headB == null) return null;
		LinkedList a=headA, b = headB;
		
		while(a!=b) {
			if(a==null) a = headB;
			else a = a.next;
			if(b==null) b=headA;
			else b = b.next;
		}
		
		return a;
	}
}
