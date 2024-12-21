import java.io.*;
public class TesKalkulator {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Kalkulator k = new Kalkulator();

        System.out.print("Masukkan bilangan pertama : ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan bilangan kedua : ");
        double b = Double.parseDouble(br.readLine());

        k = new Kalkulator(a, b);
        System.out.println();

        System.out.print("Hasil penjumlahan = "); k.Penjumlahan();
        System.out.print("hasil pengurangan = "); k.Pengurangan();
        System.out.println("Hasil perkalian = "  + k.Perkalian());
        System.out.println("Hasil pembagian = "  + k.Pembagian());
    }
}
