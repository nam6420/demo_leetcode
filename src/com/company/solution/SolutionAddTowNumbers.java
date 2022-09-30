package com.company.solution;

import com.company.model.ListNode;

import java.util.Arrays;

public class SolutionAddTowNumbers {

    public static ListNode createListNode(int[] nums) {
        ListNode result = null;
        ListNode head = null;

        for (int i = 0; i < nums.length; i ++) {
            if (result == null) {
                head = result = new ListNode(nums[i]);
            } else {
                head.next = new ListNode(nums[i]);
                head = head.next;
            }
        }

        return result;
    }

    /**
     * Add two numbers
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            if (temp == null) {
                temp = head = node;
            }

            else {
                temp.next = node;
                temp = temp.next;
            }
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return head;
    }

    public static void verifyListNode(ListNode listNode, int[] output) {
        int[] nodeValues = new int[output.length];
        for (int i = 0; i < output.length; i++) {
            nodeValues[i] = listNode.val;
            listNode = listNode.next;
        }

        boolean isNodeValuesEqualOutput = Arrays.equals(nodeValues, output);
        System.out.println("Result solution 2: " + isNodeValuesEqualOutput);
    }

}
