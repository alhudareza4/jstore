
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
        
     
        Location location=new Location("Serang","banten","Panas");
        Supplier supplier= new Supplier(1,"reza", "alhuda38@gmail.com","081382777680", location);
        
        location.printData();
        supplier.printData();
        
        Transaction transaksi = new Transaction();        
        transaksi.orderNewItem(supplier);
        transaksi.orderSecondItem(supplier);
        transaksi.orderRefurbishedItem(supplier);
        transaksi.sellItemPaid(DatabaseItem.getItem());
        transaksi.sellItemUnpaid(DatabaseItem.getItem());
        transaksi.sellItemInstallment(DatabaseItem.getItem());
        
        //Item item =new Item(1,"ayam",9,9000,"adult",supplier);
        //Invoice invoice =new Invoice(1,item,"5-3-2019",9000);
        //System.out.println(supplier.getName());
        //supplier.setName("ghifari");
        //System.out.println(supplier.getName());
        //item.printData();
        
    }
    
   
    
    
}
