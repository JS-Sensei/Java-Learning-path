package vol1.chap4.ParamTest;

/**
 * A Simplified Employee Class
 * @author nlekane
 * @version 1.0 13-05-2019
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent){
        double raise = this.salary * percent;
        this.salary += raise;
    }
}
