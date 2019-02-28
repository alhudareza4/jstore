
/**
 * Write a description of class item here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * Constructor for objects of class item
     */
    public Item(int id,String name, int stock, int price,
    String category, Supplier supplier)
    {
        // initialise instance variables
        //id = 0;
        //stock = 0;
        //price = 0;
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public int getStock()
    {
        // put your code here
        return stock;
    }
    
    public int getPrice()
    {
        // put your code here
        return price;
    }
    
    public String getCategory()
    {
        // put your code here
        return category;
    }
    // ini
    public Supplier getSupplier()
    {
        // put your code here
        return supplier;
    }
    
    public void setId(int id)
    {
        
    }
    
    public void setName(String name)
    {
        
    }
    
    public void setStock(int stock)
    {
        
    }
    
    public void setPrice(int price)
    {
        
    }
    
    public void setCategory(String category)
    {
        
    }
    
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    public void printData()
    {
        System.out.println(name);
    }
    
}
