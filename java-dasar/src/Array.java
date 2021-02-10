/**
 * @author Hanif Amrullah
 * @since 10/02/2021 - 19:52
 */

public class Array {
	public static void main(String[] args) {

		// Deklarasi Array
		String[] stringArray;
		stringArray = new String[3];

		// Insert  nilai di Array
		stringArray[0] = "Fachri";
		stringArray[1] = "Mufti";
		stringArray[2] = "Amrullah";

		// Cetak nilai
		System.out.println(stringArray[0]); // Fachri
		System.out.println(stringArray[1]); // Mufti
		System.out.println(stringArray[2]); // Amrullah
		// Update nilai
		stringArray[0] = "Hanif";
		System.out.println(stringArray[0]); // Hanif


		// Inisialisasi array dengan include value metode 1
		int[] arrayInt = new int[]{
				10, 90, 80, 67, 29
		};
		// Inisialisasi array dengan include value metode 2
		int[] arrayInt2 = {
				10, 90, 80, 67, 29
		};

		String[] fullName = {
				"Fachri", "Mufhti", "Amrullah"
		};
		// Mendapatkan panjang array
		System.out.println(fullName.length); // 3
		// Mengahpus data array dengan replace element array
		fullName[0] = null;
		// Atau hapus satu tipe data array
		fullName = null;

		// Array di dalam array
		String[][] members = {
				{"Hanif", "Amrullah"},
				{"Fachri", "Amrullah"},
				{"Orkhan"}
		};

		System.out.println(members[0][0]); // Hanif
		System.out.println(members[1][1]); // Amrullah
		System.out.println(members[2][0]); // Orkhan

	}
}
