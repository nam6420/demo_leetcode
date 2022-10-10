package com.company;

import com.company.model.ListNode;
import com.company.solution.SolutionAddTowNumbers;

import java.util.Arrays;

public class TutorialMain {

    public static void main(String[] args) {
        int[] inputArrays = {5, 4, 6, 8, 9, 2, 1, 7, 3};
        System.out.println(Arrays.toString(sortArrays(inputArrays, false)));


        ListNode listNode = SolutionAddTowNumbers.createListNode(new int[]{5, 4, 6, 8, 9, 2, 1, 7, 3});
    }

    private static void changeValue(int[] values, int i, int j) {
        int current = values[i];
        int change = values[j];
        values[i] = change;
        values[j] = current;
    }

    private static int[] sortArrays(int[] values, boolean isUp) {

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (isUp) {
                    if (values[i] > values[j]) {
                        changeValue(values, i, j);
                    }
                } else {
                    if (values[i] < values[j]) {
                        changeValue(values, i, j);
                    }
                }
            }
        }
        return values;
    }

    private static ListNode sortNode(ListNode listNode) {
        return listNode;
    }

}
