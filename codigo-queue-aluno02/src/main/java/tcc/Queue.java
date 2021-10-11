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
        if (front == null) {
            return -1;
        } else {
            Node aux = front;
            front = front.next;

            return aux.item;
        }
    }

    /**
     * Insere um elemento no fim da fila
     */
    public void enqueue(int item) {
        Node novo = new Node();
        novo.item = item;
        novo.next = null;

        if (front == null) {
            front = back = novo;
        } else {
            back.next = novo;
            back = novo;
        }
    }

    /**
     * Retorna o primeiro elemento da fila
     */
    public int head() {
        if (front == null) {
            return -1;
        }
        return front.item;
    }

    /**
     * Retorna o ultimo elemento da fila
     */
    public int rear() {
        if (back == null) {
            return -1;
        }
        return back.item;
    }

    /**
     * Verifica se a fila está vazia
     */
    public boolean isEmpty() {
        if (front == null) {
            return true;
        }
        return false;
    }
}

