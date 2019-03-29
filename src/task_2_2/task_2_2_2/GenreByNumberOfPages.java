package Netologia.task_2_2.task_2_2_2;

public class GenreByNumberOfPages extends Genre{
    public GenreByNumberOfPages() {
        super("Number of pages of the text");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreByNumberOfPages that = (GenreByNumberOfPages) o;

        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;
    }
}