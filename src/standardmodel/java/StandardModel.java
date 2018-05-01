package standardmodel.java;

import java.util.ArrayList;
import java.util.List;

public class StandardModel {
    public static void printWorker(List<Employee> workers) {
        System.out.println("===============");
        for (Employee worker : workers) {
//            System.out.println(worker.getName());
            System.out.println(worker.toString());
        }
    }
    public static void main(String[] args) {
        List<Employee> workers = new ArrayList<Employee>();

        workers.add(new Employee("yaoxiang", "Car" ,"Yes"));
        workers.add(new Employee("big sun", "Car" ,"Yes"));
        workers.add(new Employee("JUINs", "Bus" ,"Yes"));
        workers.add(new Employee("KUEdja adas", "Taxi" ,"No"));
        workers.add(new Employee("Lsuwj", "Car" ,"No"));
        workers.add(new Employee("DBacd", "Bus" ,"Yes"));
        workers.add(new Employee("USJlsa qdqw", "Bus" ,"Yes"));

        FactoryWorker workerForCar = new WorkerForCar();
        printWorker(workerForCar.factoryWorker(workers));

        FactoryWorker workerForBus = new WorkerForBus();
        printWorker(workerForBus.factoryWorker(workers));

        FactoryWorker workerForTaxi = new WorkerForTaxi();
        printWorker(workerForTaxi.factoryWorker(workers));

        FactoryWorker workerForYes = new WorkerStatusYes();
        printWorker(workerForYes.factoryWorker(workers));

        FactoryWorker workerAnd = new WorkerAnd(workerForCar, workerForYes);
        printWorker(workerAnd.factoryWorker(workers));

        FactoryWorker workerOr = new WorkerOr(workerForCar, workerForBus);
        printWorker(workerOr.factoryWorker(workers));

    }
}
