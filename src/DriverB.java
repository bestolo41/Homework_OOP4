import java.util.Objects;

public class DriverB<D extends PassengerCar> extends Driver {
    private final char category = 'B';

    public DriverB(String name, int experience) {
        super(name, experience);
    }


    public void participation(D car) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и участвует в заезде");
    }

    public char getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverB<?> driverB = (DriverB<?>) o;
        return category == driverB.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "DriverB{" +
                "category=" + category +
                '}';
    }
}
