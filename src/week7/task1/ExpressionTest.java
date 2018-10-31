package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral numeral1 = new Numeral(10);
        Numeral numeral2 = new Numeral(1);
        Numeral numeral3 = new Numeral(2);
        Numeral numeral4 = new Numeral(3);
        Square square1 = new Square(numeral1);//10^2
        Subtraction subtraction = new Subtraction(square1,numeral2);
        Multiplication multiplication = new Multiplication(numeral3,numeral4);
        Addition addition = new Addition(subtraction,multiplication);
        Square square2= new Square(addition);

        System.out.println(square2+" = " +square2.evaluate());

    }
}
