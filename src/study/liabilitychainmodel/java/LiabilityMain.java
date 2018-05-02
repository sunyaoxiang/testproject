package study.liabilitychainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class LiabilityMain {
    public static AbstractLiability getLiability() {
        AbstractLiability carLiability = new CarLiability();
        AbstractLiability busLiability = new BusLiability();
        AbstractLiability bikeLiability = new BikeLiability();

        carLiability.setNextLiability(busLiability);
        busLiability.setNextLiability(bikeLiability);
        return carLiability;
    }

    public static void main(String[] args) {
        AbstractLiability liability = getLiability();
        liability.liabilityStr("One: ");
        liability.liabilityStr("Two: ");
        liability.liabilityStr("Three: ");
    }
}
