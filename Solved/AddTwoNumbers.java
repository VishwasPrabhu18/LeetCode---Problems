/*
 *  2. Add Two Numbers
 *  You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 *  Example 1
 *      Input: l1 = [2,4,3], l2 = [5,6,4]
 *      Output: [7,0,8]
 *      Explanation: 342 + 465 = 807.
 *      
 * Example 2:
 *      Input: l1 = [0], l2 = [0]
 *      Output: [0]
 * 
 * Example 3:
 *      Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 *      Output: [8,9,9,9,0,0,0,1]
 * 
 */

package Solved;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }

}

public class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode(0);
            ListNode temp1 = res;
            int carry = 0;
    
            while(l1 != null || l2 != null || carry != 0) {
                int v1 = (l1 != null) ? l1.val : 0;
                int v2 = (l2 != null) ? l2.val : 0;
                
                int t = v1 + v2 + carry;
                int d = t % 10;
                carry = t / 10;
    
                ListNode newNode = new ListNode(d);
                temp1.next = newNode;
                temp1 = temp1.next;
    
                l1 = (l1 != null) ? l1.next : null;
                l2 = (l2 != null) ? l2.next : null;
    
            }
            
            ListNode result = res.next;
            return result;
        }
}
