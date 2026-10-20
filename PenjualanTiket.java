import java.util.Scanner;
public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPelanggan = 0;
        double totalPenjualan = 0;
        double total, diskon, totalBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

           
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                System.out.println("Silakan masukkan ulang !");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }
            total = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                diskon = total * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = total * 0.10;
            } else {
                diskon = 0;
            }
            totalBayar = total - diskon;
            totalTiket += jumlahTiket;
            totalPelanggan++;
            totalPenjualan += totalBayar;

            System.out.println("Jumlah tiket  : " + jumlahTiket);
            System.out.println("Subtotal      : Rp" + total);
            System.out.println("Diskon        : Rp" + diskon);
            System.out.println("Total bayar   : Rp" + totalBayar);
            
        }

        System.out.println("PENJUALAN HARIAN");
        System.out.println("Total pelanggan    : " + totalPelanggan);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan    : Rp" + totalPenjualan);

        sc.close();
    }
}

        

