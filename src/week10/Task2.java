package week10;

import java.util.Random;

public class Task2 {
    public void bubbleSort(int[] arr){
        for (int i = 0; i <1000 ; i++) {
            for (int j = 1; j <1000 ; j++) {
                if(arr[j]<arr[j-1]){
                    int a=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=a;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rd = new Random();
        for (int i = 0; i <1000 ; i++) {
            array[i] = rd.nextInt(1000);
        }
        Task2 t = new Task2();
        t.bubbleSort(array);
        for (int i = 0; i <1000 ; i++) {
            System.out.println("array["+i+"]"+array[i]);
        }
    }
}
