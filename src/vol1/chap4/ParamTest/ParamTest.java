package vol1.chap4.ParamTest;

/**
 * Simple Class to showcase parameter passing in Java
 * @author nlekane
 * @version 1.0 13-05-2019
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
            Test1: Methods can't modify numeric(primitive/immutable) parameters
         */
        System.out.println("Testing TripleValue: ");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        // Test 2: methods can change the state of objects parameters
        System.out.println("\nTesting Triple Salary: ");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary= "+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("Before: salary= "+ harry.getSalary());

        // Test 3: Methods can't attach new objects to object parameters
        System.out.println("\nTesting Swap");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before a= "+a.getName());
        System.out.println("Before b= "+b.getName());
        swap(a, b);
        System.out.println("After a= "+a.getName());
        System.out.println("After b= "+b.getName());

    }

    public static void tripleValue(double x) {
        //does not work
        x = 3 * x;
        System.out.println("End of method: x = "+ x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary = "+ x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x; //temp points to the same object as x does
        x = y; // x points to the same object as y
        y = temp; // y points at the same object as temp does
        System.out.println("End of method: x = "+x.getName());
        System.out.println("End of method: y = "+y.getName());
    }
}
