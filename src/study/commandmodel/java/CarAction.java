package study.commandmodel.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarAction {
    private List<InterfaceDrive> carActions = new ArrayList<InterfaceDrive>();

    public void takeCar(InterfaceDrive carAction) {
        carActions.add(carAction);
    }

    public void placeCars() {
        for (InterfaceDrive carAction : carActions) {
            carAction.go();
        }
        carActions.clear();
        System.out.println("Compliete!");
    }
}
