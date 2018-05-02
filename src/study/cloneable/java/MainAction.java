package study.cloneable.java;


public class MainAction {
    public static void main(String[] args) {
        MainFactoryType.loadCache();

        MainFactory mainFactory1 = MainFactoryType.getFactory("1");
        mainFactory1.make();
        System.out.println(mainFactory1.getType());
        System.out.println(mainFactory1.getId());

        MainFactory mainFactory2 = MainFactoryType.getFactory("2");
        mainFactory2.make();
        mainFactory2.setType("GGGOOO");
        mainFactory2.setId("GGGOOO");
        System.out.println(mainFactory2.getType());
        System.out.println(mainFactory2.getId());
    }
}
