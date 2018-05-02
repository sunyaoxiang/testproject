package study.standardmodel.java;

import java.util.ArrayList;
import java.util.List;

public class WorkerForTaxi implements FactoryWorker {
    @Override
    public List<Employee> factoryWorker (List<Employee> workers) {
        List<Employee> taxiworker = new ArrayList<Employee>();
        for (Employee worker : workers) {
            if (worker.getType().equalsIgnoreCase("Taxi")) {
                taxiworker.add(worker);
            }
        }
        return taxiworker;
    }
}
