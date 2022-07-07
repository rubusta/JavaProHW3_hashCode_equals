import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Transport> set = new HashSet<>();

        Transport Bike = new Transport(133, "Kawasaki");
        Transport Car = new Transport(456, "Porsche");
        Transport Car2 = new Transport(678, "Mercedes");

        set.add(Bike);
        set.add(Car);
        set.add(Car2);

        System.out.println("In my shop 'SET' i have:\n"
                + set + "\n-----------------------");

        System.out.println("Equals of Porsche and Mercedes: " + Objects.equals(Car2, Car));
        System.out.println("Equals of Mercedes and Kawasaki: " + Objects.equals(Car2, Bike)
                + "\n------------------------");

        System.out.println("HashCode of Kawwasaki: " + Bike.hashCode());
        System.out.println("HashCode of Porche is : " + Car.hashCode());
        System.out.println("HashCode of Mercedes is: " + Car2.hashCode()
                + "\n------------------------");

        System.out.println("The number of Parking for  Kawasaki and  Kawasaki is the same?: "
                + Bike.equals(Bike));
        System.out.println("The number of Parking for Kawasaki and Porsche is the same?: "
                + Bike.equals(Car) + "\nThe number of Parking for Mercedes and Porsche is the same?: "
                + Car2.equals(Car));
    }
}
