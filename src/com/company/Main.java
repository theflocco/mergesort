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
    }
}
