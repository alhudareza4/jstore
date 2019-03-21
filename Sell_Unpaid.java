
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private InvoiceStatus INVOICE_STATUS =InvoiceStatus.Unpaid;
    private String dueDate;
    public Sell_Unpaid(int id, Item item, String date, int totalItem,
    int totalPrice)
    {
       super(id,item,date,totalItem,totalPrice);
       this.dueDate=dueDate;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public String getDueDate()
    {
        return dueDate;
    }
    
    public void printData()
    {
        System.out.println("INVOICE");
        System.out.println("ID :" + super.getId());
        System.out.println("TANGGAL :" + super.getDate());
        System.out.println("ITEM :" + super.getTotalItem());
        System.out.println("Total Harga :" + super.getTotalPrice());
        System.out.println("Status :" + super.getInvoiceStatus());
    }
}
