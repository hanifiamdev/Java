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

		// Konversi Antara Tipe Data baik primitif maupun bukan primitif
		// Jika masih setara misal int ke Integer atau float ke Float maka cara konversinya sangat mudah
		int age = 17;
		Integer ageObject = age;
		int ageAgain = ageObject;
		// Namun untuk yang tidak setara dapat gunakan  method dari objek data bukan primitif
		// Bukan primitif ke primitif dan tidak setara
		Integer num = 1000;
		long thisLongs = num.shortValue();
		float thisFloat = num.floatValue();

		// Primitif ke bukan primitif dan tidak setara
		int num2 = 1000;
		Integer contohSetara = num2;
		Long longNotPrimitif = Long.valueOf(num2);

	}
}
