package week5_6;

public class Rectangle extends Shape {
    private double weight;
    private double height;
    public Rectangle(String color,boolean filled,int x,int y){
        super(color, filled,x,y);
    }
    public Rectangle(String color,boolean filled,int x,int y,double weight, double heigt){
        super(color, filled,x,y);
        this.height = heigt;
        this.weight= weight;
    }

    @Override
    double Area() {
        return height*weight;
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
