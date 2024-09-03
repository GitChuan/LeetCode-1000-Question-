package PriorityQueue.PriorityQueue01;

import PriorityQueue.Priority;
import Queue.Queue;

public class PriorityQueue01<E extends Priority> implements Queue<E> {
    private final E[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public PriorityQueue01(int capacity) {
        array = (E[]) new Priority[capacity];
    }

    @Override
    public boolean offer(E value) {
        if(isFull()) return false;
        array[size++] = value;
        return true;
    }

    private int selectMax(){
        int m = 0;
        for (int i = 1; i < size; i++) {
            if(array[m].Priority() < array[i].Priority()){
                m = i;
            }
        }
        return m;
    }
    private void remove(int index){
        if(index < size - 1){
            System.arraycopy(array, index+1, array, index, size - 1- index);
        }
        --size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E poll() {
        if (isEmpty()) return null;
        int m = selectMax();
        E ret = (E) array[m];
        remove(m);
        return ret;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) return null;
        int m = selectMax();
        return (E) array[m];
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
