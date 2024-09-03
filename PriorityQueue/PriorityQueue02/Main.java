package PriorityQueue.PriorityQueue02;

import PriorityQueue.Entry;

public class Main {
    public static void main(String[] args) {
        PriorityQueue02<Entry> queue = new PriorityQueue02<>(100);
        System.out.println(queue.offer(new Entry("1", 1)));
        System.out.println(queue.offer(new Entry("4", 4)));
        System.out.println(queue.offer(new Entry("2", 2)));
        System.out.println(queue.offer(new Entry("5", 5)));
        System.out.println(queue.offer(new Entry("3", 3)));
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
    }
}
