import java.util.Objects;

public class Transport {
    private final int numberParking;
    private final String name;

    public Transport(int number, String name) {
        this.numberParking = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + numberParking +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        if (numberParking != transport.numberParking) return false;
        return Objects.equals(name, transport.name);
    }

    @Override
    public int hashCode() {
        int result = numberParking;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}





