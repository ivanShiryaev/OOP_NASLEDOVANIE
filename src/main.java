import Car.Car;
import Ship.Ship;

public class main {


    public static void main(String[] args) {

        Car ford = new Car("fusion","white",567);
        System.out.println(ford.getModel());
        System.out.println(ford.getColor());
        System.out.println(ford.getNumber());

        Ship Kanin = new Ship("tanker","blue",5678);
        // добовляем значение в баласт
        Kanin.setBalast(567);
        System.out.println(Kanin.getModel());
        System.out.println(Kanin.getColor());
        System.out.println(Kanin.getNumber());
        System.out.println(Kanin.getBalast());



    }
}
