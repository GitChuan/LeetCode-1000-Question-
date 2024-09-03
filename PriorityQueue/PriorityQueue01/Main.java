package PriorityQueue.PriorityQueue01;


import PriorityQueue.Entry;

public class Main {
    public static void main(String[] args) {
        PriorityQueue01<Entry> queue = new PriorityQueue01<>(100);
        queue.offer(new Entry("1", 1));
        queue.offer(new Entry("2", 2));
        queue.offer(new Entry("5", 5));
        queue.offer(new Entry("3", 3));
        queue.offer(new Entry("4", 4));

        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
        System.out.println(queue.poll().Priority());
    }
}