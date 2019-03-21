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
        
    }

    
    public void orderNewItem(Item item)
    {
       Invoice beli = new Sell_Installment(1,item,"21-10-2019",10,1000);
       item.getPrice();
       
       if(beli instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
    
    public void orderSecondItem(Item item)
    {
        Invoice beli = new Buy_Paid(1, item, "21-Mar-19", 1, item.getPrice());
        
          if(beli instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
    public void orderRefurbishedItem(Item item)
    {
        Invoice beli = new Buy_Paid(1, item, "21-Mar-19", 1, item.getPrice());
        
        if(beli instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
     public void sellItemPaid(Item item)
    {
         Invoice beli = new Sell_Paid(1, item, "21-Mar-19", 1, item.getPrice());
        
        item.printData();
    }
    
 
    public void sellItemUnpaid(Item item)
    {
         Invoice beli = new Sell_Unpaid(1,item,"21-Mar-19",1, item.getPrice());
        
        item.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        Invoice beli = new Sell_Installment(1, item, "21-Mar-19", 1, 
        item.getPrice());
        
        item.printData();
    }
}
    