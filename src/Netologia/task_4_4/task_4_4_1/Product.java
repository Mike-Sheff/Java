package Netologia.task_4_4.task_4_4_1;

public class Product implements Comparable<Product>{
    String id;
    String name;
    float price;

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        return id.equals(o);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return id +". '" + name + "\' по цене " + price + " руб.\n" ;
    }

    @Override
    public int compareTo(Product o) {

        return this.id.compareTo(o.id);
    }
}
