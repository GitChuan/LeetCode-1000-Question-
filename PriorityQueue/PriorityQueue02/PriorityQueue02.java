package PriorityQueue.PriorityQueue02;

import PriorityQueue.Priority;
import Queue.Queue;

public class PriorityQueue02<E extends Priority> implements Queue<E> {
    private final E[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public PriorityQueue02(int capacity) {
        array = (E[]) new Priority[capacity];
    }

    @Override
    public boolean offer(E value) {
        if(isFull()) return false;
        int p = size - 1;
        ++size;
        while (p >= 0){
            if(value.Priority()< array[p].Priority()){
                array[p+1] = array[p];
                --p;
            } else{
                array[p+1] = value;
                return true;
            }
        }
        array[0] = value;
        return true;
    }

    @Override
    public E poll() {
        if(isEmpty()) return null;
        E val = array[--size];
        array[size] = null;
        return val;
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        return array[size -1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }
}
