package study.daomodel.java;

import java.util.List;

interface FactoryDao {
    List<FactoryMain> getAll();
//    FactoryMain get(int num);
    void updateFactory(FactoryMain factoryMain);
    void delete(FactoryMain factoryMain);
}
