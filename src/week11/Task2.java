package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2<T> {
    public <T extends Comparable> void max(ArrayList<T> arrayList){
        T max = arrayList.get(0);
        for (int i = 0; i <arrayList.size() ; i++) {
            if(max.compareTo(arrayList.get(i))<0){
                max=arrayList.get(i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            int number = scanner.nextInt();
            a.add(number);
        }
        Task2 task2 = new Task2();
        task2.max(a);
    }
}
