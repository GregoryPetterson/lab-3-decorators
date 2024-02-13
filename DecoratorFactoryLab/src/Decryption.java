import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Decryption {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        String inFile = "./encrypted.txt";
		int c;
        InputStream in = null;

        try {
            InputStream in1 = new FileInputStream(inFile);
            in1 = new BufferedInputStream(in1);
            in = new DecryptionInputStream(10, in1);
        
        
                while ((c = in.read()) >= 0) {
                    System.out.print((char) c);
                }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        System.out.println();
    }
}