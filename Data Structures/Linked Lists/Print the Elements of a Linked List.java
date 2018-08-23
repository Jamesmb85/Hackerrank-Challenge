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
        
	/*This is a pointer. It stores a reference(memory address) to the next Node in the LinkedList. 
	Default value is null if we don't set it in constructor */
	public SinglyLinkedListNode next; 

	//constructor that once a new Node(instance) is created, nodeData is assigned to data and next is assigned null
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData; //nodeData is the input entered into the LinkedList and it is assigned to data
            this.next = null; //node is set to default for each new element created
        }
    }
    //LinkedList Class
    static class SinglyLinkedList {
	/*This is a pointer. It stores a reference(memory address) to the head Node in the LinkedList. */
        public SinglyLinkedListNode head;
	/*This is a pointer. It stores a reference(memory address) to the tail Node in the LinkedList. */		
        public SinglyLinkedListNode tail; 

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

	/*Let's look at our simple LinkedList of 1->2->3->null

	Iteration 1
	head = some memory address since it is a reference to the object(head which is an instance of SinglyLinkedListNode)
	Let's assume the memory address is 100ABC

	So, we enter the loop

	head.data = 1 so it is printed
	head.next = is the next memory address and it is assigned to head
	Let's assume the memory address is 101ABC

	Iteration 2
	head = 101ABC != null so loop continues
	head.data = 2 so it is printed
	head.next = is the next memory address and it is assigned to head
	Let's assume the memory address is 102ABC

	Iteration 3
	head = 102ABC != null so loop continues
	head.data = 3 so it is printed
	head.next = is the next memory address and it is assigned to head. We are at the end of the list so it is null

	Iteration 4
	head = null so loop doesn't execute
	*/
	while(head != null){
            System.out.println(head.data); //print out data element of the node
            head = head.next; //head.next is the reference(memory address) to the next element and it is assigned to head

    	}
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
