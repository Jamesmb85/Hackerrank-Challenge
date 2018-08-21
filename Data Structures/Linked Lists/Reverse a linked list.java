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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
	
	
	    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
	 
	 You’re given the pointer to the head node of a linked list. 
	 Change the next pointers of the nodes so that their order is reversed. 
	 The head pointer given may be null meaning that the initial list is empty.
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
		//need three pointers
        SinglyLinkedListNode previousNode = null;
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode nextNode = null;
        
		/*Let's look at the sample array and what the steps are doing 
		null -> 1 -> 2 -> 3 -> null
		
		Entering the loop, we have the following:
		currentNode = 1
		previousNode and nextNode = null
		
		currentNode.next points to 2 and is assigned to nextNode
		previousNode is null and is assigned currentNode.next(So, the pointer from 1 to 2 is used to point 1 to null)
		currentNode is 1 and that is assigned previousNode
		nextNode is 2 and is assigned to currentNode
		
		So, we have currentNode = 2, previousNode = 1, nextNode = 2 after the first iteration
		
		The LinkedList is now  null <- 1  2 -> 3 -> null

		No link from 1 to 2
			
		Check the condition again
		
		currentNode.next points to 3 and is assigned to nextNode
		previousNode is 1 and is assigned currentNode.next (So, the pointer from 2 to 3 is used to point 2 to 1)
		currentNode is 2 and that is assigned previousNode
		nextNode is 3 and is assigned to currentNode
		
		So, we have currentNode = 3, previousNode = 2, nextNode = 3 after the second iteration
		
		The LinkedList is now  null <- 1 <- 2  3 -> null

		No link from 2 to 3
			
		Check the condition again
		
		currentNode.next points to null and is assigned to nextNode
		previousNode is 2 and is assigned currentNode.next (So, the pointer from 3 to null is used to point 3 to 2)
		currentNode is 3 and that is assigned previousNode
		nextNode is null and is assigned to currentNode
		
		So, we have currentNode = null, previousNode = 3, nextNode = null after the third iteration
		
		The LinkedList is now  null <- 1 <- 2 <- 3 null

		No link from 3 to null
			
		Check the condition again, currentNode == null so we move the header to 3 by line head = previousNode
		
		
		
		*/
        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        
        head = previousNode;
        
        return head;

    }
	
	
	    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

            SinglyLinkedListNode llist1 = reverse(llist.head);

            printSinglyLinkedList(llist1, " ", bufferedWriter);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
