/**
 * @author Hanif Amrullah
 * @since 10/02/2021 - 5:10
 */

public class TipeDataBukanPrimitif {
	public static void main(String[] args) {

		Integer thisInteger = 100;
		Long thisLong = 1000L;
		// Example Penarapan Default Type data primitif
		/*Byte thisByte;
		System.out.println(thisByte); // ini Eror karena Byte objek sehingga butuh inisialisasi*/

		// Nilai Default Tipe data bukan primitif adalah null
		Byte thisByte = null;
		System.out.println(thisByte); // null
		thisByte = 100;
		System.out.println(thisByte); // 100

		// Nilai Default Tipe data primitif adalah 0
		byte thisByte2 = 0 ;
		System.out.println(thisByte2); // 0
		thisByte2 = 100;
		System.out.println(thisByte2); // 100

	}
}
