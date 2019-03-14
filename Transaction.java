import java.util.*;
import java.text.*;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    public Supplier supplier;
    public DatabaseItem DatabaseItem;
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        // initialise instance variables
        this.DatabaseItem=DatabaseItem;
    }

    
    public void orderNewItem(Supplier supplier)
    {
       Item item1 = new Item(1,"huda",3,9000,ItemStatus.New,ItemCategory.Electronic,supplier);
       //menyimpan kedatabaseitem
       DatabaseItem.addItem(item1);
       
       
       Date dNow = new Date( );
       SimpleDateFormat ft = new SimpleDateFormat ("yyyy");
       Invoice invoice1 = new Invoice(1,item1,ft.format(dNow),10000);
       
       item1.setStatus(ItemStatus.New);
       
       invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        System.out.println("==========Order Second Item==========");
        item1.printData();
        invoice1.printData();
    }
    
    
    public void orderSecondItem(Supplier supplier)
    {
       Item item2 = new Item(1,"huda",3,9000,ItemStatus.Second,ItemCategory.Electronic,supplier);
       //menyimpan kedatabaseitem
       DatabaseItem.addItem(item2);
       
       
       Date dNow = new Date( );
       SimpleDateFormat ft = new SimpleDateFormat ("yyyy");
       Invoice invoice2 = new Invoice(1,item2,ft.format(dNow),10000);
       
       item2.setStatus(ItemStatus.New);
       invoice2.setInvoiceStatus(InvoiceStatus.Paid);
        System.out.println("==========Order Second Item==========");
        item2.printData();
        invoice2.printData();
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
       Item item3 = new Item(1,"huda",3,9000,ItemStatus.Refurbished,ItemCategory.Electronic,supplier);
       //menyimpan kedatabaseitem
        DatabaseItem.addItem(item3);
       
       
       Date dNow = new Date( );
       SimpleDateFormat ft = new SimpleDateFormat ("yyyy");
       Invoice invoice3 = new Invoice(1,item3,ft.format(dNow),10000);
       
       item3.setStatus(ItemStatus.New);
       
       invoice3.setInvoiceStatus(InvoiceStatus.Paid);
        System.out.println("==========Order Second Item==========");
        item3.printData();
        invoice3.printData();
    }
    
     public void sellItemPaid(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "14-Mar-19", item.getPrice());
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("==========Sell Item Paid==========");
        pembelian.printData();
        item.printData();
    }
    
 public void sellItemUnpaid(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "14-Mar-19", item.getPrice());
        
        pembelian.setInvoiceStatus(InvoiceStatus.Unpaid);
        
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("==========Sell Item Unpaid==========");
        pembelian.printData();
        item.printData();
    }
    
     public void sellItemInstallment(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "14-Mar-19", item.getPrice());
        
        pembelian.setInvoiceStatus(InvoiceStatus.Installment);
        
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("==========Sell Item Installment==========");
        pembelian.printData();
        item.printData();
    }
}
    