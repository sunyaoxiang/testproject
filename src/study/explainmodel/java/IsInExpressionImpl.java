package study.explainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class IsInExpressionImpl implements Expression {
    private String data;

    public IsInExpressionImpl(String data) {
        this.data = data;
    }

    @Override
    public boolean evaluate(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
