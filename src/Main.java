import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", "1", 35000);
        employees[1] = new Employee("Иванов Петр Сергеевич", "2", 31000);
        employees[2] = new Employee("Сидоров Иван Сергеевич", "5", 39000);
        employees[3] = new Employee("Сидоров Сергей Иванович", "3", 35500);
        employees[4] = new Employee("Петрова Елена Ивановна", "4", 42500);
        employees[5] = new Employee("Петрова Татьяна Сергеевна", "5", 32800);
        employees[6] = new Employee("Петров Сергей Иванович", "2", 34300);
        employees[7] = new Employee("Васильев Петр Иванович", "1", 27000);
        employees[8] = new Employee("Захаров Павел Сергеевич", "3", 46500);
        employees[9] = new Employee("Павлов Иван Сергеевич", "5", 41500);
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

        //Повышенная сложность:
        System.out.println("Повышенная сложность:");
        //Метод проиндексировать зарплаты всех сотрудников
        calculateSalaryPercent(employees, 5);
        System.out.println("Проиндексированные зарплаты:");
        printAllEmployees(employees);
        //Метод найти сотрудника с минимальной зарплатой по отделу
        getSalaryMinimumInDept(employees, "5");
        //Метод найти сотрудника с максимальной зарплатой по отделу
        getSalaryMaximumInDept(employees, "4");
        //Сумма затрат на зарплату по отделу (уже после того, как зарплату
        // проиндексировали на процент)
        calculateSumOfAllSalaryInDept(employees, "1");
        //средняя зарплата по отделу
        calculateAverageSalary(employees, "2");
        //Метод проиндексировать зарплату сотрудников отдела
        calculateSalaryPercentInDept(employees, "3", 15);
        //печать сотрудников отдела
        System.out.println("Печать сотрудников одного отдела: ");
        printEmployeesInDept(employees,  "1");
        //Метод найти всех сотрудников с зарплатой меньше числа
        System.out.println("Печать сотрудников с зарплатой меньше числа:");
        findEmployeesWithSalaryLessNumber(employees, 35000);
        //Метод найти всех сотрудников с зарплатой больше или равно числа
        System.out.println("Печать сотрудников с зарплатой больше или равно числа:");
        findEmployeesWithSalaryMoreThanNumber(employees, 35500);
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

    //Повышенная сложность:

    //Метод проиндексировать зарплаты всех сотрудников
    public static void calculateSalaryPercent(Employee[] employees, int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary()+employee.getSalary()*percent/100);
        }
    }
    //Метод найти сотрудника с минимальной зарплатой по отделу
    public static void getSalaryMinimumInDept(Employee[] employees, String dept) {
        int salaryMinimumInDept = Integer.MAX_VALUE;
                String person = null;
        for (Employee employee : employees) {
            if (dept.equals(employee.getDept()) && employee.getSalary() < salaryMinimumInDept) {
                salaryMinimumInDept = employee.getSalary();
                person = employee.getFullName();
            }
        }
        System.out.println(dept + " отдел,"+ " минимальная зарплата: " + salaryMinimumInDept + ", сотрудник: " + person);
    }
    //Метод найти сотрудника с максимальной зарплатой по отделу
    public static void getSalaryMaximumInDept(Employee[] employees, String dept) {
        int salaryMaximumInDept = 0;
        String person = null;
        for (Employee employee : employees) {
            if (dept.equals(employee.getDept()) && employee.getSalary() > salaryMaximumInDept) {
                salaryMaximumInDept = employee.getSalary();
                person = employee.getFullName();
            }
        }
        System.out.println(dept + " отдел,"+ " Максимальная зарплата: " + salaryMaximumInDept + ", сотрудник: " + person);
    }
    //Метод найти сумму затрат на зарплату по отделу
    public static void calculateSumOfAllSalaryInDept(Employee[] employees, String dept) {
        int sum = 0;
        for (Employee employee : employees) {
            if (dept.equals(employee.getDept())) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату сотрудников "+ "по " + dept + " отделу: " + sum);
    }
    //Метод подсчета средней зарплаты по отделу
    public static void calculateAverageSalary(Employee[] employees,String dept) {
        double sum = 0D;
        int count = 0;
        for (Employee employee : employees) {
            if (dept.equals(employee.getDept())) {
                sum = sum + employee.getSalary();
                count++;
            }
        }
        double averageSalaryInDept = sum / count;
        System.out.println("Средняя зарплата по отделу " + dept + ": " + averageSalaryInDept);
    }
    //Метод проиндексировать зарплату сотрудников отдела (округление до целого, без копеек - можно позже доработать)
    public static void calculateSalaryPercentInDept(Employee[] employees, String dept, int percent) {
        for (Employee employee: employees) {
            if (dept.equals(employee.getDept())) {
                employee.setSalary(employee.getSalary()+employee.getSalary()*percent/100);
                System.out.println("Отдел: " + dept + ", id = " + employee.getId() + ", ФИО: " + employee.getFullName() + ", новая зарплата: " + employee.getSalary());
            }
        }
    }
    //печать сотрудников отдела
    public static void printEmployeesInDept(Employee[] employees, String dept) {
        for (Employee employee: employees) {
            if (dept.equals(employee.getDept())) {
                System.out.println("id = " + employee.getId() + ", ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    //Метод найти всех сотрудников с зарплатой меньше числа
    public static void findEmployeesWithSalaryLessNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("id = " + employee.getId() + ", ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    //Метод найти всех сотрудников с зарплатой больше или равно числа
    public static void findEmployeesWithSalaryMoreThanNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println("id = " + employee.getId() + ", ФИО: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

}