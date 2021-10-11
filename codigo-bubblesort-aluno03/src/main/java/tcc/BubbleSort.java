package tcc;

public class BubbleSort {

    private int arr[];

    public BubbleSort(int[] array) {
        arr = array;
    }

    public int[] Ordena() {

        int tam = arr.length;
        int aux = 0;

        for (int i = 0 ; i < tam ; i++) {
            for (int j = 1 ; j < (tam - i) ; j++) {
                if (arr[j-1] > arr[j]) {
                    aux = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        return arr;
    }
}
