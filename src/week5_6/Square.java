package week5_6;

public class Square extends Rectangle {
    public Square(String color,boolean filled,double side){
        super(color,filled,side,side);
    }

    public double getSide(){
        return super.getHeight();
    }

    public void setSide(double side){
        this.setHeight(side);
        this.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setHeight(side);
    }

    @Override
    public void setWeight(double side) {
        super.setWeight(side);
    }
}
