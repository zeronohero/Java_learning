package id.web.matteo;

public class App {

	public static void main(String[] args) {
		Book buku1 = new Book("Moshouku Tensei", "Rifujin na Magonote", 2001, 1, true);
		Book buku2 = new Book("3 day of happines", "Sugaru Miaki", 2013, 3, true);
		Book buku3 = new Book("My cursed assistence", "Miss Avleb", 2024, 5, false);
		Pinjam mahasiswa1 = new Pinjam("Si", "0000014809", "bobby", buku1);
		Pinjam mahasiswa2 = new Pinjam("SI", "00000101809", "suguru", buku1);
		Pinjam mahasiswa3 = new Pinjam("SI", "00000101810", "Matteo", buku3);
		
		
	
		System.out.println("=== Periksa ketersediaan ===");
		mahasiswa1.cekKetersediaan();
		mahasiswa2.cekKetersediaan();
		mahasiswa3.cekKetersediaan();
		
		// mengambil informasi siswa 
		System.out.println("=== Informasi Siswa ===");
		mahasiswa1.infoMahasiswa();
		mahasiswa2.infoMahasiswa();
		mahasiswa3.infoMahasiswa();
		
		// mengambil informasi buku
		System.out.println("=== Informasi Buku ===");
		buku1.infoBuku();
		buku2.infoBuku();
		buku3.infoBuku();
		
//		His palms are sweaty, 
//		knees weak, 
//		arms are heavy
//		There's vomit on his sweater already,
//		mom's spaghetti
	}
}
