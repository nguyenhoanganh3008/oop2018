package week5_6;

public class Circle extends Shape {
    private double radius;
    final private double Pi = Math.PI;
    public Circle(){

    }
    public Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
