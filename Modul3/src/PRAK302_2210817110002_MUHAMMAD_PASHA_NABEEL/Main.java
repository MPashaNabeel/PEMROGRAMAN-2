package PRAK302_2210817110002_MUHAMMAD_PASHA_NABEEL;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahNegara = scan.nextInt();
        scan.nextLine();

        LinkedList<Negara> negaraList = new LinkedList<>();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scan.nextLine();
            String jenisKepemimpinan = scan.nextLine();
            String namaPemimpin = scan.nextLine();

            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = scan.nextInt();
                bulanKemerdekaan = scan.nextInt();
                tahunKemerdekaan = scan.nextInt();
                scan.nextLine();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " +
                    (negara.getJenisKepemimpinan().equals("monarki") ? "Raja" :
                    (negara.getJenisKepemimpinan().equals("presiden") ? "Presiden" : "Perdana Menteri"))
                    + " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + negara.getBulanKemerdekaan() + " " + negara.getTahunKemerdekaan());
            }
            System.out.println();
        }
    }
}
