package Ship;


import Car.Car;


//Наследование классом Ship класса Car

public class Ship extends Car {
    // дополняем наследованный метод Car значением баласта
    private int balast;
    public Ship(String model, String color, int number) {
        super(model, color, number);

    }
   // добовляем геттеры и сеттеры для параметра баласт
    public int getBalast() {
        return balast;
    }

    public void setBalast(int balast) {
        this.balast = balast;
    }
}
