package week5_6;

public class Test {
    public static void main(String[] args) {
       Circle circle1 = new Circle();
       Layer layer1 = new Layer();
       Diagram diagram1 = new Diagram();

        System.out.println("sau khi xoa: ");
       diagram1.removeCircle();
       layer1.shapes.add(circle1);
       diagram1.layers.add(layer1);


    }
}
