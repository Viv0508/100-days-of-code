class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int size = 1;
        ListNode dummy = null;

        while (temp.next != null)
        {
            temp = temp.next;
            size++;
        }

        temp.next = head;
        int rotation = k % size;
        int skip = size - rotation;
        ListNode newLast = head;

        for(int i = 1 ; i <skip; i++)
        {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
