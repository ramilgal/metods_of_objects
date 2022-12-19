import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String nameOfBook;
    private int publishingYear;
    private Author author;
    public Book (String nameOfBook, int publishingYear, Author author) {
        this.nameOfBook = nameOfBook;
        this.publishingYear = publishingYear;
        this.author = new Author(author.getNameOfAuthor(), author.getSureNameOfAuthor());
    }
    public String getNameOfBook() {
        return this.nameOfBook;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        int currentYear = LocalDate.now().getYear();
        if (publishingYear > currentYear) {
            System.out.println("Введен некорректный год издания: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameOfBook + ", год издания: " + publishingYear +
                ", " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && nameOfBook.equals(book.nameOfBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, publishingYear, author);
    }
}
