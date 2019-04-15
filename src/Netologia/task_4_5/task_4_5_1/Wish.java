package Netologia.task_4_5.task_4_5_1;

public class Wish {
    String name;
    String descriptionShort;
    Double price;
    String urlOrAddress;
    int priority;

    public Wish(String name, String descriptionShort, Double price, String urlOrAddress, int priority) {
        this.name = name;
        this.descriptionShort = descriptionShort;
        this.price = price;
        this.urlOrAddress = urlOrAddress;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrlOrAddress() {
        return urlOrAddress;
    }

    public void setUrlOrAddress(String urlOrAddress) {
        this.urlOrAddress = urlOrAddress;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", descriptionShort='" + descriptionShort + '\'' +
                ", price=" + price +
                ", urlOrAddress='" + urlOrAddress + '\'' +
                ", priority=" + priority;
    }
}
