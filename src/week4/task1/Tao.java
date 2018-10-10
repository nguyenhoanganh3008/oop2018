package week4.task1;

public class Tao extends HoaQua {
    private String color;
    private String cost;
    private String source;

    public Tao(String kind,String shade,
               String color,String cost,String source){
        super(kind, shade);
        this.color=color;
        this.cost=cost;
        this.source=source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("Info Tao: \n");
        super.showInfo();
        String tao = "Color: " +color+"\n"+"Cost:" + cost+ "\n" + "Source: "+source;
        System.out.println(tao);
    }
}
