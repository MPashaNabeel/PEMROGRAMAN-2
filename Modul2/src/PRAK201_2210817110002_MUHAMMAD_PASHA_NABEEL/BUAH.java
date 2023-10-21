package PRAK201_2210817110002_MUHAMMAD_PASHA_NABEEL;
public class BUAH {
    public final String nama;
    public final double berat;
    public final double harga;
    public final double jumlahBeli;
    public final double sebelumDiskon;
    public final double totalDiskon;
    public final double setelahDiskon;
    public BUAH(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.sebelumDiskon = jumlahBeli / berat * harga;
        double kelipatan = this.jumlahBeli >= 4 ? this.jumlahBeli / 4 : 0.0;
        this.totalDiskon = 0.02 * (4 * this.harga) * Math.floor(kelipatan);
        this.setelahDiskon = this.sebelumDiskon - this.totalDiskon;
    }

    BUAH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void display() {
        System.out.println("Nama Buah: " + this.nama);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + this.harga);
        System.out.printf("Jumlah Beli: %.1fkg\n", this.jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f \n", this.sebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", this.totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", this.setelahDiskon);
        System.out.println();
    }
}
