public class PassengerCar extends Car implements Competing {

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " ушел на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " показал лучшее время круга t");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " развил максимальную скорость v");
    }
}
