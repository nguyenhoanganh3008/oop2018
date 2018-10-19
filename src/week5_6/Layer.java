package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer extends Diagram {
    public ArrayList<Shape> shapes = new ArrayList<Shape>();
    public Layer(){

    }
    public Layer(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    public void removeTriangle(){
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()){
            Shape sh = iterator.next();
            if(sh instanceof Triangle){
                iterator.remove();
            }
        }
    }
    public void removeCircle(){
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()){
            Shape sh = iterator.next();
            if(sh instanceof Circle){
                iterator.remove();
            }
        }
    }
}
