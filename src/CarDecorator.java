public class CarDecorator implements Car{

    private Car car;
    private String control;

    public CarDecorator(Car car, String control){
        this.car = car;
        this.control = control;
    }



    @Override
    public String getCarType() {
        return car.getCarType();
    }

    @Override
    public String getControlType() {
        return this.control;
    }
}
