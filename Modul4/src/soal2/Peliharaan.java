package soal2;

public abstract class Peliharaan {
    private final String nama;
    private final String ras;

    public Peliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharan: " + nama);
        System.out.println("Ras: " + ras);
    }
}
