package tuprak5;

import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Pembelian: ");
        double totalBeli = input.nextDouble();
        double diskon = 0;
        
        if (totalBeli < 50000) {
            diskon = totalBeli * 0.05;
        } else if (totalBeli >= 50000) {
            diskon = totalBeli * 0.2;
        }

        double bayar = totalBeli - diskon;

        // Output
        System.out.println("Total Pembelian Rp. " + totalBeli);
        System.out.println("Besarnya Potongan Rp. " + diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + bayar);
    }
}
   
