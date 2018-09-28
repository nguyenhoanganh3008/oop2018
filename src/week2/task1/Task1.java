package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while(b>0){
            if(a<b){
            int temp=a;
            a=b;
            b=temp;
            }
            int temp=a-b;
            a=b;
            b=temp;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

//    public static void main(String[] args) {
//        for(int i=0;i<=10;i++){
//            System.out.println(fibonacci(i) + " ");
//        }
//        System.out.println(gcd(6,9));
//    }
}
