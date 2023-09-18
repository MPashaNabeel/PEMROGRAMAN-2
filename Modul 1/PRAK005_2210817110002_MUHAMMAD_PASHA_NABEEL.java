import java.util.Scanner;

public class PRAK005_2210817110002_MUHAMMAD_PASHA_NABEEL {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Masukkan Makanan Favorit: ");
            String makananFavorit = in.nextLine();
            
            System.out.print("Masukkan Hobi: ");
            String hobi = in.nextLine();
            
            System.out.println("Aku Suka Makan " + makananFavorit + ", dan Hobiku " + hobi);
        }
    }
}