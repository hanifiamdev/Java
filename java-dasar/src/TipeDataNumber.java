/**
 * @author Hanif Amrullah
 * @since 10/02/2021 - 1:08
 */

public class TipeDataNumber {

	public static void main(String[] args) {

		// Example Integer Number
		byte thisByte = 100;
		// Berikut Eror karena byte antara -128 sampai 127
		//byte erorByte = 129;
		short thisShort = 2000;
		int thisInteger = 300000000;
		long thisLong  = 1000000000;
		// Cara lain mendeklarasikan long yaitu menambahkan huruf L dibelakang anggka
		long thisLongL  = 1000000000L;

		// Example Floating Point NUmber
		float thisFloat = 10.10F;
		float thisFloat2 = 10.10f;
		double thisDouble = 10.12345678914345;

		// Example Kode literals
		int decimalInt = 34;
		int hexaDecimal = 0xFFFFFF;
		int binaryDecimal = 0b10101010;

		// Example Kode Underscore ( hanya untuk memudahkan pembacaan saja )
		// 1 juta
		int amount = 1_000_000_000;
		// 1 triliun
		long balance = 1_000_000_000_000L;



	}
}
