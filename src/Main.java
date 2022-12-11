public class Main {
    public static void main(String[] args) {
        //sportcar with bluetooth
        Car Car1 = new CarWithBluetooth(new SportCar());

        //truck with iot
        Car Car2 = new CarWithIoT(new Truck());

        //passanger car with iot
        Car Car3 = new CarWithIoT(new PassCar());

        //truck with remote
        Car Car4 = new CarWithRemote(new Truck());

        System.out.println("Type:"+Car1.getCarType()+"| Control: "+Car1.getControlType());
        System.out.println("Type:"+Car2.getCarType()+"| Control: "+Car2.getControlType());
        System.out.println("Type:"+Car3.getCarType()+"| Control: "+Car3.getControlType());
        System.out.println("Type:"+Car4.getCarType()+"| Control: "+Car4.getControlType());
    }
}