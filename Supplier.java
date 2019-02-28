
/**
 * Write a description of class Supplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    // private String city;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email,String phoneNumber,
    Location location)
    {
        // initialise instance variables
        //id = 0;
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
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
    
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    //public String getCity()
    //{
        // put your code here
    //    return "";
    //}
    
    public Location getLocation()
    {
        return location;
    }
    
    public void setId(int id)
    {
        // put your code here
       
    }
    
    public void setName(String name)
    {
        // put your code here
        
    }
    
    public void setEmail(String email)
    {
        // put your code here
        
    }
    
    public void setphoneNumber(String phoneNumber)
    {
        // put your code here
        
    }
    
    //public String setCity(String city)
    //{
        // put your code here
    //    return "";
    //}
    public void setLocation(Location location)
    {
        this.location=location;
    }
    public void printData()
    {
        System.out.println(name);
    }
}
