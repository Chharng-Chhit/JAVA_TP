package Test;
import java.util.*;
public class Test {

    public static void main(String[] args) {
        String s = "Hello, stackoverflow";
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int characterASCII = s.charAt(i);
            buf.append(" ");
            // Automatic type casting as 'char' is a type of 'int'
            buf.append(Integer.toBinaryString(characterASCII));
        
            // or:
            // buf.append(characterASCII, 2);
            // or - custom method:
            // buf.append(toBinary(characterASCII));
        }
        // String encry 
        System.out.println("answer : " + buf);
        String h = buf.toString();
        h = h.replace("0", "-").replace("1", "?");
        System.out.println("answer : " + h);

        
        String dycry_bin = h.toString();
        dycry_bin = dycry_bin.replace("-", "0").replace("?", "1");
        
        // dycry_bin = dycry_bin.trim();
        System.out.println("Bin: "+dycry_bin);
        // Integer bin = dycry_bin;


        // String input = "  1100011 1100001 1110010 1100101 1111001 1100100 1100101 1110110 1100101 01101100 01101111 01110000 01101101 01100101 01101110 01110100";
        String input = dycry_bin;

        input = input.trim();
        String[] parts = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {
            int val = Integer.parseInt(part, 2);
            String c = Character.toString(val);
            sb.append(c);
        }

        System.err.println(sb.toString());
    }

    
}
