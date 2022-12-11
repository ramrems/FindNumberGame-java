import java.util.Random;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {
        System.out.println("Hello world! This is 'FIND THE NUMBER' game");
        Random r = new Random();
        int a = r.nextInt(100);
        System.out.println("random:" + a);
        //Scanner myObje = new Scanner(System.in);
        //int sayii = myObje.nextInt();
        //System.out.println("num is:" + sayii);
        //SayiGir();
        int i = 0;
        int x = 0;
        // boolean b = i < 6 || x != 0;
        while (i < 6 || x <1) {
            Kontrol((SayiGir()), a, i,x);
            i += 1;
        /*public static void SayiGir () {
            System.out.println("Enter num:");
            Scanner myObj = new Scanner(System.in);
            int sayi = myObj.nextInt();
            System.out.println("new num is::" + sayi);
        }*/
        }
    }
        private static int SayiGir () {
            System.out.println("Enter num:");
            Scanner myObj = new Scanner(System.in);
            //System.out.println("new num is::" + sayi);
            return (myObj.nextInt());
        }
        private static void Kontrol ( int sayi, int a, int i,int x){
            if (sayi < a) {
                System.out.println("girdiginiz sayi kucuk tekrar deneyin:");
                //SayiGir();
            } else if (sayi > a) {
                System.out.println("girdiginiz sayi buyuk tekrar deneyin:");
                //SayiGir();
            } else if (sayi == a) {
                System.out.println("tebriklerr:");
                x = 1;
                // break;
            } else if (i > 6) {
                System.out.println("uzgunuz basarisiz oldun");
                //break;
            }
        }
    }
