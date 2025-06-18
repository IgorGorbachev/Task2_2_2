package web.model;


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
}
