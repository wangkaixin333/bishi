package niukelianxi;
//输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，
// 所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
public class lianbao2 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode A = pHead1;
        ListNode B = pHead2;
        while (A != B) {
            A = A == null ? pHead2 : A.next;
            B = B == null ? pHead1 : B.next;
        }
        return A;
    }
}
