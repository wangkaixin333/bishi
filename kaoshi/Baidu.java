import niukelianxi.ListNode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Baidu {

    public ListNode ReverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }

        return pre;

    }
    public static void main(String[] args) {




    }
}
