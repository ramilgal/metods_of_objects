public class Employee {
    private String fullName;
    private int dept;
    private int salary;
    private final int id;
    static int count = 1;


    public Employee(String fullName, int dept, int salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", ФИО: " + fullName +
                ", отдел: " + dept +
                ", зарплата: " + salary;
    }
    public static void printAllEmployees(Employee[] employees) {
            for (Employee i : employees) {
            System.out.println(i + " ");
            }
            System.out.println();
    }
}






