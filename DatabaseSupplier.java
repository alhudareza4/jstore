
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
    private Supplier[] listSupplier;
    private Supplier supplier;

    /**
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public DatabaseSupplier()
    {
        // initialise instance variables
        this.supplier=supplier;
        this.listSupplier=listSupplier;
    }

   /**
     * methode yang berguna untuk mengambil nilai supplier
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel  supplier dan menggunakan tipe data boolean
     */
     public boolean Supplier()
    {
       return true; 
    }
    /**
     * methode yang berguna untuk menset nilai supplier
     * @param parameter yang digunakan pada method ini adalah supplier 
     */
    public void removeSupplier(Supplier supplier)
    {
        // put your code here
        
    }
    /**
     * methode yang berguna untuk mengambil nilai item pada database
     */
    public void getItemDatabase()
    {
        this.supplier=supplier;
    }
    /**
     * methode yang berguna untuk mengambil supplier
     */
     public Supplier getSupplier()
    {
        return supplier;
    }
    /**
     * methode yang berguna untuk mengambil nilai listsupplier
     * @return dimana nilai yang sudah diambil tersebut direturn ke listsupplier  supplier dan menggunakan tipe data String[]
     */
    public Supplier[] getListSupplier()
    {
        return listSupplier;
    }
    static public boolean addSupplier()
    {
       return true; 
    }
    
}
