/**
 *
 * @author Pande Wayan Agus Wijaya 20103390
 */

import java.util.Scanner;

public class HitungVolBalok {
    public static void main(String[] args) {

        HitungVol volBalok = new HitungVol();

        Scanner inputDt = new Scanner(System.in);

        System.out.print("Masukan Nilai Panjang : ");
        volBalok.pj = inputDt.nextDouble();

        System.out.print("Masukan Nilai Lebar   : ");
        volBalok.lb = inputDt.nextDouble();

        System.out.print("Masukan Nilai Tinggi  : ");
        volBalok.tg = inputDt.nextDouble();
        System.out.println();

        volBalok.PrintHasil();

    }
}