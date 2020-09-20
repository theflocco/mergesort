package com.company;

import com.company.MergeSort;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        int[] list = {5, 7, 3, 9, 11, 15, 1, 23, 104, 3, 208};
        MergeSort mergeSort = new MergeSort();
        int[] sorted = mergeSort.mergeSort(list);
        for (int i : sorted) {
            System.out.println(i);
        }


        // BST Test Case
        Node node4 = new Node(4);
        Node node2 = new Node(2);
        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node7 = new Node(7);

        node2.left = node1;
        node2.right = node3;
        node4.left = node2;
        node4.right = node7;

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node finalnode = binarySearchTree.insert(node4, 6);

    }
}
