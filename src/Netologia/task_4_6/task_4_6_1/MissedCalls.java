package Netologia.task_4_6.task_4_6_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

/*
    @author Sharin Mikhail
*/

public class MissedCalls {
    Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");

    public void showCalls() {
        for (Map.Entry<LocalDateTime, String> call : missedCalls.entrySet()) {
            System.out.format(call.getKey().format(formatter) + " - " + call.getValue() + "\n");
        }
    }

    public void showCalls(Contacts contacts) {
        if (missedCalls.isEmpty()){
            System.out.println("\nСписок пропущенных звонков пуст!");
        } else {
            for (Map.Entry<LocalDateTime, String> call : missedCalls.entrySet()) {
                String phone = call.getValue();
                Contact contact = contacts.getPhoneContact(phone);
                if (contact != null) {
                    System.out.format(call.getKey().format(formatter) + " - " + contact.getName() + " " + contact.getSurmane() + "\n");
                } else {
                    System.out.format(call.getKey().format(formatter) + " - " + phone + "\n");
                }
            }
        }
    }

    public void addMissedCalls(String phone) {
        missedCalls.put(LocalDateTime.now(), phone);
    }

    public void clearMissesCalls() {
        missedCalls.clear();
    }

    @Override
    public String toString() {
        System.out.println("Список пропущенных звонков:\n");
        if (missedCalls.isEmpty()) {
            return "Список пустой \n";
        } else {
            return missedCalls.values().toString();
        }
    }
}