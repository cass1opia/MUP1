package Tutorium;
import java.util.ArrayList;

public class ArrayLIstAdapter <E> implements MyQueue<E>{
    private ArrayList<E> elements;
    public ArrayLIstAdapter() {
        this.elements = new ArrayList<E>();
    }
    public void add(E elem){
        this.elements.add(elem);
    }
    public E top(){
        return this.elements.get(0);
    }
    public E topAndPop() {
        return this.elements.remove(0);
    }
    public int size(){
        return this.elements.size();
    }
}
