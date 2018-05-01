package standardmodel.java;

import java.util.ArrayList;
import java.util.List;

public class WorkerForCar implements FactoryWorker {
    @Override
    public List<Employee> factoryWorker (List<Employee> workers) {
        List<Employee> carWorkers = new ArrayList<Employee>();
        for (Employee worker : workers) {
            if (worker.getType().equalsIgnoreCase("Car")) {
                carWorkers.add(worker);
            }
        }
        return carWorkers;
    }
}
