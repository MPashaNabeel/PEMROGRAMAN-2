package PRAK301_2210817110002_MUHAMMAD_PASHA_NABEEL;

import java.util.Random;

public class Dadu {
    private int nilai;
    public Dadu() {
        this.nilai = 1; 
    }
    public int getNilai() {
        return nilai;
    }
    public void lemparDadu(Random random) {   
        this.nilai = random.nextInt(6) + 1;
    }
}