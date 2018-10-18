package week4.task2;


public class Rectangle extends Shade {

    private double height = 1.0;
    private double weight = 1.0;
    public Rectangle(){

    }
    public Rectangle(double height,double weight){
        this.height=height;
        this.weight=weight;
    }
    public Rectangle(String color,boolean filled){
        super(color, filled);
    }
    public Rectangle(String color,boolean filled,double height,double weight){
        super(color, filled);
        this.weight=weight;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString(){
        double Area = weight*height;
        double Perimeter = 2*(weight+height);
        return super.toString()
                +"\n"+"Area: "+Area+"\n"+"Perimeter: " +Perimeter;
    }

}
