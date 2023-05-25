public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.carNotification();
        car.carRun();
        car.carNotification();
        car.carRun();
        car.setState(new Run());
        car.carNotification();
    }
}