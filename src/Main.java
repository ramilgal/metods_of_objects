public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person sarah = new Person("Sarah", 30);
        if (sarah.isAdult()) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }



        System.out.println("Домашнее задание");
        Author author = new Author("Алексей", "Толстой");
        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book("Петр 1", 1850, new Author(author.getNameOfAuthor(), author.getSureNameOfAuthor()));
        Book book1 = new Book("Война и мир", 1851, new Author(author1.getNameOfAuthor(), author1.getSureNameOfAuthor()));
        System.out.println("Название книги: " + book.getNameOfBook());
        System.out.println("Имя автора: " + author.getNameOfAuthor());
        System.out.println("Фамилия автора: " + author.getSureNameOfAuthor());
        System.out.println("Год издания: " + book.getPublishingYear());
        System.out.println("Название книги: " + book1.getNameOfBook());
        System.out.println("Имя автора: " + author1.getNameOfAuthor());
        System.out.println("Фамилия автора: " + author1.getSureNameOfAuthor());
        System.out.println("Год издания: " + book1.getPublishingYear());
        book1.setPublishingYear(2000);
        System.out.println("Год издания: " + book1.getPublishingYear());
        System.out.println();
        System.out.println("Домашнее задание 2 с применением toString и других");
        System.out.println();
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book.equals(book1));
        System.out.println(author.equals(author1));


    }
}