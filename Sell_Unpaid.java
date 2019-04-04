import java.util.*;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private InvoiceStatus INVOICE_STATUS =InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Costumer costumer;
    public Sell_Unpaid(int id, Item item,int totalItem,
    Costumer costumer)
    {
       super(id,item,totalItem);
       this.dueDate=new GregorianCalendar();
       dueDate.add((GregorianCalendar.DATE), 1);
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public Costumer getCostumer()
    {
        return costumer;
    }
    public Calendar getDueDate()
    {
        return dueDate;
    }
    public void setCostumer(Costumer costumer)
    {
         this.costumer = costumer;
    }
    public void setDueDate(Calendar dueDate)
    {
        this.costumer = costumer;
    }
    public String toString()
    {
        return "";
        
    }
    //public void printData()
    //{
      //  System.out.println("INVOICE");
      //  System.out.println("ID :" + super.getId());
      //  System.out.println("TANGGAL :" + super.getDate());
      //  System.out.println("ITEM :" + super.getTotalItem());
      //  System.out.println("Total Harga :" + super.getTotalPrice());
      //  System.out.println("Status :" + super.getInvoiceStatus());
    //}
}
