package bytestream1;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.logging.Logger;

public class LAB3 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB3.class.getName()).log(null, "File not found");
        } catch (IOException e) {
            Logger.getLogger(LAB3.class.getName()).log(null, "File not found");
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB3.class.getName()).log(null, "File not found");

        } catch (IOException e) {
            Logger.getLogger(LAB3.class.getName()).log(null, "File not found");
        }
    }
}
