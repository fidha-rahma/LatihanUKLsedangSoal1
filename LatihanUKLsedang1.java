import java.util.Scanner;

public class LatihanUKLsedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan Bulat Positif: ");
        int i = input.nextInt();
        long Hasil = faktorial(i);
        System.out.println("Faktorial dari " + i + " adalah " + Hasil);
    }

    static long faktorial(int i){
        long Hasil = 1;
        for (int n = 1; n <= i; n++){
            Hasil *= n;
        }
        return Hasil;
    }
    
}
