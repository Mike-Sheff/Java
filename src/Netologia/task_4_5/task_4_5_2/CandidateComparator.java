package Netologia.task_4_5.task_4_5_2;

import java.util.Comparator;

public class CandidateComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate o1, Candidate o2) {
        int result = Integer.compare(o2.getRelevance(), o1.getRelevance());
        return result != 0 ? result : Integer.compare(o2.getRating(), o1.getRating());
    }
}