package tcc;

public class BubbleSort {

    private int arr[];

    public BubbleSort(int[] array) {
        arr = array;
    }

    public int[] Ordena() {
        int  n =  arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j <  n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int aux = arr[j-1];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        return arr;
    }
}
