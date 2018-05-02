package study.mvcmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarController {
    private CarModel carModel;
    private CarView carView;

    public CarController(CarModel carModel, CarView carView) {
        this.carModel = carModel;
        this.carView = carView;
    }

    public void setCarModelBrand(String brand) {
        carModel.setBrand(brand);
    }

    public void setCarModelValue(String value) {
        carModel.setValue(value);
    }

    public String getCarModelBrand() {
        return carModel.getBrand();
    }

    public String getCarModelValue() {
        return carModel.getValue();
    }

    public void carModelView() {
        carView.printCar(this.getCarModelBrand(), this.getCarModelValue());
    }
}
