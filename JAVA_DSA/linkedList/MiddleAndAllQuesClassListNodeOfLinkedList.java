package linkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void printCircular(ListNode head) {
        ListNode temp = head;
        while (temp.next != head) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val + " ");
    }

    static ListNode createList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        return head;
    }
}

public class MiddleAndAllQuesClassListNodeOfLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.createList();
        ListNode ans = middleNode(head);
        ListNode.display(ans);
    }

    public static ListNode middleNode(ListNode head) {
        // Tortoise hare[Slow fast approach] ////Tc=O(n) Sc=O(1)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

        // OR //Brute force Tc=O(n)
        // int length=0;
        // ListNode temp= head;
        // while(temp!=null){
        // temp=temp.next;
        // length++;
        // }
        // temp=head;
        // for(int i=0;i<length/2;i++){
        // temp=temp.next;
        // }
        // return temp; //middle node se end tak ki linked list print karta hai.
    }
}
