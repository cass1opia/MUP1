package Tutorium;

import java.util.Queue;
import java.util.Stack;

public class Client {
    public static void main(String[] args){
        MyQueue<Integer> myQueue = new ArrayLIstAdapter<>();
        myQueue.add(42);
        myQueue.add(-1);
        myQueue.add(20);
        System.out.println(myQueue.top());
        System.out.println(myQueue.topAndPop());
        System.out.println(myQueue.topAndPop());
        System.out.println(myQueue.size());
    }
}
