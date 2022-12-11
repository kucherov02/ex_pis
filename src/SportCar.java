public class SportCar implements Car {

    private String CarType = "Sportcar";

    @Override
    public String getCarType() {
        return this.CarType;
    }

    @Override
    public String getControlType() {
        return null;
    }


}
