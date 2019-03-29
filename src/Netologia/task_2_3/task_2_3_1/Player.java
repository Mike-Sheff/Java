package Netologia.task_2_3.task_2_3_1;

import java.util.Arrays;
import java.util.List;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private List<Weapon> weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = Arrays.asList(new Pistol(),
                new Avtomatic(),
                new Slingshot(),
                new RPG(),
                new WaterGun());
    }

    public int getSlotsCount() {
        // size - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.size();
    }

    public void shotWithWeapon(int slot) throws IllegalArgumentException {
        if ((slot < 0) || (slot >= this.getSlotsCount())) {
            // проверить на выход за границы
            // выбросить IllegalArgumentException,
            // если значение slot некорректно
            throw new IllegalArgumentException("Значение некорректно! ");
        } else {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots.get(slot);
            // Огонь!
            weapon.shot();
        }
    }
}

