package com.geekster;

public class addnodebegin {
	

	

	int data;
	addnodebegin next;
	public addnodebegin() {
		
	}

		public static void main(String[] args) {
			addnodebegin node1 = new addnodebegin();
			node1.data = 1;
			addnodebegin node2 = new addnodebegin();
			node2.data = 2;
			addnodebegin node3 = new addnodebegin();
			node3.data = 3;
			
			node1.next = node2;
			node2.next = node3;
			
			addnodebegin nodeToBeAtBegining = new addnodebegin();
			nodeToBeAtBegining.data = 0;
			
			nodeToBeAtBegining.next = node1;
			
			
		}
		private static void printer(addnodebegin list) {
			addnodebegin pointer = list;
			while(pointer != null) {
				System.out.print(pointer.data +" ");
				pointer = pointer.next;
			}
		}
	}

