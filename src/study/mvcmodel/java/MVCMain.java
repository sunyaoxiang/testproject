package study.mvcmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class MVCMain {
    public static void main(String[] args) {
        CarModel carModel = new CarModel();
        carModel.setBrand("Polo");
        carModel.setValue("200000");
        CarView carView = new CarView();

        CarController carController = new CarController(carModel, carView);
        carController.carModelView();

        carController.setCarModelBrand("Buick");
        carController.setCarModelValue("150,000");
        carController.carModelView();
    }
}
