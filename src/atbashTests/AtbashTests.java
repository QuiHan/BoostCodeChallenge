/**
 * @author Chew
 * @version 1.0
 * 
 * Class Description: Unit testing for {@link atbash.Atbash}
 */

package atbashTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import atbash.Atbash;

public class AtbashTests {
	
	public static final String encryptedTxt1 = "dzs";

	public static final String cipher1 = "zodvqukgwefbyitmrsplhacxnj";

	public static final String encryptedTxt2 = "skd qj qucbjvq?";

	public static final String cipher2 = "xipmuzfkbrlwotjancqgveshdy";

	public static final String encryptedTxt3 = "knlfgnb, sj koqj o yvnewju";

	public static final String cipher3 = "oephjizkxdawubnytvfglqsrcm";
	
	@Before
	public void setUp() throws Exception {
	}
	
	/**
	 * Test method for {@link atbash.Atbash#decrypt(java.lang.String,java.lang.String)}.
	 * Test for decrypting encryptedTxt1 with cipher1
	 */
	@Test
	public void decryptEncryptedTxt1(){
		assertEquals("car", Atbash.decrypt(encryptedTxt1, cipher1));
	}
	
	/**
	 * Test method for {@link atbash.Atbash#decrypt(java.lang.String,java.lang.String)}.
	 * Test for decrypting encryptedTxt2 with cipher2
	 */
	@Test
	public void decryptEncryptedTxt2(){
		assertEquals("why so serious?", Atbash.decrypt(encryptedTxt2, cipher2));
	}
	
	/**
	 * Test method for {@link atbash.Atbash#decrypt(java.lang.String,java.lang.String)}.
	 * Test for decrypting encryptedTxt3 with cipher3
	 */
	@Test
	public void decryptEncryptedTxt3(){
		assertEquals("houston, we have a problem", Atbash.decrypt(encryptedTxt3, cipher3));
	}
	
	/**
	 * Test method for {@link atbash.Atbash#decrypt(java.lang.String,java.lang.String)}.
	 * Test for decrypting encryptedTxt1 with cipher2
	 */
	@Test
	public void decryptEncryptedTxt1WithCipher2(){
		assertNotEquals("car", Atbash.decrypt(encryptedTxt1, cipher2));
	}
	
	/**
	 * Test method for {@link atbash.Atbash#decrypt(java.lang.String,java.lang.String)}.
	 * Test for decrypting encryptedTxt3 with cipher1
	 */
	@Test
	public void decryptEncryptedTxt3WithCipher1(){
		assertNotEquals("houston, we have a problem", Atbash.decrypt(encryptedTxt3, cipher1));
	}
	
	/**
	 * Test method for {@link atbash.Atbash#decrypt(java.lang.String,java.lang.String)}.
	 * Test for decrypting encryptedTxt3 with random cipher
	 */
	@Test
	public void decryptEncryptedTxt3WithRandomCipher(){
		assertNotEquals("houston, we have a problem", Atbash.decrypt(encryptedTxt3, "qpwoeirutyaszdxlmfcknvjghb"));
	}
}
