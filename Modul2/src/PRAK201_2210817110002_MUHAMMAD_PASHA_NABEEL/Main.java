package PRAK201_2210817110002_MUHAMMAD_PASHA_NABEEL;
public class Main {
    public static void main(String[] args) {
        BUAH apel;
        apel = new BUAH("Apel", 0.4, 7000.0, 40.0);
        BUAH mangga;
        mangga = new BUAH("mangga", 0.2,3500.0, 15.0);
        BUAH alpukat;
        alpukat = new BUAH("alpukat", 0.25, 10000.0, 12.0);
        apel.display();
        mangga.display();
        alpukat.display();
    }
}
