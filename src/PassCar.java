public class PassCar implements Car {
    private String CarType = "Passanger Car";

    @Override
    public String getCarType() {
        return this.CarType;
    }

    @Override
    public String getControlType() {
        return null;
    }


}
