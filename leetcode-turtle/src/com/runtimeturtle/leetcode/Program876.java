package com.runtimeturtle.leetcode;


/* Definition for singly-linked list.*/
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
/**
 * {@link}https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4426/
 * {@link}https://leetcode.com/problems/middle-of-the-linked-list/
 *
 * @author white-parrot
 */
public class Program876 {

    public ListNode middleNode(ListNode head) {
        ListNode midNode = head;
        ListNode next = head.next;
        int count = 1;
        while(next != null){
            count++;
            if(count % 2 == 0){
                midNode = midNode.next;
            }
            next = next.next;
        }
        
        /*Second Approach without Count*/
        ListNode middle = head;
        ListNode end = head;

        while(end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
        // return midNode;
    }

}
