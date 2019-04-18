import java.util.*;
/**
 * Write a description of class jstore here.
 *
 * @author Alhuda reza mahara
 * @version 21-2-2019
 */
public class jstore
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class jstore
     */
    public jstore()
    {
        // initialise instance variables
       
    }

    
    public static void main(String[] args)
    {
        Location bekasi = new Location("Bekasi", "Jawa Barat", "Rumah");

        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Irsyad", "irsyad@yahoo.com",
                    "081294447597", bekasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Gema", "gema@yahoo.com",
                    "081294447598", bekasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Upi", "upi@yahoo.com",
                    "081294447599", bekasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Supplier data : DatabaseSupplier.getSupplierDatabase())
        {
            data.toString();
        }

        try
        {
            DatabaseCostumer.addCustomer(new Costumer("aldy", "aldy@yahoo.com",
                    "aldy", "ald1gAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseCostumer.addCustomer(new Costumer("jati", "jati@yahoo.com",
                    "jati", "jAt1gAn", 1998, 8, 15));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseCostumer.addCustomer(new Costumer("tina", "tina@yahoo.com",
                    "tina", "t1nAgAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Costumer data : DatabaseCostumer.getCustomerDatabase())
        {
            data.toString();
        }

        try
        {
            DatabaseItem.addItem(new Item("asus", 10, 5000,
                    ItemCategory.Electronic, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("acer", 12, 3000,
                    ItemCategory.Electronic, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("lenovo", 15, 6000,
                    ItemCategory.Electronic, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Item data : DatabaseItem.getItemDatabase())
        {
            data.toString();
        }

        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(DatabaseItem.getItemFromID(1).getId());
        item.add(DatabaseItem.getItemFromID(2).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Installment(item,
                    5, DatabaseCostumer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        ArrayList<Integer> item2 = new ArrayList<Integer>();
        item2.add(DatabaseItem.getItemFromID(1).getId());
        item2.add(DatabaseItem.getItemFromID(3).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item2,
                    DatabaseCostumer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        /*
        Location location1=new Location("Depok","Jawa Barat","Panas");
        
        
        DatabaseSupplier.addSupplier(new Supplier("reza1","123@gmail.com","081234567",location1));
        DatabaseSupplier.addSupplier(new Supplier("reza2","123@gmail.com","081234567",location1));
        DatabaseSupplier.addSupplier(new Supplier("reza3","123@gmail.com","081234567",location1));

        for(Supplier temp : DatabaseSupplier.getSupplierDatabase())
        {
            System.out.println(temp);
        }
        
        DatabaseCostumer.addCustomer(new Costumer("reza1","1234@gmail.com",
        "reza","12345678",1998, 02, 1));
        DatabaseCostumer.addCustomer(new Costumer("reza2","1234@gmail.com",
        "reza","12345678",1998, 02, 1));
        DatabaseCostumer.addCustomer(new Costumer("reza3","1234@gmail.com",
        "reza","12345678",1998, 02, 1));
        
        ArrayList<Costumer> temCostumer=DatabaseCostumer.getCustomerDatabase();
        for(Costumer temp : temCostumer)
        {
            System.out.println(temp);
        }
        
        DatabaseItem.addItem(new Item("reza",23,5000,ItemStatus.New,ItemCategory.Electronic,
        DatabaseSupplier.getSupplier(1)));
        DatabaseItem.addItem(new Item("reza",23,5000,ItemStatus.New,ItemCategory.Electronic,
        DatabaseSupplier.getSupplier(2)));
        DatabaseItem.addItem(new Item("reza",23,5000,ItemStatus.New,ItemCategory.Electronic,
        DatabaseSupplier.getSupplier(3)));
        ArrayList<Item> arrInt= new ArrayList<Item>(100);
        for(Item temp:arrInt)
        {
            System.out.println(temp);
        }
        
        ArrayList<Integer> arr_integer1 =new ArrayList<Integer>(100);
        arr_integer1.add(1);
        arr_integer1.add(2);
        
        ArrayList<Integer> arr_integer2 =new ArrayList<Integer>(100);
        arr_integer2.add(2);
        arr_integer2.add(3);
        
        ArrayList<Integer> arr_integer3 =new ArrayList<Integer>(100);
        arr_integer3.add(3);
        arr_integer3.add(3);
        
        DatabaseInvoice.addInvoice(new Sell_Paid(arr_integer1,DatabaseCostumer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Installment(arr_integer2,1,DatabaseCostumer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Paid(arr_integer3,DatabaseCostumer.getCustomer(3)));
        
        ArrayList<Invoice> arr_invoice= DatabaseInvoice.getInvoiceDatabase();
        for(Invoice temp:arr_invoice)
        {
            System.out.println(temp);
        }
        
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(1)))
        System.out.println("finish");
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(2)))
        System.out.println("finish");
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(3)))
        System.out.println("finish");
        System.out.println();
        
        //if(!Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1)));
        //for(Invoice temp:arr_invoice)
        //{
          //  System.out.println(temp);
        //}
        */
    }
    
   
    
    
}
