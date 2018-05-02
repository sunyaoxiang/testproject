package study.cloneable.java;

import java.util.Hashtable;

public class MainFactoryType {
    private static Hashtable<String, MainFactory> factoryMap =
            new Hashtable<String, MainFactory>();

    public static MainFactory getFactory(String factoryid) {
        MainFactory cachedFactory = factoryMap.get(factoryid);
        return (MainFactory) cachedFactory.clone();
    }

    public static void loadCache() {
        FactoryCar factoryCar = new FactoryCar();
        factoryCar.setId("1");
        factoryMap.put(factoryCar.getId(), factoryCar);

        FactoryBus factoryBus = new FactoryBus();
        factoryBus.setId("2");
        factoryMap.put(factoryBus.getId(), factoryBus);

        FactoryTaxi factoryTaxi = new FactoryTaxi();
        factoryTaxi.setId("3");
        factoryMap.put(factoryTaxi.getId(), factoryTaxi);
    }
}
