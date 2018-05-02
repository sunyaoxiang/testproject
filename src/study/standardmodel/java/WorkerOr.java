package study.standardmodel.java;

import java.util.List;

public class WorkerOr implements FactoryWorker {
    private FactoryWorker factoryWorker;
    private FactoryWorker otherFactoryWork;

    public WorkerOr(FactoryWorker factoryWorker, FactoryWorker otherFactoryWork){
        this.factoryWorker = factoryWorker;
        this.otherFactoryWork = otherFactoryWork;
    }

    @Override
    public List<Employee> factoryWorker (List<Employee> workers) {
        List<Employee> firstFactoryWorker = factoryWorker.factoryWorker(workers);
        List<Employee> otherFactoryWorker = otherFactoryWork.factoryWorker(workers);

        for (Employee worker : otherFactoryWorker) {
            if (!firstFactoryWorker.contains(worker)) {
                firstFactoryWorker.add(worker);
            }
        }
        return firstFactoryWorker;
    }
}
