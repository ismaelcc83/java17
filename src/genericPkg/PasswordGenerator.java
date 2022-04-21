package genericPkg;

import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerator {

    public static void execute(){
        String text = "ABCDEFGHIKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        int min_val = 1;
        int max_val = 61;
        char[] pass = new char[10];
        char c = 0;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        for (int i = 0; i<10; i++){
            int randomNum = tlr.nextInt(min_val, max_val);
            String x = text.substring(randomNum-1, randomNum);
            c = x.charAt(0);
            pass[i] = c;
        }
        System.err.println(pass);
        System.out.println("size: "+pass.length);
    }    
}