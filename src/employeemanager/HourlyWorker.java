package employeemanager;
/**
 *
 * @author Charmi
 */
public class HourlyWorker extends Worker
{
    public HourlyWorker()
    {
        super();
    }   
    
    public HourlyWorker(String n, int h, double r)
    {
        super(n,h,r);   
    }
    public double computePay(int hours)
    {
        if(getHours()>40)
        {
            int hoursOverForty=getHours()-40;
            double pay=(getRateOfPay()*1.5)*(hoursOverForty);
            return pay + (getRateOfPay()*40);
        }
        else
            return getRateOfPay()*getHours();
    }        
    
    public String toString()
    {
        return super.toString()+ "\nSalary Paid: $"+ computePay(getHours())+ "\nHours worked & Paid for: "+getHours();
    }        
}

