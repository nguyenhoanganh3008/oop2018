package week4.task2;



public class Shade {
    protected String color;
    protected boolean filled;
    public Shade(){

    }
    public Shade(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public String toString(){
        return "Color: " + color + "\n" +"Filled: "+filled;
    }

}
