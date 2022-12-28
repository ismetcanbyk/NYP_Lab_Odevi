package TRY_CATCH.AsalSayi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int num;
       public static boolean asal = false;
    public static void main(String[] args) {
        
        try_catch();

       
    }

    public static void try_catch(){
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Bir sayı giriniz :");
            num=inp.nextInt();
            if (num > 0) {
               for (int i = 2; i < num; i++) {
                if (num % i != 0) {
                    asal = true;
                }else {
                    asal = false;
                    break;
                }
               }
               if(asal == true){
                System.out.println("asal");
               }else{System.out.println("asal değil");}
            }

        } catch (Exception e){
            System.out.println( "hata tekrar dene");
            try_catch();

        }
    }
}