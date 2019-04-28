package Netologia.task_4_4.task_4_4_1;

import java.util.HashSet;
import java.util.Set;

public class Storage {
    private String name;
    private String address;

    private Set<Product> storage = new HashSet<>();

    public Storage(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addStorage(Product o){
        storage.add(o);
    }

    public void removeStorage(Product o){
        storage.remove(o);
    }

    @Override
    public boolean equals(Object o) {
        return name.equals(o);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Склад: '" + name + "\' по адресу: '" + address + "\'\n";
    }
}
