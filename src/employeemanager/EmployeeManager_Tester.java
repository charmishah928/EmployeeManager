
package employeemanager;

/**
 *
 * @author Charmi
 */
public class EmployeeManager_Tester
{
    public static void main(String[] args)
    {
        Worker Steph = new HourlyWorker("Stephanie", 50, 9);
        Worker Joseph = new HourlyWorker("Josephine", 45, 10);
        Worker John = new SalariedWorker("John", 20);
        Worker Lis = new SalariedWorker("Lisa", 40);
        System.out.println(Steph);
        System.out.println(Joseph);
        boolean compared = Steph.equals(Steph, Joseph);
        System.out.println("They earned the same amount of money?: " +compared);
    }
}
