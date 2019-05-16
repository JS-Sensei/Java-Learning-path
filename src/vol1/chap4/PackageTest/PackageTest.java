package vol1.chap4.PackageTest;


import vol1.chap4.PackageTest.com.nlt.corejava.Employee;

//Static import statement
import static  java.lang.System.*;

/**
 * This program demonstrates the use of packages.
 * @version 1.11 16-05-2019
 * @author nlekane
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of static import we don't have to use System.out here
        out.println("Name: "+harry.getName()+", salary: "+harry.getSalary());

    }
}
