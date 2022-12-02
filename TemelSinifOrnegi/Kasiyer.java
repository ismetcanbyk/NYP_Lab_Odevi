package TemelSinifOrnegi;
import java.util.Scanner;

public class Kasiyer {

    Scanner inp = new Scanner(System.in);

    Kasa k1;

    public Kasiyer() {
        k1 = new Kasa();
    }

    public Kasiyer(String isim) {
        k1 = new Kasa(isim);
    }

    public void isVakti() {
        int yiyecekKodu;
        double fiyat;
        boolean isFinish = true;


        System.out.println("\n\t----Yiyecek Kodları----");
        System.out.println("Salata \t\t=> 1");
        System.out.println("Hamburger \t=> 2");
        System.out.println("Pizza \t\t=> 3");
        System.out.println("Tatlı \t\t=> 4");
        System.out.println("\n=>Çıkış yapmak ve fiş yazdırmak için : 5'e basın");
        
        
        do {
            
            System.out.print("Yiyecek kodu girin : ");
            try {
                yiyecekKodu = inp.nextInt();
            } catch (Exception e) {
                System.out.println("\nHatalı Kod Girdiniz !");
                yiyecekKodu = 5;
            }
            if(yiyecekKodu > 5 || yiyecekKodu <= 0){
                System.out.println("Geçersiz kod !");
                break;
            }

            if (yiyecekKodu == 5) {
                isFinish = false;
                break;
            }
            System.out.print("Fiyat girin : ");
            try {
                fiyat = inp.nextDouble();
            } catch (Exception e) {
                System.out.println("\nHatalı Fiyat Girdiniz !");
                fiyat = -1;
            }
            if (fiyat < 0) {
                isFinish = false;
                break;
            }

            k1.hesapla(yiyecekKodu, fiyat);

        } while (isFinish);
        k1.fisYazdir();
    }

    

}
