package tcc;

public class Queue {
    public Elemento inicio = null;
    public Elemento fim = null;
    public static class Elemento {
        int valor;
        Elemento proximo;
    }
    public int saiDaFila(){
        if(inicio != null){
            Elemento aux = inicio;
            inicio = inicio.proximo;
            int valor = aux.valor;
            return valor;
        }
        return -1;
    }
    public Elemento entraNaFila(int valor){
        Elemento aux = new Elemento();
        aux.valor = valor;
        aux.proximo = null;
        if(fim == null){
            inicio = aux;
            fim = aux;
        }
        if(fim != null){
            fim.proximo = aux;
            fim = aux;
        }
        return aux;
    }
}