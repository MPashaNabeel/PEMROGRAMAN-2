package PRAK203_2210817110002_MUHAMMAD_PASHA_NABEEL;
public class Main {
     public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // Baris ini terdapat error karena titik koma ';' yang kurang
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.umur = 17;
        p1.setJabatan("Assasin");

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
