package week5_6;

public abstract class Shape extends Layer {
    private String color;
    private boolean filled;
    private int x,y;

    public Shape(){}
    public Shape(String color,boolean filled,int x,int y){
        this.color = color;
        this.filled = filled;
        this.x=x;
        this.y=y;
    }
    public Shape(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Shape(String color,boolean filled,int x){
        this.color = color;
        this.filled = filled;
        this.x=x;
    }
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double Area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Color: " + color + "\n" +"Filled: "+filled ;
    }

}
