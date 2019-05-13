package vol1.chap4.static_test;

/**
 * Simple Class to Review some concept about static methods/variables
 * @author nlekane
 * @version 1.00 13-05-2019
 */
public class StaticTest {

    public static void main(String[] args) {
        //Fill the staff Array with 3 Employee Objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Cristiano", 85000);
        staff[1] = new Employee("Neymar", 105000);
        staff[2] = new Employee("Messi", 95000);

        //Print out information about all Employee Objects
        for(Employee e : staff) {
            System.out.println("Name= "+ e.getName() +", id= "+ e.getId() +", salary=" + e.getSalary());
        }

        int n = Employee.getNextId(); // calls static method
        System.out.println("Next Available Employee id: "+ n);
    }
}
