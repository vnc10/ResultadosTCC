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
        if(isEmpty()){
            return -1;
        }
        else{
            Node aux = front;
            front = front.next;

            return aux.item;
        }
    }

    /**
     * Insere um elemento no fim da fila
     */
    public void enqueue(int item) {
        Node newElem = new Node();
        newElem.item = item;
        newElem.next = null;

        if(front == null){
            front = newElem;
            back = newElem;
        }
        else{
            back.next = newElem;
            back = newElem;
        }
    }

    /**
     * Retorna o primeiro elemento da fila
     */
    public int head() {
        if(isEmpty()){
            return -1;
        }
        else{
            return front.item;
        }
    }

    /**
     * Verifica se a fila está vazia
     */
    public boolean isEmpty() {
        if(front == null){
            return true;
        }
        else{
            return false;
        }
    }
}
