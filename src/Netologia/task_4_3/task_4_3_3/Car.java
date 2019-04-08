package Netologia.task_4_3.task_4_3_3;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparator<Car>, Comparable<Car>{
    private String number;
    private String Producer;
    private Enum Color;
    private Enum Type;

    public Car(String number, String producer, Enum color, Enum type) {
        this.number = number;
        Producer = producer;
        Color = color;
        Type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public Enum getColor() {
        return Color;
    }

    public void setColor(Enum color) {
        Color = color;
    }

    public Enum getType() {
        return Type;
    }

    public void setType(Enum type) {
        Type = type;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getType().compareTo(o2.getType());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", Producer='" + Producer + '\'' +
                ", Color='" + Color + '\'' +
                ", Type=" + Type + '\n';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}

