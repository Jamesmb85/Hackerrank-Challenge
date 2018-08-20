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
	
	
	    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     
	 You’re given the pointer to the head node of a linked list and the position of a node to delete. 
	 Delete the node at the given position and return the head node. 
	 A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. 
	 The list may become empty after you delete the node.
	 
	 The first line of input contains an integer n, denoting the number of elements in the linked list.
	 The next n lines contain an integer each in a new line, denoting the elements of the linked list in the order.
	 The last line contains an integer position denoting the position of the node that has to be deleted form the linked list. 
	 */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	//store head Node
        SinglyLinkedListNode newHead = head;
        
        //if list is empty, return head
        if(head == null){
            return head;
        }
        
        //if head needs to be removed
        if(position == 0){
            head = newHead.next; // newHead.next is moved to the next reference and assigned to head
            return head;
        }
        
        //find the previous Node which is at position-1
        for(int i = 0; newHead != null && i < position - 1; i++){
           //the newHead next field is assigned to back to newHead. 
	   //So, whatever newHead.next is pointing at is assigned to newNode 
            newHead = newHead.next;
        }
        
        // SinglyLinkedListNode newNode->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        SinglyLinkedListNode next = newHead.next.next;
        
        //unlink the deleted node from the list
        newHead.next = next;
        
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

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
