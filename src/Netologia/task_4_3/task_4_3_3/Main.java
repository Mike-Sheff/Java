package Netologia.task_4_3.task_4_3_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Car> set = new HashSet<>();

        set.add(new Car("А192АА199", "ВАЗ 2105", Color.WHITE, Type.SEDAN));
        set.add(new Car("А121АА190", "ВАЗ 2106", Color.BLUE, Type.SEDAN));
        set.add(new Car("А121АА190", "ВАЗ 2105", Color.BLACK, Type.WAGON));
        set.add(new Car("А121АА191", "ВАЗ 2106", Color.BLUE, Type.SEDAN));
        set.add(new Car("B788AB99", "Камаз 120", Color.RED, Type.PICKUP));
        set.add(new Car("B788AB99", "Камаз 120", Color.BLUE, Type.PICKUP));
        set.add(new Car("B788AB98", "Камаз 120", Color.WHITE, Type.PICKUP));

        System.out.println();

        //TODO: добавить фильтрацию по типу автомабиля

        System.out.println("\nСписок машин:");

        if (set.isEmpty()) {
            System.out.println("В списке нет машин");
        } else {
            System.out.println(set.toString());
        }

        System.out.println("\nДо свидания!");

    }
}
