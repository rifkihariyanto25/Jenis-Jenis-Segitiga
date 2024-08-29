import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        System.out.print("MASUKKAN PANJANG SISI PERTAMA: ");
        int sisi1 = baca.nextInt();

        System.out.print("MASUKKAN PANJANG SISI KEDUA: ");
        int sisi2 = baca.nextInt();

        System.out.print("MASUKKAN PANJANG SISI KETIGA: ");
        int sisi3 = baca.nextInt();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("SEGITIGA TERSEBUT ADALAH SEGITIGA SAMA SISI");
        } else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
            System.out.println("SEGITIGA TERSEBUT ADALAH SEGITIGA SAMA KAKI");
        } else {
            System.out.println("SEGITIGA TERSEBUT ADALAH SEGITIGA SEMBARANG");
        }
    }
}
