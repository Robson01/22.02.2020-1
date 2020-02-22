import java.util.Scanner;


public class Zadanie1 {
    public static void main(String[] args) {

        Scanner liczby1 = new Scanner(System.in);
        int[] tablica = new int[4];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = liczby1.nextInt();

        }
        int wynik;
        wynik = 0;
        for (int a = 0; a < tablica.length; a++) {
            wynik += tablica[a];


        }
        System.out.println("wynik " + wynik);

        double srednia = wynik / tablica.length;
        System.out.println("średnia " + srednia);

        int max = 0;
        int min = 0;
        for (int a= 0; a < tablica.length; a++){
            if (max > tablica[a]) {
                max = tablica[a];
            }
            if (min > tablica[a]) {
                min = tablica[a];
            }

        }
        System.out.println("max " + max);
        System.out.println("min " + min);

        double sum = 0;
        for (int element :tablica) {
            sum += Math.pow(element - srednia, 2) /tablica.length;
        }
        double odchylenie = Math.sqrt(sum);
        System.out.println("Odchylenie standardowe: " + odchylenie);

        }

    }
