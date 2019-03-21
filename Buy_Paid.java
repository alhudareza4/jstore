
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.BUY;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, String date, int totalItem,
    int totalPrice)
    {
        super(id,item,date,totalItem,totalPrice);
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
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
