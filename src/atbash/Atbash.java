/**
 * 
 * @author Qui Han
 * @version 1.0
 * 
 * Class Description: This program decodes the Atbash chiper. Using the cipher, strings can be encypted. 
 * When the cipher and encrypted string is given it possible to decrypt the encrypted text.
 * Any character other than alphabets constant doesn't replace.
 *       
 */
package atbash;

public class Atbash {

	public static final String alphabets = "abcdefghijklmnopqrstuvwxyz";

	public static final String encryptedTxt1 = "dzs";

	public static final String cipher1 = "zodvqukgwefbyitmrsplhacxnj";

	public static final String encryptedTxt2 = "skd qj qucbjvq?";

	public static final String cipher2 = "xipmuzfkbrlwotjancqgveshdy";

	public static final String encryptedTxt3 = "knlfgnb, sj koqj o yvnewju";

	public static final String cipher3 = "oephjizkxdawubnytvfglqsrcm";

	public static void main(String[] args) {
		System.out.println("Original Texts: " + decrypt(encryptedTxt3, cipher3));
	}

	public static String decrypt(String encryptedTxt, String cipher) {
		StringBuilder decryptedTxt = new StringBuilder();

		for (char c : encryptedTxt.toCharArray()) {
			if (Character.isLetter(c)) {
				decryptedTxt.append(alphabets.charAt(cipher.indexOf(c)));
			} else {
				decryptedTxt.append(c);
			}
		}

		return decryptedTxt.toString();
	}
}
