package com.geekster;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode l11 = new ListNode(9);
		ListNode l12 = new ListNode(9);
		ListNode l13 = new ListNode(9);
		ListNode l14 = new ListNode(9);
		ListNode l15 = new ListNode(9);
		ListNode l16 = new ListNode(9);
		//ListNode l17 = new ListNode(9);
		//ListNode l18 = new ListNode(9);
		
		ListNode l2 = new ListNode(9);
		ListNode l21 = new ListNode(9);
		ListNode l22 = new ListNode(9);
		ListNode l23 = new ListNode(9);
		
		l1.next=l11;
		l11.next=l12;
		l12.next=l13;
		l13.next=l14;
		l14.next=l15;
		l15.next=l16;
		//l16.next=l17;
		//l17.next=l18;
		
		l2.next = l21;
		l21.next = l22;
		l22.next = l23;
		
		ListNode returner=addTwoNumbers(l1, l2);
		ListNode pointer = returner;
		while(pointer!=null) {
			System.out.print(pointer.data + " ");
			pointer = pointer.next;
		}
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pointer = null, head = null;
        int a = 0, b=0, carry =0, sum =0;
        boolean flag = true;
        while(flag){
            flag = false;
            if(l1!=null){
                a = l1.data;
                l1 = l1.next;
                flag = true;
            }
            if(l2!=null){
                b = l2.data;
                l2 = l2.next;
                flag = true;
            }
            sum = a+b+carry;
            if(sum>9) carry = 1;
            else carry =0;
            if(sum>0) flag = true;
            ListNode temp = new ListNode(sum%10);
            if(head == null){
                pointer = head = temp;
                a=0;
                b=0;
                continue;
            }
            if(flag) {
            	pointer.next = temp;
                pointer = pointer.next;
                a=0;
                b=0;
            }
        }
        return head;
    }
}
