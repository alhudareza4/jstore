
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    //private int idItem;
    private String date;
    private int totalPrice;
    private Item Item;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item Item, String date, int totalPrice)
    {
        // initialise instance variables
        //id = 0;
        //idItem =0;
        //totalPrice =0;
        this.id=id;
        this.Item=Item;
        this.date=date;
        this.totalPrice=totalPrice;
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
    
    //public String getIdItem()
    //{
        // put your code here
    //    return "";
    //}
    
    public String getDate()
    {
        // put your code here
        return date;
    }
    
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    public Item getItem()
    {
        return Item;
    }
    //public String setItem(int idItem)
    //{
        // put your code here
    //    return "";
    //}
    
    public void setId(int id)
    {
        // put your code here
        
    }
    
    public void setDate(String date)
    {
        // put your code here
        
    }
    
    public void setTotalPrice(String totalPrice)
    {
        // put your code here
        
    }
    
    public void setItem(Item Item)
    {
        this.Item=Item;
    }
    public void printData()
    {
        System.out.println(totalPrice);
    }
}
