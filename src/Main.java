public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Андрей", "Андреевич", "Андреев", 1, 150_100.10f);
        Employee employee2 = new Employee(2, "Борис", "Борисович", "Борисов", 1, 160_200.20f);
        Employee employee3 = new Employee(3, "Владимир", "Владимирович", "Владимиров", 2, 170_300.30f);
        Employee employee4 = new Employee(4, "Георгий", "Георгиевич", "Георгиев", 2, 180_400.40f);
        Employee employee5 = new Employee(5, "Дмитрий", "Дмитриевич", "Дмитриев", 3, 190_500.50f);
        Employee employee6 = new Employee(6, "Елена", "Еленовна", "Еленова", 3, 200_600.60f);
        Employee employee7 = new Employee(7, "Игорь", "Мгоревич", "Игорев", 4, 210_700.70f);
        Employee employee8 = new Employee(8, "Константин", "Константинович", "Константинов", 4, 220_800.80f);
        Employee employee9 = new Employee(9, "Леонид", "Леонидович", "Леонидов", 5, 230_900.90f);
        Employee employee10 = new Employee(10, "Наталья", "Натальевна", "Натальева", 5, 240_000.00f);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        printEmployees();
        System.out.println();
        System.out.println(findEmployeeMinSalary());
        System.out.println(findEmployeeMaxSalary());
        System.out.println(calculateAverageSalary());
        System.out.println();
        printFullName();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateTotalMonthlySalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static Employee findEmployeeMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой:");
        Employee result = employees[0];
        float minSalary = Float.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null & employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой:");
        Employee result = employees[0];
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null & employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        System.out.print("Средняя зарплата сотрудников = ");
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return calculateTotalMonthlySalary() / count;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
            }
        }
    }
}