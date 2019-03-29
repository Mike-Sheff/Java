package Netologia.task_2_3.task_2_3_3;

import java.util.ArrayList;
import java.util.List;

public class Track {
    final int SONG_LENGHT = 20;
    private Instrument instruments;
    List<Instrument> timeline = new ArrayList<>(SONG_LENGHT);

    public Track(Instrument instruments) {
        this.instruments = instruments;
        for (int i = 0; i < SONG_LENGHT; ++i) {
            Instrument instrument = null;
            switch ((int) Math.round(Math.random())) {
                case 0:
                    instrument = this.instruments;
                    break;
                case 1:
                    instrument = new Instrument();
                    break;
            }
            timeline.add(instrument);
        }
    }

    public void print() {
        for (Instrument i : timeline) {
            i.printNote();
        }
    }
}