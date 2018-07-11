package study.replacecode.java;

/**
 * Created by yaoxiang.sun on 2018/7/9.
 */
public class ReplaceTypeCodeTOClass {
//    public static final int O = 0;
//    public static final int A = 1;
//    public static final int B = 2;
//    public static final int AB = 3;
    // replace type code with class;

    private BloodGroup bloodGroup;

//    public ReplaceTypeCodeTOClass(int bloodGroup) {
//        this.bloodGroup = BloodGroup.code(bloodGroup);
//    }

    public ReplaceTypeCodeTOClass(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public void setBloodGroup(BloodGroup arg) {
        this.bloodGroup = arg;
    }

//    public void setBloodGroup(int arg) {
//        this.bloodGroup = BloodGroup.code(arg);
//    }

//    public int getBloodGroupCode() {
//        return bloodGroup.getCode();
//    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public static void main(String[] args) {
        ReplaceTypeCodeTOClass r = new ReplaceTypeCodeTOClass(BloodGroup.A);
        r.setBloodGroup(BloodGroup.AB);
        System.out.println(r.getBloodGroup().getCode());
    }
}
