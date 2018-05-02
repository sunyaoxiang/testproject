package study.w3cschool.java;



/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
class Cake extends Object{
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake " + id + " Object is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake " + id + " Object is disposed");
    }
}
