package PRAK301_2210817110002_MUHAMMAD_PASHA_NABEEL;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("");
        int jumlahDadu = scan.nextInt();

        LinkedList<Dadu> daduList = new LinkedList<>();
        Random random = new Random();

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.lemparDadu(random);
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }
        int totalNilai = 0;
        for (Dadu dadu : daduList) {
            totalNilai += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}