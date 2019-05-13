package vol1.chap4.static_test;

/**
 * Revisited Employee class
 * @author nlekane
 * @version 1.01 13-05-2019
 */
public class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        this.setId();
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        // Used as unit test
        Employee e = new Employee("Harry Kane", 5000000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
