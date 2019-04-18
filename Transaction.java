import java.util.*;
//import java.text.*;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    private static ArrayList<Integer> listItem = new ArrayList<Integer>();
    
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        // initialise instance variables
        
    }

    
    public void orderNewItem(ArrayList<Integer> item_list)
    {
       //listItem.add(item.getId());
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }
    
    
    public void orderSecondItem(ArrayList<Integer> item_list)
    {
        //listItem.add(item.getId());
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);

    }
    
    public void orderRefurbishedItem(ArrayList<Integer> item_list)
    {
        //listItem.add(item.getId());
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }
    
     public void sellItemPaid(ArrayList<Integer> item_list,Costumer costumer)
    {
        //listItem.add(item.getId());
        Invoice sellPaid = new Sell_Paid(listItem, costumer);
        DatabaseInvoice.addInvoice(sellPaid);
    }
    
 
    public void sellItemUnpaid(ArrayList<Integer> item_list,Costumer costumer)
    {
        //listItem.add(item.getId());
        Invoice sellUnpaid = new Sell_Unpaid(listItem, costumer);
        DatabaseInvoice.addInvoice(sellUnpaid);
    }
    
    public void sellItemInstallment(ArrayList<Integer> item_list,Costumer costumer,int
    installmentPeriod)
    {
        //listItem.add(item.getId());
        Invoice sellInstall = new Sell_Installment(listItem, installmentPeriod, costumer);
        DatabaseInvoice.addInvoice(sellInstall);
    }
     public static boolean finishTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        if(invoice.getInvoiceStatus() == InvoiceStatus.Unpaid
                || invoice.getInvoiceStatus() == InvoiceStatus.Installment)
        {
            invoice.setIsActive(false);
            invoice.toString();
            System.out.println("isActive : " + invoice.getIsActive());
            return true;
        }
        return false;
    }
    public static boolean cancelTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        DatabaseInvoice.removeInvoice(invoice.getId());
        return true;
    }
}
    