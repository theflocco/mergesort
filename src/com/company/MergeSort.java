package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSort {


    public int[] mergeSort(int[] unsortedList) {

        if (unsortedList.length <= 1) {
            return unsortedList;
        }

        int[] l;
        int[] r;

        if (unsortedList.length%2==0) {
            l = new int[unsortedList.length/2];
            r = new int[unsortedList.length/2];
        } else {
            l = new int[(int) Math.floor(unsortedList.length/2)];
            r = new int[(int) Math.floor(unsortedList.length/2+1)];
        }




        for (int i = 0; i < unsortedList.length; i++) {
            if (i < (int) Math.floor(unsortedList.length/2)) {
                l[i] = unsortedList[i];
            } else {
                r[i - (int) Math.floor(unsortedList.length/2)] = unsortedList[i];
            }
        }
        l = mergeSort(l);
        r = mergeSort(r);
        return merge(l, r);
    }

    private int[] merge(int[] l, int[] r) {
        int i = 0;
        int j = 0;

        Queue<Integer> leftQueue = new LinkedList<>();
        for (int ele : l) {
            leftQueue.add(ele);
        }

        Queue<Integer> rightQueue = new LinkedList<>();
        for (int ele : r) {
            rightQueue.add(ele);
        }


        int[] returnArray = new int[l.length+r.length];
        for (int k = 0; k < returnArray.length; k++) {

            // get elements and compare
            if (leftQueue.size() > 0 && rightQueue.size() > 0) {
                if (leftQueue.peek() < rightQueue.peek()) {
                    returnArray[k] = leftQueue.poll();
                } else {
                    returnArray[k] = rightQueue.poll();
                }
                // left queue is empty, fill in from right queue
            } else if (rightQueue.size() > 0 && leftQueue.size() == 0){
                returnArray[k] = rightQueue.poll();
                // right queue is empty, fill in from left queue
            } else if(leftQueue.size() > 0 && rightQueue.size() == 0) {
                returnArray[k] = leftQueue.poll();

            }

        }
        return returnArray;
    }
}
