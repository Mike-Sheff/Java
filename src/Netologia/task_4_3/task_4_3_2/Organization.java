package Netologia.task_4_3.task_4_3_2;

import java.util.Objects;

public class Organization {
    private String name;
    private String city;
    private String adress;
    private int inn;
    private int kpp;
    private int ogrn;

    public Organization(String name, String city, String adress, int inn, int kpp, int ogrn) {
        this.name = name;
        this.city = city;
        this.adress = adress;
        this.inn = inn;
        this.kpp = kpp;
        this.ogrn = ogrn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public int getKpp() {
        return kpp;
    }

    public void setKpp(int kpp) {
        this.kpp = kpp;
    }

    public int getOgrn() {
        return ogrn;
    }

    public void setOgrn(int ogrn) {
        this.ogrn = ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return inn == that.inn &&
                kpp == that.kpp &&
                ogrn == that.ogrn ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inn, kpp, ogrn);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                ", inn=" + inn +
                ", kpp=" + kpp +
                ", ogrn=" + ogrn + '\n';
    }
}
