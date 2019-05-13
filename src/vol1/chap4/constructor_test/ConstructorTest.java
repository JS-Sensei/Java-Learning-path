package vol1.chap4.constructor_test;

/**
 * A Simple Class to showcase stuffs about Constructor
 * @author nlekane
 * @version 1.0 13-05-2019
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // Fill the Staff Array with 3 Employee Objects
        Employee[] staff = { new Employee("Harry", 40000), new Employee(60000), new Employee()};

        //print out all Infos about all Employee Objects
        for(Employee e : staff) {
            System.out.println("Name= "+ e.getName() + ", id= "+ e.getId()+", salary = " + e.getSalary());
        }
    }
}
