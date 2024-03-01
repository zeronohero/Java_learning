package web.id.matteo;


// interface 
interface Tampilkan {

    public void tampilkan();

}

interface Pesan {

    public void pesan();

}

// abstract father class
public abstract class Menu implements Tampilkan, Pesan {
    // objects
    int jumlah = 1; // stock of item default
    String nama;
    float harga;

    // constructor
    public Menu(String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // method
    @Override
    public void tampilkan() {

    }
    @Override
    public void pesan(){

    }

    // getter setter
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public float getHarga() {
        return harga;
    }
    
}

// child class
class Makanan extends Menu  {

    public Makanan(String nama, float harga) {
        super(nama, harga);

    }

    @Override
    public void tampilkan() {
        System.out.printf("%-15s Rp %-15s \n", nama, harga);


    }

    @Override
    public void pesan() {
        jumlah = jumlah+1;
    }
   
    

}

class Minuman extends Menu {
    public Minuman(String nama, float harga) {
        super(nama, harga);
    }

    @Override
    public void tampilkan() {
        System.out.printf("%-15s Rp %-15s \n", nama, harga);


    }

    @Override
    public void pesan() {
        jumlah = jumlah+1;

    }
    

   

}