package Netologia.task_4_6.task_4_6_1;

import java.util.HashMap;
import java.util.Map;

/*
    @author Sharin Mikhail
*/

public class Contacts {
    Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String surname, String name, String phone, Enum group) {
        contacts.put(phone, new Contact(name, surname, phone, group));
    }

    public Contact getPhoneContact(String phone){
        for (Contact contact : contacts.values()) {
          if (phone.equals(contact.getPhone())){
              return contact;
          }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Список контактов:\n"
                + contacts.values();
    }
}
