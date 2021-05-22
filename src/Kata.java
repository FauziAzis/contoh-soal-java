/**
 * Created by fauzi on 22/05/2021.
 */
public class Kata {
    public static void main(String[] args) {
        balikKata("malam");
    }

    static void balikKata(String kata) {
        String temp = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            temp = temp + kata.charAt(i);
        }

        if (temp.equals(kata)) {
            System.out.println("Ini Benar");
        } else {
            System.out.println("Ini Salah");
        }

    }


}
