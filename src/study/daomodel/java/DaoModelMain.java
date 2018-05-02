package study.daomodel.java;

public class DaoModelMain {
    public static void main(String[] args) {
        FactoryDao factoryDao = new FactoryDaoImpl();
//        for (FactoryMain factory : factoryDao.getAll()) {
//            System.out.println("Factory Name: " +factory.getFactoryname() + ", Value: " + factory.getValue());
//        }

        FactoryMain factoryMain1 = factoryDao.getAll().get(0);
        System.out.println(factoryMain1.getFactoryname());
        factoryMain1.setFactoryname("Buick Plus");
        System.out.println(factoryMain1.getFactoryname());

        FactoryMain factoryMain2 = ((FactoryDaoImpl) factoryDao).get(1);
        System.out.println(factoryMain2.getFactoryname());
        factoryMain2.setFactoryname("Buick Plus");
        System.out.println(factoryMain2.getFactoryname());
    }
}
