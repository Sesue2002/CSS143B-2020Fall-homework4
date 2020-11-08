package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        //got help with this from msquared too
        if(list == null){
            String empty = "[";
            print.print(empty.replace("[", ""));
            return;
        }
        if(list.next == null){
            print.print(list.val + " ");
            return;
        }
        printListInReverse(list.next, print);
        print.print(list.val + " ");
    }
}
