
package employeemanager;
/**
 *
 * @author Charmi
 */
    public class SalariedWorker extends Worker
{
    public SalariedWorker()
    {
        super();
    }        
    
    public SalariedWorker(String n, double r)
    {
        super(n,r);
    }        
    
    public double computePay(int hours)
    {
        return 40 * getRateOfPay();
    }
    
    public String toString()
    {
        return super.toString()+ "\nSalary Paid: "+computePay(getHours());
    }        
}
