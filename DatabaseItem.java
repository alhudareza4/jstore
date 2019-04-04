
/**
 * class databaseitem berguna untuk mendapatkan dan menset database item dari
 * setiap toko.yang membedakan class ini dengan class yang lain 
 * adalah adanya variable listitem dan Item
 * @author Alhuda Reza Mahara
 * @version 28-febuari-2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private Item[] listItem;
    public static Item itemDB;

    /**
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public DatabaseItem()
    {
        // initialise instance variables
        
       
    }

   /**
     * methode yang berguna untuk menset nilai item
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel item
     * @param parameter yang digunakan pada method ini adalah item 
     */
    public static boolean addItem(Item item)
    {
        //return Item;
        itemDB = item;
        return true;
    }
    /**
     * methode yang berguna untuk mengambil nilai supplie
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel  supplier dan menggunakan tipe data boolean
     * @param parameter yang digunakan pada method ini adalah item 
     */
    public boolean removeItem(Item item)
    {
        // put your code here
        return true;
    }
    /**
     * methode yang berguna untuk mengambil nilai itemdatabase
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel listitem
     */
    public Item[] getItemDatabase()
    {
       return listItem; 
    }
    /**
     * methode yang berguna untuk mengambil nilai item
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel item
     */
    public static Item getItem()
    {
        return itemDB;
    }
    
}
