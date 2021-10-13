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
        this.front = aux.next;
        aux = null;
        return 1;
    }

    /**
     * Insere um elemento no final da fila
     */
    public void enqueue(int item) {
        Node aux = this.front;
        this.front = this.front.next;
        aux = null;
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
        if(this.back == null && this.front == null){
            return true;
        }
        else{
            return false;
        }
    }
}