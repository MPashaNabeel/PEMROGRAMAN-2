package PRAK303_2210817110002_MUHAMMAD_PASHA_NABEEL;

class Mahasiswa {
    private final String nama;
    private final String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
