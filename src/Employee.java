public class Employee {

    private static Integer counter = 0;
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private float salary;

    public Employee(int id, String firstName, String middleName, String lastName, int department, float salary) {
        this.id = counter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ID = '" + id + '\'' +
                ", Имя = '" + firstName + '\'' +
                ", Отчество = '" + middleName + '\'' +
                ", Фамилия = '" + lastName + '\'' +
                ", Отдел = '" + department + '\'' +
                ", Зарплата = '" + salary + '\'' +
                '}';
    }
}
