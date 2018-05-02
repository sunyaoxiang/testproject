package study.liabilitychainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
abstract class AbstractLiability {
    protected AbstractLiability nextLiability;

    abstract protected void printStr(String str);

    public void setNextLiability(AbstractLiability nextLiability) {
        this.nextLiability = nextLiability;
    }

    public void liabilityStr(String str) {
        printStr(str);
        if (nextLiability != null) {
            System.out.println("liabilityStr: " + str);
            nextLiability.liabilityStr(str);
        }
    }
}
