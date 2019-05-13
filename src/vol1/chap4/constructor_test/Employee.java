package vol1.chap4.constructor_test;

import java.util.Random;

/**
 * Simple Employee Class
 * @author nlekane
 * @version 1.0 13-05-2019
 */
public class Employee {
    private static int nextId;

    private int id;
    private String name = ""; // Instance field init upon declaration
    private double salary;

    // static init block that will be call as soon as the class is loaded
    static {
        Random generator = new Random();
        // set nextId to a random between 0 and 9999;
        nextId = generator.nextInt(10000);
    }
    // Object init block called and exe before the constructor when the constructor is called
    {
        id = nextId;
        nextId++;
    }

    // Three overloaded Constructors
    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    public Employee(double s) {
        //Calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    // Default constructor
    public Employee() {
        // name init with "" as made upon declaration
        // salary init with 0(default from Java) as it's a double
        //id initialized from Object init block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
