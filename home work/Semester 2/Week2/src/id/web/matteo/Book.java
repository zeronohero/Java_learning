package id.web.matteo;

public class Book {
	private String Judul;
	private String Pengarang;
	private int tahunTerbit;
	private int Stok;
	private boolean Ketersediaan;
	
	public int getStok() {
		return Stok;
	}
	public Book(String judul, String pengarang, int tahunTerbit, int stok, boolean ketersediaan) {
		Judul = judul;
		Pengarang = pengarang;
		this.tahunTerbit = tahunTerbit;
		Stok = stok;
		Ketersediaan = ketersediaan;
		}

	public void setStok(int stok) {
		Stok = stok;
	}
	public String getJudul() {
		return Judul;
	}
	public String getPengarang() {
		return Pengarang;
	}
	public int getTahunTerbit() {
		return tahunTerbit;
	}
	public boolean isKetersediaan() {
		return Ketersediaan;
	}
	 
	public void infoBuku() {
		System.out.println("Judul: "+Judul);
		System.out.println("Pengarang: "+ Pengarang);
		System.out.println("Tahun Terbit: " + tahunTerbit);
		System.out.println("Stok: "+Stok);
		if(Stok>0&&Ketersediaan==true) {
		System.out.println("Ketersediaan: Tersedia \n");
		}		
		else {
			Ketersediaan = false;
		System.out.println("Ketersediaan: Tidak Tersedia \n");
		}

	}


	
	}
