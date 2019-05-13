package vol1.chap4;

import java.time.LocalDate;

/**
 * Simple Java Program in which we create a simple class and use it
 * @author nlekane
 * @version 1.0 09-05-2019
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Fill the staff array with three Employee Objects
        Employee[] staff = {
                new Employee("Carl Cracker", 75000, LocalDate.of(1987, 12, 15)),
                new Employee("Harry Hacker", 50000, LocalDate.of(1989, 10, 1)),
                new Employee("Tony Tester", 40000, LocalDate.of(1990, 3, 15))
        };

        // Raise everyone's salary by 5%
        for(Employee e: staff){
            e.raiseSalary(5);
        }

        // Print out information about all Employee objects
        for(Employee e : staff ){
            System.out.println("Name: "+ e.getName() + ", salary: "+ e.getSalary() +", was hired on: "+ e.getHireDay());
        }

    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
