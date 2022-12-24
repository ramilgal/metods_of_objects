import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 35000);
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
        printAllEmployees(employees);
        //Считаю сумму затрат на зарплату в месяц всего и вывожу в консоль
        calculateSumOfAllSalary(employees);
        //Минимальная зарплата
        getSalaryMinimum(employees);
        //Максимальная зарплата
        getSalaryMaximum(employees);
        //Считаю среднюю зарплату и вывожу в консоль
        calculateAverageSalary(employees);
        //Печать только ФИО Сотрудников
        printOnlyNamesOfEmployees(employees);
    }
    //Метод распечатать всех сотрудников
    public static void printAllEmployees(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    //Метод напечатать только ФИО
    public static void printOnlyNamesOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("ФИО: " + employee.getFullName());
        }
    }
//метод посчитать общую сумму затрат на зарплату
    public static void calculateSumOfAllSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплату сотрудников: " + sum);
    }
    //Метод найти сотрудника с минимальной зарплатой
    public static void getSalaryMinimum(Employee[] employees) {
        int salaryMinimum = Integer.MAX_VALUE;
        String person = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < salaryMinimum) {
                salaryMinimum = employee.getSalary();
                person = employee.getFullName();
            }
        }
        System.out.println("Минимальная зарплата: " + salaryMinimum + ", сотрудник: " + person);
    }
    //Метод найти сотрудника с максимальной зарплатой
    public static void getSalaryMaximum(Employee[] employees) {
        int salaryMaximum = 0;
        String person = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > salaryMaximum) {
                salaryMaximum = employee.getSalary();
                person = employee.getFullName();
            }
        }
        System.out.println("Максимальная зарплата: " + salaryMaximum + ", сотрудник: " + person);
    }
    //Метод подсчета средней зарплаты
    public static void calculateAverageSalary(Employee[] employees) {
        int sum = 0;
        int averageSalary;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        averageSalary = sum / employees.length;
        System.out.println("Средняя зарплата: " + averageSalary);
    }
}