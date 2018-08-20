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
	
	
	    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
	 If you're new to linked lists, this is a great exercise for learning about them. 
	 Given a pointer to the head node of a linked list, print its elements in order, one element per line. 
	 If the head pointer is null (indicating the list is empty), don’t print anything.
     */
    static void printLinkedList(SinglyLinkedListNode head) {
	//if head==null, then that means the List in empty and nothing is printed
        while(head != null){
            System.out.println(head.data); //print out data element of the node
            head = head.next; //head.next is the reference to the next element and it is assigned to head

    }
	
	
	    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}
