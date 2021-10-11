package tcc;

public class Queue {
    private Node front = null;
    private Node back = null;

    private static class Node {
        int item;
        Node next;
    }

    public int dequeue() {
        Node aux = this.front;
        this.front = this.front.next;
        aux = null;
        return 1;
    }

    public void enqueue(int item) {
        this.back.next = new Node();
        this.back.next.item = item;
        this.back.next.next = null;
        this.back = this.back.next;
    }

    public int head() {
        return this.front.item;
    }

    public boolean isEmpty() {
        if(this.front == null && this.back == null){
            return true;
        } else {
            return false;
        }
    }
}
