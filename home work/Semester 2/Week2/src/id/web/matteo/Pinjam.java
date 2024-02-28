package id.web.matteo;

public class Pinjam {
	private Book Peminjaman;
	private String Jurusan;
	private String Nim;
	private String Nama;
	private boolean infopinjam = false;

	public Book getPeminjaman() {
		return Peminjaman;
	}

	public String getJurusan() {
		return Jurusan;
	}

	public void setJurusan(String jurusan) {
		Jurusan = jurusan;
	}

	public String getNim() {
		return Nim;
	}

	public void setNim(String nim) {
		Nim = nim;
	}

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}
	
	public Pinjam(String jurusan, String nim, String nama, Book peminjaman) {
		Peminjaman = peminjaman;
		Jurusan = jurusan;
		Nim = nim;
		Nama = nama;
		
		if(Peminjaman.getStok()>0&&Peminjaman.isKetersediaan()==true) {
			int x = 0;
			x = Peminjaman.getStok()-1;
			Peminjaman.setStok(x);
			infopinjam = true;
		}
		else {
			
		}
		
		
			
		}
		

	public void cekKetersediaan() {
		if(infopinjam==true) {
			System.out.println("Judul: "+Peminjaman.getJudul());
			System.out.println("Pengarang: "+Peminjaman.getPengarang());
			System.out.println("Tahun Terbit: " + Peminjaman.getTahunTerbit());
			System.out.println("Stok buku: " + Peminjaman.getStok());
			System.out.println("Ketersediaan: ");
			System.out.println("info peminjaman: Dapat Dipinjam\n");
		}
		else {
			System.out.println("Judul: "+Peminjaman.getJudul());
			System.out.println("Pengarang: "+Peminjaman.getPengarang());
			System.out.println("Tahun Terbit: " + Peminjaman.getTahunTerbit());
			System.out.println("Stok buku: " + Peminjaman.getStok());
			System.out.println("Ketersediaan: ");
			System.out.println("info peminjaman: Tidak Dapat Dipinjam\n");
		}
		}
	

	
	public void infoMahasiswa() {
		System.out.println("NIM: "+Nim);
		System.out.println("Nama: "+Nama);
		System.out.println("Jurusan: "+Jurusan);
		if(infopinjam==true) {
			System.out.println("Peminjaman: "+Peminjaman.getJudul()+"\n");
		}
		else {
			System.out.println("Peminjaman: Tidak ada \n");
		}
		
		
	}
}
