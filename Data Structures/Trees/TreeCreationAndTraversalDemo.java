package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        //let's add some Node
        Tree intTree = new Tree(); //empty tree
        intTree.insertNode(25); //this is the root
        intTree.insertNode(40); //this is the right child
        intTree.insertNode(10); //this is the left child
        intTree.insertNode(11); //this is the left.right child
        intTree.insertNode(8); //this is the left.left child
        intTree.insertNode(45); //this is the right.right chlld
        intTree.insertNode(35); //this is the right.left child

        //before calling one of our traverse methods, our tree looks like this
         /*
            25
           /  \
          10   40
         / \   / \
        8   11 35  45*/

        /*Depth First Traversals:
        (a) Inorder (Left, Root, Right) : 8 10 11 25 35 40 45
        (b) Preorder (Root, Left, Right) : 8 11 10 35 45 40 25
        (c) Postorder (Left, Right, Root) : 25 10 8 11 40 35 45

        Breadth First or Level Order Traversal :  */

        System.out.println("InOrder Traversal is: ");
        intTree.inOrder();
        System.out.println("\n");

        System.out.println("PostOrder Traversal is: ");
        intTree.postOrder();
        System.out.println("\n");

        System.out.println("PreOrder Traversal is: ");
        intTree.preOrder();
        System.out.println("\n");


    }
}

//////////////////////////////////////////////////////////BinaryTreeDemo//////////////////////////////////////////////////////////
package com.company;

public class Node {
    int data;
    Node left, right;

    //constructor
    public Node(int data) {
        this.data = data;
    }

    //method to insert a node
    public void insertion(int value){
        //need to check if the data already exist, we aren't going to insert it
        if(data == value){
            //do nothing return
            return;
        }

        //check to see if we need to traverse down the left side of a node
        if(value < data){
            //check to see if Node exist
            if(left == null){
                //left node doesn't exist so we found our insertion point
                this.left = new Node(value);
            }
            //left node exist, but we need to traverse down the left side to find the insertion point
            else{
                //recursive call keep checking the value on the left side until we find an empty position
                left.insertion(value);
            }
        }
        //check to see if we need to traverse down the right side
        else{
            //check to see if node exist
            if(right == null){
                //right node doesn't exist so we found our insertion point
                this.right = new Node(value);
            }
            //right node exist, but we need to traverse down the right side to find the insertion point
            else{
                //recursive call keep checking the value on the left side until we find an empty position
                right.insertion(value);
            }
        }
    }

    //traverse methods
      public void inOrderTraverse(){
        //traverse the left side of a Node
        if(left != null){
            //call inOrderTraverse on left node
            left.inOrderTraverse();
        }

        //visit the root
        System.out.print(data + " ");

        //traverse the right side of a node
        if(right != null){
            //call inOrderTraverse on left node
            right.inOrderTraverse();
        }

    }

    public void inPostOrder(){
        //traverse the left side of a Node
        if(left != null){
            //call inPostOrder on left node
            left.inPostOrder();
        }


        //traverse the right side of a node
        if(right != null){
            //call inPostOrder on left node
            right.inPostOrder();
        }

        //visit the root
        System.out.print(data + " ");

    }

    public void inPreOrder(){
        //visit the root
        System.out.print(data + " ");

        //traverse the left side of a Node
        if(left != null){
            //call inPreOrder on left node
            left.inPreOrder();
        }


        //traverse the right side of a node
        if(right != null){
            //call inPreOrder on left node
            right.inPreOrder();
        }

    }

}

//////////////////////////////////////////////////////////BinaryTreeDemo//////////////////////////////////////////////////////////
package com.company;

public class Tree {
    Node root;

    public void insertNode(int value){
        //check to see if tree is empty,
        if(root == null){
            //create a root
            root = new Node(value);
        }

        //find our insertion point. call insert method in Node class
        root.insertion(value);
    }

    public void inOrder(){
        if(root != null){
            //traverse the root
            root.inOrderTraverse();
        }
    }

    public void postOrder(){
        if(root != null){
            //traverse the root
            root.inPostOrder();
        }
    }

    public void preOrder(){
        if(root != null){
            //traverse the root
            root.inPreOrder();
        }
    }



}
