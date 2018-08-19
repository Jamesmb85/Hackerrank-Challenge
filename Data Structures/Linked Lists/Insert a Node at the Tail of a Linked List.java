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

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData; //nodeData is the input entered into the LinkedList and it is assigned to data
            this.next = null; //node is set to default for each new element created
        }
    }

    //LinkedList Class
    static class SinglyLinkedList {
        public SinglyLinkedListNode head; //This is a pointer. head is an instance of the Node class

        public SinglyLinkedList() {
            this.head = null;
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
	
	    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
	 
	 You are given the pointer to the head node of a linked list and an integer to add to the list. 
	 Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node 
	 of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the 
	 initial list is empty.
	 
	 You have to complete the SinglyLinkedListNode insertAtTail(SinglyLinkedListNode head, int data) method. 
	 It takes two arguments: the head of the linked list and the integer to insert at tail. 
	 You should not read any input from the stdin/console.
	 
	 The input is handled by code editor and is as follows:
	 The first line contains an integer , denoting the elements of the linked list.
	 The next lines contain an integer each, denoting the element that needs to be inserted at tail. 
	 
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

	/* 1.Allocate the Node & Put in the data
         Create a new node with the given data. New Instance calls the default constructor*/
         SinglyLinkedListNode nodeWeAreGoingToAddAtTheEnd = new SinglyLinkedListNode(data);
        
         /* 2. Check if the given Node is null */
        if(head == null){
            return nodeWeAreGoingToAddAtTheEnd;
        }
        
         /* 3. This new node is going to be the last node, so make next of it as null */
        nodeWeAreGoingToAddAtTheEnd.next = null;
 
        /* 4. Traverse till the last node */
		//create new Node for the head
        SinglyLinkedListNode last = head; 
        
		while (last.next != null){
			//last.next points to the next data element and that value is assigned to last. This is done until you reach the tail
			last = last.next;
		}
            

        /* 5. Change the next of last node. The last node is the  */
        last.next = nodeWeAreGoingToAddAtTheEnd;
        
	//return head
        return head;

    }
	
	    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
          
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
          llist.head = llist_head;
          
        }



        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
