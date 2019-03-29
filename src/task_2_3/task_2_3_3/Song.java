package Netologia.task_2_3.task_2_3_3;

import java.util.List;

public class Song {
    private List<Track> tracks;

    public Song(List<Track> tracks) {
        this.tracks = tracks;
    }

    public void print() {
        for (Track track : tracks) {
            track.print();
            System.out.println("");
        }
    }
}