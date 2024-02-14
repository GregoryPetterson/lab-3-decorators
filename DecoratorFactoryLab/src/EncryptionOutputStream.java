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
			return (((c - a + shift % 26) + 26) % 26) + a;
			// Have to subtract the ascii value of a from c so the ascii values of the alphabet
			// start at zero. Then we add the shift to it. The first modulo is to ensure that if c - a + shift is 
			// negative it isn't less than -26. The second modulo will never do anything if c - a + shift is negative.
			// It only matters for positive numbers. We need to add 26 to handle negative numbers but it effects positive numbers
			// and we need to modulo accordingly.
		} else if (A <= c && c <= Z) {
			return (((c - A + shift % 26) + 26) % 26) + A;
		} else {
			return c;
		}

	
	}

}
