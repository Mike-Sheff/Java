package Netologia.task_2_2.task_2_2_2;

public class Genre {
    protected String attribute;

    public Genre (String attribute){
        this.attribute = attribute;
    }

    String getAttributeOfGenre() {
        return this.attribute;
    }

    String getGenreName() {
        return "Some genre name";
    }
}
