/**
 * @author Hanif Amrullah
 * @since 10/02/2021 - 3:40
 */

public class Variable {
	public static void main(String[] args) {

		String name;
		name = "Hanif Amrullah";

		int age = 17;
		String address = "Indonesia";

		System.out.println(name); // Hanif Amrullah
		System.out.println(age); // 17
		System.out.println(address); // Indonesia

		// Mengganti value sebuah variable
		// name = 12345  // ini eror karena name String di inputkan value int
		name = "Fachri Amrullah";
		System.out.println(name); // Fachri Amrullah

		// Kata Kunci var
		//var name; // tanpa value untuk var akan eror
		var fullName = "Hanif Amrullah";

		// Kata Kunci final
		final String application = "Belajar Java";

		//application = "Belajar Kotlin" // Ini akan eror karena varibel final, valuenya tidak boleh di modifikasi

	}
}
