/**
 * @author Hanif Amrullah
 * @since 10/02/2021 - 1:54
 */

public class KonversiNumber {

	public static void main(String[] args) {
		// Widening dilakukan secara otomatis untuk castingnya
		byte thisByte = 10;
		short thisShort = thisByte;
		int thisInt = thisShort;

		// Narrowing dilakukan secara manual untuk castingnya
		// Misal ada int 1000 jika dikonversi ke byte yang muatannya hanya 127
		int thisInt2 = 130;
		int thisInt3 = 260;
		byte thisByte2 = (byte) thisInt2;
		byte thisByte3 = (byte) thisInt3;
		System.out.println(thisByte2 + "|" + thisByte3); // Output : -126|4
		// Note : hasil terjadi ini terjadi Number Overvlow muter terus sesuai muatan byte.

		double thisDouble = 175.3456543445555;
		float thisFloat = (float) thisDouble;
		System.out.println(thisFloat); // Output : 175.34566
		// Note : Terjadi pembulatan bilangan decimal keatas baik lebih dari atau kurang dari 5
	}
}
