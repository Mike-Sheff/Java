package Netologia.task_4_4.task_4_4_2;

import java.util.List;
import java.util.Map;

public class PhoneContacts {
    private List<String> name;
    private Map<Contact, String> nameContactMap;

    public PhoneContacts(List<String> name, Map<Contact, String> nameContactMap) {
        this.name = name;
        this.nameContactMap = nameContactMap;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Список групп: ");
        for (int i = 0; i < name.size(); i++) {
            System.out.format("%2d. %s\n",i+1, name.get(i));
        }
    }

    public void setNameContactMap(Map<Contact, String> nameContactMap) {
        this.nameContactMap = nameContactMap;
    }

    public Map<Contact, String> getNameContactMap() {
        return nameContactMap;
    }

    @Override
    public String toString() {
        return "Телефонный справочник:\n" +
                " Группы: \n  " + name +
                "\n Контакты: \n " + nameContactMap;
    }

    public void setNameContactMap(String name, Contact contact) {
        this.nameContactMap.put(contact, name);
    }

    public void addNewName(String newName){
        this.name.add(newName);
    }

    public int getSizeName(){
        return this.name.size();
    }

    public String setName(int i){
        return name.get(i);
    }

    public boolean searchName(String name){
        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(name)){
                return true;
            }
        }
        return false;
    }
}