package week4.task1;

public class CamCaoPhong extends Cam {
    private String cost;
    private String source;
    private String amout;

    public CamCaoPhong(String kind,String shade, String color,String flavor,
                       String source,String amout,String cost ){
        super(kind,shade,color,flavor);
        this.amout=amout;
        this.cost=cost;
        this.source=source;
    }

    public void setAmout(String amout) {
        this.amout = amout;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAmout() {
        return amout;
    }

    public String getSource() {
        return source;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCost() {
        return cost;
    }

    @Override
    public void showInfo() {
        System.out.println("Info Cam Cao Phong: \n");
        super.showInfo();
        String infoCCP = "Amout: " +amout+"\n"+"Source: "+source+"\n"+"cost: "+cost;
        System.out.println(infoCCP);
    }
}
