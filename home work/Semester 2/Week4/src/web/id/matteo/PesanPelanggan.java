package web.id.matteo;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class PesanPelanggan {

    ArrayList<Menu> personList = new ArrayList<>();

    PesanPelanggan() {

    }

    public void tambaPesanan(Menu menu) {
        if (personList.contains(menu)) {
            menu.pesan();
        } else {
            personList.add(menu);
        }
    }

    public void tampilkanPesanan() {
        System.out.println("                 Billing U-Restaurant ");
        System.out.println("=============================================================");
        System.out.printf("%-15s %-15s %-15s %-15s \n", "Menu", "Harga", "Jumlah", "Total Harga");
        float totalHarga = 0;
        for (Menu menu : personList) {
            float totalMenu = menu.getHarga() * menu.getJumlah();
            totalHarga = totalHarga + totalMenu;
            System.out.printf("%-15s Rp%-15.2f %-15d Rp%-15.2f \n", menu.getNama(), menu.getHarga(), (menu.getJumlah()),
                    totalMenu);
        }
        System.out.println("=============================================================");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println();
    }

    public void hitungTotalPembayaran() {
        float totalPembayaran = 0;
        for (Menu menu : personList) {
            totalPembayaran = (totalPembayaran + menu.getHarga());
        }
        System.out.println("Total Pembayaran: " + totalPembayaran);
    }

    public void clear() {
        personList.clear();
    }

    public void checkout() {
        File myfile = new File("checkout.txt");
        try{
            if (!myfile.exists()){
                myfile.createNewFile();
            }
            PrintWriter write = new PrintWriter(myfile);
            write.println("                 Billing U-Restaurant ");
            write.println("=============================================================");
            write.printf("%-15s %-15s %-15s %-15s \n" , "Menu", "Harga", "Jumlah", "Total Harga");
            float totalHarga = 0;
            for (Menu menu : personList) {
            float totalMenu = menu.getHarga() * menu.getJumlah();
            totalHarga = totalHarga + totalMenu;
            write.printf("%-15s Rp %-15.2f %-15d Rp %-15.2f \n",menu.getNama(), menu.getHarga(), (menu.getJumlah()), totalMenu);
        }
            write.println("=============================================================");
            write.println("Total Harga: " + totalHarga);
            write.println();
            write.flush();
            write.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        personList.clear();
    }

}
