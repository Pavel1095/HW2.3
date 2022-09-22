public class Main {
    public static void main(String[] args) {
        Car car = new Car("Приора",4);
        Truck truck = new Truck("Камаз",10);
        Bicycle bicycle = new Bicycle("Аист",2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
    }
}