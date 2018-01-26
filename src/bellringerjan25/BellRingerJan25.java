
package bellringerjan25;
import java.util.*;

/**
 * Create a program that 
 * 
 * 1.  Implements the interface NewString
 * 2.  Asks the person for a string on the command line
 * 3.  Executes each one of the methods of your NewString implementation and
 *     prints the result on the command line
 * 
 * @author tim
 */
public class BellRingerJan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Type something");
        Scanner s= new Scanner(System.in);
       NewStringImpl message= new NewStringImpl(s.nextLine());
       System.out.println(message.flipped());
       System.out.println(message.length());
    }
    
}
