import java.util.Scanner;
public class pembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int durasi, total = 0;
        int jenis;
        while (true) {
            System.out.println("Masukkan jenis kendaraan anda (1=mobil) dan (2=motor) (0=keluar)!");
            System.out.print("jenis kendaraan : ");
            jenis=sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid.");
                continue;
            }

            System.out.println("Masukkan durasi parkir kendaraan : ");
            durasi = sc.nextInt();
            if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
            
        System.out.println("Total pembayaran parkir: " + total);
            }
        }
        
    }

