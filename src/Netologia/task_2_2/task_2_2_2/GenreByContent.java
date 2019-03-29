package Netologia.task_2_2.task_2_2_2;

public class GenreByContent extends Genre{
    public GenreByContent() {
        super("Content of the text");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreByContent that = (GenreByContent) o;

        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;
    }
}
