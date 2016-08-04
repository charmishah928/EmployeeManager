
package employeemanager;
/**
 *
 * @author Charmi
 */
public abstract class Worker
{
    private String Name;
    private double rateOfPay;
    private int Hours;
    
    public Worker()
    {
        Name="";
        rateOfPay=0.0;
        Hours=0;
    }   
    public Worker(String n, double r)
    {
        Name=n;
        rateOfPay=r;
    }        
    
    public Worker(String n, int h, double r)
    {
        this(n,r);
        Hours=h;
    }        
            
    public String getName()
    {
        return Name;
    }        
    public int getHours()
    {
        return Hours;
    }        
    public double getRateOfPay()
    {
        return rateOfPay;
    }        
    public void setName(String n)
    {
        Name=n;
    }        
    public void setHours(int h)
    {
        Hours=h;
    }        
    public void setRateOfPay(double r)
    {
        rateOfPay=r;
    }        
    
    public String toString()
    {
        return "Name:"+Name;
    }   
    public boolean equals(Worker one, Worker two)
    {
        if(!(one.computePay(one.getHours())==two.computePay(two.getHours())))
            return false;
        else
            return true;
    }        
    public abstract double computePay(int hours);
}