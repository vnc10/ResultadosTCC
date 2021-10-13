package tcc;

public class BubbleSort {

    private int arr[];

    public BubbleSort(int[] array) {
        arr = array;
    }

    public int[] Ordena() {
        int i, j = 0;
        int aux = 0;

        for(i = 0; i < arr.length; i++){
            for(j = 0; j < (arr.length - 1); j++){
                if(arr[j] > arr[j + 1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        return arr;
    }

}
