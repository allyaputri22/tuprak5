package tuprak5;
import java.util.Scanner;

public class imt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("|====NILAI IMT====|=====KRITERIA=====|");
        System.out.println("|      <18,4      |Berat Badan Kurang|");
        System.out.println("|    18,5-24,9    |Berat Badan Ideal |");
        System.out.println("|     25-29,9     |Berat Badan Lebih |");
        System.out.println("|     30-39,9     |       Gemuk      |");
        System.out.println("|       >40       |   Sangat Gemuk   |");
        System.out.println("|=================|==================|");
        
        System.out.print("Masukkan Berat Badan (kg): ");
        double beratbadan = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (m): ");
        double tinggibadan = input.nextDouble();

        double imt = beratbadan / (tinggibadan * tinggibadan);
        
        String kriteria;
                if (imt < 18.5) {
              kriteria = "Berat Badan Kurang";
          } else if (imt >= 18.5 && imt < 25) {
              kriteria = "Berat Badan Ideal";
          } else if (imt >= 25 && imt < 30) {
              kriteria = "Berat Badan Lebih";
          } else if (imt >= 30 && imt < 40) {
              kriteria = "Gemuk";
          } else {
              kriteria = "Sangat Gemuk";
          }

        
        System.out.println("IMT Anda adalah          : " + imt);
        System.out.println("Kriteria                 : " + kriteria);
    }
    
}