package com.example.myapplication.arrays;

public class AddNumSum {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        ListNode listNode = addTwoNum(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(String.valueOf(listNode.value));
            listNode = listNode.next;
        }

    }

    private static ListNode addTwoNum(ListNode listNodeOne, ListNode listNodeTwo) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;
        ListNode p1 = listNodeOne;
        ListNode p2 = listNodeTwo;
        while (p1 != null || p2 != null) {
            int x = p1 != null ? p1.value : 0;
            int y = p2 != null ? p2.value : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return head.next;
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
}
