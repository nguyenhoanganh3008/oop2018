package week4.task2;

public class Circle extends Shade {
    private double radious = 1.0;
    private double PI = Math.PI;
    public Circle(){

    }
    public Circle(double radious){
        this.radious=radious;
    }
    public Circle(String color,boolean filled,double radious){
        super(color, filled);
        this.radious=radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }
    @Override
    public String toString(){
        double Area = PI*Math.pow(radious,2);
        double Perimeter = 2*PI*radious;
        return super.toString()
                +"\n"+"Area: "+Area+"\n"+"Perimeter: " +Perimeter;
    }

}
