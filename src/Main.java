import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 30000);
        employees[1] = new Employee("Иванов Петр Сергеевич", 2, 31000);
        employees[2] = new Employee("Сидоров Иван Сергеевич", 5, 39000);
        employees[3] = new Employee("Сидоров Сергей Иванович", 3, 35500);
        employees[4] = new Employee("Петрова Елена Ивановна", 4, 42500);
        employees[5] = new Employee("Петрова Татьяна Сергеевна", 5, 32800);
        employees[6] = new Employee("Петров Сергей Иванович", 2, 34300);
        employees[7] = new Employee("Васильев Петр Иванович", 1, 27000);
        employees[8] = new Employee("Захаров Павел Сергеевич", 3, 46500);
        employees[9] = new Employee("Павлов Иван Сергеевич", 5, 41500);
        //Вывожу в консоль список всех сотрудников со всеми полями в одну строку
        System.out.println(Arrays.toString(employees));
        //Вывожу в консоль список всех сотрудников со всеми полями в отдельные строки
        Employee.printAllEmployees(employees);
        //Считаю сумму затрат на зарплату всего и вывожу в консоль
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println(sum);









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