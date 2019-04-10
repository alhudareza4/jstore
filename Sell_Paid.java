import java.text.*;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Costumer costumer; 
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id ,Item item,int totalItem
    ,Costumer costumer)
    {
        super(id,item,totalItem);
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return this.INVOICE_TYPE;
    }
    public Costumer getCostumer()
    {
        return costumer;
    }
    public String toString()
    {
        return "";
    }
    public void setCostumer(Costumer costumer)
    {
        this.costumer = costumer;
    }
    //public void printData()
    //{
     //   System.out.println("INVOICE");
     //   System.out.println("ID :" + super.getId());
     //   System.out.println("TANGGAL :" + super.getDate());
     //   System.out.println("ITEM :" + super.getTotalItem());
     //   System.out.println("Total Harga :" + super.getTotalPrice());
     //   System.out.println("Status :" + super.getInvoiceStatus());
    //}
    
}
