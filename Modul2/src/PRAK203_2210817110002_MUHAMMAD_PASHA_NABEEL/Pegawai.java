package PRAK203_2210817110002_MUHAMMAD_PASHA_NABEEL;
public class Pegawai {
        public String nama;
        // Baris ini terjadi error karena pada file Main, value nya bukanlah karakter
        // public char asal;
        public String asal;
        public String jabatan;
        public int umur;
        public String getNama() {
            return nama;
        }
        // Baris ini terdapat error karena tipe data nya harus sama dengan variabel asal
        // public char getAsal() {
        public String getAsal() {
            return asal;
        }
        // Baris ini terdapat error karena variabel j dideklarasikan lebih dulu menjadi parameter
        // public void setJabatan() {
        public void setJabatan(String j) {
            this.jabatan = j;
        }
    }