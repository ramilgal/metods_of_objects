import java.util.Objects;

public class Author {
    private String nameOfAuthor;
    private String sureNameOfAuthor;
    public Author (String nameOfAuthor, String sureNameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.sureNameOfAuthor = sureNameOfAuthor;
    }
    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }
    public String getSureNameOfAuthor() {
        return this.sureNameOfAuthor;
    }

    @Override
    public String toString() {
        return " автор: " + nameOfAuthor +
                " " + sureNameOfAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameOfAuthor.equals(author.nameOfAuthor) && sureNameOfAuthor.equals(author.sureNameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, sureNameOfAuthor);
    }
}
