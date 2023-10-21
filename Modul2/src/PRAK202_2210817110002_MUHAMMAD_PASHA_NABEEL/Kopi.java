package PRAK202_2210817110002_MUHAMMAD_PASHA_NABEEL;
public class Kopi {
    public String namaKopi;
    public String ukuran;
    double harga;
    public String pembeli;
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }
    public String getPembeli() {
        return pembeli;
    }
    public void setPembeli(String pembeliBaru) {
        this.pembeli = pembeliBaru;
    }
    public double getPajak() {
        return harga * 0.11;
    }
}