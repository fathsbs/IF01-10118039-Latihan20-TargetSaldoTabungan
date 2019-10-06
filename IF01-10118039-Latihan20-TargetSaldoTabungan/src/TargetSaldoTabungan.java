
import java.text.DecimalFormat;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan saldo perbulan  
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, saldo;

        DecimalFormat satuan = new DecimalFormat();

        i = 1;
        saldo = 3500000;
        while (i < 10) {

            saldo += (0.08 * saldo);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(saldo));
            i++;

            if (saldo >= 6000000) {
                break;
            }

        }
    }
}
