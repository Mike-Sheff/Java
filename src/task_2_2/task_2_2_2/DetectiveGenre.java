package Netologia.task_2_2.task_2_2_2;

public class DetectiveGenre  extends GenreByNumberOfPages {

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }
}