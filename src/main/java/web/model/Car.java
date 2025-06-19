package web.model;


import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {
    private static int nextId = 1;
    private int id;

    private String name;

    private String color;

    private int price;

    public Car() {
        this.id = nextId++;
    }

    public Car(String name, String color, int price) {
        this.id = nextId++;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", price=" + price +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && price == car.price && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price);
    }
}
