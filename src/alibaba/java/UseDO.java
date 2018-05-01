package alibaba.java;

public class UseDO {
    static String name;
    public void getMessage() {
        this.name = ForUse.name + " be copy";
    }

    public static void main(String[] args) {
        System.out.println(UseDO.name);
        UseDO useDO = new UseDO();
        useDO.getMessage();
        System.out.println(useDO.name);

        UseDO useDO_Other = new UseDO();
        System.out.println(useDO_Other.name);

        System.out.println(ForUse.name);
    }
}
