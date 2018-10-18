package week5_6;


import java.util.ArrayList;


public class Diagram {
    private ArrayList< Layer > layers;
    public Diagram(){

    }
    public Diagram(ArrayList<Layer> layers){
        this.layers=layers;
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }
    public void removeCircle(){
        Layer layer = new Layer();
        layer.removeCircle();
    }
}
