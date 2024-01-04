package solution2WithCompositeDesignCalculatorProb;

public class Expression implements ArithmeticExpression {
    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;
    private OPERATION operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, OPERATION operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value =0;
        switch (operation) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is: " + value);
        return value;
    }
}
