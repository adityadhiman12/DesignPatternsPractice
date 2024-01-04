package solution2WithCompositeDesignCalculatorProb;

public class Number implements ArithmeticExpression{
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("number value is: "+ value);
        return value;
    }
}
