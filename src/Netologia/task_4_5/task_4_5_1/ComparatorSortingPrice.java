package Netologia.task_4_5.task_4_5_1;

import java.util.Comparator;

public class ComparatorSortingPrice implements Comparator<Wish> {
    boolean increase;

    public ComparatorSortingPrice(boolean increase) {
        this.increase = increase;
    }

    @Override
    public int compare(Wish o1, Wish o2) {
        if(this.increase){
            return Double.compare(o1.getPrice(), o2.getPrice());
        } else {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }
    }
}
