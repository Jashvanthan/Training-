interface Employee {
    String getName();
    int getId();
    double calculateSalary();
    String getType();
}

abstract class AbstractEmployee implements Employee {
    private final int id;
    private final String name;

    public AbstractEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    protected String baseInfo() {
        return "ID=" + id + ", Name='" + name + "'";
    }

    @Override
    public String toString() {
        return getType() + "{" + baseInfo() + ", salary=" + calculateSalary() + '}';
    }
}

class PermanentEmployee extends AbstractEmployee {
    private final double monthlySalary;
    private final double benefits;

    public PermanentEmployee(int id, String name, double monthlySalary, double benefits) {
        super(id, name);
        this.monthlySalary = monthlySalary;
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + benefits;
    }

    @Override
    public String getType() {
        return "PermanentEmployee";
    }
}

class PartTimeEmployee extends AbstractEmployee {
    private final double hourlyRate;
    private final double hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, double hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getType() {
        return "PartTimeEmployee";
    }
}

public class Employe {
    public static void main(String[] args) {
        Employee perm = new PermanentEmployee(1001, "Alice", 6000, 1200);
        Employee part = new PartTimeEmployee(2001, "Bob", 35, 90);

        Employee[] employees = {perm, part};

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
