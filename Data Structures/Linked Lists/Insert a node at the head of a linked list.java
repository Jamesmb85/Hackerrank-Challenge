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
        public SinglyLinkedListNode head; //head is an instance of the Node class
        public SinglyLinkedListNode tail; //tail is an instance of the Node class

		//constructor that went creating a new LinkedList, it set the head and tail Node references to null
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
	
	    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
	 
	 You’re given the pointer to the head node(llist) of a linked list and an integer to add to the list. 
	 Create a new node with the given integer, insert this node at the head of the linked list and return the new head node. 
	 The head pointer given may be null meaning that the initial list is empty.
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
		 /*Adding a node to the front requires four steps */
        
         /* 1 & 2: Allocate the Node & Put in the data
		 Create a new node with the given integer*/
        SinglyLinkedListNode insertNodeInstance = new SinglyLinkedListNode(data);
        
         /* 3. Make next of insertNodeInstance as head 
		 Insert this node at the head of the linked list*/
        insertNodeInstance.next = llist;
        
        /* 4. Move the head to point to insertNodeInstance */
        llist = insertNodeInstance;
        
		//return the new head node.
        return llist;

    }
	
	  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		/* Start with the empty list. Tail and head are set to null */
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		  /* llist_head is an instance in the SinglyLinkedListNode class. 
		  The method insertNodeAtHead is called with the parameters llist.head and llistItem
		  
		  insertNodeAtHead takes in a Node class instance and the data.
		  The result is the node and data are placed in the front of the LinkedList*/
          SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
          
		  //a new head is the result after the function 
		  llist.head = llist_head;
        }



        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
