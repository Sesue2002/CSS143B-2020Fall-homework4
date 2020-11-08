package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    //Got some help from m squared for the function and from this website
    //https://www.geeksforgeeks.org/java-program-for-merge-sort-for-linked-lists/
    public static ListNode findMidAndBreak(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head.next;
        }

        ListNode p1 = head;

        //basically we have a pointer that checks each step and sees if the next one or the current one it's on is null
        while(p1 != null && p1.next != null){
            p1 = p1.next;
            //if it is we stop there
            if(p1.next == null)
                break;
            //if not then we take another step, this would be the second step
            p1 = p1.next;
            //if the next is null then we stop there, knowing that if we take two steps, head will be somewhere where it shouldn't be
            if(p1.next == null)
                break;
            //and if its in the clear then head moves forward by one
            head = head.next;
        }

        //head will be in the middle because once p1 gets to null head will be half of that
        //want this to split
        ListNode startList2 = head.next;
        head.next = null;

        return startList2;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        ListNode res = null;

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            res = list1;
            res.next = mergeLists(list1.next, list2);
        }
        else{
            res = list2;
            res.next = mergeLists(list1, list2.next);
        }
        return res;
    }
}
