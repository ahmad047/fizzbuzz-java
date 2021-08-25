import java.lang.String;
import java.lang.Integer;

public class Fizzbuzz {
    public String generate(int upto) {
        String output = "";
        for (int i = 1; i <= upto; i++) {
            if(i == 1){
                output += "1";
            } else if (i % 3 == 0){
                output += ", "+"Fizz";
            } else {
                output += ", "+Integer.toString(i);
            }

        }
        
        return output;
    }
}
