package collection_practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

    public static boolean isPalindrome(String input){
        Deque<Character> deque = new ArrayDeque<>();
        for(Character c : input.toCharArray()){
            deque.add(c);
        }
        while (deque.size()>1){
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();
            if(front != rear)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.offer(4);
        dq.push(5);
        dq.offerFirst(6);
        //dq.offerLast(7);
        for (Iterator itr = dq.iterator(); itr.hasNext();){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        for (Iterator itr = dq.descendingIterator(); itr.hasNext();){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        dq.clear();
        dq.addLast(22);
        dq.addFirst(23);
        dq.add(24);
        dq.add(25);
        System.out.println(dq);
        dq.remove();
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("cacc"));
    }
}
