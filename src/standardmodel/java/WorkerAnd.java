package standardmodel.java;

import java.util.ArrayList;
import java.util.List;

public class WorkerAnd implements FactoryWorker {
    private FactoryWorker factoryWorker;
    private FactoryWorker otherFactoryWork;

    public WorkerAnd(FactoryWorker factoryWorker, FactoryWorker otherFactoryWork){
        this.factoryWorker = factoryWorker;
        this.otherFactoryWork = otherFactoryWork;
    }

    @Override
    public List<Employee> factoryWorker (List<Employee> workers) {
        List<Employee> firstFactoryWorker = factoryWorker.factoryWorker(workers);
        return otherFactoryWork.factoryWorker(firstFactoryWorker);
    }
}
