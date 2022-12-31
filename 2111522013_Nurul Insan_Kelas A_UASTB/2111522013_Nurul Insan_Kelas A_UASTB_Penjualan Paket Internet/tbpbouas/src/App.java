import java.util.Scanner;

import java.sql.*;

public class App {
	// static Scanner scanner;
	static Connection conn;

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		String pilihan;
		boolean lanjut = true;

		// link database
		String url = "jdbc:mysql://localhost:3306/tbpbo";
		String title = "Counter PQR";
		// exception
		try {
			// jbdcdriver dan koneksi ke database
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "");
			System.out.println("Class Driver ditemukan!");

			// Demo constructor
			proses proses = new proses();

			// perulangan
			while (lanjut) {
				System.out.println("----------------------");
				// String Method
				System.out.println(title.toUpperCase());
				proses.waktu();
				System.out.println("----------------------");
				proses.array();

				System.out.print("\nMasukkan Pilihan Anda (1/2/3/4/5): ");
				pilihan = input.next();

				switch (pilihan) {
					case "1":
						proses.display();
						break;
					case "2":
						proses.insert();
						break;
					case "3":
						proses.update();
						break;
					case "4":
						proses.delete();
						break;
					case "5":
						proses.search();
						break;
					default:
						System.err.println("\nPilihan tidak ditemukan\nSilakan pilih [1-5]");
				}

				System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
				pilihan = input.next();
				lanjut = pilihan.equalsIgnoreCase("y");

			}
			System.out.println("Program Selesai");

		}
		// exception driver tidak ditemukan
		catch (ClassNotFoundException ex) {
			System.err.println("Driver Error");
			System.exit(0);
		}

		// exception tidak berhasil connect ke database
		catch (SQLException e) {
			System.err.println("Tidak Berhasil Koneksi");
			input.close();
		}
	}
}
