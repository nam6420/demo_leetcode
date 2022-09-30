package com.company;

import com.company.model.ListNode;
import com.company.solution.SolutionAddTowNumbers;
import com.company.solution.SolutionTwoNums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Solution 1: two nums
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] outputTest = {0, 1};
        System.out.println("Result solution 1: " + Arrays.equals(SolutionTwoNums.twoSum(nums, target), outputTest));

//        Solution 2: add two numbers
        ListNode listNode1 = SolutionAddTowNumbers.createListNode(new int[]{2,4,3});
        ListNode listNode2 = SolutionAddTowNumbers.createListNode(new int[]{5,6,4});
        outputTest = new int[]{7, 0, 8};
        ListNode output = SolutionAddTowNumbers.addTwoNumbers(listNode1, listNode2);
        SolutionAddTowNumbers.verifyListNode(output, outputTest);
    }
}
