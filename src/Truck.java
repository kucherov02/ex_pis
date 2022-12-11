public class Truck implements Car {
    private String CarType = "Track";

    @Override
    public String getCarType() {
        return this.CarType;
    }

    @Override
    public String getControlType() {
        return null;
    }

}
