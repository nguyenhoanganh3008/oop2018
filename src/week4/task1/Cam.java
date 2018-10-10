package week4.task1;

/**
 * TODO: Tao Class Cha cua Cam Sanh, Cam Thanh Phong
 */
public class Cam extends HoaQua {
    private String color;
    private String flavor;

    public Cam(String kind, String shade,String color,String flavor) {
        super(kind, shade);
        this.color=color;
        this.flavor=flavor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        String infoCam = "Color: " + color + "\n" + "Flavor: "+ flavor;
        System.out.println(infoCam);
    }
}
