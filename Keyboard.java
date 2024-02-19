import java.util.Scanner;
/**
 * The Keyboard class takes input from the keyboard, verifies that the input is
 * an integer and provides errors if the input is NOT an integer.
 */
public class Keyboard {
    /**
     * Declares the Scanner name "in".
     */
    public final Scanner in;
    /**
     * Keyboard is the constructor that sets up the scanner.
     */
    Keyboard(){
        // Setup Scanner.
        in = new Scanner(System.in);
    }
    /**The method readInteger checks to see if the input is a string or an
     * integer.
     * @param promptMsg gives an output specified in the superclass SortStack if the input is an integer
     * @param errorMsg gives an output if the input is NOT an integer.
     * @return returns a verified integer as "number".
     */
    public int readInteger(String promptMsg, String errorMsg){
        int number = 0;
        String strInput;
        boolean valid = false;

        // Keep looking until valid input is given.
        while(!valid){
            // Prompt the user.
            System.out.println(promptMsg);
            // Grab input from keyboard.
            strInput = in.nextLine();
            // Try to convert String to int.
            try{
                number = Integer.parseInt(strInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
        return number;
    }
}

