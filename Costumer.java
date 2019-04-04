import java.util.*;
/**
 * Write a description of class Costumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Costumer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Costumer
     */
    public Costumer(String name,String email,String username,
    String password,int id, Calendar birthDate)
    {
        // initialise instance variables
          this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = birthDate;
    }

    public Costumer(String name,String email,String username,
    String password,int id,int year,int month,int dayOfMonth)
    {
     this.name = name;
     this.email = email;
     this.username = username;
     this.password = password;
     this.id = id;
     this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    public Calendar getBirthDate()
    {
        System.out.println("Birth Date: " + birthDate.get(Calendar.DATE) + " " + 
        birthDate.get(Calendar.MONTH) + " " +  birthDate.get(Calendar.YEAR));
         return birthDate;
        //SImpleDateFormat ft = new SimpleDateFormat("dd MMM YYY");
        //System.out.printf("Birth Date : " + ft.format(birthDate.getTime()));
        //return birthDate;
    }
    
    public void setName(String name)
    {
         this.name = name;
    }
    
    public void setEmail(String email)
    {
         this.email = email;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
         this.password = password;
    }
    public void setId(int id)
    {
         this.id = id;
    }
    public void setBirthDate(Calendar birthDate)
    {
         this.birthDate = birthDate;
    }
    public void setBirthDate(int year,int month,int dayOfMonth)
    {
    }
    public String toString()
    {
        return "";
    }
}
