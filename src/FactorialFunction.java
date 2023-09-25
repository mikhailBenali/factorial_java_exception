import java.util.Scanner;

public class FactorialFunction {
    public static int factorial(int n) throws WrongInputException{
        int num;
        try {
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            return num * FactorialFunction.factorial(n - 1);
        } 
        catch (WrongInputException e) {
            throw new WrongInputException("Input must be positive");
        }
    }
}
