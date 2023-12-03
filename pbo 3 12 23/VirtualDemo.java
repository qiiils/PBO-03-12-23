import java.util.*;
import java.text.*;

public class VirtualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        Date hariSekarang = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("HH:mm:ss a zzz");
        do {
            try {
                System.out.print("kode barang\t\t: ");
                String noFaktur = scanner.next();

                System.out.print("nama pelanggan\t\t: ");
                String namaPelanggan = scanner.next();

                System.out.print("nomor HP pelanggan\t: ");
                String nomorHP = scanner.next();

                System.out.print("alamat pelanggan\t: ");
                scanner.nextLine(); 
                String alamatPelanggan = scanner.nextLine();

                System.out.print("nama barang\t\t: ");
                String namaBarang = scanner.next();

                System.out.print("harga barang\t\t: ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("jumlah barang\t\t: ");
                int jumlahBarang = scanner.nextInt();

                // Membuat objek Pembali
                Pembelian pembelian = new Pembelian (noFaktur, namaPelanggan, nomorHP, hargaBarang, jumlahBarang);

                // Menampilkan detail Invoice dan total bayar
                System.out.println("==============================================");
                System.out.println("\t\tQMart");
                System.out.println("----------------------------------------------");
                System.out.println("Tanggal\t: " + tanggal.format(hariSekarang));
                System.out.println("Waktu\t: " + waktu.format(hariSekarang));
                System.out.println("==============================================");
                System.out.println("\t\tDATA PELANGGAN\t");
                System.out.println("----------------------------------------------");
                System.out.println(pembelian);
                System.out.println("TOTAL BAYAR\t: " + pembelian.hitungTotalBayar());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Kasir\t: Aqila");

                inputValid = true; // Jika tidak terjadi exception, keluar dari perulangan

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input Data \n");
                System.out.println("========== Masukan Ulang ==========\n");
                scanner.nextLine(); 
            }
        } while (!inputValid);

        scanner.close();
    }
}