import java.util.*;
/**
 * class databasesupplier berguna untuk mendapatkan dan menset data supplier dari
 * setiap toko.yang membedakan class ini dengan class yang lain 
 * adalah adanya variable listsupplier dan supplier
 *
 * @author Alhuda Reza Mahara
 * @version 28-febuari-2019
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;
    /**
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public DatabaseSupplier()
    {
        
    }
    
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
   
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)throws SupplierAlreadyExistsException
    {
        for(Supplier temp : SUPPLIER_DATABASE)
        {
            if((temp.getEmail() == supplier.getEmail()) ||
                    (temp.getPhoneNumber() == supplier.getPhoneNumber()))
            {
                throw new SupplierAlreadyExistsException(supplier);
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }
    public static Supplier getSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    public static boolean removeSupplier(int id)throws SupplierNotFoundException, ItemNotFoundException
    {
        for(Supplier temp : SUPPLIER_DATABASE)
        {
            if(temp.getId() == id)
            {
                ArrayList<Item> list = DatabaseItem.getItemFromSupplier(temp);
                for(Item temp1 : list)
                {
                    DatabaseItem.removeItem(temp.getId());
                }
                SUPPLIER_DATABASE.remove(temp);
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
    }
}
