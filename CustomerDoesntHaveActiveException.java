public class CustomerDoesntHaveActiveException extends Exception
{
    private Costumer customer_error;

    public CustomerDoesntHaveActiveException(Costumer customer_input)
    {
        super();
        this.customer_error=customer_input;
    }
    public String getExMessage()
    {
        return super.getMessage() +"Customer : " +customer_error + " \ndoesnt have active invoice";
    }
}
