package tcc;

public class BubbleSort {

    private int arr[];

    public BubbleSort(int[] array) {
        arr = array;
    }

    public int[] Ordena() {
        for(int i = 0; i < (arr.length)-1; i++) {
            for(int j = i+1; j < (arr.length) ; j++) {
                if(arr[j] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        return arr;

    }

}
