package Netologia.task_3_1.task_3_1_2_2;

import java.util.Comparator;

public class Product  implements Comparable<Product>{
    String name;
    int price;
    String other;

    @Override
    public String toString() {
        return "name= '" + name + '\'' +
                ", price= " + price +
                ", other= '" + other + '\'';
    }

    public Product(String name, int price, String other) {
        this.name = name;
        this.price = price;
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public int compareTo(Product o) {
        return price - o.price;
    }
}

class NameProductComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class OtherProductComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getOther().compareTo(o2.getOther());
    }
}