import java.util.*;
import java.text.*;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private static final InvoiceStatus INVOICE_STATUS =InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Costumer costumer;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    public Sell_Unpaid(int id, Item item,int totalItem,
    Costumer costumer)
    {
       super(id,item,totalItem);
       this.dueDate=new GregorianCalendar();
       dueDate.add((GregorianCalendar.DATE), 1);
       this.costumer=costumer;
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
        System.out.println("ID = " + super.getId());
        System.out.println("Item = " + super.getItem().getName());
        System.out.println("Amount = " + super.getTotalItem());
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price = " + super.getItem().getPrice());
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Supplier ID = " + super.getItem().getSupplier().getId());
        System.out.println("Supplier name = " + super.getItem().getSupplier().getName());
        System.out.println("Costumer ID = " + costumer.getId());
        System.out.println("Costumer name = " + costumer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Due date = " + dateFormat.format(dueDate));
        System.out.println(
        "If payment is not received by dueDate, transaction will be cancelled.");
        return "";
    }
}
