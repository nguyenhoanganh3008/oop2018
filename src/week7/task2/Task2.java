package week7.task2;


import java.io.*;

public class Task2 {
    public void NullPointerException()throws NullPointerException{
        String str = new String();
        System.out.println(str.length());
    }
    public void ArrayIndexOfBoundException() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[3];
        arr[5]=5;
        System.out.println(arr[5]);
    }
    public void ArithmeticException() throws ArithmeticException{
        int data = 5/0;
        System.out.println(data);
    }
    public void ClassCastException() throws ClassCastException{
        Object o="HoangAnh";
        int str= (int) o;
        System.out.println(str);
    }
    public void IOException()throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("string.txt"));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }
    public void FileNotFoundException() throws FileNotFoundException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("string.txt"));
    }

    public static void main(String[] args) {
        Task2 t = new Task2();
        try {
            t.NullPointerException();
        }catch (NullPointerException e){
            System.err.println("gia tri tro toi null!!");
        }
        try{
            t.ArrayIndexOfBoundException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("phan tu khong co trong mang");
        }
        try {
            t.ArithmeticException();
        }catch (ArithmeticException e){
            System.err.println("mau so bang 0!!");
        }
        try {
            t.ClassCastException();
        }catch (ClassCastException e){
            System.err.println(e.getMessage());
        }
        try {
            t.IOException();
        } catch (IOException e) {
            System.err.println("Khong thay file text");
        }
        try {
            t.FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
