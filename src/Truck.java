public class Truck extends Transport {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void transportService() {
    updateTyre();
    checkEngine();
    checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}