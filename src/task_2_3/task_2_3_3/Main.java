package Netologia.task_2_3.task_2_3_3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача: Музыкальный редактор.");
        System.out.println("");

        List<Track> track1 = Arrays.asList(new Track(new Piano()), new Track(new Guitar()), new Track(new Guitar()));
        List<Track> track3 = Arrays.<Track>asList(new Track(new Klaxon()), new Track(new Klaxon()));


        List<Song> composition = Arrays.asList(new Song(track1)
                , new Song(Arrays.asList(new Track(new Piano()), new Track(new Guitar()), new Track(new Klaxon())))
                , new Song(track3)
        );

        for (int i = 0; i < composition.size(); i++) {
            composition.get(i).print();
            System.out.println("");
        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}
