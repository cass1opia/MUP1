package Tutorium;

public interface MyQueue<E>{
    public void add(E element);
    E topAndPop();
    E top();
    int size();
}
