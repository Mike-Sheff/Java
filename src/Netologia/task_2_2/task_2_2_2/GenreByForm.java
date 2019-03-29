package Netologia.task_2_2.task_2_2_2;

public class GenreByForm extends Genre{
    public GenreByForm() {
        super("Form of the text");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreByForm that = (GenreByForm) o;

        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;
    }
}