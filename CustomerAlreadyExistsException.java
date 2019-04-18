public class CustomerAlreadyExistsException extends Exception
{
    private Costumer customer_error;

    public CustomerAlreadyExistsException(Costumer customer_input)
    {
        super();
        this.customer_error=customer_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + "Customer Email:"+ customer_error.getEmail() + " ,or Username:"+ customer_error.getUsername() +
                " already exists.";
    }
}
