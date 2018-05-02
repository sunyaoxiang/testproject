package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class Puppy {
    int puppyAge;
    String puppyName;

    public void setPuppyAge(int age) {
        puppyAge = age;
    }

    public void getPuppyAge() {
        System.out.println(puppyName + "'age is :" + puppyAge);
//        return puppyAge;
    }

    public Puppy(String name, int age) {
        puppyName = name;
        puppyAge = age;
        System.out.println("test for object :" + name);
    }

    public Puppy(String name){
        puppyName = name;
        System.out.println("test for object :" + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Test");
        myPuppy.setPuppyAge(3);
        myPuppy.getPuppyAge();
        System.out.println("variable value :" + myPuppy.puppyAge);

        Puppy myPuppy2 = new Puppy("case" , 4);
        myPuppy2.getPuppyAge();
        System.out.println("variable value :" + myPuppy2.puppyAge);
    }
}
