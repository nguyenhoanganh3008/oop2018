package week7.task1;

public class Addition extends BinaryExpression {
    public Addition(Expression left,Expression right){
        super(left,right);
    }

    @Override
    public String toString() {
        return String.format("%s+%s",getLeft(),getRight());
    }

    @Override
    public int evaluate() {
        return getLeft().evaluate()+getRight().evaluate();
    }

}
