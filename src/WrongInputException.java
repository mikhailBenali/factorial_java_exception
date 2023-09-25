public class WrongInputException extends Exception   {
    public WrongInputException(String message)   {
        super(message);
    }
    
    public WrongInputException()   {
        super("Input must be between 1 and 10");
    }
}
