package solution2WithCompositeDesignCalculatorProb;

public class Main {
    public static void main(String[] args) {
        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression addExression = new Expression(one, seven, OPERATION.ADD);
        ArithmeticExpression parentExpression = new Expression(two, addExression, OPERATION.MULTIPLY);
        System.out.println(parentExpression.evaluate());

    }
}
