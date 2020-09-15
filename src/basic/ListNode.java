package basic;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 链表基础结构
 * ----      Example         ----
 */
public class ListNode {
    public ListNode next;
    public ListNode pre;
    public int val;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode generateNode(int[] aar) {
        ListNode node;
        if (aar == null || aar.length == 0) {
            return null;
        }
        node = new ListNode(aar[0]);
        ListNode current = node;
        int index = 1;
        while (index < aar.length) {
            ListNode next = new ListNode(aar[index]);
            current.next = next;
            current = next;
            index++;
        }
        return node;
    }

    public static void printNode(ListNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val);
        ListNode cur = node;
        while (cur.next != null) {
            cur = cur.next;
            System.out.print("-->" + cur.val);
        }
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPre() {
        return pre;
    }

    public void setPre(ListNode pre) {
        this.pre = pre;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
