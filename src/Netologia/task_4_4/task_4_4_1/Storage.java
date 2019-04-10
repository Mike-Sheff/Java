package Netologia.task_4_4.task_4_4_1;

import java.util.Objects;

public class Storage {
    String name;
    String address;

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
