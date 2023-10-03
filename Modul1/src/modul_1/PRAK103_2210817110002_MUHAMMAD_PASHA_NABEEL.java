package modul_1;
import java.util.Scanner;
public class PRAK103_2210817110002_MUHAMMAD_PASHA_NABEEL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int j = 0; j < 3; j++) { 
            System.out.print(" ");
            int jumlahDeret = input.nextInt();
            System.out.print(" ");
            int nilaiAwal = input.nextInt();

            int i = 0;
            do {
                if (nilaiAwal % 2 == 1) {
                    System.out.print(nilaiAwal);
                    if (i < jumlahDeret - 1) {
                        System.out.print(", ");
                    }
                    i++;
                }
                nilaiAwal++;
            } while (i < jumlahDeret);
            System.out.println();
        }
    }
}
