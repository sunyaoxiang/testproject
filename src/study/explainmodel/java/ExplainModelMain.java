package study.explainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class ExplainModelMain {
    public static void main(String[] args) {
        Expression select = new IsInExpressionImpl("Select");
        Expression from = new IsInExpressionImpl("From");
        Expression isSelectFrom = new AndExpressionImpl(select, from);

        Expression insert = new IsInExpressionImpl("Insert");
        Expression update = new IsInExpressionImpl("Update");
        Expression isInertOrUpdate = new OrExpressionImpl(insert, update);

        System.out.println(isSelectFrom.evaluate("Select"));
        System.out.println(isSelectFrom.evaluate("From"));
        System.out.println(isSelectFrom.evaluate("Select From"));
        System.out.println(isSelectFrom.evaluate("From Select"));


        System.out.println(isInertOrUpdate.evaluate("Insert"));
        System.out.println(isInertOrUpdate.evaluate("Update"));
        System.out.println(isInertOrUpdate.evaluate("Insert Update"));
        System.out.println(isInertOrUpdate.evaluate("Update Insert"));
    }
}
