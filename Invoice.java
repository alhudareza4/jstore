
/**
 * kelas invoice ini berfungsi untuk menset dan mendapatkan 
 * invoice dari setiap barang dengan yang membedakan dari kelas 
 * yang lain adalah adanya variable id,date dan total price
 * @Alhuda Reza Mahara
 * @version 28 febuari 2019
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private String date;
    private int totalPrice;
    private Item Item;
    private int totalItem;
    private InvoiceStatus status;

    /**
     * @param parameter yang digunakan adalah id, Item, date dan totalprice
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public Invoice(int id, Item Item, String date, int totalPrice)
    {

        this.id=id;
        this.Item=Item;
        this.date=date;
        this.totalPrice=totalPrice;
    }

    /**
     * methode yang berguna untuk mengambil nilai id
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel id dan menggunakan tipe data integer
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
   /**
     * methode yang berguna untuk mengambil nilai date
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel date dan menggunakan tipe data String
     */
    public String getDate()
    {
        // put your code here
        return date;
    }
    /**
     * methode yang berguna untuk mengambil nilai totalPrice
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel totalPrice dan menggunakan tipe data integer
     */
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    /**
     * methode yang berguna untuk mengambil nilai Item
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel Item 
     */
    public Item getItem()
    {
        return Item;
    }
    public int getTotalItem()
    {
        return 0;
    }
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    /**
     * methode yang berguna untuk menset nilai id
     * @param parameter yang digunakan pada method ini adalah id yang menggunakan tipe data integer
     */
    public void setId(int id)
    {
        // put your code here
        
    }
    /**
     * methode yang berguna untuk menset nilai date
     * @param parameter yang digunakan pada method ini adalah date yang menggunakan tipe data String
     */
    public void setDate(String date)
    {
        // put your code here
        
    }
    /**
     * methode yang berguna untuk menset nilai totalPrice
     * @param parameter yang digunakan pada method ini adalah totalPrice yang menggunakan tipe data String
     */
    public void setTotalPrice(String totalPrice)
    {
        // put your code here
        
    }
    /**
     * methode yang berguna untuk menset nilai Item
     * @param parameter yang digunakan pada method ini adalah Item 
     */
    public void setItem(Item Item)
    {
        this.Item=Item;
    }
    public void setTotalItem(int totalItem)
    {
        this.Item=Item;
    }
     public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status=status;
    }
    /**
     * methode yang berguna untuk menampilkan nila totalprice
     */
    public void printData()
    {
        System.out.println("INVOICE");
        System.out.println("ID" + id);
        System.out.println("TANGGAL" + date);
        System.out.println("ITEM" + Item.getName());
        System.out.println("Total Harga" + totalPrice);
        System.out.println("Status" + status);
    }
}
