package week4.task2;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(String color,boolean filled,double side){
        super(color, filled,side,side);
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    public String toString(){
        return super.toString();

    }


}
