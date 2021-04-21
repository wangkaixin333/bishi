package niukelianxi;
//删除链表的倒数第n个节点
public class lianbiaoshanchu {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return null;

    }
}
