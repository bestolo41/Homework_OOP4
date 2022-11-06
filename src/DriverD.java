import java.util.Objects;

public class DriverD<D extends Bus> extends Driver{
    private final char category = 'B';

    public DriverD(String name, int experience) {
        super(name, experience);
    }

    public void participation(D car) {
        System.out.println("Водитель " + getName() + " управляет грузовиком " + car.getBrand() + " " + car.getModel() + " и участвует в заезде");
    }


    public char getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverD<?> driverD = (DriverD<?>) o;
        return category == driverD.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "DriverD{" +
                "category=" + category +
                '}';
    }
}

