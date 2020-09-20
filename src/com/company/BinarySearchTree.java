package com.company;

public class BinarySearchTree {


    public Node insert(Node root, int data) {
        Node node = new Node(data);
        if (root == null) {
            return node;
        }

        Node currentNode = root;

        while(true) {
            // go right
            if (data > currentNode.data) {
                // insert if null
                if (currentNode.right == null) {
                    currentNode.right = node;
                    break;
                } else {
                    // go deeper
                    currentNode = currentNode.right;
                }
            } else {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            }
        }
        return root;
    }
}
