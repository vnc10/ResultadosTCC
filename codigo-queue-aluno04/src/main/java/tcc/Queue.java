package tcc;

public class Queue {
    private Node front = null;
    private Node back = null;

    private static class Node {
        int item;
        Node next;
    }

    /**
     * Remove um elemento do começo da fila
     */
    public int dequeue() {
        Node aux = this.front;
        this.front = this.front.next;
        aux = null;
        return 1;
    }

    /**
     * Insere um elemento no final da fila
     */
    public void enqueue(int item) {
        this.back.next = new Node();
        this.back.next.item = item;
        this.back.next.next = null;
        this.back = this.back.next;
    }

    /**
     * Retorna o primeiro elemento da fila
     */
    public int head() {
        return this.front.item;
    }

    /**
     * Verifica se a fila está vazia
     */
    public boolean isEmpty() {
        if(this.front == null && this.back == null){
            return true;
        } else {
            return false;
        }
    }
}
