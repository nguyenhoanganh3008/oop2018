package week2.task2;
public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int a = this.numerator * other.denominator + other.numerator * this.denominator;
        int b = this.denominator * other.denominator;
        if(b!=0){
            Fraction add =new Fraction(a,b);
            return add;
        }
        else {
            return null;
        }
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int c = this.numerator * other.denominator - other.numerator * this.denominator;
        int d = this.denominator * other.denominator;
        if(d!=0){
            Fraction subtract =new Fraction(c,d);
            return subtract;
        }
        else {
            return null;
        }
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int a1 = this.numerator * other.numerator;
        int b1 = this.denominator * other.denominator;
        if(b1!=0){
            Fraction multiply =new Fraction(a1,b1);
            return multiply;
        }
        else {
            return null;
        }
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int c1 = this.numerator * other.denominator;
        int d1 = this.denominator * other.numerator;
        if(d1!=0){
            Fraction divide =new Fraction(c1,d1);
            return divide;
        }
        else {
            return null;
        }
    }
    public boolean equals(Object obj){
        Fraction sum = new Fraction(1,2);
        sum=this.subtract((Fraction) obj);
        if(sum.numerator*sum.denominator==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 =new Fraction(4,5);
        f1.divide(f2);
        f1.add(f2);
        f1.multiply(f2);
        f1.subtract(f2);
        if(f1.equals(f2)==true){
            System.out.println("bang nhau");
        }
        else System.out.println("ko bang nhau");
    }
}


