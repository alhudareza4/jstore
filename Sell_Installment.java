
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private InvoiceStatus INVOICE_STATUS =InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Costumer costumer;
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
        this.customer = customer;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    public String toString()
    {
        
    }
    // public void printData()
    // {
      //  System.out.println("INVOICE");
      //  System.out.println("ID :" + super.getId());
      //  System.out.println("TANGGAL :" + super.getDate());
      //  System.out.println("ITEM :" + super.getTotalItem());
      //  System.out.println("Total Harga :" + super.getTotalPrice());
      //  System.out.println("Status :" + super.getInvoiceStatus());
    // }
}
