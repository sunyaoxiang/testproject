package study.standardmodel.java;

import java.util.ArrayList;
import java.util.List;

public class WorkerStatusYes implements FactoryWorker {
    @Override
    public List<Employee> factoryWorker (List<Employee> workers) {
        List<Employee> yesworker = new ArrayList<Employee>();
        for (Employee worker : workers) {
            if (worker.getStatus().equalsIgnoreCase("Yes")) {
                yesworker.add(worker);
            }
        }
        return yesworker;
    }
}
