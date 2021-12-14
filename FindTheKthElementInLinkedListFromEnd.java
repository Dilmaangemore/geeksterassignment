package com.geekster;

public class FindTheKthElementInLinkedListFromEnd {
	int data;
	LinkedList next;
	//no need of constructor, because the constructor is already defined in LinkedList Class

		public static void main(String[] args) {
			LinkedList node1 = new LinkedList(1);
			LinkedList node2 = new LinkedList(2);
			LinkedList node3 = new LinkedList(3);
			LinkedList node4 = new LinkedList(4);
			LinkedList node5 = new LinkedList(5);
			LinkedList node6 = new LinkedList(6);
			LinkedList node7 = new LinkedList(7);
			LinkedList node8 = new LinkedList(8);
			LinkedList node9 = new LinkedList(9);
			LinkedList node10 = new LinkedList(10);
			
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = node7;
			node7.next = node8;
			node8.next = node9;
			node9.next = node10;
			
			int target = 6;//nth node element from end
			System.out.println(doubleTraverser(node1, target));
			System.out.println(singleTraverser(node1, target));
			
		}
		private static int doubleTraverser(LinkedList list, int index) {
			int end = 0;
			LinkedList pointer = list;
			while(pointer != null) {
				end++;
				pointer = pointer.next;
			}
			
			pointer = list;
			int returner = -1;
			int count =- 1;
			while(pointer != null) {
				count++;
				if(count == end-index) {
					returner = pointer.data;
				}
				pointer = pointer.next;
			}
			return returner;
		}
		private static int singleTraverser(LinkedList list, int index) {
			LinkedList lastPointer = list;
			LinkedList kPointer = list;
			
			int x = index-1;
			while(x>0) {
				kPointer = kPointer.next;
				x--;
				if(kPointer == null) return -1;
			}
			while(kPointer.next != null) {
				lastPointer = lastPointer.next;
				kPointer = kPointer.next;
			}
			
			return lastPointer.data;
		}
}
