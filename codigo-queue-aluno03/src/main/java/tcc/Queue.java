package tcc;

public class Queue {
    private Node front = null;
    private Node back = null;

    private static class Node {
        int item;
        Node next;
    }


    public boolean isEmpty() {
        if(front == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int dequeue() {
        Node removido;

        if (!isEmpty()) {
            removido = front;
            front = front.next;
            return removido.item;
        } else {
            return -1;
        }

    }

    public void enqueue(int item) {
        Node elemento = new Node();
        elemento.item = item;
        elemento.next = null;

        if (!isEmpty()) {
            back.next = elemento;
            back = elemento;

        } else {
            front = elemento;
            back = elemento;
        }
    }

    public int head() {
        if(!isEmpty()){
            return front.item;
        }
        else{
            return -1;
        }
    }

}
