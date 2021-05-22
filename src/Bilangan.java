/**
 * Created by fauzi on 22/05/2021.
 */
public class Bilangan {

    public static void main(String[] args) {
       /* fizzBuzz(100);
        bilanganPrima(30);
        fibonacci(10);*/
        piramidaSatu(5);
        piramidaDua(5);
        piramidaTiga(5);
    }

    static void fizzBuzz(int total) {
        for (int i = 1; i <= total; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    static void bilanganPrima(int angka) {
        boolean prima;

        for (int i = 2; i <= angka; i++) {
            prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.println(i);
            }
        }
    }

    static void fibonacci(int limit){
        int sebelum = 0;
        int sekarang = 1;
        int fibonacci;

        System.out.print(" "+ sebelum);
        System.out.print(" " + sekarang);

        for (int i=2;i<=limit;i++){
            fibonacci=sebelum+sekarang;
            System.out.print(" " + fibonacci);
            sebelum=sekarang;
            sekarang=fibonacci;
        }
    }

    //piramida angka kecil ke besar
    static void piramidaSatu(int total) {
        for (int i = 0; i <= total; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
        }
    }

    //piramida besar ke kecil
    static void piramidaDua(int total) {
        for (int i = total; i >= 0; i--) {
            System.out.println();
            for (int j = total; j > i; j--) {
                System.out.print(j + " ");
            }
        }
    }

    //piramida bintang terbalik
    static void piramidaTiga(int total) {
        for (int i = total; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}
