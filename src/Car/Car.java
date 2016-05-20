package Car;

// Описываем класс и создаем инкопсуляцию некоторых параметров

public class Car {

    private String model;
    private String color;
    private int number;

    // создаем конструктор alt + ins

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    // bild getter and setters from main class

        public int getNumber() {return number;}

        public void setNumber(int number) {this.number = number;}

        public String getModel() {return model;}

        public void setModel(String model) {this.model = model;}

        public String getColor() {return color;}

        public void setColor(String color) {this.color = color;}



}
