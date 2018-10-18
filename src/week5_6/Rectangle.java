package week5_6;

public class Rectangle extends Shape {
    private double weight;
    private double height;
    public Rectangle(String color,boolean filled){
        super(color, filled);
    }
    public Rectangle(String color,boolean filled,double weight, double heigt){
        super(color, filled);
        this.height = heigt;
        this.weight= weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
