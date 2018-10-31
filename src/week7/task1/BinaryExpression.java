package week7.task1;

public abstract class BinaryExpression extends Expression {
    private Expression left;
    private Expression right;

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public BinaryExpression(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }
    @Override
    public abstract String toString();

    @Override
    public abstract int evaluate();
}
