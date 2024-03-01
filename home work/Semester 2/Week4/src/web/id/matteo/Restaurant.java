package web.id.matteo;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        PesanPelanggan pesan = new PesanPelanggan();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        Makanan[] arrMakanan = new Makanan[5];
        // Makanan
        arrMakanan[0] = new Makanan("Sate Ayam ", 100000);
        arrMakanan[1] = new Makanan("Nasi Goreng", 100000);
        arrMakanan[2] = new Makanan("Mie Gacoan", 100000);
        arrMakanan[3] = new Makanan("Bakmie Ayam", 100000);
        arrMakanan[4] = new Makanan("Ayam Geprek", 100000);

        Minuman[] arrMinuman = new Minuman[5];
        // Minuman
        arrMinuman[0] = new Minuman("Jus Alpukat", 15000);
        arrMinuman[1] = new Minuman("Jeruk peras", 5000);
        arrMinuman[2] = new Minuman("Es Teh", 3000);
        arrMinuman[3] = new Minuman("Teh Hangat", 3000);
        arrMinuman[4] = new Minuman("Susu", 4000);

        // Menu
        do {
            System.out.println("======= Selamat Datang di U-Restaurant =======");
            System.out.println("1. Menu");
            System.out.println("2. Pesan Order");
            System.out.println("3. Cek Orderan");
            System.out.println("4. Check Out");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1: // Menu Print

                    // loop through the Makanan List
                    System.out.println("\n======== List Makanan ========\n");

                    for (int i = 0; i < arrMakanan.length; i++) {
                        System.out.print((i + 1) + ". ");
                        arrMakanan[i].tampilkan();
                    }

                    // loop through the Minuman List
                    System.out.println("\n======== List Minuman ========\n");

                    for (int i = 0; i < arrMinuman.length; i++) {
                        System.out.print((i + 1) + ". ");
                        arrMakanan[i].tampilkan();
                    }
                    System.out.println();
                    break;

                case 2:
                    boolean menu1 = true;
                    do {

                        System.out.println("=========== Pilih Menu ===========");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("0. Keluar");

                        int pilihan2 = scan.nextInt();
                        scan.nextLine();

                        if (pilihan2 == 1) {
                            boolean menu2 = true;
                            do {
                                System.out.println("\n======== List Makanan ========\n");
                                for (int i = 0; i < arrMakanan.length; i++) {
                                    System.out.print((i + 1) + ". ");
                                    arrMakanan[i].tampilkan();
                                }
                                System.out.println();
                                System.out.print("Pilih (0 untuk keluar):");
                                int pilihan3 = scan.nextInt();
                                scan.nextLine();

                                if (pilihan3 > 0 && pilihan3 <= arrMakanan.length) {
                                    pilihan3 = pilihan3 - 1;
                                    pesan.tambaPesanan(arrMakanan[pilihan3]);
                                    System.out.printf("\n %s telah ditambah dengan jumlah %d\n",
                                            arrMakanan[pilihan3].getNama(), arrMakanan[pilihan3].getJumlah());
                                }

                                else if (pilihan3 == 0) {
                                    menu2 = false;
                                } else {
                                    System.out.println("masukan pilihan yang tepat");

                                }

                            } while (menu2 == true);
                        }

                        else if (pilihan2 == 2) {
                            boolean menu2 = true;
                            do {
                                System.out.println("\n======== List Minuman ========\n");
                                for (int i = 0; i < arrMinuman.length; i++) {
                                    System.out.print((i + 1) + ". ");
                                    arrMinuman[i].tampilkan();
                                }
                                System.out.println();

                                System.out.print("Pilih (0 untuk keluar): ");
                                int pilihan3 = scan.nextInt();
                                scan.nextLine();

                                if (pilihan3 > 0 && pilihan3 <= arrMinuman.length) {
                                    pilihan3 = pilihan3 - 1;
                                    pesan.tambaPesanan(arrMinuman[pilihan3]);
                                    System.out.printf("\n %s telah ditambah dengan jumlah %d\n",
                                            arrMinuman[pilihan3].getNama(), arrMinuman[pilihan3].getJumlah());
                                } else if (pilihan3 == 0) {
                                    menu2 = false;
                                } else {
                                    System.out.println("masukan pilihan yang tepat");
                                }

                            } while (menu2 == true);
                        }

                        else if (pilihan2 == 0) {
                            menu1 = false;
                        } else {
                            System.out.println("masukan pilihan yang benar");
                        }

                    } while (menu1 == true);

                    break;

                case 3:
                    pesan.tampilkanPesanan();
                    break;

                case 4:
                    do {
                        pesan.tampilkanPesanan();
                        System.out.print("Apakah anda ingin checkout? (y/n): ");
                        String checkout1 = scan.nextLine();
                        if (checkout1.equalsIgnoreCase("y")) {
                            pesan.checkout();
                            System.out.println("        ~Struk telah di Print~");
                            System.out.println("Terimakasi telah berbelanja di U-Restaurant");
                            break;
                        } else if (checkout1.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("Masukan pilihan yang benar\n");
                        }
                    } while (true);
                    break;

                case 5:
                do {
                    System.out.println("Apakah anda ingin Keluar? (y/n): ");
                    String checkout2 = scan.nextLine();
                    if (checkout2.equalsIgnoreCase("y")) {
                        
                    }
                    else if (checkout2.equalsIgnoreCase("n")) {
                        break;
                    }
                    else{
                        System.out.println("Masukan pilihan yang benar\n");
                    }
                }while(true);
                default:
                    System.out.println("\nMasukan Pilihan yang benar\n");
            }
        } while (true);
    }
}
