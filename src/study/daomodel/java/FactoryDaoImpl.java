package study.daomodel.java;

import java.util.ArrayList;
import java.util.List;

public class FactoryDaoImpl implements FactoryDao {
    List<FactoryMain> factoryDaoImlList;

    public FactoryDaoImpl() {
        factoryDaoImlList = new ArrayList<FactoryMain>();

        FactoryMain factoryMainBuick = new FactoryMain("Buick", 8500);
        FactoryMain factoryMainFox = new FactoryMain("Fox", 2900);

        factoryDaoImlList.add(factoryMainBuick);
        factoryDaoImlList.add(factoryMainFox);
    }

    @Override
    public List<FactoryMain> getAll() {
        return factoryDaoImlList;
    }

//    @Override
    public FactoryMain get(int num) {
        return factoryDaoImlList.get(num);
    }

    @Override
    public void updateFactory(FactoryMain factoryMain) {
        factoryDaoImlList.get(factoryMain.getValue()).setFactoryname(factoryMain.getFactoryname());
    }

    @Override
    public void delete(FactoryMain factoryMain) {
        factoryDaoImlList.remove(factoryMain.getValue());
    }
}
