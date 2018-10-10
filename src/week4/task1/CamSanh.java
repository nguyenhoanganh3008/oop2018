package week4.task1;

public class CamSanh extends Cam {
    private String cost;
    private String source;
    private String amout;

    public CamSanh(String kind,String shade, String color,String flavor,
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
        System.out.println("Info Cam Sanh: \n");
        super.showInfo();
        String infoSanh = "Amout: " +amout+"\n"+"Source: "+source+"\n"+"cost: "+cost;
        System.out.println(infoSanh);
    }
}
