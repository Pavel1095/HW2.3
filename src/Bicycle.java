public class Bicycle extends Transport {

        public String modelName;
        public int wheelsCount;

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    @Override
    public void updateTyre() {
            System.out.println("Меняем покрышки велосипеда");
        }

    @Override
    public void transportService() {
        updateTyre();
    }
}
