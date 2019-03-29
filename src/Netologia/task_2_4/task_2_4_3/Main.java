package Netologia.task_2_4.task_2_4_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача: Резюме инженеров.");
        System.out.println("");

        Engineer petrov = new WebDeveloper(2);
        Engineer sidorov = new PythonDeveloper();
        Engineer ivanov = new FullStackDesigner(1);
        Engineer klimov =  new FrontEndDeveloper();
        List<Engineer> netologia = Arrays.asList(petrov, sidorov, ivanov,klimov);

        for (int i = 0; i < netologia.size(); i++){
            (netologia.get(i)).knowledgeInHtml(1);
        }
        System.out.println("");
        System.out.println("До свидания!");
    }
}