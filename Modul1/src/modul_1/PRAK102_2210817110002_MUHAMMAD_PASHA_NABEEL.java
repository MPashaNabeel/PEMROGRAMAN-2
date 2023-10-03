package modul_1;
import java.util.Scanner;
public class PRAK102_2210817110002_MUHAMMAD_PASHA_NABEEL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int j = 0; j < 3; j++) {
            System.out.print(" ");
            int nilaiAwal = input.nextInt();

            int i = 0;
            while (i <= 10) {
                int nilaiSaatIni;
                if (nilaiAwal % 5 == 0) {
                    nilaiSaatIni = nilaiAwal / 5 - 1;
                    System.out.print(nilaiSaatIni);
                    if (i < 10) System.out.print(", ");
                } else {
                    nilaiSaatIni = nilaiAwal;
                    System.out.print(nilaiSaatIni);
                    if (i < 10) System.out.print(", ");
                }
                nilaiAwal++;
                i++;
            }
            System.out.println();
        }
    }
}
