
/**
 * kelas supplier ini berfungsi untuk menset dan mendapatkan nilai
 * Item dari setiap barang dengan yang membedakan dari kelas 
 * yang lain adalah adanya variable id,name ,stock,price dan category
 * @author Alhuda Reza Mahara
 * @version 28-febuari-2019
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;

    /**
     * @param parameter yang digunakan adalah id, name, stock, price, category, supplier
     * Constructor yang digunakan pada class supplier berguna untuk mengassign nilai variabel local ke variabel global
     */
    public Item(int id,String name, int stock, int price,
    String category, Supplier supplier)
    {
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
       
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
     * methode yang berguna untuk mengambil nilai name
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel name dan menggunakan tipe data String
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    /**
     * methode yang berguna untuk mengambil nilai stock
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel stock dan menggunakan tipe data integer
     */
    public int getStock()
    {
        // put your code here
        return stock;
    }
    /**
     * methode yang berguna untuk mengambil nilai price
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel price dan menggunakan tipe data integer
     */
    public int getPrice()
    {
        // put your code here
        return price;
    }
    /**
     * methode yang berguna untuk mengambil nilai category
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel category dan menggunakan tipe data String
     */
    public String getCategory()
    {
        // put your code here
        return category;
    }
    /**
     * methode yang berguna untuk mengambil nilai Supplier
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel supplier 
     */
    public Supplier getSupplier()
    {
        // put your code here
        return supplier;
    }
    /**
     * methode yang berguna untuk menset nilai id
     * @param parameter yang digunakan pada method ini adalah id yang menggunakan tipe data integer
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * methode yang berguna untuk menset nilai name
     * @param parameter yang digunakan pada method ini adalah name yang menggunakan tipe data String
     */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * methode yang berguna untuk menset nilai stock
     * @param parameter yang digunakan pada method ini adalah stock yang menggunakan tipe data integer
     */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    /**
     * methode yang berguna untuk menset nilai price
     * @param parameter yang digunakan pada method ini adalah price yang menggunakan tipe data integer
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    /**
     * methode yang berguna untuk menset nilai category
     * @param parameter yang digunakan pada method ini adalah category yang menggunakan tipe data String
     */
    public void setCategory(String category)
    {
        this.category=category;
    }
    /**
     * methode yang berguna untuk menset nilai Supplier
     * @param parameter yang digunakan pada method ini adalah supplier 
     * dimana pada methode ini berguna untuk mengassign nilai variabel local ke variabel global
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    /**
     * berguna untuk menampilkan data name
     */
    public void printData()
    {
        System.out.println(name);
    }
    
}
