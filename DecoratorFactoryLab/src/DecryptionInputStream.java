import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecryptionInputStream extends FilterInputStream {
    private int shift = 0; // The shift in Caesar cipher

    public DecryptionInputStream(int shift, InputStream in) {
        super(in);
        this.shift = shift;
    }
    
    public int read() throws IOException {
        return decrypt(super.read());
    }

    int decrypt(int c) {
        int a = 'a'; // ASCII code of lower-case 'a'
		int z = 'a' + 25; // ASCII code of lower-case 'z'
		int A = 'A';
		int Z = 'A' + 25;
		
		// if the character is a lower-case letter:
            if (a <= c && c <= z) {
                return a + (c - shift)%26; // a mock-up "cipher": changes all lower-case letters to 'a'
            } else if (A <= c && c <= Z) {
                return (c + A - (shift % 26 + 26)%26 - A); // a mock-up "cipher": changes all upper-case letters to 'A'
            } else {
                return c;
            }
    }
}