import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
	
		/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        
        //test to see if tree is empty
        if(root == null){
            //-1 is the height
            return -1;
        }
        
        else{
            //compute the depth of each side. recursive calls to get to the lowest leaf
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        //return greater depth
        if(leftHeight > rightHeight){
            return leftHeight+1;
        }
        else{
            return rightHeight+1;
        }
    }
        
        
}

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}