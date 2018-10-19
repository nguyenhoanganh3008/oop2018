package week5_6;

public class Circle extends Shape {
    private double radius;
    final private double Pi = Math.PI;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color,boolean filled,int x,double radius){
        super(color,filled,x);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double Area() {
        return Pi*Math.pow(radius,2);
    }
    public String toString(){
        return super.toString()+"\n"+ "Area: " + Area();
    }
}
