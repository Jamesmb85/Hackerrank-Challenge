package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Start with empty LinkedList
        LinkedListPresentation sampleLinkedList = new LinkedListPresentation();

        sampleLinkedList.head = new Node(100); //create the head with a value of 100 and next = null
        Node first = new Node(200);
        Node second = new Node(300);
        Node third = new Node(400);
        Node fourth = new Node(500);

        /*At this point we have 5 Node that are not linked. Each node contains the data and pointer when we create an instance
         * +-----+-----+
           + 100 | null+
           +-----+-----+
         *
         * +-----+-----+
           + 200 | null+
           +-----+-----+

           +-----+-----+
           + 300 | null+
           +-----+-----+

           +-----+-----+
           + 400 | null+
           +-----+-----+

           +-----+-----+
           + 500 | null+
           +-----+-----+
         * */

        //let's link all of the Node
        sampleLinkedList.head.next = first; //head is linked to first
        first.next = second; //first is linked second
        second.next = third; //second is linked to third
        third.next = fourth; //third is linked to fourth


        //print LinkedList
        sampleLinkedList.printList();
        System.out.println("\n");

        //let's add 999 to the front
        sampleLinkedList.addToFront(999);

        //print LinkedList
        sampleLinkedList.printList();
        System.out.println("\n");

        //let's add 111 after 300
        sampleLinkedList.addToPositionNotTheBeginningOrEnd(second, 111);

        //print LinkedList
        sampleLinkedList.printList();
        System.out.println("\n");

        ///let's add 12345 to the end
        sampleLinkedList.addToEnd(12345);

        //print LinkedList
        sampleLinkedList.printList();
        System.out.println("\n");



    }

}



//////////////////////////////////////////////////////////LinkedListDemo//////////////////////////////////////////////////////////
package com.company;

public class LinkedListPresentation {
    //pointer(reference) to beginning of the LinkedListPresentation
    Node head;

    public void printList() {
        //create an instance of the Node class so we can traverse through the LinkedList
        Node n = this.head;

        while (n != null) {
            //print out the node
            System.out.print(n.data + " ->");
            //change the node
            n = n.next;
        }
    }

    public void addToFront(int data){
        //create a new Node
        Node frontNode = new Node(data);

        //assign frontNode nex field to the current head
        frontNode.next = head;

        //assign the frontNode to the head
        head = frontNode;
    }

    public void addToPositionNotTheBeginningOrEnd(Node prevNode, int data){
        //check to see if Node parameter is null, this means LinkedList is empty
        if(prevNode == null){
            System.out.println("Linked List is empty and a null cannot be passed");
            return;
        }

        //create a New Node
        Node nodetoEnter = new Node(data);

        //new Node next field is set to the prevNode next field
        nodetoEnter.next = prevNode.next;

        //previous Node next field is now the new Node
        prevNode.next = nodetoEnter;

    }

    public void addToEnd(int data){
        //create a new Node
        Node nodeAtTheEnd = new Node(data);

        //check to see if Linked List is empty, if it is make our new Node as the head
        if(head == null){
            head = new Node(data);
            return;
        }

        //our new node is going to be last, so it next field is null
        nodeAtTheEnd.next = null;

        //we need to traverse to the end of the Linked List
        Node last = head;
        while(last.next != null){
            //change the node
            last = last.next;
        }

        //since we are at the end of the Linked List, we need to make the node we created linked to the last node
        last.next = nodeAtTheEnd;
        return;
    }


}

//////////////////////////////////////////////////////////LinkedListDemo//////////////////////////////////////////////////////////
package com.company;

public class Node {
    //data in node
    int data;
    //pointer(reference) to the next Node
    Node next;

    //constructor to get a new node
    public Node(int data) {
        this.data = data;
        //pointer is set to null so we can link them later
        this.next = null;
    }
}

