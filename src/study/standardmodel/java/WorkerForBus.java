package study.standardmodel.java;

import java.util.ArrayList;
import java.util.List;

public class WorkerForBus implements FactoryWorker {
    @Override
    public List<Employee> factoryWorker (List<Employee> workers) {
        List<Employee> busworker = new ArrayList<Employee>();
        for (Employee worker : workers) {
            if (worker.getType().equalsIgnoreCase("Bus")) {
                busworker.add(worker);
            }
        }
        return busworker;
    }
}
