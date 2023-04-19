package bytestream1;

import java.io.*;
import java.util.logging.Logger;

public class LAB2 {
    public static void main(String[] args) {
        String S = "Hello World";
        byte[] b = S.getBytes();
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            output.write(b);
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB2.class.getName()).log(null, "File not found");
        } catch (IOException e) {
            Logger.getLogger(LAB2.class.getName()).log(null, "File not found");
        }
        try {
            FileInputStream input = new FileInputStream("data.dat"  );
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB2.class.getName()).log(null, "File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}