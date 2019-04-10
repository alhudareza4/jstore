import java.text.*;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private static final InvoiceStatus INVOICE_STATUS =InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Costumer costumer;
    private SimpleDateFormat dateFormat = new SimpleDateFormat (" dd MM yyy");
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id,Item item,
    int totalItem,int installmentPeriod,Costumer costumer)
    {
        super(id,item,totalItem);
        this.installmentPeriod=installmentPeriod;
        
    }

    public int getInstallmentPeriod()
    {
        return installmentPeriod;
        
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
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
    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice =(int)(1.02* (totalPrice/installmentPeriod));
    }
    
    public void setTotalPrice(int installmentPeriod)
    {
        int totalPrice=installmentPrice * installmentPeriod;
        super.setTotalPrice(totalPrice);
    }
    public void setCostumer(Costumer costumer)
    {
        this.costumer = costumer;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
   
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        System.out.println("Item = " + super.getItem().getName());
        System.out.println("Amount = " + super.getTotalItem());
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price = " + super.getItem().getPrice());
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Installment price = " + installmentPrice);
        System.out.println("Supplier ID = " + super.getItem().getSupplier().getId());
        System.out.println("Supplier name = " + super.getItem().getSupplier().getName());
        System.out.println("Costumer ID = " + costumer.getId());
        System.out.println("Costumer name = " + costumer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
     }
}
