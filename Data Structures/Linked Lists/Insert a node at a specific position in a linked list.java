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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
	
	    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
	 
	 Function Description Complete the function insertNodeAtPosition in the editor below. 
	 It must return a reference to the head node of your finished list.
	 
	 insertNodeAtPosition has the following parameters:
	 head: a SinglyLinkedListNode pointer to the head of the list
	 data: an integer value to insert as data in your new node
	 position: an integer position to insert the new node, zero based indexin
	 
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
	/*Let's look at our simple LinkedList of 1->2->3->null 

	 We are going to add 99 to the position 1. 
	 Let's assume the memory address of 1 is 100ABC, 2 is 101ABC, and 3 is 102ABC

	 SinglyLinkedListNode nodeWeAreGoingToAdd = new SinglyLinkedListNode(data); creates a new Node and its 
	 memory address is 103ABC and data = 99

	 if(head == null) return false so it doesn't execute

	 SinglyLinkedListNode temp = head; creates a new instance of the head and the memory value of head is assgined to temp

	  while(i < position - 1){
   	 	temp = temp.next;
    		i++;
	} the memory address is updated until you get to the posotion right before the insertion.


	nodeWeAreGoingToAdd.next=temp.next; temp.next is the memory address of the node right before the insertion position.
	That is assigned to the memory address of nodeWeAreGoingToAdd.next

	temp.next=nodeWeAreGoingToAdd; the new Node is assigned to memory address

	*/
		
        /* Inserting a Node after a given Node takes 5 steps */ 
        
        /* 1.Allocate the Node & Put in the data
         Create a new node with the given data. New Instance calls the default constructor*/
         SinglyLinkedListNode nodeWeAreGoingToAdd = new SinglyLinkedListNode(data); 
        
        /* 2. Check if the given Node is null */
        if(head == null){
            return nodeWeAreGoingToAdd;
        }
        /* 3. if position equals 0, then return the head*/
        else if (position == 0){
	    //sets the new node's next field to the current head of the list
            nodeWeAreGoingToAdd.next = head;
            return nodeWeAreGoingToAdd;
        }
            
        //create new Node for the head
        SinglyLinkedListNode temp = head;
        int i = 0;
            
        /*Iterate through list until you get to the position right before you do the insertion  */     
        while(i < position - 1){
	   //the temp node next field is assigned to back to the node. So, whatever temp.node is pointing at is assigned to temp 
            temp = temp.next;
            i++;
        }
        
         /* 4. Make next of nodeWeAreGoingToAdd as next of temp. The value temp.next points to replaces what
		nodeWeAreGoingToAdd is pointing to	*/
        nodeWeAreGoingToAdd.next=temp.next;
		
	/* 5. The value of  nodeWeAreGoingToAdd is replaces what temp.next is pointing to*/
        temp.next=nodeWeAreGoingToAdd;
        
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

            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
