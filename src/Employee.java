import java.util.Objects;

public class Employee {
    private String fullName;
    private String dept;
    private int salary;
    private final int id;
    static int count = 1;


    public Employee(String fullName, String dept, int salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDept(String dept) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && id == employee.id && fullName.equals(employee.fullName) && dept.equals(employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dept, salary, id);
    }
}






