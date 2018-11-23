package week11;

public class Task1 {
    public static <T extends Comparable> void sort(T[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if(arr[j].compareTo( arr[j-1]) < 0){
                    T a=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=a;
                }
            }
        }
    }
    public static <T> void sout(T[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n===========================");

    }
    public static void main(String[] args) {
        Integer[] intarray = {3,12,2,34,1,6,7,0};
        sort(intarray);
        sout(intarray);
        Character[] chars = {'h','o','a','n','g','a','n','h'};
        sort(chars);
        sout(chars);
        Double[] doubles = {3.2,4.6,8.1,1.5,9.4,0.4,10.5};
        sort(doubles);
        sout(doubles);
    }
}
