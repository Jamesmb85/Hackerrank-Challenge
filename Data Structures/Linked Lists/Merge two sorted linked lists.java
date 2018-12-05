// You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists will be sorted in ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending order. Either head pointer given may be null meaning that the corresponding list is empty.

// Input Format

// You have to complete the SinglyLinkedListNode MergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) 
// method which takes two arguments - the heads of the two sorted linked lists to merge. 
// You should NOT read any input from stdin/console.

// The input is handled by the code in the editor and the format is as follows:

// The first line contains an integer n, denoting the number of test cases.
// The format for each test case is as follows:

// The first line contains an integer t, denoting the length of the first linked list.
// The next n lines contain an integer each, denoting the elements of the linked list.
// The next line contains an integer m, denoting the length of the second linked list.
// The next m lines contain an integer each, denoting the elements of the second linked list.

// Constraints
// 1<=t<=10
// 1<=n<=1000
// 1<=list<=1000, where list is the ith element of the list.

// Output Format

// Change the next pointer of individual nodes so that nodes from both lists are merged into a single list. Then return the head of this merged list. Do NOT print anything to stdout/console.

// The output is handled by the editor and the format is as follows:

// For each test case, print in a new line, the linked list after merging them separated by spaces.

// Sample Input

// 1
// 3
// 1
// 2
// 3
// 2
// 3
// 4

// Sample Output

// 1 2 3 3 4 

// Explanation

// The first linked list is: 1 -> 2 -> 3 -> NULL

// The second linked list is: 3 -> 4 -> NULL

// Hence, the merged linked list is: 1 -> 2 -> 3 -> 3 -> 4 -> NULL



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

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

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null) return head2; if(head2 == null) return head1;

    if(head1.next == null && head2.next == null) {
        if(head1.data < head2.data) {
            head1.next = head2;
            return head1;
        } else {
            head2.next = head1;
            return head2;
        }
    } else {
        if(head1.data < head2.data) {
            SinglyLinkedListNode c = mergeLists(head1.next, head2);
            head1.next = c;
            return head1;
        } else {
            SinglyLinkedListNode c = mergeLists(head1, head2.next);
            head2.next = c;
            return head2;
        }
    }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
          
          	SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3, " ", bufferedWriter);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
