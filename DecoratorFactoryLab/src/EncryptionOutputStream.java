import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptionOutputStream extends FilterOutputStream {
	private int shift = 0; // The shift in Caesar cipher

	public EncryptionOutputStream(int shift, OutputStream out) {
		super(out);
		this.shift = shift;
	}
	
	public void write(int c) throws IOException {
		super.write(encrypt(c));
	}
	

	int encrypt(int c) {
		int a = 'a'; // ASCII code of lower-case 'a'
		int z = 'a' + 25; // ASCII code of lower-case 'z'
		int A = 'A';
		int Z = 'A' + 25;
		
		// if the character is a lower-case letter:
		if (a <= c && c <= z) {
			return (c - a + (shift % 26 + 26)%26) % 26 + a; // a mock-up "cipher": changes all lower-case letters to 'a'
		} else if (A <= c && c <= Z) {
			return (c - A + (shift % 26 + 26)%26) % 26 + A;
		} else {
			return c;
		}

	
	}

}
