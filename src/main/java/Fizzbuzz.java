import java.lang.String;
import java.lang.Integer;

public class Fizzbuzz {
    public String generate(int upto) {
        String output = "";
        for (int i = 1; i <= upto; i++) {
            output = output+Integer.toString(i)+", ";
        }
        
        return output.substring(0, output.length() - 2);
    }
}
