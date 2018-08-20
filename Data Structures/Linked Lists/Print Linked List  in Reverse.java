import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	//this is the Node class
    static class SinglyLinkedListNode {
        public int data; //this is the data that is going to be entered into the LinkedList
        //This is a pointer. It stores a reference to the next Node in the LinkedList. Default value is null if we don't set it in constructor
		public SinglyLinkedListNode next; 

		//constructor that once a new Node(instance) is created, nodeData is assigned to data and next is assigned null
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData; //nodeData is the input entered into the LinkedList and it is assigned to data
            this.next = null; //node is set to default for each new element created
        }
    }
	//LinkedList Class
    static class SinglyLinkedList {
        public SinglyLinkedListNode head; //This is a pointer. head is an instance of the Node class
        public SinglyLinkedListNode tail; //This is a pointer. tail is an instance of the Node class

		//constructor that went creating a new LinkedList, it set the head and tail Node references to null
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
      
    }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
	
	
	    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
	 
	 You are given the pointer to the head node of a linked list and you need to print all its elements in reverse order 
	 from tail to head, one element per line. The head pointer may be null meaning that the list is empty - in that case, 
	 do not print anything!
	 
	 
     */
    static void reversePrint(SinglyLinkedListNode head) {
        if(head == null){
            return;
        }
        
		/*I solved this using recursion. Let's look at a simple linked list of 1->2->3
		Head doesn't equal null so we call reversePrint(head.next)
		
		3. reversePrint(head.next) = 3 is placed on the call stack
		2. reversePrint(head.next) = 2 is placed on the call stack
		1. reversePrint(head.next) = 1 is placed on the call stack
		
		Now, head.next = null we remove the reversePrint(head.next) in reverse order and then print them out.
		
		*/
        reversePrint(head.next);
        System.out.println(head.data);


    }
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            reversePrint(llist.head);
        }

        scanner.close();
    }
}
