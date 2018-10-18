package week4.task2;

public class showInfo {
    public static void main(String[] args) {
        Shade shade =new Shade("do",true);
        System.out.println(shade);
        System.out.println("=========================");
        Circle circle =new Circle("Do",true,6.5);
        System.out.println(circle);
        System.out.println("=========================");
        Rectangle rectangle=new Rectangle("Xanh",true,5,6);
        System.out.println(rectangle);
        System.out.println("=========================");
        Square square= new Square("Xanh",true,9);
        System.out.println(square);
    }
}
