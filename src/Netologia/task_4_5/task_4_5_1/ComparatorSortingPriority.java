package Netologia.task_4_5.task_4_5_1;

import java.util.Comparator;

public class ComparatorSortingPriority implements Comparator<Wish> {
    boolean increase;

    public ComparatorSortingPriority(boolean increase) {
        this.increase = increase;
    }

    @Override
    public int compare(Wish o1, Wish o2) {
        int result;
        if(this.increase){
            result = Integer.compare(o1.getPriority(), o2.getPriority());
            return result != 0 ? result : o1.getName().compareTo((o2.getName()));
        } else {
            result = Integer.compare(o2.getPriority(), o1.getPriority());
            return result != 0 ? result : o1.getName().compareTo((o2.getName()));
        }
    }
}
