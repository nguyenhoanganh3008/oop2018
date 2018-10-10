package week4.task1;

/**
 * TODO: Class Ong Noi
 */
public class HoaQua {
    private String shade;
    private String kind;

    public HoaQua(String kind, String shade) {
        this.kind=kind;
        this.shade=shade;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
    public void setShade(String shade) {
        this.shade = shade;
    }

    public String getShade() {
        return shade;
    }
    public void showInfo(){
        String info = "Kind: " + kind + "\n" + "Shade: " + shade;
        System.out.println(info);
    }
}
