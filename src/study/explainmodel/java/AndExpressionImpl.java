package study.explainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class AndExpressionImpl implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpressionImpl(Expression exp1, Expression exp2) {
        this.expression1 = exp1;
        this.expression2 = exp2;
    }

    @Override
    public boolean evaluate(String context) {
        return expression1.evaluate(context) && expression2.evaluate(context);
    }
}
