/**
 * Created by fauzi on 22/05/2021.
 */
public class Kelipatan {

    String[] nominal = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public String kelipatanx(double angka) {

        if (angka <= 9) {
            return nominal[(int) angka];
        }

        if (angka >= 10 && angka <= 99) {
            return nominal[(int) angka / 10] + "0\n" + nominal[(int) angka % 10];
        }

        if (angka >= 100 && angka <= 999) {
            return kelipatanx((int) angka / 100) + "00\n" + kelipatanx(angka % 100);
        }

        if (angka >= 1000 && angka <= 9999) {
            return kelipatanx((int) angka / 1000) + "000\n" + kelipatanx(angka % 1000);
        }

        if (angka >= 10000 && angka <= 99999) {
            return kelipatanx((int) angka / 10000) + "0000\n" + kelipatanx(angka % 10000);
        }

        if (angka >= 100000 && angka <= 999999) {
            return kelipatanx((int) angka / 100000) + "00000\n" + kelipatanx(angka % 100000);
        }

        if (angka >= 1000000 && angka <= 9999999) {
            return kelipatanx((int) angka / 1000000) + "000000\n" + kelipatanx(angka % 1000000);
        }

        return "";
    }

    public static void main(String[] args) {

        System.out.println(new Kelipatan().kelipatanx(1520048));

    }

}
